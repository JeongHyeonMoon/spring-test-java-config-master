package com.naver.test.mvc.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ItemXml {
	private Integer id;

	private String title;

	private String content;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

}