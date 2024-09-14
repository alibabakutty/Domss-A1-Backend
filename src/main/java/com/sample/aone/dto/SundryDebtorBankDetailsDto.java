package com.sample.aone.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigInteger;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SundryDebtorBankDetailsDto {

    private Long id;

    private String accountName;

    private BigInteger accountNumber;

    private String bankName;

    private String branchName;

    private String ifscCode;

    private String accountType;

    private String swiftCode;

    // The master to which these bank details belong (only ID required to avoid circular references)
    private Long sundryDebtorMasterId;
}
