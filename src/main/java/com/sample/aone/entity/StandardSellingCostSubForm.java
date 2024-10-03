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
@Table(name = "standard_selling_cost_subform")
public class StandardSellingCostSubForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "selling_cost_date")
    private LocalDate sellingCostDate;

    @Column(name = "selling_cost_rate")
    private BigDecimal sellingCostRate;

    @Column(name = "selling_cost_percentage")
    private Float sellingCostPercentage;

    @Column(name = "selling_cost_net_rate")
    private BigDecimal sellingCostNetRate;

    @Column(name = "selling_cost_status")
    private String sellingCostStatus;
}
