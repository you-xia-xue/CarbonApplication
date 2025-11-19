package com.carbon.carbon.controller;

import com.carbon.carbon.DAO.SalesDeliveryRepository;
import com.carbon.carbon.ResponseMessage;
import com.carbon.carbon.pojo.SalesDelivery;
import com.carbon.carbon.service.CarbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/sales/")
public class task5_Controller {
    @Autowired
    private CarbonService carbonService;
    @GetMapping("/delivery/list")
    public Page<SalesDelivery> getSalesDeliveryPage(){
    return null;
    }
}
