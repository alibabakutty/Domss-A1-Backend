package com.sample.aone.service;

import com.sample.aone.dto.VoucherTypeMasterDto;

import java.util.List;

public interface VoucherTypeMasterService {
    VoucherTypeMasterDto createVoucherTypeMaster(VoucherTypeMasterDto voucherTypeMasterDto);

    VoucherTypeMasterDto getVoucherTypeName(String voucherTypeName);

    List<VoucherTypeMasterDto> getAllVoucherTypeMasters();

    VoucherTypeMasterDto updateVoucherTypeMaster(String voucherTypeName, VoucherTypeMasterDto updatedVoucherTypeMaster);

    void deleteByVoucherTypeMaster(Long id);
}
