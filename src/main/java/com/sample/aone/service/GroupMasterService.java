package com.sample.aone.service;

import com.sample.aone.entity.GroupMaster;

import java.util.List;
import java.util.Optional;

public interface GroupMasterService {
    // create stock item master
    GroupMaster createGroupMaster(GroupMaster groupMaster);

    // Display or get a StockItemMaster by name
    Optional<GroupMaster> getGroupName(String groupName);

    // Method to get all GroupMasters
    List<GroupMaster> getAllGroupMasters();

    // Alter or update a GroupMaster
    GroupMaster updateGroupMaster(String groupName, GroupMaster updateGroup);

    // Delete a GroupMaster by id
    void deleteGroupMaster(Long id);
}
