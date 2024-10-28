package com.sample.aone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "group_master")
public class GroupMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "under")
    private String under;

    @Column(name = "behaves_like_subledger")
    private String behavesLikeSubLedger;

    @Column(name = "nett-debit_or_credit-balance")
    private String nettDebitOrCreditBalance;

    @Column(name = "used_for_calculation")
    private String usedForCalculation;

    @Column(name = "method_to_allocate_purchase_invoice")
    private String methodToAllocateForPurchaseInvoice;
}
