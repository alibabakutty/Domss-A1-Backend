package com.sample.aone.mapper;

import com.sample.aone.dto.BatchColorMasterDto;
import com.sample.aone.entity.BatchColorMaster;

public class BatchColorMasterMapper {

    public static BatchColorMasterDto mapToBatchColorMasterDto(BatchColorMaster batchColorMaster){
        return new BatchColorMasterDto(
                batchColorMaster.getId(),
                batchColorMaster.getBatchColorName()
        );
    }

    public static BatchColorMaster mapToBatchColorMaster(BatchColorMasterDto batchColorMasterDto){
        return new BatchColorMaster(
                batchColorMasterDto.getId(),
                batchColorMasterDto.getBatchColorName()
        );
    }
}
