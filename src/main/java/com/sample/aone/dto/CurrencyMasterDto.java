package com.sample.aone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyMasterDto {

    private Long id;

    private String forexCurrencySymbol;

    private String forexCurrencyName;

    private String country;

    private String voucherDate;

    private String currencySymbol;

    private Double rateForPerSalesCurrency;

    private Double rateForSalesInvoice;

    private Double rateForPerPurchaseCurrency;

    private Double rateForPurchaseInvoice;

    private Double rateForPerPaymentCurrency;

    private Double rateForPaymentInvoice;

    private Double rateForPerReceiptCurrency;

    private Double rateForReceiptInvoice;
}
