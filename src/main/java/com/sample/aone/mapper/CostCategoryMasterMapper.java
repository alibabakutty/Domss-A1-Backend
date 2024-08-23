package com.sample.aone.mapper;

import com.sample.aone.dto.CostCategoryMasterDto;
import com.sample.aone.entity.CostCategoryMaster;

public class CostCategoryMasterMapper {

    public static CostCategoryMasterDto mapToCostCategoryMasterDto(CostCategoryMaster costCategoryMaster){
        return new CostCategoryMasterDto(
                costCategoryMaster.getId(),
                costCategoryMaster.getCostCategoryName()
        );
    }

    public static CostCategoryMaster mapToCostCategoryMaster(CostCategoryMasterDto costCategoryMasterDto){
        return new CostCategoryMaster(
                costCategoryMasterDto.getId(),
                costCategoryMasterDto.getCostCategoryName()
        );
    }
}
