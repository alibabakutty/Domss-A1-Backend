package com.sample.aone.mapper;

import com.sample.aone.dto.ProjectCategoryMasterDto;
import com.sample.aone.entity.ProjectCategoryMaster;

public class ProjectCategoryMasterMapper {
    public static ProjectCategoryMasterDto mapToProjectCategoryMasterDto(ProjectCategoryMaster projectCategoryMaster){
        return new ProjectCategoryMasterDto(
                projectCategoryMaster.getId(),
                projectCategoryMaster.getProjectCategoryName()
        );
    }

    public static ProjectCategoryMaster mapToProjectCategoryMaster(ProjectCategoryMasterDto projectCategoryMasterDto){
        return new ProjectCategoryMaster(
                projectCategoryMasterDto.getId(),
                projectCategoryMasterDto.getProjectCategoryName()
        );
    }
}
