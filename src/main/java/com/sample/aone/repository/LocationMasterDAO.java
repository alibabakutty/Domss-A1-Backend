package com.sample.aone.repository;

import com.sample.aone.entity.LocationMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationMasterDAO extends JpaRepository<LocationMaster,Long> {
    boolean existsByGodownName(String godownName);
    Optional<LocationMaster> findByGodownName(String godownName);
}
