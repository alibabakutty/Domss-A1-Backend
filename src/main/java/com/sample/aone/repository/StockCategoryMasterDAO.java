package com.sample.aone.repository;

import com.sample.aone.entity.StockCategoryMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockCategoryMasterDAO extends JpaRepository<StockCategoryMaster, Long> {
    boolean existsByStockCategoryName(String stockCategoryName);
    Optional<StockCategoryMaster> findByStockCategoryName(String stockCategoryName);
}
