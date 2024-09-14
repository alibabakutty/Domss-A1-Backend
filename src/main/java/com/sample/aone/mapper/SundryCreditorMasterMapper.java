//package com.sample.aone.mapper;
//
//import com.sample.aone.dto.SundryCreditorMasterDto;
//import com.sample.aone.dto.SundryCreditorBankDetailsDto;
//import com.sample.aone.dto.SundryCreditorForexDetailsDto;
//import com.sample.aone.entity.SundryCreditorMaster;
//import com.sample.aone.entity.SundryCreditorBankDetails;
//import com.sample.aone.entity.SundryCreditorForexDetails;
//import java.util.stream.Collectors;
//
//public class SundryCreditorMasterMapper {
//
//    // Converts SundryCreditorMasterDto to SundryCreditorMaster entity
//    public static SundryCreditorMaster toEntity(SundryCreditorMasterDto dto) {
//        if (dto == null) {
//            return null;
//        }
//
//        SundryCreditorMaster entity = new SundryCreditorMaster();
//        entity.setId(dto.getId());
//        entity.setSundryCreditorName(dto.getSundryCreditorName());
//        entity.setUnderGroup(dto.getUnderGroup());
//        entity.setBillWiseStatus(dto.getBillWiseStatus());
//        entity.setProvideBankDetails(dto.getProvideBankDetails());
//
//        // Convert SundryCreditorBankDetailsDto to SundryCreditorBankDetails entity
//        entity.setSundryCreditorBankDetails(toEntity(dto.getSundryCreditorBankDetails()));
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
//        entity.setSundryCreditorForexDetails(
//                dto.getSundryCreditorForexDetails() != null ?
//                        dto.getSundryCreditorForexDetails().stream()
//                                .map(SundryCreditorMasterMapper::toEntity)
//                                .collect(Collectors.toList()) : null
//        );
//
//        return entity;
//    }
//
//    // Converts SundryCreditorMaster entity to SundryCreditorMasterDto
//    public static SundryCreditorMasterDto toDto(SundryCreditorMaster entity) {
//        if (entity == null) {
//            return null;
//        }
//
//        return SundryCreditorMasterDto.builder()
//                .id(entity.getId())
//                .sundryCreditorName(entity.getSundryCreditorName())
//                .underGroup(entity.getUnderGroup())
//                .billWiseStatus(entity.getBillWiseStatus())
//                .provideBankDetails(entity.getProvideBankDetails())
//                .sundryCreditorBankDetails(toDto(entity.getSundryCreditorBankDetails()))
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
//                .sundryCreditorForexDetails(
//                        entity.getSundryCreditorForexDetails() != null ?
//                                entity.getSundryCreditorForexDetails().stream()
//                                        .map(SundryCreditorMasterMapper::toDto)
//                                        .collect(Collectors.toList()) : null
//                )
//                .build();
//    }
//
//    // Helper method to convert SundryCreditorBankDetailsDto to SundryCreditorBankDetails
//    private static SundryCreditorBankDetails toEntity(SundryCreditorBankDetailsDto dto) {
//        if (dto == null) {
//            return null;
//        }
//
//        SundryCreditorBankDetails entity = new SundryCreditorBankDetails();
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
//    // Helper method to convert SundryCreditorBankDetails to SundryCreditorBankDetailsDto
//    private static SundryCreditorBankDetailsDto toDto(SundryCreditorBankDetails entity) {
//        if (entity == null) {
//            return null;
//        }
//
//        return SundryCreditorBankDetailsDto.builder()
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
//    // Helper method to convert SundryCreditorForexDetailsDto to SundryCreditorForexDetails
//    private static SundryCreditorForexDetails toEntity(SundryCreditorForexDetailsDto dto) {
//        if (dto == null) {
//            return null;
//        }
//
//        SundryCreditorForexDetails entity = new SundryCreditorForexDetails();
//        // Set properties accordingly
//        return entity;
//    }
//
//    // Helper method to convert SundryCreditorForexDetails to SundryCreditorForexDetailsDto
//    private static SundryCreditorForexDetailsDto toDto(SundryCreditorForexDetails entity) {
//        if (entity == null) {
//            return null;
//        }
//
//        return SundryCreditorForexDetailsDto.builder()
//                // Set properties accordingly
//                .build();
//    }
//}
