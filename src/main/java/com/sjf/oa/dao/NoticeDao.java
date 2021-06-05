package com.sjf.oa.dao;

import com.sjf.oa.entity.LeaveForm;
import com.sjf.oa.entity.Notice;

import java.util.List;

public interface NoticeDao {
    public void insert(Notice notice);

    public List<Notice> selectByReceiverId(Long receiverId);
}
