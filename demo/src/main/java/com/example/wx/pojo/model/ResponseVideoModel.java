package com.example.wx.pojo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseVideoModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4947926096994461347L;
	
	@XmlElement(name="MediaId")
	private String mediaId;
	
	@XmlElement(name="Title")
	private String title;
	
	@XmlElement(name="Description")
	private String description;

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

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

}
