package com.sample.aone.controller;

import com.sample.aone.dto.SundryDebtorMasterDto;
import com.sample.aone.entity.SundryDebtorMaster;
import com.sample.aone.service.SundryDebtorMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @RequestMapping("/displaySundryDebtor/{sundryDebtorName}")
    public ResponseEntity<SundryDebtorMaster> getSundryDebtorByName(@PathVariable String sundryDebtorName){
        Optional<SundryDebtorMaster> sundryDebtorMaster = sundryDebtorMasterService.getSundryDebtorName(sundryDebtorName);
        return sundryDebtorMaster.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
    }

    @RequestMapping("/allSundryDebtors")
    public ResponseEntity<List<SundryDebtorMaster>> getAllSundryDebtors(){
        List<SundryDebtorMaster> sundryDebtors = sundryDebtorMasterService.getAllSundryDebtors();
        return new ResponseEntity<>(sundryDebtors, HttpStatus.OK);
    }

    @PutMapping("/alterSundryDebtorMaster/{sundryDebtorName}")
    public ResponseEntity<SundryDebtorMaster> updateSundryDebtor(@PathVariable String sundryDebtorName, @RequestBody SundryDebtorMaster updateSundryDebtorMaster){
        SundryDebtorMaster updateDebtor = sundryDebtorMasterService.updateSundryDebtorMaster(sundryDebtorName, updateSundryDebtorMaster);
        return ResponseEntity.ok(updateDebtor);
    }
    @DeleteMapping("deleteSundryDebtorMaster/{id}")
    public ResponseEntity<Void> deleteSundryDebtorMaster(@PathVariable Long id){
        sundryDebtorMasterService.deleteSundryDebtorMaster(id);
        return ResponseEntity.noContent().build();
    }
}
