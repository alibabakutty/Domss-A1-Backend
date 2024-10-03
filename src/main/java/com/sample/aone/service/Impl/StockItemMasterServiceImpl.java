package com.sample.aone.service.Impl;



import com.sample.aone.entity.StockItemMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.repository.StockItemMasterDAO;
import com.sample.aone.service.StockItemMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockItemMasterServiceImpl implements StockItemMasterService {

    @Autowired
    private StockItemMasterDAO stockItemMasterDAO;


    // create stock item master
    @Override
    public StockItemMaster createStockItemMaster(StockItemMaster stockItemMaster){
        return stockItemMasterDAO.save(stockItemMaster);
    }


    // Display or get a StockItemMaster by name
    @Override
    public Optional<StockItemMaster> getStockItemName(String stockItemName){
        return stockItemMasterDAO.findByStockItemName(stockItemName);
    }

    // Method to get all StockItemMasters
    @Override
    public List<StockItemMaster> getAllStockItemMasters(){
        // Fetch all records and return as a list of SundryCreditorMaster objects
        return stockItemMasterDAO.findAll();
    }

    // Alter or update a StockItemMaster
    @Override
    public StockItemMaster updateStockItemMaster(String stockItemName, StockItemMaster updateStockItemMaster){
        // Fetch existing StockItem by name, or throw an exception if not found
        StockItemMaster existingStockItem = stockItemMasterDAO.findByStockItemName(stockItemName).orElseThrow(() ->

                new ResourceNotFoundException("Stock item name is not found with this name:" + stockItemName));

        // Update the basic fields
        existingStockItem.setStockItemCode(updateStockItemMaster.getStockItemCode());
        existingStockItem.setStockItemName(updateStockItemMaster.getStockItemName());
        existingStockItem.setUnder(updateStockItemMaster.getUnder());
        existingStockItem.setCategory(updateStockItemMaster.getCategory());
        existingStockItem.setUnits(updateStockItemMaster.getUnits());
        existingStockItem.setStandardSellingPrice(updateStockItemMaster.getStandardSellingPrice());

        // Update forex sub-form details if present
        if (updateStockItemMaster.getStandardSellingPriceSubForm() != null){
            existingStockItem.getStandardSellingPriceSubForm().clear();   // Clear existing forex details
            existingStockItem.getStandardSellingPriceSubForm().addAll(updateStockItemMaster.getStandardSellingPriceSubForm());
        }

        existingStockItem.setStandardSellingCost(updateStockItemMaster.getStandardSellingCost());

        // Update forex sub-form details if present
        if (updateStockItemMaster.getStandardSellingCostSubForm() != null){
            existingStockItem.getStandardSellingCostSubForm().clear();  // Clear existing forex details
            existingStockItem.getStandardSellingCostSubForm().addAll(updateStockItemMaster.getStandardSellingCostSubForm());
        }

        updateStockItemMaster.setOpeningBalanceQuantity(updateStockItemMaster.getOpeningBalanceQuantity());
        updateStockItemMaster.setOpeningBalanceRate(updateStockItemMaster.getOpeningBalanceRate());
        updateStockItemMaster.setOpeningBalanceUnit(updateStockItemMaster.getOpeningBalanceUnit());
        updateStockItemMaster.setOpeningBalanceValue(updateStockItemMaster.getOpeningBalanceValue());

        // Save the updated entity to the database
        return stockItemMasterDAO.save(existingStockItem);
    }

    // Delete a StockItemMaster by id
    @Override
    public void deleteStockItemMaster(Long id){
        StockItemMaster stockItemMaster = stockItemMasterDAO.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Stock item not found with this id:" + id));
        stockItemMasterDAO.delete(stockItemMaster);
    }
}
