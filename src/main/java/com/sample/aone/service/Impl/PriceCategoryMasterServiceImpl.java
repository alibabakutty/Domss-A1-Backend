package com.sample.aone.service.Impl;

import com.sample.aone.entity.PriceCategoryMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.repository.PriceCategoryMasterDAO;
import com.sample.aone.service.PriceCategoryMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PriceCategoryMasterServiceImpl implements PriceCategoryMasterService {

    @Autowired
    private PriceCategoryMasterDAO priceCategoryMasterDAO;

    // create price category master
    @Override
    public PriceCategoryMaster createPriceCategoryMaster(PriceCategoryMaster priceCategoryMaster){
        return priceCategoryMasterDAO.save(priceCategoryMaster);
    }

    // Display or get a price category master by name
    @Override
    public Optional<PriceCategoryMaster> getPriceCategoryName(String priceCategoryName){
        return priceCategoryMasterDAO.findByPriceCategoryName(priceCategoryName);
    }

    // Method to get all PriceCategoryMasters
    @Override
    public List<PriceCategoryMaster> getAllPriceCategoryMasters(){
        // Fetch all records and return as a list of price category master objects
        return priceCategoryMasterDAO.findAll();
    }


    // Alter or update a PriceCategoryMaster
    @Override
    public PriceCategoryMaster updatePriceCategoryMaster(String priceCategoryName, PriceCategoryMaster updatePriceCategory){
        // Fetch existing Price Category by name, or throw an exception if not found
        PriceCategoryMaster existingPriceCategory = priceCategoryMasterDAO.findByPriceCategoryName(priceCategoryName).orElseThrow(() ->
            new ResourceNotFoundException("Price category name is not found with this name:" + priceCategoryName));

        // Update the basic fields
        existingPriceCategory.setPriceCategoryName(updatePriceCategory.getPriceCategoryName());

        // Update price-category sub-form details if present
        if (updatePriceCategory.getPriceCategorySubForm() != null){
            existingPriceCategory.getPriceCategorySubForm().clear();   // Clear existing price category subform details
            existingPriceCategory.getPriceCategorySubForm().addAll(updatePriceCategory.getPriceCategorySubForm());
        }

        // Save the updated entity to the database
        return priceCategoryMasterDAO.save(existingPriceCategory);
    }

    // Delete a StockItemMaster by id
    @Override
    public void deletePriceCategoryMaster(Long id){
        PriceCategoryMaster priceCategoryMaster = priceCategoryMasterDAO.findById(id).orElseThrow(() ->

                new ResourceNotFoundException("Price category master not found with this id:" + id));
        priceCategoryMasterDAO.delete(priceCategoryMaster);
    }
}
