package com.sample.aone.service;

import com.sample.aone.dto.DepartmentMasterDto;
import com.sample.aone.entity.DepartmentMaster;

import java.util.List;

public interface DepartmentMasterService {
    DepartmentMasterDto createDepartmentMaster(DepartmentMasterDto departmentMasterDto);

    DepartmentMasterDto getDepartmentName(String departmentName);

    List<DepartmentMasterDto> getAllDepartmentMaster();

    DepartmentMasterDto updateDepartmentMaster(String departmentName, DepartmentMasterDto updatedDepartmentMaster);

    void deleteByDepartmentMaster(Long id);


}
