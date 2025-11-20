package com.carbon.carbon.service;

import com.carbon.carbon.pojo.PurchaseContract;
import org.springframework.data.domain.Page;

import java.time.LocalDate;

public interface Task3Service {
    /**
     *
     * @param page
     * @param size
     * @return
     */
    Page<PurchaseContract> getPurchaseContractList(
            Integer page,
            Integer size
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
