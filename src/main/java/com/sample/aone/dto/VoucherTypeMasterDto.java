package com.sample.aone.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoucherTypeMasterDto {

    private Long id;

    private String voucherTypeName;

    private String voucherType;

    private String startingNumber;

    private String widthOfNumericalPart;

    private String prefillWithZero;

    private String restartNumberingApplicationForm;

    private String restartNumberingStartingNumber;

    private String restartNumberingPeriodicity;

    private String prefixDetailsApplicationForm;

    private String prefixDetailsParticulars;

    private String suffixDetailsApplicationForm;

    private String suffixDetailsParticulars;

}
