package com.sample.aone.repository;

import com.sample.aone.entity.RevenueCategoryMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RevenueCategoryMasterDAO extends JpaRepository<RevenueCategoryMaster,Long> {
    boolean existsByRevenueCategoryName(String revenueCategoryName);
    Optional<RevenueCategoryMaster> findByRevenueCategoryName(String revenueCategoryName);
}
