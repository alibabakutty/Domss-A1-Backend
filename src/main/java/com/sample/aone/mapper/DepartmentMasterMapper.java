package com.sample.aone.mapper;

import com.sample.aone.dto.DepartmentMasterDto;
import com.sample.aone.entity.DepartmentMaster;

public class DepartmentMasterMapper {

    public static DepartmentMasterDto mapToDepartmentMasterDto(DepartmentMaster departmentMaster){
        return new DepartmentMasterDto(
                departmentMaster.getId(),
                departmentMaster.getDepartmentName()
        );
    }

    public static DepartmentMaster mapToDepartmentMaster(DepartmentMasterDto departmentMasterDto){
        return new DepartmentMaster(
                departmentMasterDto.getId(),
                departmentMasterDto.getDepartmentName()
        );
    }
}
