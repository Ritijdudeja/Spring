package com.experiment.bo.mapper.custom;

import java.util.Map;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EployeeCustomMapper {

	Map<String, String> getEmployeeData();

}
