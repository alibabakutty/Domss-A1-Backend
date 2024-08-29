package com.sample.aone.mapper;

import com.sample.aone.dto.SundryDebtorMasterDto;
import com.sample.aone.entity.SundryDebtorMaster;

public class SundryDebtorMasterMapper {

    public static SundryDebtorMasterDto mapToSundryDebtorMasterDto(SundryDebtorMaster sundryDebtorMaster){
        return new SundryDebtorMasterDto(
                sundryDebtorMaster.getId(),
                sundryDebtorMaster.getSundryDebtorName(),
                sundryDebtorMaster.getUnderGroup(),
                sundryDebtorMaster.getBillWiseStatus(),
                sundryDebtorMaster.getAddressOne(),
                sundryDebtorMaster.getAddressTwo(),
                sundryDebtorMaster.getAddressThree(),
                sundryDebtorMaster.getAddressFour(),
                sundryDebtorMaster.getAddressFive(),
                sundryDebtorMaster.getLandMarkOrArea(),
                sundryDebtorMaster.getState(),
                sundryDebtorMaster.getCountry(),
                sundryDebtorMaster.getPincode(),
                sundryDebtorMaster.getPanOrItNumber(),
                sundryDebtorMaster.getMsmeNumber(),
                sundryDebtorMaster.getOpeningBalance(),
                sundryDebtorMaster.getDateForOpening(),
                sundryDebtorMaster.getCreditOrDebit()
        );
    }

    public static SundryDebtorMaster mapToSundryDebtorMaster(SundryDebtorMasterDto sundryDebtorMasterDto){
        return new SundryDebtorMaster(
                sundryDebtorMasterDto.getId(),
                sundryDebtorMasterDto.getSundryDebtorName(),
                sundryDebtorMasterDto.getUnderGroup(),
                sundryDebtorMasterDto.getBillWiseStatus(),
                sundryDebtorMasterDto.getAddressOne(),
                sundryDebtorMasterDto.getAddressTwo(),
                sundryDebtorMasterDto.getAddressThree(),
                sundryDebtorMasterDto.getAddressFour(),
                sundryDebtorMasterDto.getAddressFive(),
                sundryDebtorMasterDto.getLandMarkOrArea(),
                sundryDebtorMasterDto.getState(),
                sundryDebtorMasterDto.getCountry(),
                sundryDebtorMasterDto.getPincode(),
                sundryDebtorMasterDto.getPanOrItNumber(),
                sundryDebtorMasterDto.getMsmeNumber(),
                sundryDebtorMasterDto.getOpeningBalance(),
                sundryDebtorMasterDto.getDateForOpening(),
                sundryDebtorMasterDto.getCreditOrDebit()
        );
    }
}
