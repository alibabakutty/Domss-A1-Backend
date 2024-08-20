package com.sample.aone.mapper;

import com.sample.aone.dto.LocationMasterDto;
import com.sample.aone.entity.LocationMaster;

public class LocationMasterMapper {

    public static LocationMasterDto mapToLocationMasterDto(LocationMaster locationMaster){
        return new LocationMasterDto(
                locationMaster.getId(),
                locationMaster.getGodownName()
        );
    }

    public static LocationMaster mapToLocationMaster(LocationMasterDto locationMasterDto){
        return new LocationMaster(
                locationMasterDto.getId(),
                locationMasterDto.getGodownName()
        );
    }
}
