package com.carbon.carbon.service;

import com.carbon.carbon.DAO.TenderInfoRepository;
import com.carbon.carbon.DAO.TenderRecordRepository;
import com.carbon.carbon.pojo.TenderInfo;
import com.carbon.carbon.pojo.TenderRecord;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface Task6Service {
    /**
     *
     * @return
     */
    List<TenderInfo> getTenderInfoList();

    /**
     *
     * @param tenderId
     * @return
     */
    TenderRecord registerTender(Integer tenderId);

}
