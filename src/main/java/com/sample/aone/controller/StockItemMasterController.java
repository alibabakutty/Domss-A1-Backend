package com.sample.aone.controller;

import com.sample.aone.entity.StockItemMaster;
import com.sample.aone.service.StockItemMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("stockItemMasterApi")
public class StockItemMasterController {

    @Autowired
    private StockItemMasterService stockItemMasterService;


    //Build ADD Masters REST API
    @PostMapping("/addStockItem")
    public ResponseEntity<StockItemMaster> createStockItemMaster(@RequestBody StockItemMaster stockItemMaster){
        StockItemMaster saveStockItemMaster = stockItemMasterService.createStockItemMaster(stockItemMaster);
        return new ResponseEntity<>(stockItemMaster, HttpStatus.CREATED);
    }

    //Build GET Master Ids REST API
    @RequestMapping("/displayStockItem/{stockItemName}")
    public ResponseEntity<StockItemMaster> getStockItemName(@PathVariable String stockItemName){
        Optional<StockItemMaster> stockItemMaster = stockItemMasterService.getStockItemName(stockItemName);
        return stockItemMaster.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Build GET All Master Ids REST API
    @RequestMapping("/allStockItems")
    public ResponseEntity<List<StockItemMaster>> getAllStockItemMaster(){
        List<StockItemMaster> stockItemMasters = stockItemMasterService.getAllStockItemMasters();
        return new ResponseEntity<>(stockItemMasters, HttpStatus.OK);
    }

    //Build UPDATE Master REST API
    @PutMapping("/alterStockItemMaster/{stockItemName}")
    public ResponseEntity<StockItemMaster> updateStockItemMaster(@PathVariable String stockItemName, @RequestBody StockItemMaster updateStockItem){
        StockItemMaster updateItem = stockItemMasterService.updateStockItemMaster(stockItemName,updateStockItem);
        return ResponseEntity.ok(updateItem);
    }

    //Build DELETE Ledger REST API
    @DeleteMapping("deleteStockItemMaster/{id}")
    public ResponseEntity<Void> deleteStockItemMaster(@PathVariable Long id){
        stockItemMasterService.deleteStockItemMaster(id);
        return ResponseEntity.noContent().build();
    }

}
