package com.sample.aone.repository;

import com.sample.aone.entity.StockItemMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockItemMasterDAO extends JpaRepository<StockItemMaster, Long> {
    boolean existsByStockItemName(String stockItemName);
    Optional<StockItemMaster> findByStockItemName(String stockItemName);
}
