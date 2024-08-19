package com.sample.aone.service;

import com.sample.aone.dto.DepartmentMasterDto;

import java.util.List;

public interface DepartmentMasterService {
    DepartmentMasterDto createDepartmentMaster(DepartmentMasterDto departmentMasterDto);

    DepartmentMasterDto getDepartmentName(String departmentName);

    List<DepartmentMasterDto> getAllDepartmentMaster();

    void deleteByDepartmentMaster(Long id);
}
