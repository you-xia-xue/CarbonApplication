package com.carbon.carbon.controller;

import com.carbon.carbon.ResponseMessage;
import com.carbon.carbon.pojo.PurchasePlan;
import com.carbon.carbon.service.Task2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(name = "/api/purchase/plan")
public class Task2Controller{
    @Autowired
    Task2Service task2Service;
    @GetMapping("/list")
    public ResponseEntity<Page<PurchasePlan>> getPurchasePlanList(
            @RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer size,
            @RequestParam(required = false) Integer billNo,
            @RequestParam(required = false) String applicant,
            @RequestParam(required = false) LocalDate applyDateStart,
            @RequestParam(required = false) LocalDate applyDateEnd,
            @RequestParam(required = false) String applyStatus,
            @RequestParam(required = false) String auditor,
            @RequestParam(required = false) LocalDate auditDateStart,
            @RequestParam(required = false) LocalDate auditDateEnd,
            @RequestParam(required = false) String auditStatus
    ){
        Page<PurchasePlan> purchasePlansPage = task2Service.getPurchasePlanList(
                page,size,billNo,applicant,applyDateStart,applyDateEnd,applyStatus,auditor,auditDateStart,auditDateEnd,auditStatus);
        return ResponseEntity.ok(purchasePlansPage);
    }
    @PostMapping("/audit")
    public ResponseMessage<PurchasePlan> auditPurchase(
            @RequestParam(name = "id")Integer id,
            @RequestParam("audit_status") String auditStatus,
            @RequestParam(required = false) String auditOpinion){
        PurchasePlan purchasePlan = task2Service.auditPurchase(id,auditStatus,auditOpinion);
        return ResponseMessage.success(purchasePlan);
    }
}
