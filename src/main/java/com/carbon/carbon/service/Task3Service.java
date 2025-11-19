package com.carbon.carbon.service;

import com.carbon.carbon.pojo.PurchaseContract;
import org.springframework.data.domain.Page;

import java.time.LocalDate;

public interface Task3Service {
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
    Page<PurchaseContract> getPurchaseContractList(
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
     * @param id
     * @param auditStatus
     * @param auditOpinion
     * @return
     */
    PurchaseContract auditPurchaseContract(
            Integer id,
            String auditStatus,
            String auditOpinion
    );

}
