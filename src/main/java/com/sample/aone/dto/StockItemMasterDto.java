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

    private BigDecimal openingBalanceQuantity;

    private BigDecimal openingBalanceRate;

    private String openingBalanceUnit;

    private BigDecimal openingBalanceValue;
}
