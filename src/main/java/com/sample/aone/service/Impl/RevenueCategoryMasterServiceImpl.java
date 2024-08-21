package com.sample.aone.service.Impl;

import com.sample.aone.dto.RevenueCategoryMasterDto;
import com.sample.aone.entity.RevenueCategoryMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.mapper.RevenueCategoryMasterMapper;
import com.sample.aone.repository.RevenueCategoryMasterDAO;
import com.sample.aone.service.RevenueCategoryMasterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class RevenueCategoryMasterServiceImpl implements RevenueCategoryMasterService {

    @Autowired
    private RevenueCategoryMasterDAO revenueCategoryMasterDAO;

    @Override
    public RevenueCategoryMasterDto createRevenueCategoryMaster(RevenueCategoryMasterDto revenueCategoryMasterDto){

        // validate head office object
        validateRevenueCategoryName(revenueCategoryMasterDto);

        // check for duplicate entry
        if (revenueCategoryMasterDAO.existsByRevenueCategoryName(revenueCategoryMasterDto.getRevenueCategoryName())){
            throw new DuplicateKeyException("Duplicate entry for unique field:" + revenueCategoryMasterDto.getRevenueCategoryName());
        }

        RevenueCategoryMaster revenueCategoryMaster = RevenueCategoryMasterMapper.mapToRevenueCategoryMaster(revenueCategoryMasterDto);
        RevenueCategoryMaster saveRevenueCategory = revenueCategoryMasterDAO.save(revenueCategoryMaster);
        return RevenueCategoryMasterMapper.mapToRevenueCategoryMasterDto(saveRevenueCategory);
    }

    public void validateRevenueCategoryName(RevenueCategoryMasterDto revenueCategoryMasterDto){
        if (revenueCategoryMasterDto.getRevenueCategoryName() == null || revenueCategoryMasterDto.getRevenueCategoryName().isEmpty()){
            throw new IllegalArgumentException("Revenue Category Name cannot be empty!");
        }
    }

    @Override
    public RevenueCategoryMasterDto getRevenueCategoryMaster(String revenueCategoryName){
        RevenueCategoryMaster revenueCategoryMaster = revenueCategoryMasterDAO.findByRevenueCategoryName(revenueCategoryName).orElseThrow(() ->

                new ResourceNotFoundException("Revenue category name is not found with this name:" + revenueCategoryName));

        return RevenueCategoryMasterMapper.mapToRevenueCategoryMasterDto(revenueCategoryMaster);
    }

    @Override
    public List<RevenueCategoryMasterDto> getAllRevenueCategoryMasters(){
        List<RevenueCategoryMaster> revenueCategoryMaster = revenueCategoryMasterDAO.findAll();
        return revenueCategoryMaster.stream().map(RevenueCategoryMasterMapper::mapToRevenueCategoryMasterDto).toList();
    }

    @Override
    public RevenueCategoryMasterDto updateRevenueCategoryMaster(String revenueCategoryName, RevenueCategoryMasterDto updateRevenueCategoryMaster){
        RevenueCategoryMaster revenueCategoryMaster = revenueCategoryMasterDAO.findByRevenueCategoryName(revenueCategoryName).orElseThrow(()->

                new ResourceNotFoundException("Revenue category name is not found with this name:" + revenueCategoryName));

        revenueCategoryMaster.setRevenueCategoryName(updateRevenueCategoryMaster.getRevenueCategoryName());
        RevenueCategoryMaster revenueCategoryMasterObj = revenueCategoryMasterDAO.save(revenueCategoryMaster);
        return RevenueCategoryMasterMapper.mapToRevenueCategoryMasterDto(revenueCategoryMasterObj);
    }

    @Override
    public void deleteByRevenueCategoryMaster(Long id){
        RevenueCategoryMaster revenueCategoryMaster = revenueCategoryMasterDAO.findById(id).orElseThrow(()->

                new ResourceNotFoundException("Revenue category name is not found with this name;" + id));
        revenueCategoryMasterDAO.deleteById(id);
    }
}
