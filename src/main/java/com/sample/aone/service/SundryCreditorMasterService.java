package com.sample.aone.service;

import com.sample.aone.dto.SundryCreditorMasterDto;
import com.sample.aone.entity.SundryCreditorMaster;

import java.util.List;
import java.util.Optional;

public interface SundryCreditorMasterService {

    // Create a new SundryCreditorMaster
    SundryCreditorMaster createSundryCreditorMaster(SundryCreditorMaster sundryCreditorMaster);

    // Display or get a SundryCreditorMaster by name
    Optional<SundryCreditorMaster> getSundryCreditorName(String sundryCreditorName);


    // Method to get all SundryCreditor names
    List<SundryCreditorMaster> getAllSundryCreditors();

    // Alter or update a SundryCreditorMaster
    SundryCreditorMaster updateSundryCreditorMaster(String sundryCreditorName, SundryCreditorMaster updateSundryCreditorMaster);

    // Delete a SundryCreditorMaster by id
    void deleteSundryCreditorMaster(Long id);

//    SundryCreditorMasterDto updateSundryCreditorMaster(String sundryCreditorName, SundryCreditorMasterDto sundryCreditorMasterDto);
//
//    Optional<SundryCreditorMasterDto> getSundryCreditorMasterByName(String sundryCreditorName);
//
//    List<SundryCreditorMasterDto> getAllSundryCreditorMasters();
//
//    void deleteSundryCreditorMasterById(Long id);
}
