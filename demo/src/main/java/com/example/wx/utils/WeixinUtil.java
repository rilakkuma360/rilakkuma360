package com.example.wx.utils;

import java.io.IOException;
import java.util.Date;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.example.wx.pojo.model.AccessToken;
import com.example.wx.pojo.model.JSONResult;
import com.example.wx.pojo.model.RequestModel;
import com.example.wx.pojo.model.ResponseModel;


public class WeixinUtil {
	
	public static ResponseModel getResponse(RequestModel request, String msgType) {
				
		ResponseModel response = new ResponseModel();
		response.setToUserName(request.getFromUserName());
		response.setFromUserName(request.getToUserName());
		response.setCreateTime(String.valueOf((new Date()).getTime()));
		if (msgType != null) {
			response.setMsgType(msgType);
		}
		return response;
	}
	
	public static AccessToken getAccessToken(String appid, String secret){
		
		String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" +appid+ "&secret=" + secret;
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet(url);
		HttpResponse response = null;
		AccessToken token = null;
		try {
			 response = client.execute(get);
			 
			 if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				 HttpEntity entity = response.getEntity();
				 String tokenjson = EntityUtils.toString(entity);
				 token = JSON.parseObject(tokenjson, AccessToken.class);
			}
			 
			 
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return token;
	}
	
	public static void createMenu(){
		
		AccessToken token = WeixinUtil.getAccessToken("wxe80020daf3678c5b", "081325a765b13babe5f0915ebd7f6a6c");
		
		if (token == null) {
			return;
		}
		
		String url =  "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=" + token.getAccess_token();
		String menuJsonStr = "{\"button\":[{\"type\":\"click\",\"name\":\"MENU01\",\"key\":\"1\"},{\"type\":\"click\",\"name\":\"天气查询\",\"key\":\"西安\"},{\"name\":\"日常工作\",\"sub_button\":[{\"type\":\"click\",\"name\":\"待办工单\",\"key\":\"01_WAITING\"},{\"type\":\"click\",\"name\":\"已办工单\",\"key\":\"02_FINISH\"},{\"type\":\"click\",\"name\":\"我的工单\",\"key\":\"03_MYJOB\"},{\"type\":\"view\",\"name\":\"网站\",\"url\":\"http://www.baidu.com/\"},{\"type\":\"click\",\"name\":\"签到\",\"key\":\"05_SIGN\"}]}]}";

		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(url);
		post.setEntity(new StringEntity(menuJsonStr, "UTF-8"));
		HttpResponse response;
		try {
			response = client.execute(post);
			
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {

				HttpEntity entity = response.getEntity();
				String tokenjson = EntityUtils.toString(entity);
				JSONResult result = JSON.parseObject(tokenjson, JSONResult.class);
				
				System.out.println("result.getErrcode(): " + result.getErrcode());
				System.out.println("result.getErrmsg(): " + result.getErrmsg());
				
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

		
		
	}
	
//	public static void main(String[] args) {
//		WeixinUtil.createMenu();
//	}

}
