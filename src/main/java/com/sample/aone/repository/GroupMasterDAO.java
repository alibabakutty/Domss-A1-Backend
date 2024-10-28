package com.sample.aone.repository;

import com.sample.aone.entity.GroupMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroupMasterDAO extends JpaRepository<GroupMaster, Long> {
    boolean existsByGroupName(String groupName);
    Optional<GroupMaster> findByGroupName(String groupName);
}
