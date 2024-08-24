package com.sample.aone.mapper;

import com.sample.aone.dto.ProjectNameMasterDto;
import com.sample.aone.entity.ProjectNameMaster;

public class ProjectNameMasterMapper {

    public static ProjectNameMasterDto mapToProjectNameMasterDto(ProjectNameMaster projectNameMaster){
        return new ProjectNameMasterDto(
                projectNameMaster.getId(),
                projectNameMaster.getProjectName(),
                projectNameMaster.getProjectCategoryName()
        );
    }

    public static ProjectNameMaster mapToProjectNameMaster(ProjectNameMasterDto projectNameMasterDto){
        return new ProjectNameMaster(
                projectNameMasterDto.getId(),
                projectNameMasterDto.getProjectName(),
                projectNameMasterDto.getProjectCategoryName()
        );
    }
}
