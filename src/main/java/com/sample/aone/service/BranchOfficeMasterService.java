package com.sample.aone.service;

import com.sample.aone.dto.BranchOfficeMasterDto;

import java.util.List;

public interface BranchOfficeMasterService {
    BranchOfficeMasterDto createBranchOfficeMaster(BranchOfficeMasterDto branchOfficeMasterDto);

    BranchOfficeMasterDto getBranchOfficeMaster(String branchOfficeName);

    List<BranchOfficeMasterDto> getAllBranchOfficeMaster();

    BranchOfficeMasterDto updateBranchOfficeMaster(String branchOfficeName, BranchOfficeMasterDto updateBranchOfficeMaster);

    void deleteByBranchOfficeMaster(Long id);
}
