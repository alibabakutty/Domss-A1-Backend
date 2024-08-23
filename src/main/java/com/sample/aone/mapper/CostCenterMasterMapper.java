package com.sample.aone.mapper;

import com.sample.aone.dto.CostCenterMasterDto;
import com.sample.aone.entity.CostCenterMaster;

public class CostCenterMasterMapper {

    public static CostCenterMasterDto mapToCostCenterMasterDto(CostCenterMaster costCenterMaster){
        return new CostCenterMasterDto(
                costCenterMaster.getId(),
                costCenterMaster.getCostCenterName(),
                costCenterMaster.getCostCategoryName()
        );
    }

    public static CostCenterMaster mapToCostCenterMaster(CostCenterMasterDto costCenterMasterDto){
        return new CostCenterMaster(
                costCenterMasterDto.getId(),
                costCenterMasterDto.getCostCenterName(),
                costCenterMasterDto.getCostCategoryName()
        );
    }
}
