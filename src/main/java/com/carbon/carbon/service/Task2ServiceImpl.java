package com.carbon.carbon.service;

import com.carbon.carbon.DAO.PurchasePlanRepository;
import com.carbon.carbon.pojo.PurchasePlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class Task2ServiceImpl implements Task2Service {
    @Autowired
    private PurchasePlanRepository purchasePlanRepository;
    @Override
    public Page<PurchasePlan> getPurchasePlanList(
            Integer page,
            Integer size) {
        if(page == null) page = 1;
        if(size == null) size = 10;
        Pageable pageable = PageRequest.of(
                page-1,
                size,
                Sort.by("id").descending()
        );
        //此处应当有动态条件（后续补充）
        return purchasePlanRepository.findAll(pageable);
    }

    @Override
    public PurchasePlan auditPurchase(Integer id, String auditStatus, String auditOpinion) {
        PurchasePlan purchasePlan = purchasePlanRepository.findById(id).orElseThrow(()->new RuntimeException("该id无对象"));
        purchasePlan.setAuditStatus(auditStatus);
        return purchasePlanRepository.save(purchasePlan);
    }

}
