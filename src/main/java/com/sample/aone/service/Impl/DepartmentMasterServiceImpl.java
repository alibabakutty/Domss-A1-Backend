package com.sample.aone.service.Impl;

import com.sample.aone.dto.DepartmentMasterDto;
import com.sample.aone.entity.DepartmentMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.mapper.DepartmentMasterMapper;
import com.sample.aone.repository.DepartmentMasterDAO;
import com.sample.aone.service.DepartmentMasterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DepartmentMasterServiceImpl implements DepartmentMasterService {

    @Autowired
    private DepartmentMasterDAO departmentMasterDAO;

    @Override
    public DepartmentMasterDto createDepartmentMaster(DepartmentMasterDto departmentMasterDto){

        //validate currency symbol object
        validateDepartmentMaster(departmentMasterDto);

        //check for duplicate entry
        if (departmentMasterDAO.existsByDepartmentName(departmentMasterDto.getDepartmentName())){
            throw new DuplicateKeyException("Duplicate entry for unique field:" + departmentMasterDto.getDepartmentName());
        }

        DepartmentMaster departmentMaster = DepartmentMasterMapper.mapToDepartmentMaster(departmentMasterDto);
        DepartmentMaster saveDepartmentMaster = departmentMasterDAO.save(departmentMaster);
        return DepartmentMasterMapper.mapToDepartmentMasterDto(saveDepartmentMaster);
    }

    private void validateDepartmentMaster(DepartmentMasterDto departmentMasterDto){
        if (departmentMasterDto.getDepartmentName() == null || departmentMasterDto.getDepartmentName().isEmpty()){
            throw new IllegalArgumentException("Department field cannot be empty!");
        }
    }

    @Override
    public DepartmentMasterDto getDepartmentName(String departmentName){
        DepartmentMaster departmentMaster = departmentMasterDAO.findByDepartmentName(departmentName).orElseThrow(()->

                new ResourceNotFoundException("Department name is not found with this name:" + departmentName));

        return DepartmentMasterMapper.mapToDepartmentMasterDto(departmentMaster);
    }

    @Override
    public List<DepartmentMasterDto> getAllDepartmentMaster(){
        List<DepartmentMaster> departmentMaster = departmentMasterDAO.findAll();
        return departmentMaster.stream().map(DepartmentMasterMapper::mapToDepartmentMasterDto).toList();
    }

    @Override
    public DepartmentMasterDto updateDepartmentMaster(String departmentName, DepartmentMasterDto updatedDepartmentMaster){
        DepartmentMaster departmentMaster = departmentMasterDAO.findByDepartmentName(departmentName).orElseThrow(()->

                new ResourceNotFoundException("Department name is not found with this name:" + departmentName));
        departmentMaster.setDepartmentName(updatedDepartmentMaster.getDepartmentName());

        DepartmentMaster departmentMasterObj = departmentMasterDAO.save(departmentMaster);

        return DepartmentMasterMapper.mapToDepartmentMasterDto(departmentMasterObj);
    }
    @Override
    public void deleteByDepartmentMaster(Long id) {
        DepartmentMaster departmentMaster = departmentMasterDAO.findById(id).orElseThrow(() ->

                new ResourceNotFoundException("Department name is not found with this name:" + id));
        departmentMasterDAO.deleteById(id);
    }

}
