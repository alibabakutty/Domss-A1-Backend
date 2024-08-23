package com.sample.aone.repository;

import com.sample.aone.entity.CostCenterMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CostCenterMasterDAO extends JpaRepository<CostCenterMaster,Long> {
    boolean existsByCostCenterName(String costCenterName);
    Optional<CostCenterMaster> findByCostCenterName(String costCenterName);
}
