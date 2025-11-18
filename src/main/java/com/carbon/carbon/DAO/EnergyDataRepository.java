package com.carbon.carbon.DAO;

import com.carbon.carbon.pojo.EnergyData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnergyDataRepository extends JpaRepository<EnergyData,Integer> {
   @Query("SELECT SUM(electricity) FROM energy_data")
    Integer sumByElectricity();
    @Query("SELECT SUM(water) FROM energy_data")
    Integer sumByWater();
    @Query("SELECT SUM(carbon) FROM energy_data")
    Integer sumByCarbon();
    @Query("SELECT SUM(office_water) FROM energy_data")
    Integer sumByOfficeWater();
    @Query("SELECT SUM(office_electricity) FROM energy_data")
    Integer sumByOfficeElectricity();
    @Query("SELECT SUM(production_water) FROM energy_data")
    Integer sumByProductionWater();
    @Query("SELECT SUM(production_electricity) FROM energy_data")
    Integer sumByProductionElectricity();
    @Query("SELECT SUM(carbon)FROM energy_data WHERE YEAR(NOW())")
    Integer sumCarbonByYear();
    @Query("SELECT SUM(carbon)FROM energy_data WHERE MONTH(NOW())")
    Integer sumCarbonByMonth();
    @Query("SELECT SUM(carbon)FROM energy_data WHERE DAY(NOW())")
    Integer sumCarbonByDay();
    List<EnergyData> findFirst8ByOrderByCarbonDesc();
}
