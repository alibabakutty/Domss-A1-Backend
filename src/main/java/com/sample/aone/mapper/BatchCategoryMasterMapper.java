package com.sample.aone.mapper;

import com.sample.aone.dto.BatchCategoryMasterDto;
import com.sample.aone.entity.BatchCategoryMaster;

public class BatchCategoryMasterMapper {

    public static BatchCategoryMasterDto maptoBatchCategoryMasterDto(BatchCategoryMaster batchCategoryMaster){
        return new BatchCategoryMasterDto(
                batchCategoryMaster.getId(),
                batchCategoryMaster.getBatchCategoryName()
        );
    }

    public static BatchCategoryMaster mapToBatchCategoryMaster(BatchCategoryMasterDto batchCategoryMasterDto){
        return new BatchCategoryMaster(
                batchCategoryMasterDto.getId(),
                batchCategoryMasterDto.getBatchCategoryName()
        );
    }
}
