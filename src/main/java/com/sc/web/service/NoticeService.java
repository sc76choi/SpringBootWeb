package com.sc.web.service;

import java.util.List;

import com.sc.web.entity.Notice;
import com.sc.web.entity.NoticeView;

public interface NoticeService {

	// NoticeServiec
	// 검색을 요청할 때

	// 페이지를 요청할 때
	List<NoticeView> getViewList();
	List<NoticeView> getViewList(String field, String query);
	List<NoticeView> getViewList(int page, String field, String query, boolean pub);
//	List<NoticeView> getViewList(int offset, int size, String field, String query);
	// 페이지를 요청할 때
	int getCount();
	int getCount(String field, String query);

	// 일괄공개를 요청할 때
	int updatePubAll(int[] pubIds, int[] colseIds);
	// 일괄삭제를 요청할 때
	int deleteAll(int[] ids);

	// 자세한 페이지 요청할 때
	Notice getNext(int id);
	Notice getPrev(int id);

	// 수정페이지를 요청할 때
	int update(Notice notice);
	int delete(int id);
	int insert(Notice notice);

	NoticeView getView(int id);


}
