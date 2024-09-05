package com.sample.aone.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SundryCreditorForexDetailsDto {

    private Long id;

    private String billWiseBreakOf;

    private BigDecimal uptoOpeningBalanceAmount;

    private String uptoCreditOrDebit;

    private String forexDate;

    private String referenceName;

    private String dueDate;

    private String forexCurrencyType;

    private BigDecimal forexAmount;

    private BigDecimal exchangeRate;

    private BigDecimal referenceAmount;

    private String referenceCreditOrDebit;

    private BigDecimal totalForexAmount;

    private BigDecimal totalAmount;

    private String totalAmountCreditOrDebit;

    // The master to which these forex details belong (only ID required to avoid circular references)
    private Long sundryCreditorMasterId;
}
