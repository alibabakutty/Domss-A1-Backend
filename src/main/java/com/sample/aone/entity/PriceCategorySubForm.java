package com.sample.aone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "price_category_subform")
public class PriceCategorySubForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "serial_no")
    private Integer serialNumber;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_mrp")
    private BigDecimal productMrp;

    @Column(name = "product_rate")
    private BigDecimal productRate;

    @Column(name = "product_discount")
    private Float productDiscount;
}
