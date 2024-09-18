package com.sample.aone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sundry_debtor_forex_details")
public class SundryDebtorForexDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "forex_date")
    private LocalDate forexDate;

    @Column(name = "reference_name")
    private String referenceName;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Column(name = "forex_currency_type")
    private String forexCurrencyType;

    @Column(name = "forex_amount")
    private BigDecimal forexAmount;

    @Column(name = "exchange_rate")
    private BigDecimal exchangeRate;

    @Column(name = "reference_amount")
    private BigDecimal referenceAmount;

    @Column(name = "reference_credit_or_debit")
    private String referenceCreditOrDebit;
}
