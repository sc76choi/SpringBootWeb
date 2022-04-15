package com.sc.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.web.entity.NoticeView;
import com.sc.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
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
		
		model.addAttribute("list", list);
//		return "WEB-INF/view/customer/notice/list.jsp"; // application.properties에서 prefix, suffix로 줄일수 있다.
//		return "/customer/notice/list"; // ResourceViewResolver
		return "customer.notice.list"; // TilesViewResolver
	}
	
	@RequestMapping("detail")
	public String detail(Model model) {
		return "customer.notice.detail";
	}
}
