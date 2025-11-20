package com.carbon.carbon.service;

import com.carbon.carbon.pojo.OutBoundApply;
import org.springframework.data.domain.Page;

import java.time.LocalDate;

public interface Task1Service {

    /**
     *
     * @param page
     * @param size
     * @return 操作成功返页对象
     */

    Page<OutBoundApply> queryOutboundApplyByPage(
            Integer page,
            Integer size
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
