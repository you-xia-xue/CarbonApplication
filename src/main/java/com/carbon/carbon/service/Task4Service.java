package com.carbon.carbon.service;

import com.carbon.carbon.pojo.DTO.DataSummaryDTO;
import com.carbon.carbon.pojo.DTO.EnergyOverviewDTO;
import com.carbon.carbon.pojo.DTO.EnergyRatioDTO;
import com.carbon.carbon.pojo.InventoryAlert;
import com.carbon.carbon.pojo.ProductionData;
import com.carbon.carbon.pojo.SaleData;

import java.util.List;

public interface Task4Service {
    /**
     *
     * @return
     */
    EnergyOverviewDTO getEnergyOverview();

    /**
     *
     * @return
     */
    EnergyRatioDTO getEnergyRatio();

    /**
     *
     * @return
     */
    List<InventoryAlert> getInventoryAlert();

    /**
     *
     * @return
     */
    DataSummaryDTO getDataSummary();


    /**
     *
     * @return
     */
    List<SaleData> getSaleStatistics();

    /**
     *
     * @return
     */
    List<SaleData> getSaleRanking();

    /**
     *
     * @return
     */
    List<ProductionData> getProductionStatistics();
}
