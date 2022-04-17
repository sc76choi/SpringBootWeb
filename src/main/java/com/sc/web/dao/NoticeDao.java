package com.sc.web.dao;

import java.util.List;

import javax.annotation.ManagedBean;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import com.sc.web.entity.Notice;
import com.sc.web.entity.NoticeView;

@Mapper
public interface NoticeDao {

//	@Result(property = "memberName" , column="member_name")
//	@Select("select * from noticeView "
//			+ " where ${field} like '%${query}%' "	
//			+ " order by regdate desc "	
//			+ " limit #{offset}, #{size} ")
	List<NoticeView> getViewList(int offset, int size, String field, String query, boolean pub);
	int getCount(String field, String query, boolean pub);
	NoticeView getView(int id);
	
	Notice getNext(int id);
	Notice getPrev(int id);

	int update(Notice notice);
	int insert(Notice notice);
	int delete(int id);
	
	int deleteAll(int[] ids);
	int updatePubAll(int[] pubIds, int[] closeIds);
	int updatePubAll(int[] ids, boolean pub);
}
