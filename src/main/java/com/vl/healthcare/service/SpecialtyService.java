package com.vl.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vl.healthcare.entity.Specialty;
import com.vl.healthcare.repository.SpecialtyRepository;

@Service
public class SpecialtyService {
	
	  @Autowired
	    private SpecialtyRepository specialtyRepository;

		 public List<Specialty> fetchSpecialtyList() {
		        return specialtyRepository.findAll();
		    }

	}
	
