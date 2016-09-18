package com.example.wx.pojo.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseArticlesModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1207390167200417861L;
	
	@XmlElement(name="item")
	private List<ResponseArticleModel> articles;

	public List<ResponseArticleModel> getArticles() {
		return articles;
	}

	public void setArticles(List<ResponseArticleModel> articles) {
		this.articles = articles;
	}
	
	

}
