package com.sample.aone.service;

import com.sample.aone.dto.SundryCreditorMasterDto;

import java.util.List;

public interface SundryCreditorMasterService {
    SundryCreditorMasterDto createSundryCreditorMaster(SundryCreditorMasterDto sundryCreditorMasterDto);

    SundryCreditorMasterDto getSundryCreditorName(String sundryCreditorName);

    List<SundryCreditorMasterDto> getAllSundryCreditorMaster();

    SundryCreditorMasterDto updateSundryCreditorMaster(String sundryCreditorName, SundryCreditorMasterDto updateSundryCreditorMaster);

    void deleteBySundryCreditorMaster(Long id);
}
