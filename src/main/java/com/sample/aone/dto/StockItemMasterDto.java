package com.sample.aone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StockItemMasterDto {

    private Long id;

    private String stockItemName;

    private String under;

    private String units;

    private String gstApplicability;

    private String hsnOrSacDetails;

    private String sourceOfDetails;

    private String hsnOrSac;

    private String description;

    private String typeOfSupply;

    private String isInclusiveOfDutiesAndTaxes;

    private String rateOfDuty;
}
