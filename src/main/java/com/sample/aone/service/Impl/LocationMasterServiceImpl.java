package com.sample.aone.service.Impl;

import com.sample.aone.dto.LocationMasterDto;
import com.sample.aone.entity.LocationMaster;
import com.sample.aone.exception.ResourceNotFoundException;
import com.sample.aone.mapper.LocationMasterMapper;
import com.sample.aone.repository.LocationMasterDAO;
import com.sample.aone.service.LocationMasterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class LocationMasterServiceImpl implements LocationMasterService {

    @Autowired
    private LocationMasterDAO locationMasterDAO;

    @Override
    public LocationMasterDto createLocationMaster(LocationMasterDto locationMasterDto){

        //validate currency symbol object
        validateLocationMaster(locationMasterDto);

        //check for duplicate entry
        if(locationMasterDAO.existsByGodownName(locationMasterDto.getGodownName())){
            throw new DuplicateKeyException("Duplicate entry for unique field:" + locationMasterDto.getGodownName());
        }

        LocationMaster locationMaster = LocationMasterMapper.mapToLocationMaster(locationMasterDto);
        LocationMaster saveLocationMaster = locationMasterDAO.save(locationMaster);
        return LocationMasterMapper.mapToLocationMasterDto(saveLocationMaster);
    }

    private void validateLocationMaster(LocationMasterDto locationMasterDto){
        if(locationMasterDto.getGodownName() == null || locationMasterDto.getGodownName().isEmpty()){
            throw new IllegalArgumentException("Godown name is not found with this name!");
        }
    }
    @Override
    public LocationMasterDto getGodownName(String godownName){
        LocationMaster locationMaster = locationMasterDAO.findByGodownName(godownName).orElseThrow(() ->

                new ResourceNotFoundException("Godown name is not found with this name:" + godownName));

        return LocationMasterMapper.mapToLocationMasterDto(locationMaster);
    }

    @Override
    public List<LocationMasterDto> getAllLocationMasters(){
        List<LocationMaster> locationMaster = locationMasterDAO.findAll();
        return locationMaster.stream().map(LocationMasterMapper::mapToLocationMasterDto).toList();
    }

    @Override
    public LocationMasterDto updateLocationMaster(String godownName, LocationMasterDto updateLocationMaster){
        LocationMaster locationMaster = locationMasterDAO.findByGodownName(godownName).orElseThrow(()->

                new ResourceNotFoundException("Godown name is not found with this name:" + godownName));

        locationMaster.setGodownName(updateLocationMaster.getGodownName());
        LocationMaster locationMasterObj = locationMasterDAO.save(locationMaster);
        return LocationMasterMapper.mapToLocationMasterDto(locationMasterObj);
    }

    @Override
    public void deleteByLocationMaster(Long id){
        LocationMaster locationMaster = locationMasterDAO.findById(id).orElseThrow(()->

                new ResourceNotFoundException("Location name is not found with this name:" + id));
        locationMasterDAO.deleteById(id);
    }
}
