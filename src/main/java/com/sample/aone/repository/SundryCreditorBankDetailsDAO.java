package com.sample.aone.repository;

import com.sample.aone.entity.SundryCreditorBankDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SundryCreditorBankDetailsDAO extends JpaRepository<SundryCreditorBankDetails,Long> {

}
