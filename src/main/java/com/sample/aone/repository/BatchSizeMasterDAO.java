package com.sample.aone.repository;

import com.sample.aone.entity.BatchSizeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface BatchSizeMasterDAO extends JpaRepository<BatchSizeMaster,Long> {
    boolean existsByBatchSizeName(String batchSizeName);
    Optional<BatchSizeMaster> findByBatchSizeName(String batchSizeName);
}
