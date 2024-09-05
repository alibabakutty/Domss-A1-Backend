package com.sample.aone;

import org.springframework.stereotype.Service;

@Service
public class SundryService {

    private final SundryRepo sundryRepo;

    public SundryService(SundryRepo sundryRepo) {
        this.sundryRepo = sundryRepo;
    }

    public Sundry createSundry (Sundry sundry){
        return sundryRepo.save(sundry);
    }
}
