package com.sample.aone.controller;

import com.sample.aone.dto.DepartmentMasterDto;
import com.sample.aone.entity.DepartmentMaster;
import com.sample.aone.service.DepartmentMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("departmentMasterApi")
public class DepartmentMasterController {

    @Autowired
    private DepartmentMasterService departmentMasterService;

    //Build ADD Masters REST API
    @PostMapping("/addDepartmentMaster")
    public ResponseEntity<DepartmentMasterDto> createDepartment(@RequestBody DepartmentMasterDto departmentMasterDto){
        DepartmentMasterDto saveDepartment = departmentMasterService.createDepartmentMaster(departmentMasterDto);
        return new ResponseEntity<>(saveDepartment, HttpStatus.CREATED);
    }

    //Build GET Master Ids REST API
    @RequestMapping("displayDepartment/{departmentName}")
    public ResponseEntity<DepartmentMasterDto> getDataByDepartmentName(@PathVariable String departmentName){
        DepartmentMasterDto departmentMasterDto = departmentMasterService.getDepartmentName(departmentName);
        return ResponseEntity.ok(departmentMasterDto);
    }

    //Build GET All Master Ids REST API
    @RequestMapping("/allDepartments")
    public ResponseEntity<List<DepartmentMasterDto>> getAllDepartment(){
        List<DepartmentMasterDto> allDepartment = departmentMasterService.getAllDepartmentMaster();
        return ResponseEntity.ok(allDepartment);
    }

    //Build UPDATE Master REST API
    @PutMapping("/alterDepartmentMaster/{departmentName}")
    public ResponseEntity<DepartmentMasterDto> updateDepartment(@PathVariable String departmentName, @RequestBody DepartmentMasterDto updateDepartmentMaster){
        DepartmentMasterDto departmentMasterDto = departmentMasterService.updateDepartmentMaster(departmentName, updateDepartmentMaster);
        return ResponseEntity.ok(departmentMasterDto);
    }

    //Build DELETE Ledger REST API
    @DeleteMapping("deleteDepartment/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable Long id){

        departmentMasterService.deleteByDepartmentMaster(id);
        return ResponseEntity.ok("Department deleted successfully!");
    }
}
