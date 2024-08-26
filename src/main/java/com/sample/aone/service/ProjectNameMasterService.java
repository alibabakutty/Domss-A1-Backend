package com.sample.aone.service;

import com.sample.aone.dto.ProjectNameMasterDto;

import java.util.List;

public interface ProjectNameMasterService {
    ProjectNameMasterDto createProjectNameMaster(ProjectNameMasterDto projectNameMasterDto);

    ProjectNameMasterDto getProjectName(String projectName);

    List<ProjectNameMasterDto> getAllProjectNameMaster();

    ProjectNameMasterDto updateProjectNameMaster(String projectName, ProjectNameMasterDto updateProjectName);

    void deleteByProjectNameMasterId(Long id);
}
