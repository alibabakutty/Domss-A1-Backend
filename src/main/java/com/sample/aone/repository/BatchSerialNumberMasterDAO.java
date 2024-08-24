package com.sample.aone.repository;

import com.sample.aone.entity.BatchSerialNumberMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BatchSerialNumberMasterDAO extends JpaRepository<BatchSerialNumberMaster,Long> {
    boolean existsByBatchSerialNumber(String batchSerialNumber);
    Optional<BatchSerialNumberMaster> findByBatchSerialNumber(String batchSerialNumber);
}
