package com.sample.aone.service;

import com.sample.aone.dto.StockItemMasterDto;
import com.sample.aone.entity.StockItemMaster;

import java.util.List;
import java.util.Optional;

public interface StockItemMasterService {

    // create stock item master
    StockItemMaster createStockItemMaster(StockItemMaster stockItemMaster);

    // Display or get a StockItemMaster by name
    Optional<StockItemMaster> getStockItemName(String stockItemName);

    // Method to get all StockItemMasters
    List<StockItemMaster> getAllStockItemMasters();

    // Alter or update a StockItemMaster
    StockItemMaster updateStockItemMaster(String stockItemName, StockItemMaster updateStockItemMaster);

    // Delete a StockItemMaster by id
    void deleteStockItemMaster(Long id);
}
