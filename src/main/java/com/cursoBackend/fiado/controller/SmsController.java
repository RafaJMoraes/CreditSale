package com.cursoBackend.fiado.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoBackend.fiado.clients.TwilioClient;

@RestController
@RequestMapping("api/sms")
public class SmsController {
	
	
	@Autowired
	private TwilioClient twilioClient;
	
    @GetMapping(value = "/sendSMS")
    public ResponseEntity<String> sendSMS() {    	
    
        return  ResponseEntity.status(HttpStatus.OK).body(twilioClient.sendSms());
    }
}
