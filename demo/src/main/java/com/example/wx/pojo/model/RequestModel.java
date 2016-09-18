package com.example.wx.pojo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@XmlRootElement(name="xml") 
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestModel implements Serializable {

	private static final long serialVersionUID = 7122652159483344937L;

	@XmlElement(name="ToUserName")
	private String toUserName;
    
	@XmlElement(name="FromUserName")
    private String fromUserName;
    
	@XmlElement(name="CreateTime")
    private String createTime;
    
	@XmlElement(name="MsgType")
    private String msgType;
    
	@XmlElement(name="Content")
    private String content;
    
	@XmlElement(name="MsgId")
    private String msgId;
	
	@XmlElement(name="PicUrl")
	private String picUrl;
	
	@XmlElement(name="MediaId")
	private String mediaId;
	
	@XmlElement(name="Format")
	private String format;
	
	@XmlElement(name="ThumbMediaId")
	private String thumbMediaId;
	
	@XmlElement(name="Location_X")
	private String location_X;
	
	@XmlElement(name="Location_Y")
	private String location_Y;
	
	@XmlElement(name="Scale")
	private String scale;
	
	@XmlElement(name="Label")
	private String label;
	
	@XmlElement(name="Title")
	private String title;
	
	@XmlElement(name="Description")
	private String description;
	
	@XmlElement(name="Url")
	private String url;
	
	@XmlElement(name="Event")
	private String event;
	
	@XmlElement(name="EventKey")
	private String eventKey;
	
	@XmlElement(name="Ticket")
	private String ticket;
	
	//地理位置纬度
	@XmlElement(name="Latitude")
	private String latitude;
	
	//地理位置经度
	@XmlElement(name="Longitude")
	private String longitude;
	
	//地理位置精度
	@XmlElement(name="Precision")
	private String precision;
	
	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	public String getLocation_X() {
		return location_X;
	}

	public void setLocation_X(String location_X) {
		this.location_X = location_X;
	}

	public String getLocation_Y() {
		return location_Y;
	}

	public void setLocation_Y(String location_Y) {
		this.location_Y = location_Y;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
