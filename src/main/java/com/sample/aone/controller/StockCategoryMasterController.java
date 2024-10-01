package com.sample.aone.controller;

import com.sample.aone.dto.StockCategoryMasterDto;
import com.sample.aone.service.StockCategoryMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("stockCategoryMasterApi")
public class StockCategoryMasterController {

    @Autowired
    private StockCategoryMasterService stockCategoryMasterService;

    //Build ADD Masters REST API
    @PostMapping("/addStockCategory")
    public ResponseEntity<StockCategoryMasterDto> createStockCategoryMaster(@RequestBody StockCategoryMasterDto stockCategoryMasterDto){
        StockCategoryMasterDto saveStockCategoryMaster = stockCategoryMasterService.createStockCategoryMaster(stockCategoryMasterDto);
        return new ResponseEntity<>(saveStockCategoryMaster, HttpStatus.CREATED);
    }

    //Build GET Master Ids REST API
    @RequestMapping("displayStockCategory/{stockCategoryName}")
    public ResponseEntity<StockCategoryMasterDto> getDataByStockCategoryName(@PathVariable String stockCategoryName){
        StockCategoryMasterDto stockCategoryMasterDto = stockCategoryMasterService.getStockCategoryMaster(stockCategoryName);
        return ResponseEntity.ok(stockCategoryMasterDto);
    }

    //Build GET All Master Ids REST API
    @RequestMapping("/allStockCategories")
    public ResponseEntity<List<StockCategoryMasterDto>> getAllStockCategoryMasters(){
        List<StockCategoryMasterDto> allStockCategories = stockCategoryMasterService.getAllStockCategoryMasters();
        return ResponseEntity.ok(allStockCategories);
    }

    //Build UPDATE Master REST API
    @PutMapping("/alterStockCategoryMaster/{stockCategoryName}")
    public ResponseEntity<StockCategoryMasterDto> updateStockCategoryMaster(@PathVariable String stockCategoryName, @RequestBody StockCategoryMasterDto updateStockCategoryMaster){
        StockCategoryMasterDto stockCategoryMasterDto = stockCategoryMasterService.updateStockCategoryMaster(stockCategoryName,updateStockCategoryMaster);
        return ResponseEntity.ok(stockCategoryMasterDto);
    }

    //Build DELETE Ledger REST API
    @DeleteMapping("deleteStockCategoryMaster/{id}")
    public ResponseEntity<String> deleteStockCategoryMaster(@PathVariable Long id){
        stockCategoryMasterService.deleteStockCategoryMasterById(id);
        return ResponseEntity.ok("Stock category master deleted successfully!");
    }
}
