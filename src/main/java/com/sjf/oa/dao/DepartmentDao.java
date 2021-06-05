package com.sjf.oa.dao;

import com.sjf.oa.entity.Department;


public interface DepartmentDao {
    public Department selectById(Long departmentId);
}
