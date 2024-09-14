package com.sample.aone.controller;

import com.sample.aone.dto.SundryDebtorMasterDto;
import com.sample.aone.entity.SundryDebtorMaster;
import com.sample.aone.service.SundryDebtorMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("sundryDebtorMasterApi")
public class SundryDebtorMasterController {

    @Autowired
    private SundryDebtorMasterService sundryDebtorMasterService;

    @PostMapping("/addSundryDebtor")
    public ResponseEntity<SundryDebtorMaster> createSundryDebtorMaster(@RequestBody SundryDebtorMaster sundryDebtorMaster){
        SundryDebtorMaster saveSundryDebtorMaster = sundryDebtorMasterService.createSundryDebtorMaster(sundryDebtorMaster);
        return new ResponseEntity<>(saveSundryDebtorMaster, HttpStatus.CREATED);
    }
}
