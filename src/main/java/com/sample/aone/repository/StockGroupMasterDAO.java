package com.sample.aone.repository;

import com.sample.aone.entity.StockGroupMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface StockGroupMasterDAO extends JpaRepository<StockGroupMaster, Long> {
    boolean existsByStockGroupName(String stockGroupName);
    Optional<StockGroupMaster> findByStockGroupName(String stockGroupName);
}
