package com.sample.aone.service;

import com.sample.aone.dto.RevenueCategoryMasterDto;

import java.util.List;

public interface RevenueCategoryMasterService {
    RevenueCategoryMasterDto createRevenueCategoryMaster(RevenueCategoryMasterDto revenueCategoryMasterDto);

    RevenueCategoryMasterDto getRevenueCategoryMaster(String revenueCategoryName);

    List<RevenueCategoryMasterDto> getAllRevenueCategoryMasters();

    RevenueCategoryMasterDto updateRevenueCategoryMaster(String revenueCategoryName, RevenueCategoryMasterDto updateRevenueCategoryMaster);

    void deleteByRevenueCategoryMaster(Long id);
}
