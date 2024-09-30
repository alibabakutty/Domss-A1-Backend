package com.sample.aone.mapper;

import com.sample.aone.dto.StockItemMasterDto;
import com.sample.aone.entity.StockItemMaster;

public class StockItemMasterMapper {

    public static StockItemMasterDto mapToStockItemMasterDto(StockItemMaster stockItemMaster){
        return new StockItemMasterDto(
                stockItemMaster.getId(),
                stockItemMaster.getStockItemName(),
                stockItemMaster.getUnder(),
                stockItemMaster.getUnits(),
                stockItemMaster.getGstApplicability(),
                stockItemMaster.getHsnOrSacDetails(),
                stockItemMaster.getSourceOfDetails(),
                stockItemMaster.getHsnOrSac(),
                stockItemMaster.getDescription(),
                stockItemMaster.getTypeOfSupply(),
                stockItemMaster.getIsInclusiveOfDutiesAndTaxes(),
                stockItemMaster.getRateOfDuty()
        );
    }

    public static StockItemMaster mapToStockItemMaster(StockItemMasterDto stockItemMasterDto){
        return new StockItemMaster(
                stockItemMasterDto.getId(),
                stockItemMasterDto.getStockItemName(),
                stockItemMasterDto.getUnder(),
                stockItemMasterDto.getUnits(),
                stockItemMasterDto.getGstApplicability(),
                stockItemMasterDto.getHsnOrSacDetails(),
                stockItemMasterDto.getSourceOfDetails(),
                stockItemMasterDto.getHsnOrSac(),
                stockItemMasterDto.getDescription(),
                stockItemMasterDto.getTypeOfSupply(),
                stockItemMasterDto.getIsInclusiveOfDutiesAndTaxes(),
                stockItemMasterDto.getRateOfDuty()
        );
    }
}
