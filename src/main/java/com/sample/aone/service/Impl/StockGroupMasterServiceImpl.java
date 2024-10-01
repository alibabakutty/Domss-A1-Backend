package com.sample.aone.service.Impl;

import com.sample.aone.dto.StockGroupMasterDto;
import com.sample.aone.entity.StockGroupMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.mapper.StockGroupMasterMapper;
import com.sample.aone.repository.StockGroupMasterDAO;
import com.sample.aone.service.StockGroupMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockGroupMasterServiceImpl implements StockGroupMasterService {

    @Autowired
    private StockGroupMasterDAO stockGroupMasterDAO;

    @Override
    public StockGroupMasterDto createStockGroupMaster(StockGroupMasterDto stockGroupMasterDto){

        // validate stockGroupName
        validateStockGroupName(stockGroupMasterDto);

        // check for duplicate entry
        if (stockGroupMasterDAO.existsByStockGroupName(stockGroupMasterDto.getStockGroupName())){
            throw new DuplicateKeyException("Duplicate entry for unique field:" + stockGroupMasterDto.getStockGroupName());
        }

        StockGroupMaster stockGroupMaster = StockGroupMasterMapper.mapToStockGroupMaster(stockGroupMasterDto);
        StockGroupMaster saveStockGroupMaster = stockGroupMasterDAO.save(stockGroupMaster);
        return StockGroupMasterMapper.mapToStockGroupMasterDto(saveStockGroupMaster);

    }

    public void validateStockGroupName(StockGroupMasterDto stockGroupMasterDto){
        if (stockGroupMasterDto.getStockGroupName() == null || stockGroupMasterDto.getStockGroupName().isEmpty()){
            throw new IllegalArgumentException("StockGroupName cannot be empty!");
        }
    }

    @Override
    public StockGroupMasterDto getStockGroupMaster(String stockGroupName){
        StockGroupMaster stockGroupMaster = stockGroupMasterDAO.findByStockGroupName(stockGroupName).orElseThrow(() ->

                new ResourceNotFoundException("Stock group name is not found with this name:" + stockGroupName));

        return StockGroupMasterMapper.mapToStockGroupMasterDto(stockGroupMaster);
    }

    @Override
    public List<StockGroupMasterDto> getAllStockGroupMasters(){
        List<StockGroupMaster> stockGroupMasters = stockGroupMasterDAO.findAll();
        return stockGroupMasters.stream().map(StockGroupMasterMapper::mapToStockGroupMasterDto).toList();
    }

    @Override
    public StockGroupMasterDto updateStockGroupMaster(String stockGroupName, StockGroupMasterDto updateStockGroupMaster){
        StockGroupMaster stockGroupMaster = stockGroupMasterDAO.findByStockGroupName(stockGroupName).orElseThrow(() ->

                new ResourceNotFoundException("Stock group name is not found with this name:" + stockGroupName));

        stockGroupMaster.setStockGroupName(updateStockGroupMaster.getStockGroupName());
        stockGroupMaster.setUnder(updateStockGroupMaster.getUnder());
        stockGroupMaster.setShouldQuantitiesOfItemsBeAdded(updateStockGroupMaster.getShouldQuantitiesOfItemsBeAdded());
        stockGroupMaster.setHsnOrSacDetails(updateStockGroupMaster.getHsnOrSacDetails());
        stockGroupMaster.setSourceOfDetails(updateStockGroupMaster.getSourceOfDetails());
        stockGroupMaster.setHsnOrSac(updateStockGroupMaster.getHsnOrSac());
        stockGroupMaster.setDescription(updateStockGroupMaster.getDescription());

        StockGroupMaster stockGroupMasterObj = stockGroupMasterDAO.save(stockGroupMaster);
        return StockGroupMasterMapper.mapToStockGroupMasterDto(stockGroupMasterObj);
    }

    @Override
    public void deleteByStockGroupMasterId(Long id){
        StockGroupMaster stockGroupMaster = stockGroupMasterDAO.findById(id).orElseThrow(() ->

                new ResourceNotFoundException("Stock group master not found with this id:" + id));

        stockGroupMasterDAO.deleteById(id);
    }
}
