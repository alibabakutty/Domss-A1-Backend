package com.sample.aone.service;

import com.sample.aone.dto.ProjectCategoryMasterDto;

public interface ProjectCategoryMasterService {
    ProjectCategoryMasterDto createProjectCategoryMaster(ProjectCategoryMasterDto projectCategoryMasterDto);

    ProjectCategoryMasterDto getProjectCategoryName(String projectCategoryName);
}
