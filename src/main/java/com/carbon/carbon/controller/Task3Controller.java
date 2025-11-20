package com.carbon.carbon.controller;

import com.carbon.carbon.ResponseMessage;
import com.carbon.carbon.pojo.PurchaseContract;
import com.carbon.carbon.service.Task3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(name = "/api/purchase/contract")
public class Task3Controller {
    @Autowired
    private Task3Service task3Service;
    @GetMapping("/list")
    public ResponseEntity<Page<PurchaseContract>> getPurchaseContractList(
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
        Page<PurchaseContract> purchaseContract = task3Service.getPurchaseContractList(page,size);
        return ResponseEntity.ok(purchaseContract);
    }
    @PostMapping("/audit")
    public ResponseMessage<PurchaseContract> auditPurchaseContract(@RequestParam("id") Integer id, @RequestParam String auditStatus, @RequestParam(required = false) String auditOpinion){
        PurchaseContract purchaseContract = task3Service.auditPurchaseContract(id,auditStatus,auditOpinion);
        return  ResponseMessage.success(purchaseContract);
    }
}
