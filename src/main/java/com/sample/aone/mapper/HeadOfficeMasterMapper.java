package com.sample.aone.mapper;

import com.sample.aone.dto.HeadOfficeMasterDto;
import com.sample.aone.entity.HeadOfficeMaster;

public class HeadOfficeMasterMapper {

    public static HeadOfficeMasterDto mapToHeadOfficeDto (HeadOfficeMaster headOfficeMaster){
        return new HeadOfficeMasterDto(
                headOfficeMaster.getId(),
                headOfficeMaster.getHeadOfficeName()
        );
    }

    public static HeadOfficeMaster mapToHeadOffice (HeadOfficeMasterDto headOfficeMasterDto){
        return new HeadOfficeMaster(
                headOfficeMasterDto.getId(),
                headOfficeMasterDto.getHeadOfficeName()
        );
    }
}
