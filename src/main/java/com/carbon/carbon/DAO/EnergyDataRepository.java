package com.carbon.carbon.DAO;

import com.carbon.carbon.pojo.EnergyData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyDataRepository extends JpaRepository<EnergyData,Integer> {
}
