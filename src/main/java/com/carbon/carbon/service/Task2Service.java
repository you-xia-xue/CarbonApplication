package com.carbon.carbon.service;

import com.carbon.carbon.pojo.PurchasePlan;
import org.springframework.data.domain.Page;

import java.time.LocalDate;

public interface Task2Service {
    /**
     * 请求分页列表
     * @param page 页码
     * @param size 页大小
     * @param billNo 订单
     * @param applicant 申请人
     * @param applyDateStart 申请开始时间
     * @param applyDateEnd 申请结束时间
     * @param applyStatus 申请状态
     * @param auditor 审核人
     * @param auditDateStart 审核开始时间
     * @param auditDateEnd 审核结束时间
     * @param auditStatus 审核状态
     * @return 操作成功返回页对象
     */
    Page<PurchasePlan> getPurchasePlanList(
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
            String auditStatus
    );

    /**
     *
     * @param id           ID
     * @param auditStatus  申请状态
     * @param auditOpinion 申请意见
     * @return 操作成功返回对象
     */
    PurchasePlan auditPurchase(Integer id, String auditStatus, String auditOpinion);

}
