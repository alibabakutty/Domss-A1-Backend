package com.sample.aone.controller;

import com.sample.aone.dto.StockGroupMasterDto;
import com.sample.aone.service.StockGroupMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("stockGroupMasterApi")
public class StockGroupMasterController {

    @Autowired
    private StockGroupMasterService stockGroupMasterService;

    //Build ADD Masters REST API
    @PostMapping("/addStockGroup")
    public ResponseEntity<StockGroupMasterDto> createStockGroupMaster(@RequestBody StockGroupMasterDto stockGroupMasterDto){
        StockGroupMasterDto saveStockGroupMaster = stockGroupMasterService.createStockGroupMaster(stockGroupMasterDto);
        return new ResponseEntity<>(saveStockGroupMaster, HttpStatus.CREATED);
    }

    //Build GET Master Ids REST API
    @RequestMapping("displayStockGroup/{stockGroupName}")
    public ResponseEntity<StockGroupMasterDto> getDataByStockGroupName(@PathVariable String stockGroupName){
        StockGroupMasterDto stockGroupMasterDto = stockGroupMasterService.getStockGroupMaster(stockGroupName);
        return ResponseEntity.ok(stockGroupMasterDto);
    }

    //Build GET All Master Ids REST API
    @RequestMapping("/allStockGroups")
    public ResponseEntity<List<StockGroupMasterDto>> getAllStockGroupMasters(){
        List<StockGroupMasterDto> allStockGroups = stockGroupMasterService.getAllStockGroupMasters();
        return ResponseEntity.ok(allStockGroups);
    }

    //Build UPDATE Master REST API
    @PutMapping("/alterStockGroupMaster/{stockGroupName}")
    public ResponseEntity<StockGroupMasterDto> updateStockGroupMaster(@PathVariable String stockGroupName, @RequestBody StockGroupMasterDto updatedStockGroupMaster){
        StockGroupMasterDto stockGroupMasterDto = stockGroupMasterService.updateStockGroupMaster(stockGroupName,updatedStockGroupMaster);
        return ResponseEntity.ok(stockGroupMasterDto);
    }

    //Build DELETE Ledger REST API
    @DeleteMapping("deleteStockGroupMaster/{id}")
    public ResponseEntity<String> deleteStockGroupMaster(@PathVariable Long id){
        stockGroupMasterService.deleteByStockGroupMasterId(id);
        return ResponseEntity.ok("Stock group master deleted successfully!");
    }
}
