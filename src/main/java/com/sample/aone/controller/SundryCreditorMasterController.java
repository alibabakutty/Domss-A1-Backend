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

//    @RequestMapping("displaySundryCreditor/{sundryCreditorName}")
//    public ResponseEntity<Optional<SundryCreditorMaster>> findDataBySundryCreditorName(@PathVariable String sundryCreditorName){
//        Optional<SundryCreditorMasterDto> sundryCreditorMasterDto = sundryCreditorMasterService.getSundryCreditorMasterByName(sundryCreditorName);
//        return ResponseEntity.ok(sundryCreditorMasterDto);
//    }
//
//    @RequestMapping("/allSundryCreditors")
//    public ResponseEntity<List<SundryCreditorMasterDto>> getAllSundryCreditorMaster(){
//        List<SundryCreditorMasterDto> allSundryCreditorMaster = sundryCreditorMasterService.getAllSundryCreditorMasters();
//        return ResponseEntity.ok(allSundryCreditorMaster);
//    }
//
//    @PutMapping("/alterSundryCreditorMaster/{sundryCreditorName}")
//    public ResponseEntity<SundryCreditorMasterDto> updateSundryCreditorMaster(@PathVariable String sundryCreditorName, @RequestBody SundryCreditorMasterDto updateSundryCreditorMaster){
//        SundryCreditorMasterDto sundryCreditorMasterDto = sundryCreditorMasterService.updateSundryCreditorMaster(sundryCreditorName,updateSundryCreditorMaster);
//        return ResponseEntity.ok(sundryCreditorMasterDto);
//    }
//
//    @DeleteMapping("/deleteSundryCreditor/{id}")
//    public ResponseEntity<String> deleteSundryCreditorMaster(@PathVariable Long id){
//        sundryCreditorMasterService.deleteSundryCreditorMasterById(id);
//        return ResponseEntity.ok("Sundry creditor master deleted successfully!");
//    }
}
