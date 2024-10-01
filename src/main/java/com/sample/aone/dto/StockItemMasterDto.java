package com.sample.aone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StockItemMasterDto {

    private Long id;

    private String stockItemName;

    private String under;

    private String category;

    private String units;

    private String gstApplicability;

    private String hsnOrSacDetails;

    private String sourceOfDetails;

    private String hsnOrSac;

    private String description;

    private String typeOfSupply;

    private String isInclusiveOfDutiesAndTaxes;

    private String rateOfDuty;

    private BigDecimal openingBalanceQuantity;

    private BigDecimal openingBalanceRate;

    private String openingBalanceUnit;

    private BigDecimal openingBalanceValue;
}
