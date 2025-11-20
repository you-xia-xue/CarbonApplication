package com.carbon.carbon.controller;

import com.carbon.carbon.ResponseMessage;
import com.carbon.carbon.pojo.SalesDelivery;
import com.carbon.carbon.service.Task5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/sales")
public class Task5Controller {
    @Autowired
    private Task5Service task5Service;
    @GetMapping("/delivery/list")
    public ResponseEntity<Page<SalesDelivery>> getSalesDeliveryPage(
            @RequestParam(required = false)Integer page,
            @RequestParam(required = false)Integer size,
            @RequestParam(required = false)String deliveryNo,
            @RequestParam(required = false)String contractNo,
            @RequestParam(required = false) LocalDate deliveryDate,
            @RequestParam(required = false)String outStockStatus,
            @RequestParam(required = false)LocalDateTime createTime){
    return ResponseEntity.ok(task5Service.getSalesDeliveryPage(page,size));
    }
    @PostMapping("/delivery/update")
    public ResponseMessage<SalesDelivery> updateDelivery(
            @RequestParam("id") Integer id,
            @RequestParam(required =false) String deliveryMethod,
            @RequestParam(required = false) LocalDate deliveryDate,
            @RequestParam(required = false) String deliveryAddress,
            @RequestParam(required = false) String contactPerson,
            @RequestParam(required = false) String contactPhone,
            @RequestParam(required = false) String remakes
            ){
        return ResponseMessage.success(task5Service.updateDelivery(
                id,
                deliveryMethod,
                deliveryDate,
                deliveryAddress,
                contactPerson,
                contactPhone
        ));
    }
    @DeleteMapping("/delivery/delete")
    public ResponseMessage<SalesDelivery> deleteDelivery(@RequestParam("id") Integer id){
        task5Service.deleteDelivery(id);
        return ResponseMessage.success(null);
    }
}
