package com.experiment.bo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.experiment.bo.service.EmployeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeService service;

	@GetMapping(value = "bo-cash/getEmployeeData")
	public Map<String, String> getEmployeeData() {

		Map<String, String> employeeData = service.getEmployeeData();
		return employeeData;
	}

}
