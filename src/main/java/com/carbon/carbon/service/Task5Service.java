package com.carbon.carbon.service;

import com.carbon.carbon.pojo.SalesDelivery;
import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Task5Service  {
    /**
     *
     * @param page
     * @param size
     * @return
     */
    Page<SalesDelivery> getSalesDeliveryPage(
            Integer page,
            Integer size
    );

    /**
     *
     * @param id
     * @param deliveryMethod
     * @param deliveryDate
     * @param deliveryAddress
     * @param contactPerson
     * @param contactPhone
     * @return
     */
    SalesDelivery updateDelivery(
            Integer id,
            String deliveryMethod,
            LocalDate deliveryDate,
            String deliveryAddress,
            String contactPerson,
            String contactPhone
    );

    /**
     *
     * @param id
     */
    void deleteDelivery(
            Integer id
    );
}
