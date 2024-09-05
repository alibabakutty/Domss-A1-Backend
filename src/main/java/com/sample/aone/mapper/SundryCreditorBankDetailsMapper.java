package com.sample.aone.mapper;

import com.sample.aone.dto.SundryCreditorBankDetailsDto;
import com.sample.aone.entity.SundryCreditorBankDetails;

public class SundryCreditorBankDetailsMapper {

    // Map SundryCreditorBankDetailsDto to SundryCreditorBankDetails entity
    public static SundryCreditorBankDetails mapToSundryCreditorBankDetails(SundryCreditorBankDetailsDto dto) {
        if (dto == null) {
            return null;
        }
        return SundryCreditorBankDetails.builder()
                .id(dto.getId())
                .accountName(dto.getAccountName())
                .accountNumber(dto.getAccountNumber())
                .bankName(dto.getBankName())
                .branchName(dto.getBranchName())
                .ifscCode(dto.getIfscCode())
                .accountType(dto.getAccountType())
                .swiftCode(dto.getSwiftCode())
                .build();
    }

    // Map SundryCreditorBankDetails entity to SundryCreditorBankDetailsDto
    public static SundryCreditorBankDetailsDto mapToSundryCreditorBankDetailsDto(SundryCreditorBankDetails entity) {
        if (entity == null) {
            return null;
        }
        return SundryCreditorBankDetailsDto.builder()
                .id(entity.getId())
                .accountName(entity.getAccountName())
                .accountNumber(entity.getAccountNumber())
                .bankName(entity.getBankName())
                .branchName(entity.getBranchName())
                .ifscCode(entity.getIfscCode())
                .accountType(entity.getAccountType())
                .swiftCode(entity.getSwiftCode())
                .build();
    }
}
