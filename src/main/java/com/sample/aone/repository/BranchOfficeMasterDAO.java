package com.sample.aone.repository;

import com.sample.aone.entity.BranchOfficeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BranchOfficeMasterDAO extends JpaRepository<BranchOfficeMaster,Long> {
    boolean existsByBranchOfficeName(String branchOfficeName);
    Optional<BranchOfficeMaster> findByBranchOfficeName(String branchOfficeName);
}
