package com.sample.aone.mapper;

import com.sample.aone.dto.VoucherTypeMasterDto;
import com.sample.aone.entity.VoucherTypeMaster;

public class VoucherTypeMasterMapper {

    public static VoucherTypeMasterDto mapToVoucherTypeMasterDto(VoucherTypeMaster voucherTypeMaster){
        return new VoucherTypeMasterDto(
                voucherTypeMaster.getId(),
                voucherTypeMaster.getVoucherTypeName(),
                voucherTypeMaster.getVoucherType(),
                voucherTypeMaster.getStartingNumber(),
                voucherTypeMaster.getWidthOfNumericalPart(),
                voucherTypeMaster.getPrefillWithZero(),
                voucherTypeMaster.getRestartNumberingApplicationForm(),
                voucherTypeMaster.getRestartNumberingStartingNumber(),
                voucherTypeMaster.getRestartNumberingPeriodicity(),
                voucherTypeMaster.getPrefixDetailsApplicationForm(),
                voucherTypeMaster.getPrefixDetailsParticulars(),
                voucherTypeMaster.getSuffixDetailsApplicationForm(),
                voucherTypeMaster.getSuffixDetailsParticulars()
        );

    }

    public static VoucherTypeMaster mapToVoucherTypeMaster(VoucherTypeMasterDto voucherTypeMasterDto){
        return new VoucherTypeMaster(
                voucherTypeMasterDto.getId(),
                voucherTypeMasterDto.getVoucherTypeName(),
                voucherTypeMasterDto.getVoucherType(),
                voucherTypeMasterDto.getStartingNumber(),
                voucherTypeMasterDto.getWidthOfNumericalPart(),
                voucherTypeMasterDto.getPrefillWithZero(),
                voucherTypeMasterDto.getRestartNumberingApplicationForm(),
                voucherTypeMasterDto.getRestartNumberingStartingNumber(),
                voucherTypeMasterDto.getRestartNumberingPeriodicity(),
                voucherTypeMasterDto.getPrefixDetailsApplicationForm(),
                voucherTypeMasterDto.getPrefixDetailsParticulars(),
                voucherTypeMasterDto.getSuffixDetailsApplicationForm(),
                voucherTypeMasterDto.getSuffixDetailsParticulars()
        );
    }
}
