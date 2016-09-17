package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WXController {
	
	private static final Logger logger = LoggerFactory.getLogger(WXController.class);
	
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
	
	
	@PostMapping("/access")
	public String accessPost(){
		
		logger.info("accessPost accessPost accessPost accessPost");
		return null;
		
	}
}
