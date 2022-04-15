package com.sc.web.controller.admin.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.web.entity.Notice;
import com.sc.web.entity.NoticeView;
import com.sc.web.service.NoticeService;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public String list(Model model) {
		int page = 1;
		String field = "title";
		String query = "";
		boolean pub = true;
		
		List<NoticeView> list = service.getViewList(page, field, query, pub);
		return "admin.board.notice.list";
	}
	
	@RequestMapping("detail")
	public String detail(Model model) {
		Notice notice = service.getView(1);
		return "admin.board.notice.detail";
	}
	
	@RequestMapping("reg")
	public String reg(Model model) {
		return "admin.board.notice.reg";
	}
}
