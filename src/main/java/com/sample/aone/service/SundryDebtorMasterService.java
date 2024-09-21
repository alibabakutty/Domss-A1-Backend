package com.sample.aone.service;

import com.sample.aone.entity.SundryDebtorMaster;

import java.util.List;
import java.util.Optional;

public interface SundryDebtorMasterService {

    // Create a new SundryDebtorMaster
    SundryDebtorMaster createSundryDebtorMaster(SundryDebtorMaster sundryDebtorMaster);

    // Display or get a SundryDebtorMaster by name
    Optional<SundryDebtorMaster> getSundryDebtorName(String sundryDebtorName);


    // Method to get all SundryDebtor names
    List<SundryDebtorMaster> getAllSundryDebtors();

    // Alter or update a SundryDebtorMaster
    SundryDebtorMaster updateSundryDebtorMaster(String sundryDebtorName, SundryDebtorMaster updateSundryDebtorMaster);

    // Delete a SundryDebtorMaster by id
    void deleteSundryDebtorMaster(Long id);
}
