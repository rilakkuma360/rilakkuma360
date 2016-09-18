package com.example.wx.pojo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@XmlRootElement(name="xml") 
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseModel implements Serializable {

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
	
	@XmlElement(name="Image")
	private ResponseImageModel image;
	
	@XmlElement(name="Voice")
	private ResponseVoiceModel voice;
	
	@XmlElement(name="Video")
	private ResponseVideoModel video;
	
	@XmlElement(name="Music")
	private ResponseMusicModel music;
	
	@XmlElement(name="ArticleCount")
	private String articleCount;
	
	@XmlElement(name="Articles")
	private ResponseArticlesModel Articles;

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

	public ResponseImageModel getImage() {
		return image;
	}

	public void setImage(ResponseImageModel image) {
		this.image = image;
	}

	public ResponseVoiceModel getVoice() {
		return voice;
	}

	public void setVoice(ResponseVoiceModel voice) {
		this.voice = voice;
	}

	public ResponseVideoModel getVideo() {
		return video;
	}

	public void setVideo(ResponseVideoModel video) {
		this.video = video;
	}

	public ResponseMusicModel getMusic() {
		return music;
	}

	public void setMusic(ResponseMusicModel music) {
		this.music = music;
	}

	public String getArticleCount() {
		return articleCount;
	}

	public void setArticleCount(String articleCount) {
		this.articleCount = articleCount;
	}

	public ResponseArticlesModel getArticles() {
		return Articles;
	}

	public void setArticles(ResponseArticlesModel articles) {
		Articles = articles;
	}
	
}
