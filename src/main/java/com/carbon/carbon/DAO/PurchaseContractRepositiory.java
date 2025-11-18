package com.carbon.carbon.DAO;

import com.carbon.carbon.pojo.PurchaseContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseContractRepositiory extends JpaRepository<PurchaseContract, Integer> {
}
