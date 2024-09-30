package com.sample.aone.mapper;

import com.sample.aone.dto.UnitMasterDto;
import com.sample.aone.entity.UnitMaster;

public class UnitMasterMapper {

    public static UnitMasterDto mapToUnitMasterDto(UnitMaster unitMaster){
        return new UnitMasterDto(
                unitMaster.getId(),
                unitMaster.getUnitTypeName(),
                unitMaster.getUnitSymbol(),
                unitMaster.getFormalName(),
                unitMaster.getUnitQuantityCode(),
                unitMaster.getNumberOfDecimalPlaces()
        );
    }

    public static UnitMaster mapToUnitMaster(UnitMasterDto unitMasterDto){
        return new UnitMaster(
                unitMasterDto.getId(),
                unitMasterDto.getUnitTypeName(),
                unitMasterDto.getUnitSymbol(),
                unitMasterDto.getFormalName(),
                unitMasterDto.getUnitQuantityCode(),
                unitMasterDto.getNumberOfDecimalPlaces()
        );
    }
}
