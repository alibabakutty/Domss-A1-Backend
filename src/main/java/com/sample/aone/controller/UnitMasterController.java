package com.sample.aone.controller;

import com.sample.aone.dto.UnitMasterDto;
import com.sample.aone.service.UnitMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("unitMasterApi")
public class UnitMasterController {

    @Autowired
    private UnitMasterService unitMasterService;


    //Build ADD Masters REST API
    @PostMapping("/addUnit")
    public ResponseEntity<UnitMasterDto> createUnitMaster(@RequestBody UnitMasterDto unitMasterDto){
        UnitMasterDto saveUnitMaster = unitMasterService.createUnitMaster(unitMasterDto);
        return new ResponseEntity<>(saveUnitMaster, HttpStatus.CREATED);
    }

    //Build GET Master Ids REST API
    @RequestMapping("displayUnit/{unitSymbolName}")
    public ResponseEntity<UnitMasterDto> getDataByUnitMaster(@PathVariable String unitSymbolName){
        UnitMasterDto unitMasterDto = unitMasterService.getUnitMaster(unitSymbolName);
        return ResponseEntity.ok(unitMasterDto);
    }

    //Build GET All Master Ids REST API
    @RequestMapping("/allUnits")
    public ResponseEntity<List<UnitMasterDto>> getAllUnitMasters(){
        List<UnitMasterDto> allUnits = unitMasterService.getAllUnitMasters();
        return ResponseEntity.ok(allUnits);
    }

    //Build UPDATE Master REST API
    @PutMapping("alterUnitMaster/{unitSymbolName}")
    public ResponseEntity<UnitMasterDto> updateUnitMaster(@PathVariable String unitSymbolName, @RequestBody UnitMasterDto updateUnitMaster){
        UnitMasterDto unitMasterDto = unitMasterService.updateUnitMaster(unitSymbolName,updateUnitMaster);
        return ResponseEntity.ok(unitMasterDto);
    }

    //Build DELETE Ledger REST API
    @DeleteMapping("deleteUnitMaster/{id}")
    public ResponseEntity<String> deleteUnitMaster(@PathVariable Long id){
        unitMasterService.deleteUnitMasterById(id);
        return ResponseEntity.ok("Unit master deleted successfully!");
    }
}
