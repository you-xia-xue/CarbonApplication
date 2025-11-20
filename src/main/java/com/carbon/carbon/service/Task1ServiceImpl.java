package com.carbon.carbon.service;

import com.carbon.carbon.DAO.OutBoundRepository;
import com.carbon.carbon.pojo.OutBoundApply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
public class Task1ServiceImpl implements Task1Service{
    @Autowired
    OutBoundRepository outBoundRepository;
    public Page<OutBoundApply> queryOutboundApplyByPage(Integer page, Integer size) {
        if (page == null) page = 1;
        if (size == null) size = 10;
        Pageable pageable = PageRequest.of(
                page - 1,
                size,
                Sort.by("id").descending()
        );
        return outBoundRepository.findAll(pageable);
    }
    @Transactional
    @Override
    public OutBoundApply auditOutboundApply(int id, String auditStatus, String auditOpinion) {
        OutBoundApply outBoundApply= outBoundRepository.findById(id).orElseThrow(()->new RuntimeException("id无对应用户"));
        outBoundApply.setAuditStatus(auditStatus);
        return outBoundRepository.save(outBoundApply);
    }

}
