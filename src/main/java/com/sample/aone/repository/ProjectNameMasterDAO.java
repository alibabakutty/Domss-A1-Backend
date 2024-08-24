package com.sample.aone.repository;

import com.sample.aone.entity.ProjectNameMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectNameMasterDAO extends JpaRepository<ProjectNameMaster,Long> {
    boolean existByProjectName(String projectName);
    Optional<ProjectNameMaster> findByProjectName(String projectName);
}
