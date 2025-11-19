package com.carbon.carbon.DAO;

import com.carbon.carbon.pojo.ProductionData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductionDataRepository extends JpaRepository<ProductionData,Integer> {
}
