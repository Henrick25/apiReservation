package com.medHeadReservation.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medHeadReservation.api.repository.HospitalRepository;

@Service
public class HospitalService {
	 @Autowired
	    private HospitalRepository hospitalRepository;

	    public void decrementLit(Long hospitalId) {
	        hospitalRepository.decrementLitByHospitalId(hospitalId);
	    }
}
