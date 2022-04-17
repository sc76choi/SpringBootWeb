package com.sc.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.web.dao.NoticeDao;
import com.sc.web.entity.Notice;
import com.sc.web.entity.NoticeView;

@Service
public class NoticeServiceImp implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;
	

	@Override
	public NoticeView getView(int id) {
		NoticeView notice = noticeDao.getView(id);
		return notice;
	}
	
	@Override
	public List<NoticeView> getViewList(boolean pub) {
		// TODO Auto-generated method stub
		return getViewList(1, "title", "", pub);
	}

	@Override
	public List<NoticeView> getViewList(String field, String query, boolean pub) {
		// TODO Auto-generated method stub
		return getViewList(1, field, query, pub);
	}
	
	@Override
	public List<NoticeView> getViewList(int page, String field, String query, boolean pub) {
		int size = 10; 
		int offset = 0+(page-1)*size; // page 1 -> 0, 2 -> 10, 3 -> 20, an = a1 + (n-1)d
		System.out.println("3 field : " + field + ", query : " + query);
		System.out.println("3 offset : " + offset + ", size : " + size);
		return noticeDao.getViewList(offset, size, field, query, pub);
	}
	
//	@Override
//	public List<NoticeView> getViewList(int page, String field, String query, boolean pub) {
//		int size = 10; 
//		int offset = 0+(page-1)*size; // page 1 -> 0, 2 -> 10, 3 -> 20, an = a1 + (n-1)d
//		System.out.println("4 field : " + field + ", query : " + query);
//		System.out.println("4 offset : " + offset + ", size : " + size);
//		System.out.println("4 pub : " + pub);
//		List<NoticeView> list = noticeDao.getViewList(offset, size, field, query, pub);
//		return list;
//	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return noticeDao.getCount("titile", "", true);
	}

	@Override
	public int getCount(String field, String query, boolean pub) {
		// TODO Auto-generated method stub
		return noticeDao.getCount(field, query, pub);
	}

	@Override
	public int updatePubAll(int[] pubIds, int[] closeIds) {
		// TODO Auto-generated method stub
		int result = 0;
		result += noticeDao.updatePubAll(pubIds, true);
		result += noticeDao.updatePubAll(closeIds, false);
		return result;
	}
	
	@Override
	public int updatePubAll(int[] ids, boolean pub) {
		// TODO Auto-generated method stub
		return noticeDao.updatePubAll(ids, pub);
	}

	@Override
	public int deleteAll(int[] ids) {
		// TODO Auto-generated method stub
		return noticeDao.deleteAll(ids);
	}

	@Override
	public Notice getNext(int id) {
		// TODO Auto-generated method stub
		return noticeDao.getNext(id);
	}

	@Override
	public Notice getPrev(int id) {
		// TODO Auto-generated method stub
		return noticeDao.getPrev(id);
	}

	@Override
	public int update(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDao.update(notice);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return noticeDao.delete(id);
	}

	@Override
	public int insert(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDao.insert(notice);
	}

}
