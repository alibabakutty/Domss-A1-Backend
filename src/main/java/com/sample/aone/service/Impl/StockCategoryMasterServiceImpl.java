package com.sample.aone.service.Impl;

import com.sample.aone.dto.StockCategoryMasterDto;
import com.sample.aone.entity.StockCategoryMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.mapper.StockCategoryMasterMapper;
import com.sample.aone.repository.StockCategoryMasterDAO;
import com.sample.aone.service.StockCategoryMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockCategoryMasterServiceImpl implements StockCategoryMasterService {

    @Autowired
    private StockCategoryMasterDAO stockCategoryMasterDAO;

    @Override
    public StockCategoryMasterDto createStockCategoryMaster(StockCategoryMasterDto stockCategoryMasterDto){

        // validate stock category name
        validateStockCategoryName(stockCategoryMasterDto);

        // check for duplicate entry
        if (stockCategoryMasterDAO.existsByStockCategoryName(stockCategoryMasterDto.getStockCategoryName())){
            throw new DuplicateKeyException("duplicate entry for unique field:" + stockCategoryMasterDto.getStockCategoryName());
        }

        StockCategoryMaster stockCategoryMaster = StockCategoryMasterMapper.mapToStockCategoryMaster(stockCategoryMasterDto);
        StockCategoryMaster saveStockCategoryMaster = stockCategoryMasterDAO.save(stockCategoryMaster);
        return StockCategoryMasterMapper.mapToStockCategoryMasterDto(saveStockCategoryMaster);

    }

    public void validateStockCategoryName(StockCategoryMasterDto stockCategoryMasterDto){
        if (stockCategoryMasterDto.getStockCategoryName() == null || stockCategoryMasterDto.getStockCategoryName().isEmpty()){
            throw new IllegalArgumentException("Stock category name cannot be empty!");
        }
    }

    @Override
    public StockCategoryMasterDto getStockCategoryMaster(String stockCategoryName){
        StockCategoryMaster stockCategoryMaster = stockCategoryMasterDAO.findByStockCategoryName(stockCategoryName).orElseThrow(() ->

                new ResourceNotFoundException("Stock category name is not found with this name:" + stockCategoryName));

        return StockCategoryMasterMapper.mapToStockCategoryMasterDto(stockCategoryMaster);
    }

    @Override
    public List<StockCategoryMasterDto> getAllStockCategoryMasters(){
        List<StockCategoryMaster> stockCategoryMasters = stockCategoryMasterDAO.findAll();
        return stockCategoryMasters.stream().map(StockCategoryMasterMapper::mapToStockCategoryMasterDto).toList();
    }

    @Override
    public StockCategoryMasterDto updateStockCategoryMaster(String stockCategoryName, StockCategoryMasterDto updateStockCategoryMaster){
        StockCategoryMaster stockCategoryMaster = stockCategoryMasterDAO.findByStockCategoryName(stockCategoryName).orElseThrow(() ->

                new ResourceNotFoundException("Stock category name is not found with this name:" + stockCategoryName));

        stockCategoryMaster.setStockCategoryName(updateStockCategoryMaster.getStockCategoryName());
        stockCategoryMaster.setUnder(updateStockCategoryMaster.getUnder());

        StockCategoryMaster stockCategoryMasterObj = stockCategoryMasterDAO.save(stockCategoryMaster);
        return StockCategoryMasterMapper.mapToStockCategoryMasterDto(stockCategoryMasterObj);
    }

    @Override
    public void deleteStockCategoryMasterById(Long id){
        StockCategoryMaster stockCategoryMaster = stockCategoryMasterDAO.findById(id).orElseThrow(() ->

                new ResourceNotFoundException("Stock category master not found with this id:" + id));

        stockCategoryMasterDAO.deleteById(id);
    }
}
