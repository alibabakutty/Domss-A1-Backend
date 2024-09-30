package com.sample.aone.mapper;


import com.sample.aone.dto.StockCategoryMasterDto;
import com.sample.aone.entity.StockCategoryMaster;

public class StockCategoryMasterMapper {

    public static StockCategoryMasterDto mapToStockCategoryMasterDto(StockCategoryMaster stockCategoryMaster){
        return new StockCategoryMasterDto(
                stockCategoryMaster.getId(),
                stockCategoryMaster.getStockCategoryName(),
                stockCategoryMaster.getUnder()
        );
    }

    public static StockCategoryMaster mapToStockCategoryMaster(StockCategoryMasterDto stockCategoryMasterDto){
        return new StockCategoryMaster(
                stockCategoryMasterDto.getId(),
                stockCategoryMasterDto.getStockCategoryName(),
                stockCategoryMasterDto.getUnder()
        );
    }
}
