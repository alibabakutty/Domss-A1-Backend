package com.sample.aone.service.Impl;

import com.sample.aone.dto.ProjectCategoryMasterDto;
import com.sample.aone.entity.ProjectCategoryMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.mapper.ProjectCategoryMasterMapper;
import com.sample.aone.repository.ProjectCategoryMasterDAO;
import com.sample.aone.service.ProjectCategoryMasterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProjectCategoryMasterServiceImpl implements ProjectCategoryMasterService {

    @Autowired
    private ProjectCategoryMasterDAO projectCategoryMasterDAO;

    @Override
    public ProjectCategoryMasterDto createProjectCategoryMaster(ProjectCategoryMasterDto projectCategoryMasterDto){
        // validate project category name
        validateProjectCategoryName(projectCategoryMasterDto);

        // check duplicate entry for project category name
        if (projectCategoryMasterDAO.existsByProjectCategoryName(projectCategoryMasterDto.getProjectCategoryName())){
            throw new IllegalArgumentException("Duplicate entry for unique field!" + projectCategoryMasterDto.getProjectCategoryName());
        }

        ProjectCategoryMaster projectCategoryMaster = ProjectCategoryMasterMapper.mapToProjectCategoryMaster(projectCategoryMasterDto);
        ProjectCategoryMaster saveProjectCategoryMaster = projectCategoryMasterDAO.save(projectCategoryMaster);
        return ProjectCategoryMasterMapper.mapToProjectCategoryMasterDto(saveProjectCategoryMaster);
    }

    public void validateProjectCategoryName(ProjectCategoryMasterDto projectCategoryMasterDto){
        if (projectCategoryMasterDto.getProjectCategoryName() == null || projectCategoryMasterDto.getProjectCategoryName().isEmpty()){
            throw new IllegalArgumentException("Project category name is unique field cannot be empty!");
        }
    }

    @Override
    public ProjectCategoryMasterDto getProjectCategoryName(String projectCategoryName){
        ProjectCategoryMaster projectCategoryMaster = projectCategoryMasterDAO.findByProjectCategoryName(projectCategoryName).orElseThrow(() ->

                new ResourceNotFoundException("Project category name is not found with this name:" + projectCategoryName));
        return ProjectCategoryMasterMapper.mapToProjectCategoryMasterDto(projectCategoryMaster);
    }
}
