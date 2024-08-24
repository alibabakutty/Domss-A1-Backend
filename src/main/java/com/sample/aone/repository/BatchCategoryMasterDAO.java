package com.sample.aone.repository;

import com.sample.aone.entity.BatchCategoryMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BatchCategoryMasterDAO extends JpaRepository<BatchCategoryMaster,Long> {
    boolean existsByBatchCategoryName(String batchCategoryName);
    Optional<BatchCategoryMaster> findByBatchCategoryName(String batchCategoryName);
}
