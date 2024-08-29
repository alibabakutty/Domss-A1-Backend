package com.sample.aone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SundryCreditorMasterDto {


    private Long id;

    private String sundryCreditorName;

    private String underGroup;

    private String billWiseStatus;

    private String addressOne;

    private String addressTwo;

    private String addressThree;

    private String addressFour;

    private String addressFive;

    private String landMarkOrArea;

    private String state;

    private String country;

    private String pincode;

    private String panOrItNumber;

    private String msmeNumber;

    private BigDecimal openingBalance;

    private String dateForOpening;

    private String creditOrDebit;
}
