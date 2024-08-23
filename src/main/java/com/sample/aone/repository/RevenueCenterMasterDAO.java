package com.sample.aone.repository;

import com.sample.aone.entity.RevenueCenterMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RevenueCenterMasterDAO extends JpaRepository<RevenueCenterMaster,Long> {
    boolean existsByRevenueCenterName(String revenueCenterName);
    Optional<RevenueCenterMaster> findByRevenueCenterName(String revenueCenterName);
}
