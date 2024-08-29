package com.sample.aone.service.Impl;

import com.sample.aone.dto.SundryDebtorMasterDto;
import com.sample.aone.entity.SundryDebtorMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.mapper.SundryDebtorMasterMapper;
import com.sample.aone.repository.SundryDebtorMasterDAO;
import com.sample.aone.service.SundryDebtorMasterService;
import lombok.AllArgsConstructor;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class SundryDebtorMasterServiceImpl implements SundryDebtorMasterService {


    private SundryDebtorMasterDAO sundryDebtorMasterDAO;

    @Override
    public SundryDebtorMasterDto createSundryDebtorMaster(SundryDebtorMasterDto sundryDebtorMasterDto){
        // validate sundry debtor name
        validateSundryDebtorName(sundryDebtorMasterDto);

        // check duplicate entry for sundry debtor name
        if (sundryDebtorMasterDAO.existsBySundryDebtorName(sundryDebtorMasterDto.getSundryDebtorName())){
            throw new DuplicateKeyException("Duplicate entry for unique field!" + sundryDebtorMasterDto.getSundryDebtorName());
        }

        SundryDebtorMaster sundryDebtorMaster = SundryDebtorMasterMapper.mapToSundryDebtorMaster(sundryDebtorMasterDto);
        SundryDebtorMaster saveSundryDebtorMaster = sundryDebtorMasterDAO.save(sundryDebtorMaster);
        return SundryDebtorMasterMapper.mapToSundryDebtorMasterDto(saveSundryDebtorMaster);
    }

    public void validateSundryDebtorName(SundryDebtorMasterDto sundryDebtorMasterDto){
        if (sundryDebtorMasterDto.getSundryDebtorName() == null || sundryDebtorMasterDto.getSundryDebtorName().isEmpty()){
            throw new IllegalArgumentException("Sundry debtor name is unique field cannot be empty!");
        }
    }

    @Override
    public SundryDebtorMasterDto getSundryDebtorName(String sundryDebtorName){
        SundryDebtorMaster sundryDebtorMaster = sundryDebtorMasterDAO.findBySundryDebtorName(sundryDebtorName).orElseThrow(() ->

                new ResourceNotFoundException("Sundry debtor name is not found with this name:" + sundryDebtorName));

        return SundryDebtorMasterMapper.mapToSundryDebtorMasterDto(sundryDebtorMaster);
    }

    @Override
    public List<SundryDebtorMasterDto> getAllSundryDebtorMaster(){
        List<SundryDebtorMaster> sundryDebtorMaster = sundryDebtorMasterDAO.findAll();
        return sundryDebtorMaster.stream().map(SundryDebtorMasterMapper::mapToSundryDebtorMasterDto).toList();
    }

    @Override
    public SundryDebtorMasterDto updateSundryDebtorMaster(String sundryDebtorName, SundryDebtorMasterDto updateSundryDebtorMaster){
        SundryDebtorMaster sundryDebtorMaster = sundryDebtorMasterDAO.findBySundryDebtorName(sundryDebtorName).orElseThrow(() ->

                new ResourceNotFoundException("Sundry debtor name is not found with this name:" + sundryDebtorName));

        sundryDebtorMaster.setSundryDebtorName(updateSundryDebtorMaster.getSundryDebtorName());
        sundryDebtorMaster.setUnderGroup(updateSundryDebtorMaster.getUnderGroup());
        sundryDebtorMaster.setBillWiseStatus(updateSundryDebtorMaster.getBillWiseStatus());
        sundryDebtorMaster.setAddressOne(updateSundryDebtorMaster.getAddressOne());
        sundryDebtorMaster.setAddressTwo(updateSundryDebtorMaster.getAddressTwo());
        sundryDebtorMaster.setAddressThree(updateSundryDebtorMaster.getAddressThree());
        sundryDebtorMaster.setAddressFour(updateSundryDebtorMaster.getAddressFour());
        sundryDebtorMaster.setAddressFive(updateSundryDebtorMaster.getAddressFive());
        sundryDebtorMaster.setLandMarkOrArea(updateSundryDebtorMaster.getLandMarkOrArea());
        sundryDebtorMaster.setState(updateSundryDebtorMaster.getState());
        sundryDebtorMaster.setCountry(updateSundryDebtorMaster.getCountry());
        sundryDebtorMaster.setPincode(updateSundryDebtorMaster.getPincode());
        sundryDebtorMaster.setPanOrItNumber(updateSundryDebtorMaster.getPanOrItNumber());
        sundryDebtorMaster.setMsmeNumber(updateSundryDebtorMaster.getMsmeNumber());
        sundryDebtorMaster.setOpeningBalance(updateSundryDebtorMaster.getOpeningBalance());
        sundryDebtorMaster.setDateForOpening(updateSundryDebtorMaster.getDateForOpening());
        sundryDebtorMaster.setCreditOrDebit(updateSundryDebtorMaster.getCreditOrDebit());

        SundryDebtorMaster sundryDebtorMasterObj = sundryDebtorMasterDAO.save(sundryDebtorMaster);
        return SundryDebtorMasterMapper.mapToSundryDebtorMasterDto(sundryDebtorMasterObj);
    }

    @Override
    public void deleteBySundryDebtorMaster(Long id){
        SundryDebtorMaster sundryDebtorMaster = sundryDebtorMasterDAO.findById(id).orElseThrow(()->

                new ResourceNotFoundException("Sundry debtor name is not found with this id:" + id));
        sundryDebtorMasterDAO.deleteById(id);
    }
}
