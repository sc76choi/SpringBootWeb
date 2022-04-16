package com.sc.web.entity;

import java.util.Date;

public class Notice {
	
	// id, title, content, regdate, hit, pub, memberId
	private int id;
	private String title;
	private String content;
	private Date regdate;
	private int hit;
	private boolean pub;
	private int memberId;
	
	public Notice() {
		// TODO Auto-generated constructor stub
	}

	public Notice(int id, String title, String content, Date regdate, int hit, boolean pub, int memberId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.hit = hit;
		this.pub = pub;
		this.memberId = memberId;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public boolean isPub() {
		return pub;
	}

	public void setPub(boolean pub) {
		this.pub = pub;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", content=" + content + ", redate=" + regdate + ", hit=" + hit
				+ ", pub=" + pub + ", memberId=" + memberId + "]";
	}
	
	
}
