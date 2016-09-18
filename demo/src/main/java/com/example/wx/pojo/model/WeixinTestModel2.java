package com.example.wx.pojo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="xml") 
@XmlAccessorType(XmlAccessType.FIELD)
public class WeixinTestModel2 implements Serializable {

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
	
	@XmlElement(name="Content2")
	private String aaaaa;
   

	public String getAaaaa() {
		return aaaaa;
	}

	public void setAaaaa(String aaaaa) {
		this.aaaaa = aaaaa;
	}

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
	
	
}
