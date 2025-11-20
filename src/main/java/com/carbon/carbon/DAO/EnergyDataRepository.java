package com.carbon.carbon.DAO;

import com.carbon.carbon.pojo.EnergyData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnergyDataRepository extends JpaRepository<EnergyData,Integer> {
   @Query("SELECT SUM(electricity) FROM EnergyData electricity、")

    Integer sumByElectricity();
    @Query("SELECT SUM(e.water) FROM EnergyData e")
    Integer sumByWater();
    @Query("SELECT SUM(e.carbon) FROM EnergyData e")
    Integer sumByCarbon();
    @Query("SELECT SUM(e.officeWater) FROM EnergyData e")
    Integer sumByOfficeWater();
    @Query("SELECT SUM(e.officeElectricity) FROM EnergyData e")
    Integer sumByOfficeElectricity();
    @Query("SELECT SUM(e.productionWater) FROM EnergyData e")
    Integer sumByProductionWater();
    @Query("SELECT SUM(e.productionElectricity) FROM EnergyData e")
    Integer sumByProductionElectricity();
    @Query("SELECT SUM(e.carbon)FROM EnergyData e WHERE YEAR(e.date) = YEAR(NOW())")
    Integer sumCarbonByYear();
    @Query("SELECT SUM(e.carbon)FROM EnergyData e WHERE YEAR(e.date) = MONTH(NOW())")
    Integer sumCarbonByMonth();
    @Query("SELECT SUM(e.carbon)FROM EnergyData e WHERE YEAR(e.date) = DAY(NOW())")
    Integer sumCarbonByDay();
    List<EnergyData> findFirst8ByOrderByCarbonDesc();
}
