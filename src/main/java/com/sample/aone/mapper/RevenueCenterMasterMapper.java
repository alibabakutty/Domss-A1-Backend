package com.sample.aone.mapper;

import com.sample.aone.dto.RevenueCenterMasterDto;
import com.sample.aone.entity.RevenueCenterMaster;

public class RevenueCenterMasterMapper {

    public static RevenueCenterMasterDto mapToRevenueCenterMasterDto(RevenueCenterMaster revenueCenterMaster){
        return new RevenueCenterMasterDto(
                revenueCenterMaster.getId(),
                revenueCenterMaster.getRevenueCenterName(),
                revenueCenterMaster.getRevenueCategoryName()
        );
    }

    public static RevenueCenterMaster mapToRevenueCenterMaster(RevenueCenterMasterDto revenueCenterMasterDto){
        return new RevenueCenterMaster(
                revenueCenterMasterDto.getId(),
                revenueCenterMasterDto.getRevenueCenterName(),
                revenueCenterMasterDto.getRevenueCategoryName()
        );
    }
}
