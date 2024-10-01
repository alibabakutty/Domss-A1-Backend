package com.sample.aone.service.Impl;


import com.sample.aone.dto.StockItemMasterDto;
import com.sample.aone.entity.StockItemMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.mapper.StockItemMasterMapper;
import com.sample.aone.repository.StockItemMasterDAO;
import com.sample.aone.service.StockItemMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockItemMasterServiceImpl implements StockItemMasterService {

    @Autowired
    private StockItemMasterDAO stockItemMasterDAO;

    @Override
    public StockItemMasterDto createStockItemMaster(StockItemMasterDto stockItemMasterDto){


        // validate stock item name
        validateStockItemName(stockItemMasterDto);

        // check for duplicate entry
        if (stockItemMasterDAO.existsByStockItemName(stockItemMasterDto.getStockItemName())){
            throw new DuplicateKeyException("Duplicate key for unique field:" + stockItemMasterDto.getStockItemName());
        }

        StockItemMaster stockItemMaster = StockItemMasterMapper.mapToStockItemMaster(stockItemMasterDto);
        StockItemMaster saveStockItemMaster = stockItemMasterDAO.save(stockItemMaster);
        return StockItemMasterMapper.mapToStockItemMasterDto(saveStockItemMaster);
    }

    public void validateStockItemName(StockItemMasterDto stockItemMasterDto){
        if (stockItemMasterDto.getStockItemName() == null || stockItemMasterDto.getStockItemName().isEmpty()){
            throw new IllegalArgumentException("Stock item name cannot be empty!");
        }
    }

    @Override
    public StockItemMasterDto getStockItemMaster(String stockItemName){
        StockItemMaster stockItemMaster = stockItemMasterDAO.findByStockItemName(stockItemName).orElseThrow(() ->

                new ResourceNotFoundException("Stock item name is not found with this name:" + stockItemName));

        return StockItemMasterMapper.mapToStockItemMasterDto(stockItemMaster);
    }

    @Override
    public List<StockItemMasterDto> getAllStockItemMasters(){
        List<StockItemMaster> stockItemMasters = stockItemMasterDAO.findAll();
        return stockItemMasters.stream().map(StockItemMasterMapper::mapToStockItemMasterDto).toList();
    }

    @Override
    public StockItemMasterDto updateStockItemMaster(String stockItemName, StockItemMasterDto updateStockItemMaster){
        StockItemMaster stockItemMaster = stockItemMasterDAO.findByStockItemName(stockItemName).orElseThrow(() ->
                new ResourceNotFoundException("Stock item name is not found with this name:" + stockItemName));

        stockItemMaster.setStockItemName(updateStockItemMaster.getStockItemName());
        stockItemMaster.setUnder(updateStockItemMaster.getUnder());
        stockItemMaster.setCategory(updateStockItemMaster.getCategory());
        stockItemMaster.setUnits(updateStockItemMaster.getUnits());
        stockItemMaster.setGstApplicability(updateStockItemMaster.getGstApplicability());
        stockItemMaster.setHsnOrSacDetails(updateStockItemMaster.getHsnOrSacDetails());
        stockItemMaster.setSourceOfDetails(updateStockItemMaster.getSourceOfDetails());
        stockItemMaster.setHsnOrSac(updateStockItemMaster.getHsnOrSac());
        stockItemMaster.setDescription(updateStockItemMaster.getDescription());
        stockItemMaster.setTypeOfSupply(updateStockItemMaster.getTypeOfSupply());
        stockItemMaster.setIsInclusiveOfDutiesAndTaxes(updateStockItemMaster.getIsInclusiveOfDutiesAndTaxes());
        stockItemMaster.setRateOfDuty(updateStockItemMaster.getRateOfDuty());
        stockItemMaster.setOpeningBalanceQuantity(updateStockItemMaster.getOpeningBalanceQuantity());
        stockItemMaster.setOpeningBalanceRate(updateStockItemMaster.getOpeningBalanceRate());
        stockItemMaster.setOpeningBalanceUnit(updateStockItemMaster.getOpeningBalanceUnit());
        stockItemMaster.setOpeningBalanceValue(updateStockItemMaster.getOpeningBalanceValue());

        StockItemMaster stockItemMasterObj = stockItemMasterDAO.save(stockItemMaster);
        return StockItemMasterMapper.mapToStockItemMasterDto(stockItemMasterObj);
    }

    @Override
    public void deleteStockItemMasterById(Long id){
        StockItemMaster stockItemMaster = stockItemMasterDAO.findById(id).orElseThrow(() ->

                new ResourceNotFoundException("Stock item name is not found with this id:" + id));

        stockItemMasterDAO.deleteById(id);
    }
}
