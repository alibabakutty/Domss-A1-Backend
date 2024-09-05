package com.sample.aone.service;

import com.sample.aone.dto.SundryCreditorMasterDto;
import com.sample.aone.entity.SundryCreditorMaster;

import java.util.List;
import java.util.Optional;

public interface SundryCreditorMasterService {

    SundryCreditorMaster createSundryCreditorMaster(SundryCreditorMaster sundryCreditorMaster);

//    SundryCreditorMasterDto updateSundryCreditorMaster(String sundryCreditorName, SundryCreditorMasterDto sundryCreditorMasterDto);
//
//    Optional<SundryCreditorMasterDto> getSundryCreditorMasterByName(String sundryCreditorName);
//
//    List<SundryCreditorMasterDto> getAllSundryCreditorMasters();
//
//    void deleteSundryCreditorMasterById(Long id);
}
