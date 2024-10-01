package com.sample.aone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "unit_master")
public class UnitMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "unit_type_name")
    private String unitTypeName;

    @Column(name = "unit_symbol_name")
    private String unitSymbolName;

    @Column(name = "formal_name")
    private String formalName;

    @Column(name = "unit_quantity_code")
    private String unitQuantityCode;

    @Column(name = "number_of_decimal_places")
    private Short numberOfDecimalPlaces;
}
