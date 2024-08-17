package com.sample.aone.service;

import com.sample.aone.dto.PreDefinedVoucherTypeDto;

import java.util.List;

public interface PreDefinedVoucherTypeService {
    PreDefinedVoucherTypeDto createPreDefinedVoucherType(PreDefinedVoucherTypeDto preDefinedVoucherTypeDto);

    PreDefinedVoucherTypeDto getPreDefinedVoucherTypeName(String voucherType);

    List<PreDefinedVoucherTypeDto> getAllPreDefinedVoucherTypes();

    PreDefinedVoucherTypeDto updatePreDefinedVoucherType(String voucherType, PreDefinedVoucherTypeDto updatedPreDefinedVoucherType);

    void deleteByPreDefinedVoucherType(Long id);
}
