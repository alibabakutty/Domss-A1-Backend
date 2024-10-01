package com.sample.aone.repository;

import com.sample.aone.entity.UnitMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UnitMasterDAO extends JpaRepository<UnitMaster, Long> {
    boolean existsByUnitSymbolName(String unitSymbolName);
    Optional<UnitMaster> findByUnitSymbolName(String unitSymbolName);
}
