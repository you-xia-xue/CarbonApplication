package com.carbon.carbon.DAO;

import com.carbon.carbon.pojo.TenderRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenderRecordRepository extends JpaRepository<TenderRecord,Integer> {
}
