package com.sample.aone.repository;

import com.sample.aone.entity.PriceCategoryMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PriceCategoryMasterDAO extends JpaRepository<PriceCategoryMaster, Long> {
    boolean existsByPriceCategoryName(String priceCategoryName);
    Optional<PriceCategoryMaster> findByPriceCategoryName(String priceCategoryName);
}
