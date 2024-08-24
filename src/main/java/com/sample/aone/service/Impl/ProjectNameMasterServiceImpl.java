package com.sample.aone.service.Impl;

import com.sample.aone.repository.ProjectNameMasterDAO;
import com.sample.aone.service.ProjectNameMasterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProjectNameMasterServiceImpl implements ProjectNameMasterService {

    @Autowired
    private ProjectNameMasterDAO projectNameMasterDAO;
}
