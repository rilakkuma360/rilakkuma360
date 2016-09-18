package com.example.wx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.wx.constant.WeixinConstant;
import com.example.wx.pojo.model.RequestModel;
import com.example.wx.pojo.model.ResponseModel;
import com.example.wx.service.msg.MsgService;

@RestController
public class WXController {
	
	private static final Logger logger = LoggerFactory.getLogger(WXController.class);
	
	@Autowired
	private MsgService msgService;
	
	@GetMapping("/access")
	public String accessGet(@RequestParam String signature, @RequestParam String timestamp, @RequestParam String nonce, @RequestParam String echostr) {
//	public String welcome() {
		
		
		logger.info("signature : " + signature);
		logger.info("timestamp : " + timestamp);
		logger.info("nonce : " + nonce);
		logger.info("nonce : " + nonce);
		
		
		if(echostr != null && echostr.length() > 1){
			
			logger.info("echostr : " + echostr);
     		return echostr;
		}
		
		return echostr;
	}
	
	
	//微信接受接口 POST
		@RequestMapping(value = "/access", method = RequestMethod.POST, produces = "application/xml")
		ResponseModel weixinPost(@RequestBody RequestModel model) {

			ResponseModel response = null;
			switch (model.getMsgType()) {
			// 1文本消息
			case WeixinConstant.REQUEST_MSGTYPE_TEXT:
				response = msgService.exeText(model);
				break;

			// 2图片消息
			case WeixinConstant.REQUEST_MSGTYPE_IMAGE:
				System.out.println(model.getMediaId());
				break;

			// 3语音消息
			case WeixinConstant.REQUEST_MSGTYPE_VOICE:
				break;

			// 4视频消息
			case WeixinConstant.REQUEST_MSGTYPE_VIDEO:
				break;

			// 5小视频消息
			case WeixinConstant.REQUEST_MSGTYPE_SHORTVIDEO:
				break;

			// 6地理位置消息
			case WeixinConstant.REQUEST_MSGTYPE_LOCATION:
				break;

			// 7链接消息
			case WeixinConstant.REQUEST_MSGTYPE_LINK:
				break;
				
			// 事件
			case WeixinConstant.REQUEST_MSGTYPE_EVENT:
				break;	

			default:
				System.out.println("没有相关处理");
				break;
			}
			
			if (response == null) {
				response = new ResponseModel();
				/*		response.setToUserName("<![CDATA[" + model.getFromUserName() + "]]>");
						response.setFromUserName("<![CDATA[" + model.getToUserName() + "]]>");
						response.setCreateTime("12345678");
						response.setMsgType("<![CDATA[text]]>");
						response.setContent("<![CDATA[2222]]>");*/
						response.setToUserName(model.getFromUserName());
						response.setFromUserName(model.getToUserName());
						response.setCreateTime("12345678");
						response.setMsgType("text");
						response.setContent("没有相关处理");
			} 

			return response;
			
		}
		
		//网页授权
		@RequestMapping(value = "/oauth2", method = RequestMethod.GET)
		String oauth2(@RequestParam String code, @RequestParam String state) {
			
			
			System.out.println(code);
			return code;
		}
}
