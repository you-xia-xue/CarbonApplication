package com.carbon.carbon.DAO;

import com.carbon.carbon.pojo.TenderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenderInfoRepository extends JpaRepository<TenderInfo,Integer> {
}
