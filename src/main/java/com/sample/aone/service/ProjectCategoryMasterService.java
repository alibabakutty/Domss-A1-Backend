package com.sample.aone.service;

import com.sample.aone.dto.ProjectCategoryMasterDto;

import java.util.List;

public interface ProjectCategoryMasterService {
    ProjectCategoryMasterDto createProjectCategoryMaster(ProjectCategoryMasterDto projectCategoryMasterDto);

    ProjectCategoryMasterDto getProjectCategoryName(String projectCategoryName);

    List<ProjectCategoryMasterDto> getAllOProjectCategoryMaster();

    ProjectCategoryMasterDto updateProjectCategoryMaster(String projectCategoryName, ProjectCategoryMasterDto updateProjectCategoryMaster);

    void deleteByProjectCategoryMasterId(Long id);
}
