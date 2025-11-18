package com.carbon.carbon.service;

import com.carbon.carbon.DAO.*;
import com.carbon.carbon.pojo.*;
import com.carbon.carbon.pojo.DTO.EnergyOverview;
import com.carbon.carbon.pojo.DTO.EnergyRatio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CarbonServiceImpl implements CarbonService {
    @Autowired
    private OutBoundRepository outBoundRepository;
    @Autowired
    private PurchasePlanRepository purchasePlanRepository;
    @Autowired
    private PurchaseContractRepositiory purchaseContractRepositiory;
    @Autowired
    private EnergyDataRepository energyDataRepository;
    @Autowired
    private InventoryAlertRepository inventoryAlertRepository;

    @Override
    public Page<OutBoundApply> queryOutboundApplyByPage(Integer page, Integer size, Integer billNo, String businessType, String customer, String applicant, String applyDateStart, String applyDateEnd, String applyStatus, String auditor, LocalDateTime auditDateStart, LocalDateTime auditDateEnd, String auditStatus, String status) {
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

    @Override
    public Page<PurchasePlan> getPurchasePlanList(Integer page, Integer size, Integer billNo, String applicant, LocalDateTime applyDateStart, LocalDateTime applyDateEnd, String applyStatus, String auditor, LocalDateTime auditDateStart, LocalDateTime auditDateEnd, String auditStatus) {
        if(page == null) page = 1;
        if(size == null) size = 10;
        Pageable pageable = PageRequest.of(
                page-1,
                size,
                Sort.by("id").descending()
        );
        return purchasePlanRepository.findAll(pageable);
    }

    @Override
    public PurchasePlan auditPurchase(Integer id, String auditStatus, String auditOpinion) {
        PurchasePlan purchasePlan = purchasePlanRepository.findById(id).orElseThrow(()->new RuntimeException("该id无对象"));
        purchasePlan.setAuditStatus(auditStatus);
        return purchasePlanRepository.save(purchasePlan);
    }

    @Override
    public Page<PurchaseContract> getPurchaseContractList(Integer page, Integer size, Integer billNo, String applicant, LocalDateTime applyDateStart, LocalDateTime applyDateEnd, String applyStatus, String auditor, LocalDateTime auditDateStart, LocalDateTime auditDateEnd, String auditStatus) {
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

    @Override
    public EnergyOverview getEnergyOverview() {
        return new EnergyOverview(
                energyDataRepository.sumElectricity(),
                energyDataRepository.sumWater(),
                energyDataRepository.sumCarbon()
        );
    }

    @Override
    public EnergyRatio getEnergyRatio() {
        return new EnergyRatio(
                energyDataRepository.sumOfficeElectricity(),
                energyDataRepository.sumOfficeWater(),
                energyDataRepository.sumProductionWater(),
                energyDataRepository.sumProductionElectricity()
        );
    }

    @Override
    public List<InventoryAlert> getInventoryAlert() {
        return inventoryAlertRepository.findAll();
    }
}
