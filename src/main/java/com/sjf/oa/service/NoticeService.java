package com.sjf.oa.service;

import com.sjf.oa.dao.NoticeDao;
import com.sjf.oa.entity.Notice;
import com.sjf.oa.utils.MybatisUtils;

import java.util.List;

public class NoticeService {
    public List<Notice> getNoticeList(Long receiverId){
        return (List) MybatisUtils.executeQuery(sqlSession ->{
            NoticeDao noticeDao = sqlSession.getMapper(NoticeDao.class);
            return noticeDao.selectByReceiverId(receiverId);
        });
    }
}
