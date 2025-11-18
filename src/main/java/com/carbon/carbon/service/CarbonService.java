package com.carbon.carbon.service;


import com.carbon.carbon.pojo.DTO.EnergyOverview;
import com.carbon.carbon.pojo.DTO.EnergyRatio;
import com.carbon.carbon.pojo.InventoryAlert;
import com.carbon.carbon.pojo.OutBoundApply;
import com.carbon.carbon.pojo.PurchaseContract;
import com.carbon.carbon.pojo.PurchasePlan;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.List;

public interface CarbonService {

    /**
     *
     * @param pageNum
     * @param pageSize
     * @param billNo
     * @param businessType
     * @param customer
     * @param applicant
     * @param applyDateStart
     * @param applyDateEnd
     * @param applyStatus
     * @param auditor
     * @param auditDateStart
     * @param auditDateEnd
     * @param auditStatus
     * @param status
     * @return 操作成功返页对象
     */

    Page<OutBoundApply> queryOutboundApplyByPage(
            Integer pageNum,
            Integer pageSize,
            Integer billNo,
            String businessType,
            String customer,
            String applicant,
            String applyDateStart,
            String applyDateEnd,
            String applyStatus,
            String auditor,
            LocalDateTime auditDateStart,
            LocalDateTime auditDateEnd,
            String auditStatus,
            String status
    );

    /**
     *
     * @param id
     * @param auditStatus
     * @param auditOpinion
     * @return  操作成功返回对象
     */
    OutBoundApply auditOutboundApply(
            int id,
            String auditStatus,
            String auditOpinion
    );

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
            LocalDateTime applyDateStart,
            LocalDateTime applyDateEnd,
            String applyStatus,
            String auditor,
            LocalDateTime auditDateStart,
            LocalDateTime auditDateEnd,
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

    /**
     *
     * @param page
     * @param size
     * @param billNo
     * @param applicant
     * @param applyDateStart
     * @param applyDateEnd
     * @param applyStatus
     * @param auditor
     * @param auditDateStart
     * @param auditDateEnd
     * @param auditStatus
     * @return
     */
    Page<PurchaseContract> getPurchaseContractList(Integer page, Integer size, Integer billNo, String applicant, LocalDateTime applyDateStart, LocalDateTime applyDateEnd, String applyStatus, String auditor, LocalDateTime auditDateStart, LocalDateTime auditDateEnd, String auditStatus);

    /**
     *
     * @param id
     * @param auditStatus
     * @param auditOpinion
     * @return
     */
    PurchaseContract auditPurchaseContract(Integer id, String auditStatus, String auditOpinion);

    /**
     *
     * @return
     */
    EnergyOverview getEnergyOverview();

    /**
     *
     * @return
     */
    EnergyRatio getEnergyRatio();

    /**
     *
     * @return
     */
    List<InventoryAlert> getInventoryAlert();
}
