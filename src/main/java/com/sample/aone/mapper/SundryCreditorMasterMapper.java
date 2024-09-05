//package com.sample.aone.mapper;
//
//import com.sample.aone.dto.SundryCreditorMasterDto;
//import com.sample.aone.entity.SundryCreditorMaster;
//
//public class SundryCreditorMasterMapper {
//
//    // Map SundryCreditorMasterDto to SundryCreditorMaster entity
//    public static SundryCreditorMaster mapToSundryCreditorMaster(SundryCreditorMasterDto dto) {
//        if (dto == null) {
//            return null;
//        }
//        return SundryCreditorMaster.builder()
//                .id(dto.getId())
//                .sundryCreditorName(dto.getSundryCreditorName())
//                .underGroup(dto.getUnderGroup())
//                .billWiseStatus(dto.getBillWiseStatus())
//                .provideBankDetails(dto.getProvideBankDetails())
//                .addressOne(dto.getAddressOne())
//                .addressTwo(dto.getAddressTwo())
//                .addressThree(dto.getAddressThree())
//                .addressFour(dto.getAddressFour())
//                .addressFive(dto.getAddressFive())
//                .landMarkOrArea(dto.getLandMarkOrArea())
//                .state(dto.getState())
//                .country(dto.getCountry())
//                .pincode(dto.getPincode())
//                .panOrItNumber(dto.getPanOrItNumber())
//                .gstinOrUinNumber(dto.getGstinOrUinNumber())
//                .msmeNumber(dto.getMsmeNumber())
//                .contactPersonName(dto.getContactPersonName())
//                .mobileNumber(dto.getMobileNumber())
//                .landlineNumber(dto.getLandlineNumber())
//                .emailId(dto.getEmailId())
//                .dateForOpening(dto.getDateForOpening())
//                .openingBalance(dto.getOpeningBalance())
//                .creditOrDebit(dto.getCreditOrDebit())
//                .sundryCreditorForexDetails(SundryCreditorForexDetailsMapper.mapToSundryCreditorForexDetailsList(dto.getSundryCreditorForexDetails())) // Use extracted mapper
//                .build();
//    }
//
//    // Map SundryCreditorMaster entity to SundryCreditorMasterDto
//    public static SundryCreditorMasterDto mapToSundryCreditorMasterDto(SundryCreditorMaster entity) {
//        if (entity == null) {
//            return null;
//        }
//        return SundryCreditorMasterDto.builder()
//                .id(entity.getId())
//                .sundryCreditorName(entity.getSundryCreditorName())
//                .underGroup(entity.getUnderGroup())
//                .billWiseStatus(entity.getBillWiseStatus())
//                .provideBankDetails(entity.getProvideBankDetails())
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
//                .sundryCreditorBankDetails(SundryCreditorBankDetailsMapper.mapToSundryCreditorBankDetailsDto(entity.getSundryCreditorBankDetails())) // Use extracted mapper
//                .sundryCreditorForexDetails(SundryCreditorForexDetailsMapper.mapToSundryCreditorForexDetailsDtoList(entity.getSundryCreditorForexDetails())) // Use extracted mapper
//                .build();
//    }
//}
