package com.sample.aone.mapper;

import com.sample.aone.dto.RevenueCategoryMasterDto;
import com.sample.aone.entity.RevenueCategoryMaster;

public class RevenueCategoryMasterMapper {

     public static RevenueCategoryMasterDto mapToRevenueCategoryMasterDto(RevenueCategoryMaster revenueCategoryMaster){
        return new RevenueCategoryMasterDto(
                revenueCategoryMaster.getId(),
                revenueCategoryMaster.getRevenueCategoryName()
        );
    }

    public static RevenueCategoryMaster mapToRevenueCategoryMaster(RevenueCategoryMasterDto revenueCategoryMasterDto){
        return new RevenueCategoryMaster(
                revenueCategoryMasterDto.getId(),
                revenueCategoryMasterDto.getRevenueCategoryName()
        );
    }
}
