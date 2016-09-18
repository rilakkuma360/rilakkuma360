package com.example.wx.pojo.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseArticleModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2502699498631789955L;
	
	@XmlElement(name="Title")
	private String title;
	
	@XmlElement(name="Description")
	private String description;
	
	@XmlElement(name="PicUrl")
	private String picUrl;
	
	@XmlElement(name="Url")
	private String url;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
