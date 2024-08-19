package com.sample.aone.repository;

import com.sample.aone.entity.DepartmentMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentMasterDAO extends JpaRepository<DepartmentMaster,Long> {
    boolean existsByDepartmentName(String departmentName);
    Optional<DepartmentMaster> findByDepartmentName(String departmentName);
}
