package com.sample.aone.repository;

import com.sample.aone.entity.BranchOfficeMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BranchOfficeMasterDAO extends JpaRepository<BranchOfficeMaster,Long> {
    boolean existsByBranchOfficeName(String branchOfficeName);
    Optional<BranchOfficeMaster> findByBranchOfficeName(String branchOfficeName);
}
