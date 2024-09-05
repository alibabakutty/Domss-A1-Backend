package com.sample.aone.service.Impl;

import com.sample.aone.dto.SundryCreditorForexDetailsDto;
import com.sample.aone.dto.SundryCreditorMasterDto;
import com.sample.aone.entity.SundryCreditorBankDetails;
import com.sample.aone.entity.SundryCreditorForexDetails;
import com.sample.aone.entity.SundryCreditorMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.mapper.SundryCreditorBankDetailsMapper;
import com.sample.aone.mapper.SundryCreditorForexDetailsMapper;
//import com.sample.aone.mapper.SundryCreditorMasterMapper;
import com.sample.aone.repository.SundryCreditorBankDetailsDAO;
import com.sample.aone.repository.SundryCreditorForexDetailsDAO;
import com.sample.aone.repository.SundryCreditorMasterDAO;
import com.sample.aone.service.SundryCreditorMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SundryCreditorMasterServiceImpl implements SundryCreditorMasterService {

    @Autowired
    private SundryCreditorMasterDAO sundryCreditorMasterDAO;




    public SundryCreditorMaster createSundryCreditorMaster(SundryCreditorMaster sundryCreditorMaster) {
        return sundryCreditorMasterDAO.save(sundryCreditorMaster);
    }

//    @Transactional
//    public SundryCreditorMasterDto updateSundryCreditorMaster(String sundryCreditorName, SundryCreditorMasterDto sundryCreditorMasterDto) {
//        Optional<SundryCreditorMaster> existingEntityOpt = sundryCreditorMasterDAO.findBySundryCreditorName(sundryCreditorName);
//        if (existingEntityOpt.isEmpty()) {
//            throw new ResourceNotFoundException("SundryCreditorMaster not found");
//        }

//        SundryCreditorMaster existingEntity = existingEntityOpt.get();
//
//        // Update fields
//        existingEntity.setSundryCreditorName(sundryCreditorMasterDto.getSundryCreditorName());
//        existingEntity.setUnderGroup(sundryCreditorMasterDto.getUnderGroup());
//        existingEntity.setBillWiseStatus(sundryCreditorMasterDto.getBillWiseStatus());
//        existingEntity.setProvideBankDetails(sundryCreditorMasterDto.getProvideBankDetails());
//
//        // Handle OneToOne relationship
//        if (sundryCreditorMasterDto.getSundryCreditorBankDetails() != null) {
//            SundryCreditorBankDetails updatedBankDetails = sundryCreditorBankDetailsDAO.findById(sundryCreditorMasterDto.getSundryCreditorBankDetails().getId())
//                    .orElse(new SundryCreditorBankDetails());
//
//            // Update fields of related entity
//            updatedBankDetails.setAccountNumber(sundryCreditorMasterDto.getSundryCreditorBankDetails().getAccountNumber());
//            // Set other fields as needed
//
//            // Save the updated bank details
//            sundryCreditorBankDetailsDAO.save(updatedBankDetails);
//
//            // Set updated bank details to the main entity
//            existingEntity.setSundryCreditorBankDetails(updatedBankDetails);
//        }
//
//        // Handle OneToMany relationship
//        if (sundryCreditorMasterDto.getSundryCreditorForexDetails() != null) {
//            // Remove existing forex details if not present in the DTO
//            existingEntity.getSundryCreditorForexDetails().removeIf(forexDetail ->
//                    sundryCreditorMasterDto.getSundryCreditorForexDetails().stream()
//                            .noneMatch(dto -> dto.getId().equals(forexDetail.getId()))
//            );
//
//            // Add or update forex details
//            for (SundryCreditorForexDetailsDto forexDetailDto : sundryCreditorMasterDto.getSundryCreditorForexDetails()) {
//                SundryCreditorForexDetails forexDetail = sundryCreditorForexDetailsDAO.findById(forexDetailDto.getId())
//                        .orElse(new SundryCreditorForexDetails());
//
//                // Update fields of related entity
//                forexDetail.setId(forexDetailDto.getId()); // update fields accordingly
//
//                // Save or update forex detail
//                sundryCreditorForexDetailsDAO.save(forexDetail);
//
//                // Set or update in main entity
//                if (!existingEntity.getSundryCreditorForexDetails().contains(forexDetail)) {
//                    existingEntity.getSundryCreditorForexDetails().add(forexDetail);
//                }
//            }
//        }
//
//        // Update other fields directly
//        existingEntity.setAddressOne(sundryCreditorMasterDto.getAddressOne());
//        existingEntity.setAddressTwo(sundryCreditorMasterDto.getAddressTwo());
//        existingEntity.setAddressThree(sundryCreditorMasterDto.getAddressThree());
//        existingEntity.setAddressFour(sundryCreditorMasterDto.getAddressFour());
//        existingEntity.setAddressFive(sundryCreditorMasterDto.getAddressFive());
//        existingEntity.setLandMarkOrArea(sundryCreditorMasterDto.getLandMarkOrArea());
//        existingEntity.setState(sundryCreditorMasterDto.getState());
//        existingEntity.setCountry(sundryCreditorMasterDto.getCountry());
//        existingEntity.setPincode(sundryCreditorMasterDto.getPincode());
//        existingEntity.setPanOrItNumber(sundryCreditorMasterDto.getPanOrItNumber());
//        existingEntity.setGstinOrUinNumber(sundryCreditorMasterDto.getGstinOrUinNumber());
//        existingEntity.setMsmeNumber(sundryCreditorMasterDto.getMsmeNumber());
//        existingEntity.setContactPersonName(sundryCreditorMasterDto.getContactPersonName());
//        existingEntity.setMobileNumber(sundryCreditorMasterDto.getMobileNumber());
//        existingEntity.setLandlineNumber(sundryCreditorMasterDto.getLandlineNumber());
//        existingEntity.setEmailId(sundryCreditorMasterDto.getEmailId());
//        existingEntity.setDateForOpening(sundryCreditorMasterDto.getDateForOpening());
//        existingEntity.setOpeningBalance(sundryCreditorMasterDto.getOpeningBalance());
//        existingEntity.setCreditOrDebit(sundryCreditorMasterDto.getCreditOrDebit());
//
//        // Save and return the updated entity
//        SundryCreditorMaster updatedEntity = sundryCreditorMasterDAO.save(existingEntity);
//        return SundryCreditorMasterMapper.mapToSundryCreditorMasterDto(updatedEntity);
//    }
//
//    @Override
//    public Optional<SundryCreditorMasterDto> getSundryCreditorMasterByName(String sundryCreditorName) {
//        return sundryCreditorMasterDAO.findBySundryCreditorName(sundryCreditorName)
//                .map(SundryCreditorMasterMapper::mapToSundryCreditorMasterDto);
//    }
//
//    @Override
//    public List<SundryCreditorMasterDto> getAllSundryCreditorMasters() {
//        return sundryCreditorMasterDAO.findAll().stream()
//                .map(SundryCreditorMasterMapper::mapToSundryCreditorMasterDto)
//                .collect(Collectors.toList());
//    }
//
//    @Transactional
//    @Override
//    public void deleteSundryCreditorMasterById(Long id) {
//        Optional<SundryCreditorMaster> entityOpt = sundryCreditorMasterDAO.findById(id);
//        entityOpt.ifPresent(sundryCreditorMaster -> sundryCreditorMasterDAO.delete(sundryCreditorMaster));
//    }

}
