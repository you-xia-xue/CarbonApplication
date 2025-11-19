package com.carbon.carbon.controller;

import com.carbon.carbon.ResponseMessage;
import com.carbon.carbon.pojo.OutBoundApply;
import com.carbon.carbon.service.Task1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/outbound/apply")
public class Task1Controller {
    @Autowired
    private Task1Service task1Service;
    @GetMapping("/list")
    public ResponseEntity<Page<OutBoundApply>> getOutboundApplyByPage(
            @RequestParam(required = false)Integer page,
            @RequestParam(required = false)Integer size,
            @RequestParam(required = false)Integer billNo,
            @RequestParam(required = false)String businessType,
            @RequestParam(required = false)String customer,
            @RequestParam(required = false)String applicant,
            @RequestParam(required = false)LocalDate applyDateStart,
            @RequestParam(required = false)LocalDate applyDateEnd,
            @RequestParam(required = false)String applyStatus,
            @RequestParam(required = false)String auditor,
            @RequestParam(required = false)LocalDate auditDateStart,
            @RequestParam(required = false)LocalDate auditDateEnd,
            @RequestParam(required = false)String auditStatus,
            @RequestParam(required = false)String status){
        Page<OutBoundApply> outboundApplyPage= task1Service.queryOutboundApplyByPage(
                page,size,billNo,businessType,customer,applicant,applyDateStart,applyDateEnd,applyStatus,auditor,auditDateStart,auditDateEnd,auditStatus,status);
        return ResponseEntity.ok(outboundApplyPage);
    }

    @PostMapping("/auditOutboundApply")
    public ResponseMessage<OutBoundApply> auditOutboundApply(@RequestParam("id") int id, @RequestParam("audit_status") String auditStatus, @RequestParam(required = false) String auditOpinion){
        OutBoundApply outboundApply = task1Service.auditOutboundApply(id,auditStatus,auditOpinion);
        return ResponseMessage.success(outboundApply);
    }
}
