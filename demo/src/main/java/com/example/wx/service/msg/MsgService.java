package com.example.wx.service.msg;

import com.example.wx.pojo.model.RequestModel;
import com.example.wx.pojo.model.ResponseModel;

public interface MsgService {
	
	ResponseModel exeText(RequestModel model);
	
	ResponseModel exeImage(RequestModel model);
	
	ResponseModel exeVoice(RequestModel model);
	
	ResponseModel exeVideo(RequestModel model);
	
	ResponseModel exeShortvideo(RequestModel model);
	
	ResponseModel exeLocation(RequestModel model);
	
	ResponseModel exeLink(RequestModel model);

}
