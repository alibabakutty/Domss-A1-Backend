package com.sample.aone.service.Impl;


import com.sample.aone.entity.SundryCreditorMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.repository.SundryCreditorMasterDAO;
import com.sample.aone.service.SundryCreditorMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SundryCreditorMasterServiceImpl implements SundryCreditorMasterService {

    @Autowired
    private SundryCreditorMasterDAO sundryCreditorMasterDAO;


    @Override
    // Create a new SundryCreditorMaster
    public SundryCreditorMaster createSundryCreditorMaster(SundryCreditorMaster sundryCreditorMaster) {
        return sundryCreditorMasterDAO.save(sundryCreditorMaster);
    }

    // Display or get a SundryCreditorMaster by name
    @Override
    public Optional<SundryCreditorMaster> getSundryCreditorName(String sundryCreditorName){
        return sundryCreditorMasterDAO.findBySundryCreditorName(sundryCreditorName);
    }

    // Method to get all SundryCreditor names
    @Override
    public List<SundryCreditorMaster> getAllSundryCreditors(){
        // Fetch all records and return as a list of SundryCreditorMaster objects
        return sundryCreditorMasterDAO.findAll();
    }

    // Alter or update a SundryCreditorMaster
    @Override
    @Transactional
    public SundryCreditorMaster updateSundryCreditorMaster(String sundryCreditorName, SundryCreditorMaster updateSundryCreditorMaster) {
        // Fetch existing Sundry Creditor by name, or throw an exception if not found
        SundryCreditorMaster existingSundryCreditor = sundryCreditorMasterDAO.findBySundryCreditorName(sundryCreditorName)
                .orElseThrow(() -> new ResourceNotFoundException("Sundry Creditor not found with this name: " + sundryCreditorName));

        // Update the basic fields
        existingSundryCreditor.setSundryCreditorName(updateSundryCreditorMaster.getSundryCreditorName());
        existingSundryCreditor.setUnderGroup(updateSundryCreditorMaster.getUnderGroup());
        existingSundryCreditor.setForexApplicable(updateSundryCreditorMaster.getForexApplicable());
        existingSundryCreditor.setBillWiseStatus(updateSundryCreditorMaster.getBillWiseStatus());
        existingSundryCreditor.setProvideBankDetails(updateSundryCreditorMaster.getProvideBankDetails());

        // Update bank details only if present
        if (updateSundryCreditorMaster.getSundryCreditorBankDetails() != null) {
            existingSundryCreditor.setSundryCreditorBankDetails(updateSundryCreditorMaster.getSundryCreditorBankDetails());
        }

        // Update address and contact details
        existingSundryCreditor.setAddressOne(updateSundryCreditorMaster.getAddressOne());
        existingSundryCreditor.setAddressTwo(updateSundryCreditorMaster.getAddressTwo());
        existingSundryCreditor.setAddressThree(updateSundryCreditorMaster.getAddressThree());
        existingSundryCreditor.setAddressFour(updateSundryCreditorMaster.getAddressFour());
        existingSundryCreditor.setAddressFive(updateSundryCreditorMaster.getAddressFive());
        existingSundryCreditor.setLandMarkOrArea(updateSundryCreditorMaster.getLandMarkOrArea());
        existingSundryCreditor.setState(updateSundryCreditorMaster.getState());
        existingSundryCreditor.setCountry(updateSundryCreditorMaster.getCountry());
        existingSundryCreditor.setPincode(updateSundryCreditorMaster.getPincode());
        existingSundryCreditor.setPanOrItNumber(updateSundryCreditorMaster.getPanOrItNumber());
        existingSundryCreditor.setGstinOrUinNumber(updateSundryCreditorMaster.getGstinOrUinNumber());
        existingSundryCreditor.setMsmeNumber(updateSundryCreditorMaster.getMsmeNumber());
        existingSundryCreditor.setContactPersonName(updateSundryCreditorMaster.getContactPersonName());
        existingSundryCreditor.setMobileNumber(updateSundryCreditorMaster.getMobileNumber());
        existingSundryCreditor.setLandlineNumber(updateSundryCreditorMaster.getLandlineNumber());
        existingSundryCreditor.setEmailId(updateSundryCreditorMaster.getEmailId());

        // Update forex sub-form details if present
        if (updateSundryCreditorMaster.getSundryCreditorForexDetails() != null) {
            existingSundryCreditor.getSundryCreditorForexDetails().clear(); // Clear existing forex details
            existingSundryCreditor.getSundryCreditorForexDetails().addAll(updateSundryCreditorMaster.getSundryCreditorForexDetails());
        }

        // Update financial details
        existingSundryCreditor.setDateForOpening(updateSundryCreditorMaster.getDateForOpening());
        existingSundryCreditor.setOpeningBalance(updateSundryCreditorMaster.getOpeningBalance());
        existingSundryCreditor.setCreditOrDebit(updateSundryCreditorMaster.getCreditOrDebit());

        // Save the updated entity to the database
        return sundryCreditorMasterDAO.save(existingSundryCreditor);
    }


    // Delete a SundryCreditorMaster by id
    @Override
    public void deleteSundryCreditorMaster(Long id){
        SundryCreditorMaster sundryCreditorMaster = sundryCreditorMasterDAO.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Sundry Creditor not found with this id:" + id));
        sundryCreditorMasterDAO.delete(sundryCreditorMaster);
    }

}
