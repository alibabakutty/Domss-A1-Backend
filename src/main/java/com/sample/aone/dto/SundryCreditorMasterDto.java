package com.sample.aone.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SundryCreditorMasterDto {

    private Long id;

    private String sundryCreditorName;

    private String underGroup;

    private String billWiseStatus;

    private String provideBankDetails;

    private SundryCreditorBankDetailsDto sundryCreditorBankDetails;

    private String addressOne;

    private String addressTwo;

    private String addressThree;

    private String addressFour;

    private String addressFive;

    private String landMarkOrArea;

    private String state;

    private String country;

    private Long pincode;

    private String panOrItNumber;

    private String gstinOrUinNumber;

    private String msmeNumber;

    private String contactPersonName;

    private BigInteger mobileNumber;

    private String landlineNumber;

    private String emailId;

    private String dateForOpening;

    private BigDecimal openingBalance;

    private String creditOrDebit;

    // List of forex details associated with the sundry creditor master
    private List<SundryCreditorForexDetailsDto> sundryCreditorForexDetails;
}
