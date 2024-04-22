package com.springBoot.secretProject.serviceInterface;

import org.springframework.http.ResponseEntity;

import com.springBoot.secretProject.common.ServiceResponse;

/**
 * 
 * @author Aritra
 * */

public interface UserServiceIntf {
	
	 public ServiceResponse getAllUser();
	 
	 public ServiceResponse getUser(int id);
	 
	 public ResponseEntity<?> seviceCheck();

}
