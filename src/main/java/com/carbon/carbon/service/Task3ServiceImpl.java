package com.carbon.carbon.service;

import com.carbon.carbon.DAO.PurchaseContractRepositiory;
import com.carbon.carbon.pojo.PurchaseContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class Task3ServiceImpl implements Task3Service {
    @Autowired
    PurchaseContractRepositiory  purchaseContractRepositiory;
    @Override
    public Page<PurchaseContract> getPurchaseContractList(
            Integer page,
            Integer size,
            Integer billNo,
            String applicant,
            LocalDate applyDateStart,
            LocalDate applyDateEnd,
            String applyStatus,
            String auditor,
            LocalDate auditDateStart,
            LocalDate auditDateEnd,
            String auditStatus) {
        if(page == null) page = 1;
        if(size == null) size = 10;
        Pageable pageable = PageRequest.of(
                page-1,
                size,
                Sort.by("id").descending()
        );
        return purchaseContractRepositiory.findAll(pageable);
    }

    @Override
    public PurchaseContract auditPurchaseContract(Integer id, String auditStatus, String auditOpinion) {
        PurchaseContract purchaseContract = purchaseContractRepositiory.findById(id).orElseThrow(()->new RuntimeException("该id无对象"));
        purchaseContract.setAuditStatus(auditStatus);
        return purchaseContractRepositiory.save(purchaseContract);
    }
}
