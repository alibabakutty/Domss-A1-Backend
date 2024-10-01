package com.sample.aone.service;

import com.sample.aone.dto.StockItemMasterDto;

import java.util.List;

public interface StockItemMasterService {
    StockItemMasterDto createStockItemMaster(StockItemMasterDto stockItemMasterDto);

    StockItemMasterDto getStockItemMaster(String stockItemName);

    List<StockItemMasterDto> getAllStockItemMasters();

    StockItemMasterDto updateStockItemMaster(String stockItemName, StockItemMasterDto updateStockItemMaster);

    void deleteStockItemMasterById(Long id);
}
