package com.sample.aone.mapper;

import com.sample.aone.dto.SundryCreditorForexDetailsDto;
import com.sample.aone.entity.SundryCreditorForexDetails;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class SundryCreditorForexDetailsMapper {

    // Map SundryCreditorForexDetailsDto to SundryCreditorForexDetails entity
    public static SundryCreditorForexDetails mapToSundryCreditorForexDetails(SundryCreditorForexDetailsDto dto) {
        if (dto == null) {
            return null;
        }
        return SundryCreditorForexDetails.builder()
                .id(dto.getId())
                .billWiseBreakOf(dto.getBillWiseBreakOf())
                .uptoOpeningBalanceAmount(dto.getUptoOpeningBalanceAmount())
                .uptoCreditOrDebit(dto.getUptoCreditOrDebit())
                .forexDate(LocalDate.parse(dto.getForexDate()))
                .referenceName(dto.getReferenceName())
                .dueDate(LocalDate.parse(dto.getDueDate()))
                .forexCurrencyType(dto.getForexCurrencyType())
                .forexAmount(dto.getForexAmount())
                .exchangeRate(dto.getExchangeRate())
                .referenceAmount(dto.getReferenceAmount())
                .referenceCreditOrDebit(dto.getReferenceCreditOrDebit())
                .totalForexAmount(dto.getTotalForexAmount())
                .totalAmount(dto.getTotalAmount())
                .totalAmountCreditOrDebit(dto.getTotalAmountCreditOrDebit())
                .build();
    }

    // Map SundryCreditorForexDetails entity to SundryCreditorForexDetailsDto
    public static SundryCreditorForexDetailsDto mapToSundryCreditorForexDetailsDto(SundryCreditorForexDetails entity) {
        if (entity == null) {
            return null;
        }
        return SundryCreditorForexDetailsDto.builder()
                .id(entity.getId())
                .billWiseBreakOf(entity.getBillWiseBreakOf())
                .uptoOpeningBalanceAmount(entity.getUptoOpeningBalanceAmount())
                .uptoCreditOrDebit(entity.getUptoCreditOrDebit())
                .forexDate(String.valueOf(entity.getForexDate()))
                .referenceName(entity.getReferenceName())
                .dueDate(String.valueOf(entity.getDueDate()))
                .forexCurrencyType(entity.getForexCurrencyType())
                .forexAmount(entity.getForexAmount())
                .exchangeRate(entity.getExchangeRate())
                .referenceAmount(entity.getReferenceAmount())
                .referenceCreditOrDebit(entity.getReferenceCreditOrDebit())
                .totalForexAmount(entity.getTotalForexAmount())
                .totalAmount(entity.getTotalAmount())
                .totalAmountCreditOrDebit(entity.getTotalAmountCreditOrDebit())
                .build();
    }

    // Map list of SundryCreditorForexDetailsDto to list of SundryCreditorForexDetails entities
    public static List<SundryCreditorForexDetails> mapToSundryCreditorForexDetailsList(List<SundryCreditorForexDetailsDto> dtoList) {
        if (dtoList == null) {
            return null;
        }
        return dtoList.stream()
                .map(SundryCreditorForexDetailsMapper::mapToSundryCreditorForexDetails)
                .collect(Collectors.toList());
    }

    // Map list of SundryCreditorForexDetails entities to list of SundryCreditorForexDetailsDto
    public static List<SundryCreditorForexDetailsDto> mapToSundryCreditorForexDetailsDtoList(List<SundryCreditorForexDetails> entityList) {
        if (entityList == null) {
            return null;
        }
        return entityList.stream()
                .map(SundryCreditorForexDetailsMapper::mapToSundryCreditorForexDetailsDto)
                .collect(Collectors.toList());
    }
}
