package com.example.wx.pojo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseMusicModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4647266466803522407L;
	
	@XmlElement(name="Title")
	private String title;
	
	@XmlElement(name="Description")
	private String description;
	
	@XmlElement(name="MusicURL")
	private String musicURL;
	
	@XmlElement(name="HQMusicUrl")
	private String hQMusicUrl;
	
	@XmlElement(name="ThumbMediaId")
	private String thumbMediaId;

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

	public String getMusicURL() {
		return musicURL;
	}

	public void setMusicURL(String musicURL) {
		this.musicURL = musicURL;
	}

	public String gethQMusicUrl() {
		return hQMusicUrl;
	}

	public void sethQMusicUrl(String hQMusicUrl) {
		this.hQMusicUrl = hQMusicUrl;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
	
	

}
