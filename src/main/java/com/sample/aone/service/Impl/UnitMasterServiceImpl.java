package com.sample.aone.service.Impl;

import com.sample.aone.dto.UnitMasterDto;
import com.sample.aone.entity.UnitMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.mapper.UnitMasterMapper;
import com.sample.aone.repository.UnitMasterDAO;
import com.sample.aone.service.UnitMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitMasterServiceImpl implements UnitMasterService {

    @Autowired
    private UnitMasterDAO unitMasterDAO;

    @Override
    public UnitMasterDto createUnitMaster(UnitMasterDto unitMasterDto){

        // validate unit master
        validateUnitName(unitMasterDto);

        // check for duplicate entry
        if (unitMasterDAO.existsByUnitSymbolName(unitMasterDto.getUnitSymbolName())){
            throw new DuplicateKeyException("duplicate entry for unique field:" + unitMasterDto.getUnitSymbolName());
        }

        UnitMaster unitMaster = UnitMasterMapper.mapToUnitMaster(unitMasterDto);
        UnitMaster saveUnitMaster = unitMasterDAO.save(unitMaster);
        return UnitMasterMapper.mapToUnitMasterDto(saveUnitMaster);
    }

    public void validateUnitName(UnitMasterDto unitMasterDto){
        if (unitMasterDto.getUnitSymbolName() == null || unitMasterDto.getUnitSymbolName().isEmpty()){
            throw new IllegalArgumentException("Unit symbol name is cannot be empty!");
        }
    }

    @Override
    public UnitMasterDto getUnitMaster(String unitSymbolName){
        UnitMaster unitMaster = unitMasterDAO.findByUnitSymbolName(unitSymbolName).orElseThrow(() ->

                new ResourceNotFoundException("Unit master name is not found with this name:" + unitSymbolName));

        return UnitMasterMapper.mapToUnitMasterDto(unitMaster);
    }

    @Override
    public List<UnitMasterDto> getAllUnitMasters(){
        List<UnitMaster> unitMasters = unitMasterDAO.findAll();
        return unitMasters.stream().map(UnitMasterMapper::mapToUnitMasterDto).toList();
    }

    @Override
    public UnitMasterDto updateUnitMaster(String unitSymbolName, UnitMasterDto updateUnitMaster){
        UnitMaster unitMaster = unitMasterDAO.findByUnitSymbolName(unitSymbolName).orElseThrow(() ->

                new ResourceNotFoundException("Unit symbol name is not found with this name:" + unitSymbolName));

        unitMaster.setUnitTypeName(updateUnitMaster.getUnitTypeName());
        unitMaster.setUnitSymbolName(updateUnitMaster.getUnitSymbolName());
        unitMaster.setFormalName(updateUnitMaster.getFormalName());
        unitMaster.setUnitQuantityCode(updateUnitMaster.getUnitQuantityCode());
        unitMaster.setNumberOfDecimalPlaces(updateUnitMaster.getNumberOfDecimalPlaces());

        UnitMaster unitMasterObj = unitMasterDAO.save(unitMaster);
        return UnitMasterMapper.mapToUnitMasterDto(unitMasterObj);
    }

    @Override
    public void deleteUnitMasterById(Long id){
        UnitMaster unitMaster = unitMasterDAO.findById(id).orElseThrow(() ->

                new ResourceNotFoundException("Unit name is not found with this id:" + id));

        unitMasterDAO.deleteById(id);
    }
}
