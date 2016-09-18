package com.example.wx.service.msg;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.wx.constant.WeixinConstant;
import com.example.wx.pojo.model.RequestModel;
import com.example.wx.pojo.model.ResponseArticleModel;
import com.example.wx.pojo.model.ResponseArticlesModel;
import com.example.wx.pojo.model.ResponseImageModel;
import com.example.wx.pojo.model.ResponseModel;
import com.example.wx.utils.WeixinUtil;

@Service
public class MsgServiceImpl implements MsgService{

	@Override
	public ResponseModel exeText(RequestModel request) {

		ResponseModel response = WeixinUtil.getResponse(request, null);
		
		switch (request.getContent()) {
		case "1":
			response.setMsgType(WeixinConstant.RESPONSE_MSGTYPE_TEXT);
			response.setContent("回复文本消息");
			break;
			
		case "2":
			response.setMsgType(WeixinConstant.RESPONSE_MSGTYPE_IMAGE);
			ResponseImageModel image = new ResponseImageModel();
			image.setMediaId("iYx0ZQZEvGPkvcsumSANHmzIlvGQnaRPd7bhDrUFbPLrqB9i-gYr4TTD-oF6FRiC");
			response.setImage(image);
			break;
			
		case "3":
			response.setMsgType(WeixinConstant.RESPONSE_MSGTYPE_NEWS);
			response.setArticleCount("1");
			
			ResponseArticlesModel articles = new ResponseArticlesModel();
			List<ResponseArticleModel> itemList = new ArrayList<ResponseArticleModel>();
			ResponseArticleModel item = new ResponseArticleModel();
			item.setTitle("测试单图文");
			item.setDescription("测试单图文Description");
			item.setPicUrl("http://www.qqpk.cn/Article/UploadFiles/201501/20150113144931897.jpg");
			item.setUrl("www.baidu.com");
			itemList.add(item);
			articles.setArticles(itemList);
			response.setArticles(articles);
			break;
			
		case "4":
			response.setMsgType(WeixinConstant.RESPONSE_MSGTYPE_NEWS);
			response.setArticleCount("4");
			
			ResponseArticlesModel articles4 = new ResponseArticlesModel();
			List<ResponseArticleModel> itemList4 = new ArrayList<ResponseArticleModel>();
			ResponseArticleModel item41 = new ResponseArticleModel();
			item41.setTitle("1111");
			item41.setDescription("重要的事情说3遍");
			item41.setPicUrl("http://www.qqpk.cn/Article/UploadFiles/201501/20150113144931897.jpg");
			item41.setUrl("www.baidu.com");
			itemList4.add(item41);
			
			ResponseArticleModel item42 = new ResponseArticleModel();
			item42.setTitle("2222");
			item42.setDescription("重要的事情说3遍");
			item42.setPicUrl("http://diy.qqjay.com/u2/2014/1020/b8aaa504eeea60dfc513e4a4d67f60c2.jpg");
			item42.setUrl("www.baidu.com");
			itemList4.add(item42);
			
			ResponseArticleModel item43 = new ResponseArticleModel();
			item43.setTitle("3333");
			item43.setDescription("重要的事情说3遍");
			item43.setPicUrl("http://tx.haiqq.com/uploads/allimg/140708/142F62318-42.jpg");
			item43.setUrl("www.baidu.com");
			itemList4.add(item43);
			
			ResponseArticleModel item44 = new ResponseArticleModel();
			item44.setTitle("4444");
			item44.setDescription("重要的事情说3遍");
			item44.setPicUrl("http://tx.haiqq.com/uploads/allimg/140902/1QI54Z2-41.jpg");
			item44.setUrl("www.baidu.com");
			itemList4.add(item44);
			
			
			articles4.setArticles(itemList4);
			response.setArticles(articles4);
			break;	
			
		case "5":
			String url = "http://123.56.218.65/wx/oauth2";
			String urlencode = null;
			try {
				urlencode = URLEncoder.encode(url, "utf-8");
				System.out.println(urlencode);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String oauthUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxe80020daf3678c5b&redirect_uri=" +urlencode+ "&response_type=code&scope=snsapi_base&state=zl#wechat_redirect";
			response.setMsgType(WeixinConstant.RESPONSE_MSGTYPE_TEXT);
			response.setContent("<a href=\"" +oauthUrl +"\">单击这里体验oauth授权</a>");
			break;

		default:
			response.setMsgType(WeixinConstant.RESPONSE_MSGTYPE_TEXT);
			response.setContent("回复default");
			break;
		}
		
		return response;
		
	}

	@Override
	public ResponseModel exeImage(RequestModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseModel exeVoice(RequestModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseModel exeVideo(RequestModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseModel exeShortvideo(RequestModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseModel exeLocation(RequestModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseModel exeLink(RequestModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
