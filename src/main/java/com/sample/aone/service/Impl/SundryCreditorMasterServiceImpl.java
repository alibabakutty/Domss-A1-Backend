package com.sample.aone.service.Impl;


import com.sample.aone.entity.SundryCreditorMaster;
import com.sample.aone.repository.SundryCreditorMasterDAO;
import com.sample.aone.service.SundryCreditorMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SundryCreditorMasterServiceImpl implements SundryCreditorMasterService {

    @Autowired
    private SundryCreditorMasterDAO sundryCreditorMasterDAO;




    public SundryCreditorMaster createSundryCreditorMaster(SundryCreditorMaster sundryCreditorMaster) {
        return sundryCreditorMasterDAO.save(sundryCreditorMaster);
    }

}
