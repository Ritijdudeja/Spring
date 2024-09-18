package com.experiment.bo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.experiment.bo.dto.EmployeeInfoDto;
import com.experiment.bo.service.EmployeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeService service;

	@GetMapping(value = "bo-cash/getEmployeeData")
	public List<EmployeeInfoDto> getEmployeeData() {

		List<EmployeeInfoDto> employeeData = service.getEmployeeData();
		return employeeData;
	}

}
