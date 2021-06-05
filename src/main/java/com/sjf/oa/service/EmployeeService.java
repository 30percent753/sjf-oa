package com.sjf.oa.service;

import com.sjf.oa.dao.EmployeeDao;
import com.sjf.oa.entity.Employee;
import com.sjf.oa.utils.MybatisUtils;

public class EmployeeService {
    public Employee selectById(Long employeeId){
        return (Employee)MybatisUtils.executeQuery(sqlSession -> {
            EmployeeDao employeeDao=sqlSession.getMapper(EmployeeDao.class);
            return employeeDao.selectById(employeeId);
        });
    }
}
