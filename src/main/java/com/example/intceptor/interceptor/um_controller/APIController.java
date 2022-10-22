package com.example.intceptor.interceptor.um_controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

	@RequestMapping(value = "/helloUM")
	public String getProduct() {
		System.out.println("Controller Called");
		return "hello UM";
	}
}