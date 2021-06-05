package com.sjf.oa.dao;

import com.sjf.oa.entity.Notice;
import com.sjf.oa.utils.MybatisUtils;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Date;

public class NoticeDaoTest extends TestCase {
    @Test
    public void testInsert() {
        MybatisUtils.executeUpdate(sqlSession ->{
            NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
            Notice notice=new Notice();
            notice.setReceiverId(2l);
            notice.setContent("测试消息");
            notice.setCreateTime(new Date());
            dao.insert(notice);
            return null;
        });
    }
}