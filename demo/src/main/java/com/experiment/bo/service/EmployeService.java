package com.experiment.bo.service;

import java.util.Map;

import org.springframework.stereotype.Service;


@Service
public interface EmployeService {

	Map<String, String> getEmployeeData();

}
