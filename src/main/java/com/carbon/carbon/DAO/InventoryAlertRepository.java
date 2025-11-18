package com.carbon.carbon.DAO;

import com.carbon.carbon.pojo.InventoryAlert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryAlertRepository extends JpaRepository<InventoryAlert, Integer> {
}
