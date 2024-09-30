package com.sample.aone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StockCategoryMasterDto {

    private Long id;

    private String stockCategoryName;

    private String under;
}
