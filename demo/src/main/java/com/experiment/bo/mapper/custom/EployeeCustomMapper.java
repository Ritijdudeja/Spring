package com.experiment.bo.mapper.custom;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.experiment.bo.dto.EmployeeInfoDto;

@Mapper
public interface EployeeCustomMapper {

//	@Select("select employee_id as employeeId,employee_name as employeeName from employees e")
//	@Results(value = {
//			@Result(property = "employeeId", column = "employeeId"),
//			@Result(property = "employeeName", column = "employeeName"),
//			})
	List<EmployeeInfoDto> getEmployeeData();

}
