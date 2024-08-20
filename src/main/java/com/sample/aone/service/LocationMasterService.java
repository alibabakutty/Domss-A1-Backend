package com.sample.aone.service;

import com.sample.aone.dto.LocationMasterDto;

import java.util.List;

public interface LocationMasterService {
    LocationMasterDto createLocationMaster(LocationMasterDto locationMasterDto);

    LocationMasterDto getGodownName(String godownName);

    List<LocationMasterDto> getAllLocationMasters();

    LocationMasterDto updateLocationMaster(String godownName, LocationMasterDto updateLocationMaster);

    void deleteByLocationMaster(Long id);
}
