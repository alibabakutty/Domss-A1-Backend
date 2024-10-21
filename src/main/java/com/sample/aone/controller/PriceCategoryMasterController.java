package com.sample.aone.controller;

import com.sample.aone.entity.PriceCategoryMaster;
import com.sample.aone.service.PriceCategoryMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("priceCategoryMasterApi")
public class PriceCategoryMasterController {

    @Autowired
    private PriceCategoryMasterService priceCategoryMasterService;

    //Build ADD Masters REST API
    @PostMapping("/addPriceCategory")
    public ResponseEntity<PriceCategoryMaster> createPriceCategoryMaster(@RequestBody PriceCategoryMaster priceCategoryMaster){
        PriceCategoryMaster savePriceCategory = priceCategoryMasterService.createPriceCategoryMaster(priceCategoryMaster);
        return new ResponseEntity<>(savePriceCategory, HttpStatus.CREATED);
    }

    //Build GET Master Ids REST API
    @RequestMapping("displayPriceCategory/{priceCategoryName}")
    public ResponseEntity<PriceCategoryMaster> getPriceCategoryName(@PathVariable String priceCategoryName){
        Optional<PriceCategoryMaster> priceCategoryMaster = priceCategoryMasterService.getPriceCategoryName(priceCategoryName);
        return priceCategoryMaster.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    //Build GET All Master Ids REST API
    @RequestMapping("/allPriceCategories")
    public ResponseEntity<List<PriceCategoryMaster>> getAllPriceCategoryMasters(){
        List<PriceCategoryMaster> priceCategoryMasters = priceCategoryMasterService.getAllPriceCategoryMasters();
        return new ResponseEntity<>(priceCategoryMasters, HttpStatus.OK);
    }

    //Build UPDATE Master REST API
    @PutMapping("/alterPriceCategoryMaster/{priceCategoryName}")
    public ResponseEntity<PriceCategoryMaster> updatePriceCategoryMaster(@PathVariable String priceCategoryName, @RequestBody PriceCategoryMaster updatePriceCategory){
        PriceCategoryMaster updatePrice = priceCategoryMasterService.updatePriceCategoryMaster(priceCategoryName, updatePriceCategory);
        return ResponseEntity.ok(updatePrice);
    }

    //Build DELETE Ledger REST API
    @DeleteMapping("deletePriceCategoryMaster/{id}")
    public ResponseEntity<Void> deletePriceCategoryMaster(@PathVariable Long id){
        priceCategoryMasterService.deletePriceCategoryMaster(id);
        return ResponseEntity.noContent().build();
    }
}
