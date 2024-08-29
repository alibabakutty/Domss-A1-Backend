package com.sample.aone.mapper;

import com.sample.aone.dto.SundryCreditorMasterDto;
import com.sample.aone.entity.SundryCreditorMaster;

public class SundryCreditorMasterMapper {

    public static SundryCreditorMasterDto mapToSundryCreditorMasterDto(SundryCreditorMaster sundryCreditorMaster){
        return new SundryCreditorMasterDto(
                sundryCreditorMaster.getId(),
                sundryCreditorMaster.getSundryCreditorName(),
                sundryCreditorMaster.getUnderGroup(),
                sundryCreditorMaster.getBillWiseStatus(),
                sundryCreditorMaster.getAddressOne(),
                sundryCreditorMaster.getAddressTwo(),
                sundryCreditorMaster.getAddressThree(),
                sundryCreditorMaster.getAddressFour(),
                sundryCreditorMaster.getAddressFive(),
                sundryCreditorMaster.getLandMarkOrArea(),
                sundryCreditorMaster.getState(),
                sundryCreditorMaster.getCountry(),
                sundryCreditorMaster.getPincode(),
                sundryCreditorMaster.getPanOrItNumber(),
                sundryCreditorMaster.getMsmeNumber(),
                sundryCreditorMaster.getOpeningBalance(),
                sundryCreditorMaster.getDateForOpening(),
                sundryCreditorMaster.getCreditOrDebit()
        );
    }

    public static SundryCreditorMaster mapToSundryCreditorMaster(SundryCreditorMasterDto sundryCreditorMasterDto){
        return new SundryCreditorMaster(
                sundryCreditorMasterDto.getId(),
                sundryCreditorMasterDto.getSundryCreditorName(),
                sundryCreditorMasterDto.getUnderGroup(),
                sundryCreditorMasterDto.getBillWiseStatus(),
                sundryCreditorMasterDto.getAddressOne(),
                sundryCreditorMasterDto.getAddressTwo(),
                sundryCreditorMasterDto.getAddressThree(),
                sundryCreditorMasterDto.getAddressFour(),
                sundryCreditorMasterDto.getAddressFive(),
                sundryCreditorMasterDto.getLandMarkOrArea(),
                sundryCreditorMasterDto.getState(),
                sundryCreditorMasterDto.getCountry(),
                sundryCreditorMasterDto.getPincode(),
                sundryCreditorMasterDto.getPanOrItNumber(),
                sundryCreditorMasterDto.getMsmeNumber(),
                sundryCreditorMasterDto.getOpeningBalance(),
                sundryCreditorMasterDto.getDateForOpening(),
                sundryCreditorMasterDto.getCreditOrDebit()
        );
    }
}
