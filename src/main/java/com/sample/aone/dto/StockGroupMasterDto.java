package com.sample.aone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StockGroupMasterDto {

    private Long id;

    private String stockGroupName;

    private String under;

    private String shouldQuantitiesOfItemsBeAdded;

    private String hsnOrSacDetails;

    private String sourceOfDetails;

    private String hsnOrSac;

    private String description;
}
