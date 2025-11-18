package com.carbon.carbon.controller;

import com.carbon.carbon.ResponseMessage;
import com.carbon.carbon.pojo.DTO.DataSummaryDTO;
import com.carbon.carbon.pojo.DTO.EnergyOverviewDTO;
import com.carbon.carbon.pojo.DTO.EnergyRatioDTO;
import com.carbon.carbon.pojo.InventoryAlert;
import com.carbon.carbon.pojo.OutBoundApply;
import com.carbon.carbon.pojo.PurchaseContract;
import com.carbon.carbon.pojo.PurchasePlan;
import com.carbon.carbon.service.CarbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private CarbonService carbonService;

    @GetMapping("/outbound/apply/list")
    public ResponseEntity<Page<OutBoundApply>> getOutboundApplyByPage(
            @RequestParam(required = false)Integer page,
            @RequestParam(required = false) Integer size,
            @RequestParam(required = false)Integer billNo,
            @RequestParam(required = false) String businessType,
            @RequestParam(required = false)String customer,
            @RequestParam(required = false)String applicant,
            @RequestParam(required = false)String applyDateStart,
            @RequestParam(required = false)String applyDateEnd,
            @RequestParam(required = false)String applyStatus,
            @RequestParam(required = false)String auditor,
            @RequestParam(required = false)LocalDateTime auditDateStart,
            @RequestParam(required = false)LocalDateTime auditDateEnd,
            @RequestParam(required = false)String auditStatus,
            @RequestParam(required = false)String status){
        Page<OutBoundApply> outboundApplyPage= carbonService.queryOutboundApplyByPage(
                page,size,billNo,businessType,customer,applicant,applyDateStart,applyDateEnd,applyStatus,auditor,auditDateStart,auditDateEnd,auditStatus,status);
        return ResponseEntity.ok(outboundApplyPage);
    }

    @PostMapping("/outbound/apply/auditOutboundApply")
    public ResponseMessage<OutBoundApply> auditOutboundApply(@RequestParam("id") int id, @RequestParam("audit_status") String auditStatus, @RequestParam(required = false) String auditOpinion){
        OutBoundApply outboundApply = carbonService.auditOutboundApply(id,auditStatus,auditOpinion);
        return ResponseMessage.success(outboundApply);
    }

   @GetMapping("/purchase/plan/list")
    public ResponseEntity<Page<PurchasePlan>> getPurchasePlanList(
            @RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer size,
            @RequestParam(required = false) Integer billNo,
            @RequestParam(required = false) String applicant,
            @RequestParam(required = false) LocalDateTime applyDateStart,
            @RequestParam(required = false) LocalDateTime applyDateEnd,
            @RequestParam(required = false) String applyStatus,
            @RequestParam(required = false) String auditor,
            @RequestParam(required = false) LocalDateTime auditDateStart,
            @RequestParam(required = false) LocalDateTime auditDateEnd,
            @RequestParam(required = false) String auditStatus
            ){
        Page<PurchasePlan> purchasePlansPage = carbonService.getPurchasePlanList(
                page,size,billNo,applicant,applyDateStart,applyDateEnd,applyStatus,auditor,auditDateStart,auditDateEnd,auditStatus);
        return ResponseEntity.ok(purchasePlansPage);
    }

    @PostMapping("purchase/plan/auditOutboundApply")
    public ResponseMessage<PurchasePlan> auditPurchase(@RequestParam(name = "id")Integer id, @RequestParam("audit_status") String auditStatus,@RequestParam(required = false) String auditOpinion){
        PurchasePlan purchasePlan = carbonService.auditPurchase(id,auditStatus,auditOpinion);
        return ResponseMessage.success(purchasePlan);
    }

    @GetMapping("/purchase/contract/list")
    public ResponseEntity<Page<PurchaseContract>> getPurchaseContractList(
            @RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer size,
            @RequestParam(required = false) Integer billNo,
            @RequestParam(required = false) String applicant,
            @RequestParam(required = false) LocalDateTime applyDateStart,
            @RequestParam(required = false) LocalDateTime applyDateEnd,
            @RequestParam(required = false) String applyStatus,
            @RequestParam(required = false) String auditor,
            @RequestParam(required = false) LocalDateTime auditDateStart,
            @RequestParam(required = false) LocalDateTime auditDateEnd,
            @RequestParam(required = false) String auditStatus
    ){
        Page<PurchaseContract> purchaseContract = carbonService.getPurchaseContractList(
                page,size,billNo,applicant,applyDateStart,applyDateEnd,applyStatus,auditor,auditDateStart,auditDateEnd,auditStatus);
        return ResponseEntity.ok(purchaseContract);
    }
    @PostMapping("/purchase/contract/auditOutboundApply")
    public ResponseMessage<PurchaseContract> auditPurchaseContract(@RequestParam("id") Integer id,@RequestParam String auditStatus,@RequestParam(required = false) String auditOpinion){
        PurchaseContract purchaseContract = carbonService.auditPurchaseContract(id,auditStatus,auditOpinion);
        return  ResponseMessage.success(purchaseContract);
    }
    //能耗总览接口
    @GetMapping("/visualization/energy/overview")
    public ResponseMessage<EnergyOverviewDTO> getEnergyOverview(){
        return ResponseMessage.success(carbonService.getEnergyOverview());
    }
    //能耗占比数据接口
    @GetMapping("/visualization/energy/ratio")
    public ResponseMessage<EnergyRatioDTO> getEnergyRatio(){
        return ResponseMessage.success(carbonService.getEnergyRatio());
    }
    //库存预警数据接口
    @GetMapping("/visualization/inventory/alert")
    public ResponseMessage<List<InventoryAlert>> getInventoryAlert(){
        return ResponseMessage.success(carbonService.getInventoryAlert());
    }
    @GetMapping("/visualization/data/summary")
    public ResponseMessage<DataSummaryDTO> getDataSummary(){
        return ResponseMessage.success(carbonService.getDataSummary());
    }
}
