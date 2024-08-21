package com.sample.aone.service;

import com.sample.aone.dto.HeadOfficeMasterDto;

import java.util.List;

public interface HeadOfficeMasterService {
    HeadOfficeMasterDto createHeadOfficeMaster(HeadOfficeMasterDto headOfficeMasterDto);

    HeadOfficeMasterDto getHeadOfficeName(String headOfficeName);

    List<HeadOfficeMasterDto> getAllHeadOfficeMaster();

    HeadOfficeMasterDto updateHeadOfficeMaster(String headOfficeName, HeadOfficeMasterDto updatedHeadOfficeMaster);

    void deleteByHeadOfficeMaster(Long id);
}
