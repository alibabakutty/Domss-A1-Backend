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
                sundryCreditorMaster.getProvideBankDetails(),
                sundryCreditorMaster.getAccountName(),
                sundryCreditorMaster.getAccountNumber(),
                sundryCreditorMaster.getBankName(),
                sundryCreditorMaster.getBranchName(),
                sundryCreditorMaster.getIfscCode(),
                sundryCreditorMaster.getAccountType(),
                sundryCreditorMaster.getSwiftCode(),
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
                sundryCreditorMaster.getGstinOrUinNumber(),
                sundryCreditorMaster.getMsmeNumber(),
                sundryCreditorMaster.getContactPersonName(),
                sundryCreditorMaster.getMobileNumber(),
                sundryCreditorMaster.getLandlineNumber(),
                sundryCreditorMaster.getEmailId(),
                sundryCreditorMaster.getDateForOpening(),
                sundryCreditorMaster.getOpeningBalance(),
                sundryCreditorMaster.getCreditOrDebit(),
                sundryCreditorMaster.getForexDate(),
                sundryCreditorMaster.getReferenceName(),
                sundryCreditorMaster.getDueDate(),
                sundryCreditorMaster.getForexCurrencyType(),
                sundryCreditorMaster.getForexAmount(),
                sundryCreditorMaster.getExchangeRate(),
                sundryCreditorMaster.getReferenceAmount(),
                sundryCreditorMaster.getReferenceCreditOrDebit()
        );
    }

    public static SundryCreditorMaster mapToSundryCreditorMaster(SundryCreditorMasterDto sundryCreditorMasterDto){
        return new SundryCreditorMaster(
                sundryCreditorMasterDto.getId(),
                sundryCreditorMasterDto.getSundryCreditorName(),
                sundryCreditorMasterDto.getUnderGroup(),
                sundryCreditorMasterDto.getBillWiseStatus(),
                sundryCreditorMasterDto.getProvideBankDetails(),
                sundryCreditorMasterDto.getAccountName(),
                sundryCreditorMasterDto.getAccountNumber(),
                sundryCreditorMasterDto.getBankName(),
                sundryCreditorMasterDto.getBranchName(),
                sundryCreditorMasterDto.getIfscCode(),
                sundryCreditorMasterDto.getAccountType(),
                sundryCreditorMasterDto.getSwiftCode(),
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
                sundryCreditorMasterDto.getGstinOrUinNumber(),
                sundryCreditorMasterDto.getMsmeNumber(),
                sundryCreditorMasterDto.getContactPersonName(),
                sundryCreditorMasterDto.getMobileNumber(),
                sundryCreditorMasterDto.getLandlineNumber(),
                sundryCreditorMasterDto.getEmailId(),
                sundryCreditorMasterDto.getDateForOpening(),
                sundryCreditorMasterDto.getOpeningBalance(),
                sundryCreditorMasterDto.getCreditOrDebit(),
                sundryCreditorMasterDto.getForexDate(),
                sundryCreditorMasterDto.getReferenceName(),
                sundryCreditorMasterDto.getDueDate(),
                sundryCreditorMasterDto.getForexCurrencyType(),
                sundryCreditorMasterDto.getForexAmount(),
                sundryCreditorMasterDto.getExchangeRate(),
                sundryCreditorMasterDto.getReferenceAmount(),
                sundryCreditorMasterDto.getReferenceCreditOrDebit()
        );
    }
}
