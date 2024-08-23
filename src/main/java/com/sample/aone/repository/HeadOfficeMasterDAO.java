package com.sample.aone.repository;

import com.sample.aone.entity.HeadOfficeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HeadOfficeMasterDAO extends JpaRepository<HeadOfficeMaster,Long> {
    boolean existsByHeadOfficeName(String headOfficeName);
    Optional<HeadOfficeMaster> findByHeadOfficeName(String headOfficeName);
}
