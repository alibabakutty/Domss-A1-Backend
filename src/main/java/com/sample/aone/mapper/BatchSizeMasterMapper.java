package com.sample.aone.mapper;

import com.sample.aone.dto.BatchSizeMasterDto;
import com.sample.aone.entity.BatchSizeMaster;

public class BatchSizeMasterMapper {
    public static BatchSizeMasterDto mapToBatchSizeMasterDto(BatchSizeMaster batchSizeMaster){
        return new BatchSizeMasterDto(
                batchSizeMaster.getId(),
                batchSizeMaster.getBatchSizeName()
        );
    }

    public static BatchSizeMaster mapToBatchSizeMaster(BatchSizeMasterDto batchSizeMasterDto){
        return new BatchSizeMaster(
                batchSizeMasterDto.getId(),
                batchSizeMasterDto.getBatchSizeName()
        );
    }
}
