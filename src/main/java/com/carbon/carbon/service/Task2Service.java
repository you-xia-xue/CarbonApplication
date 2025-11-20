package com.carbon.carbon.service;

import com.carbon.carbon.pojo.PurchasePlan;
import org.springframework.data.domain.Page;

import java.time.LocalDate;

public interface Task2Service {
    /**
     * 请求分页列表
     * @param page 页码
     * @param size 页大小
     * @return 操作成功返回页对象
     */
    Page<PurchasePlan> getPurchasePlanList(
            Integer page,
            Integer size
    );

    /**
     *
     * @param id           ID
     * @param auditStatus  申请状态
     * @param auditOpinion 申请意见
     * @return 操作成功返回对象
     */
    PurchasePlan auditPurchase(
            Integer id,
            String auditStatus,
            String auditOpinion
    );

}
