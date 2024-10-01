package com.sample.aone.service;

import com.sample.aone.dto.StockCategoryMasterDto;

import java.util.List;

public interface StockCategoryMasterService {
    StockCategoryMasterDto createStockCategoryMaster(StockCategoryMasterDto stockCategoryMasterDto);

    StockCategoryMasterDto getStockCategoryMaster(String stockCategoryName);

    List<StockCategoryMasterDto> getAllStockCategoryMasters();

    StockCategoryMasterDto updateStockCategoryMaster(String stockCategoryName, StockCategoryMasterDto updateStockCategoryMaster);

    void deleteStockCategoryMasterById(Long id);
}
