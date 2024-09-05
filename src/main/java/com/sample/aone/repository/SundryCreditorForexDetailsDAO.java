package com.sample.aone.repository;

import com.sample.aone.entity.SundryCreditorForexDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SundryCreditorForexDetailsDAO extends JpaRepository<SundryCreditorForexDetails,Long> {

}
