package com.sample.aone.repository;

import com.sample.aone.entity.CurrencyMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CurrencyMasterDAO extends JpaRepository<CurrencyMaster,Long> {
    boolean existsByForexCurrencySymbol(String forexCurrencySymbol);
    Optional<CurrencyMaster> findByForexCurrencySymbol(String forexCurrencySymbol);
}
