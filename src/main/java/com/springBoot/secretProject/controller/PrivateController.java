package com.springBoot.secretProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.secretProject.common.ServiceResponse;
import com.springBoot.secretProject.serviceInterface.UserServiceIntf;
/**
 * Rest Controller for ADMIN role.
 * @author Aritra
 * */
@RestController
@RequestMapping(value = "/admin")
public class PrivateController {
	
	@Autowired
	private UserServiceIntf service;
	

    @GetMapping(value="/test")
	public ResponseEntity<String> testApi(){
		try {
		return new ResponseEntity<String>("Admin Controller is up.",HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>("Admin Controller is down.",HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
    
    @GetMapping(value="/test/service")
    public ResponseEntity<?> testService(){
    	return service.seviceCheck();
    }
    
    @GetMapping(value="/getAll")
    public ServiceResponse getAllUser() {
    	return service.getAllUser();
    }
    
    @GetMapping(value="/getUser")
    public ServiceResponse getUser(@RequestParam int id) {
    	return service.getUser(id);
    }
}
