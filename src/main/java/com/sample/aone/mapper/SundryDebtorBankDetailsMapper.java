package com.sample.aone.mapper;


import com.sample.aone.dto.SundryDebtorBankDetailsDto;
import com.sample.aone.entity.SundryDebtorBankDetails;

public class SundryDebtorBankDetailsMapper {

    public static SundryDebtorBankDetails mapToSundryDebtorBankDetails(SundryDebtorBankDetailsDto sundryDebtorBankDetailsDto){
        return SundryDebtorBankDetails.builder()
                .id(sundryDebtorBankDetailsDto.getId())
                .accountName(sundryDebtorBankDetailsDto.getAccountName())
                .accountNumber(sundryDebtorBankDetailsDto.getAccountNumber())
                .bankName(sundryDebtorBankDetailsDto.getBankName())
                .branchName(sundryDebtorBankDetailsDto.getBranchName())
                .ifscCode(sundryDebtorBankDetailsDto.getIfscCode())
                .accountType(sundryDebtorBankDetailsDto.getAccountType())
                .swiftCode(sundryDebtorBankDetailsDto.getSwiftCode())
                .build();
    }

    public static SundryDebtorBankDetailsDto mapToSundryDebtorBankDetailsDto(SundryDebtorBankDetails sundryDebtorBankDetails){
        return SundryDebtorBankDetailsDto.builder()
                .id(sundryDebtorBankDetails.getId())
                .accountName(sundryDebtorBankDetails.getAccountName())
                .accountNumber(sundryDebtorBankDetails.getAccountNumber())
                .bankName(sundryDebtorBankDetails.getBankName())
                .branchName(sundryDebtorBankDetails.getBranchName())
                .ifscCode(sundryDebtorBankDetails.getIfscCode())
                .accountType(sundryDebtorBankDetails.getAccountType())
                .swiftCode(sundryDebtorBankDetails.getSwiftCode())
                .build();
    }
}
