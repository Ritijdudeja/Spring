package com.experiment.bo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experiment.bo.dto.EmployeeInfoDto;
import com.experiment.bo.mapper.custom.EployeeCustomMapper;
import com.experiment.bo.service.EmployeService;

@Service
public class EmployeeServiceImpl implements EmployeService {

	@Autowired
	EployeeCustomMapper mapper;

	@Override
	public List<EmployeeInfoDto> getEmployeeData() {
		List<EmployeeInfoDto> employeeData = mapper.getEmployeeData();
		return employeeData;
	}

}
