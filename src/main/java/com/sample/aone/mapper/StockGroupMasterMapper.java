package com.sample.aone.mapper;

import com.sample.aone.dto.StockGroupMasterDto;
import com.sample.aone.entity.StockGroupMaster;

public class StockGroupMasterMapper {

    public static StockGroupMasterDto mapToStockGroupMasterDto(StockGroupMaster stockGroupMaster){
        return new StockGroupMasterDto(
                stockGroupMaster.getId(),
                stockGroupMaster.getStockGroupName(),
                stockGroupMaster.getUnder(),
                stockGroupMaster.getShouldQuantitiesOfItemsBeAdded(),
                stockGroupMaster.getHsnOrSacDetails(),
                stockGroupMaster.getSourceOfDetails(),
                stockGroupMaster.getHsnOrSac(),
                stockGroupMaster.getDescription()
        );
    }

    public static StockGroupMaster mapToStockGroupMaster(StockGroupMasterDto stockGroupMasterDto){
        return new StockGroupMaster(
                stockGroupMasterDto.getId(),
                stockGroupMasterDto.getStockGroupName(),
                stockGroupMasterDto.getUnder(),
                stockGroupMasterDto.getShouldQuantitiesOfItemsBeAdded(),
                stockGroupMasterDto.getHsnOrSacDetails(),
                stockGroupMasterDto.getSourceOfDetails(),
                stockGroupMasterDto.getHsnOrSac(),
                stockGroupMasterDto.getDescription()
        );
    }
}
