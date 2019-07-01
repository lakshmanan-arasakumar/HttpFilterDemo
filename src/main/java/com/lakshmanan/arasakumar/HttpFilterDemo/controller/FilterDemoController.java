package com.lakshmanan.arasakumar.HttpFilterDemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterDemoController {
	
	@GetMapping(value = "/headerDetails")
	public ResponseEntity<String> getHeaderDetails(HttpServletRequest request){
		String correlationId = (String) request.getAttribute("correlationId");
		
		if (correlationId != null) {
			return new ResponseEntity<>(correlationId, HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Http Filter is not available", HttpStatus.OK);
		}
	}
}
