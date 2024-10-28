package com.sample.aone.service.Impl;

import com.sample.aone.entity.GroupMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.repository.GroupMasterDAO;
import com.sample.aone.service.GroupMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupMasterServiceImpl implements GroupMasterService {

    @Autowired
    private GroupMasterDAO groupMasterDAO;

    // create group master
    @Override
    public GroupMaster createGroupMaster(GroupMaster groupMaster){
        return groupMasterDAO.save(groupMaster);
    }

    // Display or get a GroupMaster by name
    @Override
    public Optional<GroupMaster> getGroupName(String groupName){
        return groupMasterDAO.findByGroupName(groupName);
    }

    // Method to get all GroupMasters
    @Override
    public List<GroupMaster> getAllGroupMasters(){
        // Fetch all records and return as a list of GroupMaster objects
        return groupMasterDAO.findAll();
    }

    // Alter or update a GroupMaster
    @Override
    public GroupMaster updateGroupMaster(String groupName, GroupMaster updateGroup){
        // Fetch existing Group by name, or throw an exception if not found
        GroupMaster existingGroup = groupMasterDAO.findByGroupName(groupName).orElseThrow(() ->

                new ResourceNotFoundException("Group name is not found with this name:" + groupName));

        // Update the basic fields
        existingGroup.setGroupName(updateGroup.getGroupName());
        existingGroup.setUnder(updateGroup.getUnder());
        existingGroup.setBehavesLikeSubLedger(updateGroup.getBehavesLikeSubLedger());
        existingGroup.setNettDebitOrCreditBalance(updateGroup.getNettDebitOrCreditBalance());
        existingGroup.setUsedForCalculation(updateGroup.getUsedForCalculation());
        existingGroup.setMethodToAllocateForPurchaseInvoice(updateGroup.getMethodToAllocateForPurchaseInvoice());

        // Save the updated entity to the database
        return groupMasterDAO.save(existingGroup);
    }

    // Delete a GroupMaster by id
    @Override
    public void deleteGroupMaster(Long id){
        GroupMaster groupMaster = groupMasterDAO.findById(id).orElseThrow(()->

                new ResourceNotFoundException("Group Name is not found with this id:" + id));
        groupMasterDAO.delete(groupMaster);
    }
}
