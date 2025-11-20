package com.carbon.carbon.service;

import com.carbon.carbon.DAO.TenderInfoRepository;
import com.carbon.carbon.DAO.TenderRecordRepository;
import com.carbon.carbon.pojo.TenderInfo;
import com.carbon.carbon.pojo.TenderRecord;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Task6ServiceImpl implements Task6Service{
    @Autowired
    private TenderInfoRepository tenderInfoRepository;
    @Autowired
    private TenderRecordRepository tenderRecordRepository;
    @Override
    public List<TenderInfo> getTenderInfoList() {
        return tenderInfoRepository.findAll();
    }
    @Transactional
    @Override
    public TenderRecord registerTender(Integer tenderId) {
        TenderRecord tenderRecord = new TenderRecord();
        tenderRecord.setTenderId(tenderId);
        return tenderRecordRepository.save(tenderRecord);
    }
}
