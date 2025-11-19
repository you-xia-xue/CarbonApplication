package com.carbon.carbon.service;

import com.carbon.carbon.DAO.*;
import com.carbon.carbon.pojo.*;
import com.carbon.carbon.pojo.DTO.DataSummaryDTO;
import com.carbon.carbon.pojo.DTO.EnergyOverviewDTO;
import com.carbon.carbon.pojo.DTO.EnergyRatioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
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
    @Autowired
    private SalesDataRepository salesDataRepository;
    @Autowired
    private ProductionDataRepository productionDataRepository;


    public Page<OutBoundApply> queryOutboundApplyByPage(
            Integer page,
            Integer size,
            Integer billNo,
            String businessType,
            String customer,
            String applicant,
            LocalDate applyDateStart,
            LocalDate applyDateEnd,
            String applyStatus,
            String auditor,
            LocalDate auditDateStart,
            LocalDate auditDateEnd,
            String auditStatus,
            String status) {
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
    public EnergyOverviewDTO getEnergyOverview() {
        return new EnergyOverviewDTO(
                energyDataRepository.sumByElectricity(),
                energyDataRepository.sumByWater(),
                energyDataRepository.sumByCarbon()
        );
    }

    @Override
    public EnergyRatioDTO getEnergyRatio() {
        return new EnergyRatioDTO(
                energyDataRepository.sumByOfficeElectricity(),
                energyDataRepository.sumByOfficeWater(),
                energyDataRepository.sumByProductionWater(),
                energyDataRepository.sumByProductionElectricity()
        );
    }

    @Override
    public List<InventoryAlert> getInventoryAlert() {
        return inventoryAlertRepository.findAll();
    }

    @Override
    public DataSummaryDTO getDataSummary() {
        return new DataSummaryDTO(
                salesDataRepository.sumSalesByYear(),
                salesDataRepository.sumSalesByMonth(),
                salesDataRepository.sumSalesByDay(),
                energyDataRepository.sumCarbonByYear(),
                energyDataRepository.sumCarbonByMonth(),
                energyDataRepository.sumCarbonByDay(),
                energyDataRepository.findFirst8ByOrderByCarbonDesc());
    }

    @Override
    public List<SaleData> getSaleStatistics() {
        return salesDataRepository.findAll();
    }

    @Override
    public List<SaleData> getSaleRanking() {
        return salesDataRepository.findFirst8ByOrderByTotalSalesDesc();
    }

    @Override
    public List<ProductionData> getProductionStatistics() {
        return productionDataRepository.findAll();
    }

}
