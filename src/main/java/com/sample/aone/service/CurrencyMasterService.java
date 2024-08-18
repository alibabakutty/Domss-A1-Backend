package com.sample.aone.service;

import com.sample.aone.dto.CurrencyMasterDto;

import java.util.List;

public interface CurrencyMasterService {
    CurrencyMasterDto createCurrencyMaster(CurrencyMasterDto currencyMasterDto);

    CurrencyMasterDto getCurrencySymbol(String forexCurrencySymbol);

    List<CurrencyMasterDto> getAllCurrencyMasters();

    CurrencyMasterDto updateCurrencyMaster(String forexCurrencySymbol, CurrencyMasterDto updatedCurrencyMaster);

    void deleteByCurrencyMaster(Long id);
}
