package com.sample.aone.service.Impl;

import com.sample.aone.dto.CostCenterMasterDto;
import com.sample.aone.entity.CostCenterMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.mapper.CostCenterMasterMapper;
import com.sample.aone.repository.CostCenterMasterDAO;
import com.sample.aone.service.CostCenterMasterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CostCenterMasterServiceImpl implements CostCenterMasterService {

    @Autowired
    CostCenterMasterDAO costCenterMasterDAO;

    @Override
    public CostCenterMasterDto createCostCenterMaster(CostCenterMasterDto costCenterMasterDto){

        // validate cost center name object
        validateCostCenterName(costCenterMasterDto);

        // check for duplicate entry
        if (costCenterMasterDAO.existsByCostCenterName(costCenterMasterDto.getCostCenterName())){
            throw new DuplicateKeyException("Duplicate entry for unique field!" + costCenterMasterDto.getCostCenterName());
        }

        CostCenterMaster costCenterMaster = CostCenterMasterMapper.mapToCostCenterMaster(costCenterMasterDto);
        CostCenterMaster saveCostCenterMaster = costCenterMasterDAO.save(costCenterMaster);
        return CostCenterMasterMapper.mapToCostCenterMasterDto(saveCostCenterMaster);
    }

    public void validateCostCenterName(CostCenterMasterDto costCenterMasterDto){
        if(costCenterMasterDto.getCostCenterName() == null || costCenterMasterDto.getCostCategoryName().isEmpty()){
            throw new IllegalArgumentException("Cost center name field cannot be empty!:" + costCenterMasterDto);
        }
    }

    @Override
    public CostCenterMasterDto getCostCenterMaster(String costCenterName){
        CostCenterMaster costCenterMaster = costCenterMasterDAO.findByCostCenterName(costCenterName).orElseThrow(() ->

                new ResourceNotFoundException("Cost center name is not found with this name:" + costCenterName));

        return CostCenterMasterMapper.mapToCostCenterMasterDto(costCenterMaster);
    }

    @Override
    public List<CostCenterMasterDto> getAllCostCenterMaster(){
        List<CostCenterMaster> costCenterMaster = costCenterMasterDAO.findAll();
        return costCenterMaster.stream().map(CostCenterMasterMapper::mapToCostCenterMasterDto).toList();
    }

    @Override
    public CostCenterMasterDto updateCostCenterMaster(String costCenterName, CostCenterMasterDto updatedCostCenterMaster){
        CostCenterMaster costCenterMaster = costCenterMasterDAO.findByCostCenterName(costCenterName).orElseThrow(()->

                new ResourceNotFoundException("Cost center name is not found with this name:" + costCenterName));
        costCenterMaster.setCostCenterName(updatedCostCenterMaster.getCostCenterName());
        costCenterMaster.setCostCategoryName(updatedCostCenterMaster.getCostCategoryName());
        CostCenterMaster costCenterMasterObj = costCenterMasterDAO.save(costCenterMaster);
        return CostCenterMasterMapper.mapToCostCenterMasterDto(costCenterMasterObj);
    }

    @Override
    public void deleteByCostCenterMaster(Long id){
        CostCenterMaster costCenterMaster = costCenterMasterDAO.findById(id).orElseThrow(() ->

                new ResourceNotFoundException("Cost center master is not found with this id" + id));
        costCenterMasterDAO.deleteById(id);
    }
}
