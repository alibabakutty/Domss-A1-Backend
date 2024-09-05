package com.sample.aone.service;

import com.sample.aone.dto.SundryCreditorMasterDto;

import java.util.List;
import java.util.Optional;

public interface SundryCreditorMasterService {

    SundryCreditorMasterDto createSundryCreditorMaster(SundryCreditorMasterDto sundryCreditorMasterDto);

    SundryCreditorMasterDto updateSundryCreditorMaster(String sundryCreditorName, SundryCreditorMasterDto sundryCreditorMasterDto);

    Optional<SundryCreditorMasterDto> getSundryCreditorMasterByName(String sundryCreditorName);

    List<SundryCreditorMasterDto> getAllSundryCreditorMasters();

    void deleteSundryCreditorMasterById(Long id);
}
