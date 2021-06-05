package com.sjf.oa.service;

import com.sjf.oa.dao.DepartmentDao;
import com.sjf.oa.entity.Department;
import com.sjf.oa.utils.MybatisUtils;

/**
 * 部门服务
 */
public class DepartmentService {
    /**
     * 按编号得到部门对象
     * @param departmentId  部门编号
     * @return  部门对象，null代表部门不存在
     */
    public Department selectById(Long departmentId){
        return (Department)MybatisUtils.executeQuery(
                sqlSession -> sqlSession.getMapper(DepartmentDao.class).selectById(departmentId)
        );
    }
}
