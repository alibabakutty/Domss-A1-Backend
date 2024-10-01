package com.sample.aone.service;

import com.sample.aone.dto.StockGroupMasterDto;

import java.util.List;

public interface StockGroupMasterService {
    StockGroupMasterDto createStockGroupMaster(StockGroupMasterDto stockGroupMasterDto);

    StockGroupMasterDto getStockGroupMaster(String stockGroupName);

    List<StockGroupMasterDto> getAllStockGroupMasters();

    StockGroupMasterDto updateStockGroupMaster(String stockGroupName, StockGroupMasterDto updateStockGroupMaster);

    void deleteByStockGroupMasterId(Long id);
}
