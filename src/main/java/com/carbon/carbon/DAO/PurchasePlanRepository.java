package com.carbon.carbon.DAO;

import com.carbon.carbon.pojo.PurchasePlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchasePlanRepository extends JpaRepository<PurchasePlan, Integer> {
}
