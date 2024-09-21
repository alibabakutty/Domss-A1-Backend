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
                .forexDate(LocalDate.parse(dto.getForexDate()))
                .referenceName(dto.getReferenceName())
                .dueDate(LocalDate.parse(dto.getDueDate()))
                .forexCurrencyType(dto.getForexCurrencyType())
                .forexAmount(dto.getForexAmount())
                .exchangeRate(dto.getExchangeRate())
                .outwardReferenceAmount(dto.getOutwardReferenceAmount())
                .inwardReferenceAmount(dto.getInwardReferenceAmount())
                .referenceCreditOrDebit(dto.getReferenceCreditOrDebit())
                .build();
    }

    // Map SundryCreditorForexDetails entity to SundryCreditorForexDetailsDto
    public static SundryCreditorForexDetailsDto mapToSundryCreditorForexDetailsDto(SundryCreditorForexDetails entity) {
        if (entity == null) {
            return null;
        }
        return SundryCreditorForexDetailsDto.builder()
                .id(entity.getId())
                .forexDate(String.valueOf(entity.getForexDate()))
                .referenceName(entity.getReferenceName())
                .dueDate(String.valueOf(entity.getDueDate()))
                .forexCurrencyType(entity.getForexCurrencyType())
                .forexAmount(entity.getForexAmount())
                .exchangeRate(entity.getExchangeRate())
                .outwardReferenceAmount(entity.getOutwardReferenceAmount())
                .inwardReferenceAmount(entity.getInwardReferenceAmount())
                .referenceCreditOrDebit(entity.getReferenceCreditOrDebit())
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
