package com.vl.healthcare.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vl.healthcare.entity.Specialty;
import com.vl.healthcare.service.SpecialtyService;

@RestController
public class SpecialtyController {

	@Autowired
	private final SpecialtyService specialtyService;

	@Autowired
	private SpecialtyController(SpecialtyService specialtyservice) {
		this.specialtyService = specialtyservice;
	}

	@GetMapping("healthcare/vlh/specialtys")
	public List<Specialty> fetchSpecialtyList()
	{
		return specialtyService.fetchSpecialtyList();
	}
	
}
