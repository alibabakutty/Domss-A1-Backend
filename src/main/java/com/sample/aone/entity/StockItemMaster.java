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
@Table(name = "stock_item_master")
public class StockItemMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "stock_item_name")
    private String stockItemName;

    @Column(name = "under")
    private String under;

    @Column(name = "category")
    private String category;

    @Column(name = "units")
    private String units;

    @Column(name = "gst_applicability")
    private String gstApplicability;

    @Column(name = "hsn_or_sac_details")
    private String hsnOrSacDetails;

    @Column(name = "source_of_details")
    private String sourceOfDetails;

    @Column(name = "hsn_or_sac")
    private String hsnOrSac;

    @Column(name = "description")
    private String description;

    @Column(name = "type_of_supply")
    private String typeOfSupply;

    @Column(name = "is_inclusive_of_duties_and_taxes")
    private String isInclusiveOfDutiesAndTaxes;

    @Column(name = "rate_of_duty")
    private String rateOfDuty;

    @Column(name = "opening_balance_quantity")
    private BigDecimal openingBalanceQuantity;

    @Column(name = "opening_balance_rate")
    private BigDecimal openingBalanceRate;

    @Column(name = "opening_balance_unit")
    private String openingBalanceUnit;

    @Column(name = "opening_balance_value")
    private BigDecimal openingBalanceValue;
}
