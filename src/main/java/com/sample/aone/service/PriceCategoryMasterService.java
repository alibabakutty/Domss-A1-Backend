package com.sample.aone.service;

import com.sample.aone.entity.PriceCategoryMaster;

import java.util.List;
import java.util.Optional;

public interface PriceCategoryMasterService {
    // create stock item master
    PriceCategoryMaster createPriceCategoryMaster(PriceCategoryMaster priceCategoryMaster);

    // Display or get a StockItemMaster by name
    Optional<PriceCategoryMaster> getPriceCategoryName(String priceCategoryName);

    // Method to get all PriceCategoryMasters
    List<PriceCategoryMaster> getAllPriceCategoryMasters();

    // Alter or update a PriceCategoryMaster
    PriceCategoryMaster updatePriceCategoryMaster(String priceCategoryName, PriceCategoryMaster updatePriceCategory);

    // Delete a StockItemMaster by id
    void deletePriceCategoryMaster(Long id);
}
