package com.sample.aone.mapper;

import com.sample.aone.dto.BranchOfficeMasterDto;
import com.sample.aone.entity.BranchOfficeMaster;

public class BranchOfficeMasterMapper {

    public static BranchOfficeMasterDto mapToBranchOfficeMasterDto(BranchOfficeMaster branchOfficeMaster){
        return new BranchOfficeMasterDto(
                branchOfficeMaster.getId(),
                branchOfficeMaster.getBranchOfficeName()
        );
    }

    public static BranchOfficeMaster mapToBranchOfficeMaster(BranchOfficeMasterDto branchOfficeMasterDto){
        return new BranchOfficeMaster(
                branchOfficeMasterDto.getId(),
                branchOfficeMasterDto.getBranchOfficeName()
        );
    }
}
