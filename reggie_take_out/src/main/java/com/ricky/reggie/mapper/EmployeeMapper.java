package com.ricky.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ricky.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
