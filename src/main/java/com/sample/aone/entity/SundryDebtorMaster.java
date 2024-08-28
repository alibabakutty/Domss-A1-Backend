package com.sample.aone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "sundry_debtor_master")
public class SundryDebtorMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sundry_debtor_name")
    private String sundryDebtorName;

    @Column(name = "under_group")
    private String underGroup;

    @Column(name = "bill_wise_status")
    private String billWiseStatus;

    @Column(name = "address_one")
    private String addressOne;

    @Column(name = "address_two")
    private String addressTwo;

    @Column(name = "address_three")
    private String addressThree;

    @Column(name = "address_four")
    private String addressFour;

    @Column(name = "address_five")
    private String addressFive;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "pincode")
    private String pincode;

    @Column(name = "pan_or_it_number")
    private String panOrItNumber;

    @Column(name = "msme_number")
    private String msmeNumber;
}
