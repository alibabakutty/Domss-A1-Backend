package com.sample.aone.controller;

import com.sample.aone.entity.GroupMaster;
import com.sample.aone.service.GroupMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("groupMasterApi")
public class GroupMasterController {

    @Autowired
    private GroupMasterService groupMasterService;

    //Build ADD Masters REST API
    @PostMapping("/addGroup")
    public ResponseEntity<GroupMaster> createGroupMaster(@RequestBody GroupMaster groupMaster){
        GroupMaster saveGroupMaster = groupMasterService.createGroupMaster(groupMaster);
        return new ResponseEntity<>(groupMaster, HttpStatus.CREATED);
    }

    //Build GET Master Ids REST API
    @RequestMapping("/displayGroup/{groupName}")
    public ResponseEntity<GroupMaster> getGroupName(@PathVariable String groupName){
        Optional<GroupMaster> groupMaster = groupMasterService.getGroupName(groupName);
        return groupMaster.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Build GET All Master Ids REST API
    @RequestMapping("/allGroups")
    public ResponseEntity<List<GroupMaster>> getAllGroupMasters(){
        List<GroupMaster> groupMasters = groupMasterService.getAllGroupMasters();
        return new ResponseEntity<>(groupMasters, HttpStatus.OK);
    }

    //Build UPDATE Master REST API
    @PutMapping("/alterGroupMaster/{groupName}")
    public ResponseEntity<GroupMaster> updateGroupMaster(@PathVariable String groupName, @RequestBody GroupMaster updateGroup){
        GroupMaster update = groupMasterService.updateGroupMaster(groupName,updateGroup);
        return ResponseEntity.ok(update);
    }

    //Build DELETE Ledger REST API
    @DeleteMapping("deleteGroupMaster/{id}")
    public ResponseEntity<Void> deleteGroupMaster(@PathVariable Long id){
        groupMasterService.deleteGroupMaster(id);
        return ResponseEntity.noContent().build();
    }
}
