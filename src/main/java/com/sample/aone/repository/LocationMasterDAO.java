package com.sample.aone.repository;

import com.sample.aone.entity.LocationMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface LocationMasterDAO extends JpaRepository<LocationMaster,Long> {
    boolean existsByGodownName(String godownName);
    Optional<LocationMaster> findByGodownName(String godownName);
}
