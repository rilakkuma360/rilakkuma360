package com.example.wx.service.schedule;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.wx.pojo.model.AccessToken;
import com.example.wx.utils.WeixinUtil;
@Service
public class ScheduledTaskServiceImpl implements ScheduledTaskService {
	
	private static final Logger LOGGER = Logger.getLogger(ScheduledTaskServiceImpl.class);
	
	@Autowired
	private AccessToken accessToken;

	@Override
	//@Scheduled(fixedRate = 10000)
	@Scheduled(fixedRate = 7200000)
	public void getAccessTokenForWeixin() {
		// TODO Auto-generated method stub
		
		LOGGER.debug("获取AccessToken，每隔7200000秒执行一次");
		AccessToken toke = WeixinUtil.getAccessToken("wxe80020daf3678c5b", "081325a765b13babe5f0915ebd7f6a6c");
		
		accessToken.setAccess_token(toke.getAccess_token());
		accessToken.setExpires_in(toke.getExpires_in());
		
	}

}
