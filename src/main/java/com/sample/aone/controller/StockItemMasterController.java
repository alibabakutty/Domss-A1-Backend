package com.sample.aone.controller;

import com.sample.aone.dto.StockItemMasterDto;
import com.sample.aone.service.StockItemMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("stockItemMasterApi")
public class StockItemMasterController {

    @Autowired
    private StockItemMasterService stockItemMasterService;


    //Build ADD Masters REST API
    @PostMapping("/addStockItem")
    public ResponseEntity<StockItemMasterDto> createStockItemMaster(@RequestBody StockItemMasterDto stockItemMasterDto){
        StockItemMasterDto saveStockItemMaster = stockItemMasterService.createStockItemMaster(stockItemMasterDto);
        return new ResponseEntity<>(saveStockItemMaster, HttpStatus.CREATED);
    }

    //Build GET Master Ids REST API
    @RequestMapping("displayStockItem/{stockItemName}")
    public ResponseEntity<StockItemMasterDto> getDataByStockItemName(@PathVariable String stockItemName){
        StockItemMasterDto stockItemMasterDto = stockItemMasterService.getStockItemMaster(stockItemName);
        return ResponseEntity.ok(stockItemMasterDto);
    }

    //Build GET All Master Ids REST API
    @RequestMapping("/allStockItems")
    public ResponseEntity<List<StockItemMasterDto>> getAllStockItemMasters(){
        List<StockItemMasterDto> allStockItemMasters = stockItemMasterService.getAllStockItemMasters();
        return ResponseEntity.ok(allStockItemMasters);
    }

    //Build UPDATE Master REST API
    @PutMapping("/alterStockItemMaster/{stockItemName}")
    public ResponseEntity<StockItemMasterDto> updateStockItemMaster(@PathVariable String stockItemName, @RequestBody StockItemMasterDto updateStockItemMaster){
        StockItemMasterDto stockItemMasterDto = stockItemMasterService.updateStockItemMaster(stockItemName, updateStockItemMaster);
        return ResponseEntity.ok(stockItemMasterDto);
    }

    //Build DELETE Ledger REST API
    @DeleteMapping("deleteStockItemMaster/{id}")
    public ResponseEntity<String> deleteStockItemMaster(@PathVariable Long id){
        stockItemMasterService.deleteStockItemMasterById(id);
        return ResponseEntity.ok("Stock Item Master deleted successfully!");
    }
}
