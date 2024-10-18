package com.sample.aone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "accounting_ledger_subform")
public class AccountingLedgerSubForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "accounting_ledger_purchase")
    private String accountingLedgerPurchase;

    @Column(name = "accounting_ledger_sales")
    private String accountingLedgerSales;

    @Column(name = "accounting_ledger_credit_note")
    private String accountingLedgerCreditNote;

    @Column(name = "accounting_ledger_debit_note")
    private String accountingLedgerDebitNote;
}
