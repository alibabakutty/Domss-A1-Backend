package com.sample.aone.mapper;

import com.sample.aone.dto.BatchSerialNumberMasterDto;
import com.sample.aone.entity.BatchSerialNumberMaster;

public class BatchSerialNumberMasterMapper {

    public static BatchSerialNumberMasterDto mapToBatchSerialNumberMasterDto(BatchSerialNumberMaster batchSerialNumberMaster){
        return new BatchSerialNumberMasterDto(
                batchSerialNumberMaster.getId(),
                batchSerialNumberMaster.getBatchSerialNumber()
        );
    }

    public static BatchSerialNumberMaster mapToBatchSerialNumberMaster(BatchSerialNumberMasterDto batchSerialNumberMasterDto){
        return new BatchSerialNumberMaster(
                batchSerialNumberMasterDto.getId(),
                batchSerialNumberMasterDto.getBatchSerialNumber()
        );
    }
}
