package com.sample.aone.service.Impl;

import com.sample.aone.entity.SundryDebtorMaster;
import com.sample.aone.repository.SundryDebtorMasterDAO;
import com.sample.aone.service.SundryDebtorMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SundryDebtorMasterServiceImpl implements SundryDebtorMasterService{

    @Autowired
    private SundryDebtorMasterDAO sundryDebtorMasterDAO;

    @Override
    public SundryDebtorMaster createSundryDebtorMaster(SundryDebtorMaster sundryDebtorMaster){
        return sundryDebtorMasterDAO.save(sundryDebtorMaster);
    }

}
