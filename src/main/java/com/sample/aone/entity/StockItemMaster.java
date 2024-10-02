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

    @Column(name = "opening_balance_quantity")
    private BigDecimal openingBalanceQuantity;

    @Column(name = "opening_balance_rate")
    private BigDecimal openingBalanceRate;

    @Column(name = "opening_balance_unit")
    private String openingBalanceUnit;

    @Column(name = "opening_balance_value")
    private BigDecimal openingBalanceValue;
}
