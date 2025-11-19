package com.carbon.carbon.service;

import com.carbon.carbon.pojo.OutBoundApply;
import org.springframework.data.domain.Page;

import java.time.LocalDate;

public interface Task1Service {

    /**
     *
     * @param page
     * @param size
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
            String status
    );

    /**
     * 更改申请对象
     * @param id 用户ID
     * @param auditStatus 申请状态
     * @param auditOpinion 申请意见
     * @return  操作成功返回对象
     */
    OutBoundApply auditOutboundApply(
            int id,
            String auditStatus,
            String auditOpinion
    );

}
