package com.sample.aone.service;

import com.sample.aone.dto.BatchCategoryMasterDto;

import java.util.List;

public interface BatchCategoryMasterService {
    BatchCategoryMasterDto createBatchCategoryMaster(BatchCategoryMasterDto batchCategoryMasterDto);

    BatchCategoryMasterDto getBatchCategoryName(String batchCategoryName);

    List<BatchCategoryMasterDto> getAllBatchCategoryMaster();

    BatchCategoryMasterDto updateBatchCategoryMaster(String batchCategoryName, BatchCategoryMasterDto updateBatchCategoryMaster);

    void deleteBatchCategoryMaster(Long id);
}
