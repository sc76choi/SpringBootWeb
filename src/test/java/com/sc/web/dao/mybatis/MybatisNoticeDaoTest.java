package com.sc.web.dao.mybatis;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sc.web.dao.NoticeDao;
import com.sc.web.entity.NoticeView;

@SpringBootTest
class MybatisNoticeDaoTest {
	
	@Autowired
	private NoticeDao noticeDao;
	
	@Test
	void test() {
		List<NoticeView> list = noticeDao.getViewList(0, 1, "title", null, true);
		System.out.println(list.get(0));
	}

}
