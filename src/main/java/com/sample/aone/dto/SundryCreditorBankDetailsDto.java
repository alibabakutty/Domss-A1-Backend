package com.sample.aone.dto;

import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SundryCreditorBankDetailsDto {

    private Long id;

    private String accountName;

    private BigInteger accountNumber;

    private String bankName;

    private String branchName;

    private String ifscCode;

    private String accountType;

    private String swiftCode;

    // The master to which these bank details belong (only ID required to avoid circular references)
    private Long sundryCreditorMasterId;
}
