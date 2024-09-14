package com.sample.aone.mapper;

import com.sample.aone.dto.SundryDebtorForexDetailsDto;
import com.sample.aone.entity.SundryDebtorForexDetails;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class SundryDebtorForexDetailsMapper {

    public static SundryDebtorForexDetails mapToSundryDebtorForexDetails(SundryDebtorForexDetailsDto sundryDebtorForexDetailsDto){
        return SundryDebtorForexDetails.builder()
                .id(sundryDebtorForexDetailsDto.getId())
                .billWiseBreakOf(sundryDebtorForexDetailsDto.getBillWiseBreakOf())
                .uptoOpeningBalanceAmount(sundryDebtorForexDetailsDto.getUptoOpeningBalanceAmount())
                .uptoCreditOrDebit(sundryDebtorForexDetailsDto.getUptoCreditOrDebit())
                .forexDate(LocalDate.parse(sundryDebtorForexDetailsDto.getForexDate()))
                .referenceName(sundryDebtorForexDetailsDto.getReferenceName())
                .dueDate(LocalDate.parse(sundryDebtorForexDetailsDto.getDueDate()))
                .forexCurrencyType(sundryDebtorForexDetailsDto.getForexCurrencyType())
                .forexAmount(sundryDebtorForexDetailsDto.getForexAmount())
                .exchangeRate(sundryDebtorForexDetailsDto.getExchangeRate())
                .referenceAmount(sundryDebtorForexDetailsDto.getReferenceAmount())
                .referenceCreditOrDebit(sundryDebtorForexDetailsDto.getReferenceCreditOrDebit())
                .totalForexAmount(sundryDebtorForexDetailsDto.getTotalForexAmount())
                .totalAmount(sundryDebtorForexDetailsDto.getTotalAmount())
                .totalAmountCreditOrDebit(sundryDebtorForexDetailsDto.getTotalAmountCreditOrDebit())
                .build();
    }

    public static SundryDebtorForexDetailsDto mapToSundryDebtorForexDetailsDto(SundryDebtorForexDetails sundryDebtorForexDetails){
        return SundryDebtorForexDetailsDto.builder()
                .id(sundryDebtorForexDetails.getId())
                .billWiseBreakOf(sundryDebtorForexDetails.getBillWiseBreakOf())
                .uptoOpeningBalanceAmount(sundryDebtorForexDetails.getUptoOpeningBalanceAmount())
                .uptoCreditOrDebit(sundryDebtorForexDetails.getUptoCreditOrDebit())
                .forexDate(String.valueOf(sundryDebtorForexDetails.getForexDate()))
                .referenceName(sundryDebtorForexDetails.getReferenceName())
                .dueDate(String.valueOf(sundryDebtorForexDetails.getDueDate()))
                .forexCurrencyType(sundryDebtorForexDetails.getForexCurrencyType())
                .forexAmount(sundryDebtorForexDetails.getForexAmount())
                .exchangeRate(sundryDebtorForexDetails.getExchangeRate())
                .referenceAmount(sundryDebtorForexDetails.getReferenceAmount())
                .referenceCreditOrDebit(sundryDebtorForexDetails.getReferenceCreditOrDebit())
                .totalForexAmount(sundryDebtorForexDetails.getTotalForexAmount())
                .totalAmount(sundryDebtorForexDetails.getTotalAmount())
                .totalAmountCreditOrDebit(sundryDebtorForexDetails.getTotalAmountCreditOrDebit())
                .build();
    }

    public static List<SundryDebtorForexDetails> mapToSundryCreditorForexDetailsList(List<SundryDebtorForexDetailsDto> dtoList){
        if (dtoList == null){
            return null;
        }
        return dtoList.stream()
                .map(SundryDebtorForexDetailsMapper::mapToSundryDebtorForexDetails)
                .collect(Collectors.toList());
    }

    public static List<SundryDebtorForexDetailsDto> mapToSundryCreditorForexDetailsDtoList(List<SundryDebtorForexDetails> entityList){
        if (entityList == null){
            return null;
        }

        return entityList.stream()
                .map(SundryDebtorForexDetailsMapper::mapToSundryDebtorForexDetailsDto)
                .collect(Collectors.toList());
    }
}
