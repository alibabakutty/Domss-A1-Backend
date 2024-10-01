package com.sample.aone.service;

import com.sample.aone.dto.UnitMasterDto;

import java.util.List;

public interface UnitMasterService {
    UnitMasterDto createUnitMaster(UnitMasterDto unitMasterDto);

    UnitMasterDto getUnitMaster(String unitSymbolName);

    List<UnitMasterDto> getAllUnitMasters();


    UnitMasterDto updateUnitMaster(String unitSymbolName, UnitMasterDto updateUnitMaster);

    void deleteUnitMasterById(Long id);
}
