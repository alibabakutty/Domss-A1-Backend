package com.sample.aone.service;

import com.sample.aone.dto.CostCenterMasterDto;
import java.util.List;

public interface CostCenterMasterService {
    CostCenterMasterDto createCostCenterMaster(CostCenterMasterDto costCenterMasterDto);

    CostCenterMasterDto getCostCenterMaster(String costCenterName);

    List<CostCenterMasterDto> getAllCostCenterMaster();

    CostCenterMasterDto updateCostCenterMaster(String costCenterName, CostCenterMasterDto updatedCostCenterMaster);

    void deleteByCostCenterMaster(Long id);
}
