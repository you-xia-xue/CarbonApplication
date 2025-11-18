package com.carbon.carbon.DAO;

import com.carbon.carbon.pojo.OutBoundApply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutBoundRepository extends JpaRepository<OutBoundApply, Integer> {
}
