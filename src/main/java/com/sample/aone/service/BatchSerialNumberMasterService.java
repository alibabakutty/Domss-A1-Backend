package com.sample.aone.service;

import com.sample.aone.dto.BatchSerialNumberMasterDto;

import java.util.List;

public interface BatchSerialNumberMasterService {
    BatchSerialNumberMasterDto createBatchSerialNumberMaster(BatchSerialNumberMasterDto batchSerialNumberMasterDto);

    BatchSerialNumberMasterDto getBatchSerialNumber(String batchSerialNumber);

    List<BatchSerialNumberMasterDto> getAllBatchSerialNumberMaster();

    BatchSerialNumberMasterDto updateBatchSerialNumberMaster(String batchSerialNumber, BatchSerialNumberMasterDto updatedBatchSerialNumber);

    void deleteByBatchSerialNumberId(Long id);
}
