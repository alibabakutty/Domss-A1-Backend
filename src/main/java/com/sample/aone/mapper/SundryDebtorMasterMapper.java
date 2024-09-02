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
                sundryDebtorMaster.getProvideBankDetails(),
                sundryDebtorMaster.getAccountName(),
                sundryDebtorMaster.getAccountNumber(),
                sundryDebtorMaster.getBankName(),
                sundryDebtorMaster.getBranchName(),
                sundryDebtorMaster.getIfscCode(),
                sundryDebtorMaster.getAccountType(),
                sundryDebtorMaster.getSwiftCode(),
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
                sundryDebtorMaster.getGstinOrUinNumber(),
                sundryDebtorMaster.getMsmeNumber(),
                sundryDebtorMaster.getContactPersonName(),
                sundryDebtorMaster.getMobileNumber(),
                sundryDebtorMaster.getLandlineNumber(),
                sundryDebtorMaster.getEmailId(),
                sundryDebtorMaster.getDateForOpening(),
                sundryDebtorMaster.getOpeningBalance(),
                sundryDebtorMaster.getCreditOrDebit(),
                sundryDebtorMaster.getForexDate(),
                sundryDebtorMaster.getReferenceName(),
                sundryDebtorMaster.getDueDate(),
                sundryDebtorMaster.getForexCurrencyType(),
                sundryDebtorMaster.getForexAmount(),
                sundryDebtorMaster.getExchangeRate(),
                sundryDebtorMaster.getReferenceAmount(),
                sundryDebtorMaster.getReferenceCreditOrDebit()
        );
    }

    public static SundryDebtorMaster mapToSundryDebtorMaster(SundryDebtorMasterDto sundryDebtorMasterDto){
        return new SundryDebtorMaster(
                sundryDebtorMasterDto.getId(),
                sundryDebtorMasterDto.getSundryDebtorName(),
                sundryDebtorMasterDto.getUnderGroup(),
                sundryDebtorMasterDto.getBillWiseStatus(),
                sundryDebtorMasterDto.getProvideBankDetails(),
                sundryDebtorMasterDto.getAccountName(),
                sundryDebtorMasterDto.getAccountNumber(),
                sundryDebtorMasterDto.getBankName(),
                sundryDebtorMasterDto.getBranchName(),
                sundryDebtorMasterDto.getIfscCode(),
                sundryDebtorMasterDto.getAccountType(),
                sundryDebtorMasterDto.getSwiftCode(),
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
                sundryDebtorMasterDto.getGstinOrUinNumber(),
                sundryDebtorMasterDto.getMsmeNumber(),
                sundryDebtorMasterDto.getContactPersonName(),
                sundryDebtorMasterDto.getMobileNumber(),
                sundryDebtorMasterDto.getLandlineNumber(),
                sundryDebtorMasterDto.getEmailId(),
                sundryDebtorMasterDto.getDateForOpening(),
                sundryDebtorMasterDto.getOpeningBalance(),
                sundryDebtorMasterDto.getCreditOrDebit(),
                sundryDebtorMasterDto.getForexDate(),
                sundryDebtorMasterDto.getReferenceName(),
                sundryDebtorMasterDto.getDueDate(),
                sundryDebtorMasterDto.getForexCurrencyType(),
                sundryDebtorMasterDto.getForexAmount(),
                sundryDebtorMasterDto.getExchangeRate(),
                sundryDebtorMasterDto.getReferenceAmount(),
                sundryDebtorMasterDto.getReferenceCreditOrDebit()
        );
    }
}
