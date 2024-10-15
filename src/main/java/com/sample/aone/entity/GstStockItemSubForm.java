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
@Table(name = "gst_stock_item_subform")
public class GstStockItemSubForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "gst_date")
    private LocalDate gstDate;

    @Column(name = "hsn_code")
    private String hsnCode;

    @Column(name = "gst_percentage")
    private Float gstPercentage;

    @Column(name = "gst_status")
    private String gstStatus;
}
