package com.carbon.carbon.controller;

import com.carbon.carbon.ResponseMessage;
import com.carbon.carbon.pojo.DTO.DataSummaryDTO;
import com.carbon.carbon.pojo.DTO.EnergyOverviewDTO;
import com.carbon.carbon.pojo.DTO.EnergyRatioDTO;
import com.carbon.carbon.pojo.InventoryAlert;
import com.carbon.carbon.pojo.ProductionData;
import com.carbon.carbon.pojo.SaleData;
import com.carbon.carbon.service.Task4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(name = "/visualization")
public class Task4Controller {
    @Autowired
    private Task4Service task4Service;
    //能耗总览接口
    @GetMapping("/energy/overview")
    public ResponseMessage<EnergyOverviewDTO> getEnergyOverview(){
        return ResponseMessage.success(task4Service.getEnergyOverview());
    }
    //能耗占比数据接口
    @GetMapping("/energy/ratio")
    public ResponseMessage<EnergyRatioDTO> getEnergyRatio(){
        return ResponseMessage.success(task4Service.getEnergyRatio());
    }
    //库存预警数据接口
    @GetMapping("/inventory/alert")
    public ResponseMessage<List<InventoryAlert>> getInventoryAlert(){
        return ResponseMessage.success(task4Service.getInventoryAlert());
    }
    @GetMapping("/data/summary")
    public ResponseMessage<DataSummaryDTO> getDataSummary(){
        return ResponseMessage.success(task4Service.getDataSummary());
    }
    //销售计划完成率接口（看不懂）
    //@GetMapping("/visualization/sales/plan/completion")
    @GetMapping("/sales/statistics")
    public ResponseMessage<List<SaleData>>  getSaleStatistics(){
        return ResponseMessage.success(task4Service.getSaleStatistics());
    }
    //销售排名Top8
    @GetMapping("/sales/ranking")
    public ResponseMessage<List<SaleData>> getSaleRanking(){
        return ResponseMessage.success(task4Service.getSaleRanking());
    }
    //生产统计数据
    @GetMapping("/production/statistics")
    public ResponseMessage<List<ProductionData>>  getProductionStatistics(){
        return ResponseMessage.success(task4Service.getProductionStatistics());
    }
}
