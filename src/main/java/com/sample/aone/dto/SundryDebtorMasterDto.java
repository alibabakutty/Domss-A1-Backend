package com.sample.aone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SundryDebtorMasterDto {

    private Long id;

    private String sundryDebtorName;

    private String underGroup;

    private String billWiseStatus;

    private String addressOne;

    private String addressTwo;

    private String addressThree;

    private String addressFour;

    private String addressFive;

    private String state;

    private String country;

    private String pincode;

    private String panOrItNumber;

    private String msmeNumber;
}
