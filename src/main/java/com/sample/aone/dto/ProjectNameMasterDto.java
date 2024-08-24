package com.sample.aone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectNameMasterDto {

    private Long id;

    private String projectName;

    private String projectCategoryName;
}
