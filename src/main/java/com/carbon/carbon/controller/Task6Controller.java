package com.carbon.carbon.controller;

import com.carbon.carbon.ResponseMessage;
import com.carbon.carbon.pojo.TenderInfo;
import com.carbon.carbon.pojo.TenderRecord;
import com.carbon.carbon.service.Task6Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tender")
public class Task6Controller {
    @Autowired
    private Task6Service task6Service;
    @GetMapping("list")
    public ResponseMessage<List<TenderInfo>> getTenderList() {
        return ResponseMessage.success(task6Service.getTenderInfoList());
    }
    @PostMapping("register")
    public ResponseMessage<TenderRecord> register(@RequestParam Integer tenderId) {
        return ResponseMessage.success(task6Service.registerTender(tenderId));
    }
}
