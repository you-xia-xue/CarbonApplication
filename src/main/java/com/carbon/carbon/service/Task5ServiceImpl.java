package com.carbon.carbon.service;

import com.carbon.carbon.DAO.SalesDeliveryRepository;
import com.carbon.carbon.pojo.SalesDelivery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class Task5ServiceImpl implements Task5Service{
    @Autowired
    private SalesDeliveryRepository salesDeliveryRepository;
    @Override
    public Page<SalesDelivery> getSalesDeliveryPage(Integer page, Integer size) {
        if (page == null){ page = 1;}
        if (size == null){ size = 10;}
        Pageable pageable = PageRequest.of(
                page-1,
                size,
                Sort.by("id").descending());
        return salesDeliveryRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public SalesDelivery updateDelivery(
            Integer id,
            String deliveryMethod,
            LocalDate deliveryDate,
            String deliveryAddress,
            String contactPerson,
            String contactPhone
    ) {
        SalesDelivery salesDelivery = salesDeliveryRepository.findById(id).orElseThrow(()->new RuntimeException("未找到该id"));
        salesDelivery.setDeliveryMethod(deliveryMethod);
        salesDelivery.setDeliveryDate(deliveryDate);
        salesDelivery.setDeliveryAddress(deliveryAddress);
        salesDelivery.setContactPerson(contactPerson);
        salesDelivery.setContactPhone(contactPhone);
        return salesDeliveryRepository.save(salesDelivery);
    }

    @Override
    public void deleteDelivery(Integer id) {
        SalesDelivery salesDelivery = salesDeliveryRepository.findById(id).orElseThrow(()->new RuntimeException("未找到该id"));
        salesDeliveryRepository.delete(salesDelivery);
    }


}
