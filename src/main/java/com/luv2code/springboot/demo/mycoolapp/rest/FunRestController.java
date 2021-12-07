package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FunRestController {
	
	@PostMapping("hello")
//	@ResponseBody
	public String getPin(@RequestParam String pin) {
		
		System.out.println("*************** HELLO WORLD data tag ***************");
		System.out.println("*************** HELLO WORLD 2 ***************");
		System.out.println("=== pin is :: "+pin);

	   
	    return "hello";
	    
	}
	
	@PostMapping("loginSuccess")
	public String login(@RequestParam String pin) {
		
		System.out.println("*************** HELLO WORLD submit tag ***************");
		System.out.println("*************** HELLO WORLD 2 ***************");
		System.out.println("=== pin is :: "+pin);
//		System.out.println("=== message is :: "+loginSuccess);

	   
	    return "hello";
	    
	}
	
	

}
