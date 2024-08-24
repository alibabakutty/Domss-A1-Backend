package com.sample.aone.repository;

import com.sample.aone.entity.BatchColorMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BatchColorMasterDAO extends JpaRepository<BatchColorMaster,Long> {
    boolean existsByBatchColorName(String batchColorName);
    Optional<BatchColorMaster> findByBatchColorName(String batchColorName);
}
