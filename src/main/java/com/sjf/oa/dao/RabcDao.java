package com.sjf.oa.dao;

import com.sjf.oa.entity.Node;
import com.sjf.oa.utils.MybatisUtils;

import java.util.List;

public class RabcDao {
    public List<Node> selectNodeByUserId(Long userId){
        return (List) MybatisUtils.executeQuery(sqlSession -> sqlSession.selectList("rbacmapper.selectNodeByUserId",userId));

    }
}
