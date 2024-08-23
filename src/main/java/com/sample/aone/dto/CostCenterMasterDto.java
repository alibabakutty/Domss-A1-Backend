package com.sample.aone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CostCenterMasterDto {

    private Long id;

    private String costCenterName;

    private String costCategoryName;
}
