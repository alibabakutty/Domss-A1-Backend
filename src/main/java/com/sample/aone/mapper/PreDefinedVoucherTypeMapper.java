package com.sample.aone.mapper;

import com.sample.aone.dto.PreDefinedVoucherTypeDto;
import com.sample.aone.entity.PreDefinedVoucherType;

public class PreDefinedVoucherTypeMapper {

    public static PreDefinedVoucherTypeDto mapToPreDefinedVoucherTypeDto(PreDefinedVoucherType preDefinedVoucherType){
        return new PreDefinedVoucherTypeDto(
                preDefinedVoucherType.getId(),
                preDefinedVoucherType.getVoucherTypeName(),
                preDefinedVoucherType.getVoucherType(),
                preDefinedVoucherType.getStartingNumber(),
                preDefinedVoucherType.getWidthOfNumericalPart(),
                preDefinedVoucherType.getPrefillWithZero(),
                preDefinedVoucherType.getRestartNumberingApplicationForm(),
                preDefinedVoucherType.getStartingNumber(),
                preDefinedVoucherType.getRestartNumberingPeriodicity(),
                preDefinedVoucherType.getPrefixDetailsApplicationForm(),
                preDefinedVoucherType.getPrefixDetailsParticulars(),
                preDefinedVoucherType.getSuffixDetailsApplicationForm(),
                preDefinedVoucherType.getSuffixDetailsParticulars()
        );
    }

    public static PreDefinedVoucherType mapToPreDefinedVoucherType(PreDefinedVoucherTypeDto preDefinedVoucherTypeDto){
        return new PreDefinedVoucherType(
                preDefinedVoucherTypeDto.getId(),
                preDefinedVoucherTypeDto.getVoucherTypeName(),
                preDefinedVoucherTypeDto.getVoucherType(),
                preDefinedVoucherTypeDto.getStartingNumber(),
                preDefinedVoucherTypeDto.getWidthOfNumericalPart(),
                preDefinedVoucherTypeDto.getPrefillWithZero(),
                preDefinedVoucherTypeDto.getRestartNumberingApplicationForm(),
                preDefinedVoucherTypeDto.getRestartNumberingStartingNumber(),
                preDefinedVoucherTypeDto.getRestartNumberingPeriodicity(),
                preDefinedVoucherTypeDto.getPrefixDetailsApplicationForm(),
                preDefinedVoucherTypeDto.getPrefixDetailsParticulars(),
                preDefinedVoucherTypeDto.getSuffixDetailsApplicationForm(),
                preDefinedVoucherTypeDto.getSuffixDetailsParticulars()
        );
    }
}