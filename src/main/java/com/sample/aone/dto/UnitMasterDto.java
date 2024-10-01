package com.sample.aone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UnitMasterDto {

    private Long id;

    private String unitTypeName;

    private String unitSymbolName;

    private String formalName;

    private String unitQuantityCode;

    private Short numberOfDecimalPlaces;
}
