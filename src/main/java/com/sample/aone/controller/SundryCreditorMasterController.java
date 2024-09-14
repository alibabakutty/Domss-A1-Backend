package com.sample.aone.controller;

import com.sample.aone.dto.SundryCreditorMasterDto;
import com.sample.aone.entity.SundryCreditorMaster;
import com.sample.aone.service.SundryCreditorMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("sundryCreditorMasterApi")
public class SundryCreditorMasterController {

    @Autowired
    private SundryCreditorMasterService sundryCreditorMasterService;

    @PostMapping("/addSundryCreditor")
    public ResponseEntity<SundryCreditorMaster> createSundryCreditorMaster(@RequestBody SundryCreditorMaster sundryCreditorMaster){
        SundryCreditorMaster saveSundryCreditorMaster = sundryCreditorMasterService.createSundryCreditorMaster(sundryCreditorMaster);
        return new ResponseEntity<>(saveSundryCreditorMaster, HttpStatus.CREATED);
    }
}
