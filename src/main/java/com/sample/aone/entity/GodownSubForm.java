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
@Table(name = "godown_subform")
public class GodownSubForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "godown_name")
    private String godownName;

    @Column(name = "batch_name")
    private String batchName;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "rate_amount")
    private BigDecimal rateAmount;

    @Column(name = "per_unit")
    private String perUnit;

    @Column(name = "net_amount")
    private BigDecimal netAmount;
}
