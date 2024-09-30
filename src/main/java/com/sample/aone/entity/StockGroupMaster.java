package com.sample.aone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "stock_Group_master")
public class StockGroupMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "stock_group_name")
    private String stockGroupName;

    @Column(name = "under")
    private String under;

    @Column(name = "should_quantities_of_items_be_added")
    private String shouldQuantitiesOfItemsBeAdded;

    @Column(name = "hsn_or_sac_details")
    private String hsnOrSacDetails;

    @Column(name = "source_of_details")
    private String sourceOfDetails;

    @Column(name = "hsn_or_sac")
    private String hsnOrSac;

    @Column(name = "description")
    private String description;
}
