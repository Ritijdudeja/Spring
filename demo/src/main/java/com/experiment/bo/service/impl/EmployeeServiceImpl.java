package com.experiment.bo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experiment.bo.mapper.custom.EployeeCustomMapper;
import com.experiment.bo.service.EmployeService;

@Service
public class EmployeeServiceImpl implements EmployeService{
	
	
	//@Autowired
	EployeeCustomMapper mapper;

	@Override
	public Map<String, String> getEmployeeData() {
		Map<String,String> employeeData=mapper.getEmployeeData();
		//new HashMap<String,String>();//
		//employeeData.put("1", "Ritiz");
		return employeeData;
	}

}
