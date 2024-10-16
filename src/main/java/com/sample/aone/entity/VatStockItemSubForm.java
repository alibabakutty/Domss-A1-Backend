package com.sample.aone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "vat_stock_item_subform")
public class VatStockItemSubForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "vat_date")
    private LocalDate vatDate;

    @Column(name = "vat_code")
    private Integer vatCode;

    @Column(name = "vat_percentage")
    private Float vatPercentage;

    @Column(name = "vat_status")
    private String vatStatus;
}
