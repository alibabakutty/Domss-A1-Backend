package com.sample.aone.service.Impl;

import com.sample.aone.entity.SundryDebtorMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.repository.SundryDebtorMasterDAO;
import com.sample.aone.service.SundryDebtorMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SundryDebtorMasterServiceImpl implements SundryDebtorMasterService{

    @Autowired
    private SundryDebtorMasterDAO sundryDebtorMasterDAO;

    // Create a new SundryDebtorMaster
    @Override
    public SundryDebtorMaster createSundryDebtorMaster(SundryDebtorMaster sundryDebtorMaster){
        return sundryDebtorMasterDAO.save(sundryDebtorMaster);
    }

    // Display or get a SundryDebtorMaster by name
    @Override
    public Optional<SundryDebtorMaster> getSundryDebtorName(String sundryDebtorName){
        return sundryDebtorMasterDAO.findBySundryDebtorName(sundryDebtorName);
    }

    // Method to get all SundryDebtor names
    @Override
    public List<SundryDebtorMaster> getAllSundryDebtors(){
        // Fetch all records and map to their names
        return sundryDebtorMasterDAO.findAll();
    }

    // Alter or update a SundryDebtorMaster
    @Override
    public SundryDebtorMaster updateSundryDebtorMaster(String sundryDebtorName, SundryDebtorMaster updateSundryDebtorMaster){
        SundryDebtorMaster existingSundryDebtor = sundryDebtorMasterDAO.findBySundryDebtorName(sundryDebtorName).orElseThrow(()->
                new ResourceNotFoundException("Sundry debtor not found with this name:" + sundryDebtorName));

        // Update fields as necessary
        existingSundryDebtor.setSundryDebtorName(updateSundryDebtorMaster.getSundryDebtorName());
        existingSundryDebtor.setUnderGroup(updateSundryDebtorMaster.getUnderGroup());
        existingSundryDebtor.setForexApplicable(updateSundryDebtorMaster.getForexApplicable());
        existingSundryDebtor.setBillWiseStatus(updateSundryDebtorMaster.getBillWiseStatus());
        existingSundryDebtor.setProvideBankDetails(updateSundryDebtorMaster.getProvideBankDetails());

        // Update bank details
        if (updateSundryDebtorMaster.getSundryDebtorBankDetails() != null) {
            existingSundryDebtor.setSundryDebtorBankDetails(updateSundryDebtorMaster.getSundryDebtorBankDetails());
        }

        // Update address and contact details
        existingSundryDebtor.setAddressOne(updateSundryDebtorMaster.getAddressOne());
        existingSundryDebtor.setAddressTwo(updateSundryDebtorMaster.getAddressTwo());
        existingSundryDebtor.setAddressThree(updateSundryDebtorMaster.getAddressThree());
        existingSundryDebtor.setAddressFour(updateSundryDebtorMaster.getAddressFour());
        existingSundryDebtor.setAddressFive(updateSundryDebtorMaster.getAddressFive());
        existingSundryDebtor.setLandMarkOrArea(updateSundryDebtorMaster.getLandMarkOrArea());
        existingSundryDebtor.setState(updateSundryDebtorMaster.getState());
        existingSundryDebtor.setCountry(updateSundryDebtorMaster.getCountry());
        existingSundryDebtor.setPincode(updateSundryDebtorMaster.getPincode());
        existingSundryDebtor.setPanOrItNumber(updateSundryDebtorMaster.getPanOrItNumber());
        existingSundryDebtor.setGstinOrUinNumber(updateSundryDebtorMaster.getGstinOrUinNumber());
        existingSundryDebtor.setMsmeNumber(updateSundryDebtorMaster.getMsmeNumber());
        existingSundryDebtor.setContactPersonName(updateSundryDebtorMaster.getContactPersonName());
        existingSundryDebtor.setMobileNumber(updateSundryDebtorMaster.getMobileNumber());
        existingSundryDebtor.setLandlineNumber(updateSundryDebtorMaster.getLandlineNumber());
        existingSundryDebtor.setEmailId(updateSundryDebtorMaster.getEmailId());

        // Update forex sub-form details
        if (updateSundryDebtorMaster.getSundryDebtorForexDetails() != null) {
            existingSundryDebtor.setSundryDebtorForexDetails(updateSundryDebtorMaster.getSundryDebtorForexDetails());
        }

        // Update financial details
        existingSundryDebtor.setDateForOpening(updateSundryDebtorMaster.getDateForOpening());
        existingSundryDebtor.setOpeningBalance(updateSundryDebtorMaster.getOpeningBalance());
        existingSundryDebtor.setCreditOrDebit(updateSundryDebtorMaster.getCreditOrDebit());

        // Save the updated entity
        return sundryDebtorMasterDAO.save(existingSundryDebtor);
    }

    // Delete a SundryDebtorMaster by id
    @Override
    public void deleteSundryDebtorMaster(Long id){
        SundryDebtorMaster sundryDebtorMaster = sundryDebtorMasterDAO.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Sundry debtor not found with this id:" + id));
        sundryDebtorMasterDAO.delete(sundryDebtorMaster);
    }

}
