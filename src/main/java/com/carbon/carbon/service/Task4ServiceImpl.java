package com.carbon.carbon.service;

import com.carbon.carbon.DAO.EnergyDataRepository;
import com.carbon.carbon.DAO.InventoryAlertRepository;
import com.carbon.carbon.DAO.SalesDataRepository;
import com.carbon.carbon.pojo.DTO.DataSummaryDTO;
import com.carbon.carbon.pojo.DTO.EnergyOverviewDTO;
import com.carbon.carbon.pojo.DTO.EnergyRatioDTO;
import com.carbon.carbon.pojo.InventoryAlert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Task4ServiceImpl implements Task4Service{
    @Autowired
    EnergyDataRepository energyDataRepository;
    @Autowired
    SalesDataRepository salesDataRepository;
    @Autowired
    InventoryAlertRepository inventoryAlertRepository;
    @Override
    public EnergyOverviewDTO getEnergyOverview() {
        return new EnergyOverviewDTO(
                energyDataRepository.sumByElectricity(),
                energyDataRepository.sumByWater(),
                energyDataRepository.sumByCarbon()
        );
    }

    @Override
    public EnergyRatioDTO getEnergyRatio() {
        return new EnergyRatioDTO(
                energyDataRepository.sumByOfficeElectricity(),
                energyDataRepository.sumByOfficeWater(),
                energyDataRepository.sumByProductionWater(),
                energyDataRepository.sumByProductionElectricity()
        );
    }

    @Override
    public List<InventoryAlert> getInventoryAlert() {
        return inventoryAlertRepository.findAll();
    }

    @Override
    public DataSummaryDTO getDataSummary() {
        return new DataSummaryDTO(
                salesDataRepository.sumSalesByYear(),
                salesDataRepository.sumSalesByMonth(),
                salesDataRepository.sumSalesByDay(),
                energyDataRepository.sumCarbonByYear(),
                energyDataRepository.sumCarbonByMonth(),
                energyDataRepository.sumCarbonByDay(),
                energyDataRepository.findFirst8ByOrderByCarbonDesc());
    }
}
