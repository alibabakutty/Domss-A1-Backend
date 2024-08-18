package com.sample.aone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "currency_master")
public class CurrencyMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "forex_currency_symbol")
    private String forexCurrencySymbol;

    @Column(name = "forex_currency_name")
    private String forexCurrencyName;

    @Column(name = "country")
    private String country;

    @Column(name = "voucher_date")
    private String voucherDate;

    @Column(name = "currency_symbol")
    private String currencySymbol;

    @Column(name = "rate_for_per_sales_currency")
    private Long rateForPerSalesCurrency;

    @Column(name = "rate_for_sales_invoice")
    private Long rateForSalesInvoice;

    @Column(name = "rate_for_per_purchase_currency")
    private Long rateForPerPurchaseCurrency;

    @Column(name = "rate_for_purchase_invoice")
    private Long rateForPurchaseInvoice;

    @Column(name = "rate_for_per_payment_currency")
    private Long rateForPerPaymentCurrency;

    @Column(name = "rate_for_payment_invoice")
    private Long rateForPaymentInvoice;

    @Column(name = "rate_for_per_receipt_currency")
    private Long rateForPerReceiptCurrency;

    @Column(name = "rate_for_receipt_invoice")
    private Long rateForReceiptInvoice;
}
