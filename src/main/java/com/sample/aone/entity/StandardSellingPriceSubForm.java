package com.sample.aone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "standard_selling_price_subform")
public class StandardSellingPriceSubForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "selling_price_date")
    private LocalDate sellingPriceDate;

    @Column(name = "selling_price_rate")
    private BigDecimal sellingPriceRate;

    @Column(name = "selling_price_percentage")
    private Float sellingPricePercentage;

    @Column(name = "selling_price_net_rate")
    private BigDecimal sellingPriceNetRate;

    @Column(name = "selling_price_status")
    private String sellingPriceStatus;
}
