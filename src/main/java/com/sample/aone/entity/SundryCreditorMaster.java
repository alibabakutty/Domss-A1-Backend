package com.sample.aone.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "sundry_creditor_master")
public class SundryCreditorMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sundry_creditor_name")
    private String sundryCreditorName;

    @Column(name = "under_group")
    private String underGroup;

    @Column(name = "forex_applicable")
    private String forexApplicable;

    @Column(name = "bill_wise_status")
    private String billWiseStatus;

    @Column(name = "provide_bank_details")
    private String provideBankDetails;

    @OneToOne( cascade = CascadeType.ALL)
    @JoinColumn(name = "creditor_id", referencedColumnName = "id")
    private SundryCreditorBankDetails sundryCreditorBankDetails;

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

    @Column(name = "land_mark_or_area")
    private String landMarkOrArea;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "pincode")
    private Long pincode;

    @Column(name = "pan_or_it_number")
    private String panOrItNumber;

    @Column(name = "gst_number")
    private String gstinOrUinNumber;

    @Column(name = "msme_number")
    private String msmeNumber;

    @Column(name = "contact_person_name")
    private String contactPersonName;

    @Column(name = "mobile_number")
    private BigInteger mobileNumber;

    @Column(name = "landline_number")
    private String landlineNumber;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "date_for_opening")
    private String dateForOpening;

    @Column(name = "opening_balance")
    private BigDecimal openingBalance;

    @Column(name = "credit_or_debit")
    private String creditOrDebit;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "creditor_id")
    private List<SundryCreditorForexDetails> sundryCreditorForexDetails;
}
