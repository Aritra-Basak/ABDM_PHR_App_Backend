/**
 * 
 */
package com.springBoot.secretProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.secretProject.serviceInterface.UserServiceIntf;

/**
 * Controller for User role
 * @author Aritra
 *
 */
@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired 
	UserServiceIntf userService;
	
	@GetMapping(value="/test")
	public ResponseEntity<String> testApi(){
		try {
		return new ResponseEntity<String>("User Controller is up.",HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>("User Controller is down.",HttpStatus.SERVICE_UNAVAILABLE);
		}
	}

}
