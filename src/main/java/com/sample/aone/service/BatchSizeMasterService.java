package com.sample.aone.service;

import com.sample.aone.dto.BatchSizeMasterDto;

import java.util.List;

public interface BatchSizeMasterService {
    BatchSizeMasterDto createBatchSizeMaster(BatchSizeMasterDto batchSizeMasterDto);

    BatchSizeMasterDto getBatchSizeName(String batchSizeName);

    List<BatchSizeMasterDto> getAllBatchSizeMaster();

    BatchSizeMasterDto updateBatchSizeMaster(String batchSizeName, BatchSizeMasterDto updateBatchSizeMaster);

    void deleteByBatchSizeMaster(Long id);
}
