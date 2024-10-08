package com.sample.aone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

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

    @Column(name = "stock_item_code")
    private String stockItemCode;

    @Column(name = "stock_item_name")
    private String stockItemName;

    @Column(name = "under")
    private String under;

    @Column(name = "category")
    private String category;

    @Column(name = "units")
    private String units;

    @Column(name = "standard_selling_price")
    private String standardSellingPrice;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "selling_price_id")
    private List<StandardSellingPriceSubForm> standardSellingPriceSubForm;

    @Column(name = "standard_selling_cost")
    private String standardSellingCost;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "selling_cost_id")
    private List<StandardSellingCostSubForm> standardSellingCostSubForm;

    @Column(name = "opening_balance_quantity")
    private Integer openingBalanceQuantity;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "godown_id")
    private List<GodownSubForm> godownSubForm;

    @Column(name = "opening_balance_rate")
    private BigDecimal openingBalanceRate;

    @Column(name = "opening_balance_unit")
    private String openingBalanceUnit;

    @Column(name = "opening_balance_value")
    private BigDecimal openingBalanceValue;

    @Column(name = "totalQuantity")
    private Integer totalQuantity;

    @Column(name = "total_net_amount")
    private BigDecimal totalNetAmount;
}
