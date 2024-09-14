//package com.sample.aone.mapper;
//
//import com.sample.aone.dto.SundryDebtorBankDetailsDto;
//import com.sample.aone.dto.SundryDebtorForexDetailsDto;
//import com.sample.aone.dto.SundryDebtorMasterDto;
//import com.sample.aone.entity.SundryDebtorBankDetails;
//import com.sample.aone.entity.SundryDebtorForexDetails;
//import com.sample.aone.entity.SundryDebtorMaster;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class SundryDebtorMasterMapper {
//
//    // Converts SundryDebtorMasterDto to SundryDebtorMaster entity
//    public static SundryDebtorMaster toEntity(SundryDebtorMasterDto dto) {
//        if (dto == null) {
//            return null;
//        }
//
//        SundryDebtorMaster entity = new SundryDebtorMaster();
//        entity.setId(dto.getId());
//        entity.setSundryDebtorName(dto.getSundryDebtorName());
//        entity.setUnderGroup(dto.getUnderGroup());
//        entity.setBillWiseStatus(dto.getBillWiseStatus());
//        entity.setProvideBankDetails(dto.getProvideBankDetails());
//
//        // Convert SundryDebtorBankDetailsDto to SundryDebtorBankDetails entity
//        entity.setSundryDebtorBankDetails(toEntity(dto.getSundryDebtorBankDetails()));
//
//        entity.setAddressOne(dto.getAddressOne());
//        entity.setAddressTwo(dto.getAddressTwo());
//        entity.setAddressThree(dto.getAddressThree());
//        entity.setAddressFour(dto.getAddressFour());
//        entity.setAddressFive(dto.getAddressFive());
//        entity.setLandMarkOrArea(dto.getLandMarkOrArea());
//        entity.setState(dto.getState());
//        entity.setCountry(dto.getCountry());
//        entity.setPincode(dto.getPincode());
//        entity.setPanOrItNumber(dto.getPanOrItNumber());
//        entity.setGstinOrUinNumber(dto.getGstinOrUinNumber());
//        entity.setMsmeNumber(dto.getMsmeNumber());
//        entity.setContactPersonName(dto.getContactPersonName());
//        entity.setMobileNumber(dto.getMobileNumber());
//        entity.setLandlineNumber(dto.getLandlineNumber());
//        entity.setEmailId(dto.getEmailId());
//        entity.setDateForOpening(dto.getDateForOpening());
//        entity.setOpeningBalance(dto.getOpeningBalance());
//        entity.setCreditOrDebit(dto.getCreditOrDebit());
//
//        // Convert list of ForexDetails Dtos to entities
//        entity.setSundryDebtorForexDetails(
//                dto.getSundryDebtorForexDetails() != null ?
//                        dto.getSundryDebtorForexDetails().stream()
//                                .map(SundryDebtorMasterMapper::toEntity)
//                                .collect(Collectors.toList()) : null
//        );
//
//        return entity;
//    }
//
//    // Converts SundryDebtorMaster entity to SundryDebtorMasterDto
//    public static SundryDebtorMasterDto toDto(SundryDebtorMaster entity) {
//        if (entity == null) {
//            return null;
//        }
//
//        return SundryDebtorMasterDto.builder()
//                .id(entity.getId())
//                .sundryDebtorName(entity.getSundryDebtorName())
//                .underGroup(entity.getUnderGroup())
//                .billWiseStatus(entity.getBillWiseStatus())
//                .provideBankDetails(entity.getProvideBankDetails())
//                .sundryDebtorBankDetails(toDto(entity.getSundryDebtorBankDetails()))
//                .addressOne(entity.getAddressOne())
//                .addressTwo(entity.getAddressTwo())
//                .addressThree(entity.getAddressThree())
//                .addressFour(entity.getAddressFour())
//                .addressFive(entity.getAddressFive())
//                .landMarkOrArea(entity.getLandMarkOrArea())
//                .state(entity.getState())
//                .country(entity.getCountry())
//                .pincode(entity.getPincode())
//                .panOrItNumber(entity.getPanOrItNumber())
//                .gstinOrUinNumber(entity.getGstinOrUinNumber())
//                .msmeNumber(entity.getMsmeNumber())
//                .contactPersonName(entity.getContactPersonName())
//                .mobileNumber(entity.getMobileNumber())
//                .landlineNumber(entity.getLandlineNumber())
//                .emailId(entity.getEmailId())
//                .dateForOpening(entity.getDateForOpening())
//                .openingBalance(entity.getOpeningBalance())
//                .creditOrDebit(entity.getCreditOrDebit())
//                .sundryDebtorForexDetails(
//                        entity.getSundryDebtorForexDetails() != null ?
//                                entity.getSundryDebtorForexDetails().stream()
//                                        .map(SundryDebtorMasterMapper::toDto)
//                                        .collect(Collectors.toList()) : null
//                )
//                .build();
//    }
//
//    // Helper method to convert SundryDebtorBankDetailsDto to SundryDebtorBankDetails
//    private static SundryDebtorBankDetails toEntity(SundryDebtorBankDetailsDto dto) {
//        if (dto == null) {
//            return null;
//        }
//
//        SundryDebtorBankDetails entity = new SundryDebtorBankDetails();
//        entity.setId(dto.getId());
//        entity.setAccountName(dto.getAccountName());
//        entity.setAccountNumber(dto.getAccountNumber());
//        entity.setBankName(dto.getBankName());
//        entity.setBranchName(dto.getBranchName());
//        entity.setIfscCode(dto.getIfscCode());
//        entity.setAccountType(dto.getAccountType());
//        entity.setSwiftCode(dto.getSwiftCode());
//        return entity;
//    }
//
//    // Helper method to convert SundryDebtorBankDetails to SundryDebtorBankDetailsDto
//    private static SundryDebtorBankDetailsDto toDto(SundryDebtorBankDetails entity) {
//        if (entity == null) {
//            return null;
//        }
//
//        return SundryDebtorBankDetailsDto.builder()
//                .id(entity.getId())
//                .accountName(entity.getAccountName())
//                .accountNumber(entity.getAccountNumber())
//                .bankName(entity.getBankName())
//                .branchName(entity.getBranchName())
//                .ifscCode(entity.getIfscCode())
//                .accountType(entity.getAccountType())
//                .swiftCode(entity.getSwiftCode())
//                .build();
//    }
//
//    // Helper method to convert SundryDebtorForexDetailsDto to SundryDebtorForexDetails
//    private static SundryDebtorForexDetails toEntity(SundryDebtorForexDetailsDto dto) {
//        if (dto == null) {
//            return null;
//        }
//
//        SundryDebtorForexDetails entity = new SundryDebtorForexDetails();
//        // Set properties accordingly
//        return entity;
//    }
//
//    // Helper method to convert SundryDebtorForexDetails to SundryDebtorForexDetailsDto
//    private static SundryDebtorForexDetailsDto toDto(SundryDebtorForexDetails entity) {
//        if (entity == null) {
//            return null;
//        }
//
//        return SundryDebtorForexDetailsDto.builder()
//                // Set properties accordingly
//                .build();
//    }
//}
