/**
 * 
 */
package com.springBoot.secretProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springBoot.secretProject.common.ServiceResponse;
import com.springBoot.secretProject.repository.UserRepo;
import com.springBoot.secretProject.serviceInterface.UserServiceIntf;

/**
 * @author Aritra
 *
 */
@Service
public class UserService implements UserServiceIntf {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public ServiceResponse getAllUser() {
		try {
			ServiceResponse serviceResponse = ServiceResponse.builder().entityCount(userRepo.count()).resMessage("Success: Found all the User Details").resObject(userRepo.findAll()).status(HttpStatus.OK).statusCode(1).build();
			return serviceResponse;
		}catch(Exception e) {
			e.printStackTrace();
			ServiceResponse serviceResponse = ServiceResponse.builder().entityCount(0).resMessage("Failure: No Users Found").status(HttpStatus.BAD_REQUEST).statusCode(0).build();
			return serviceResponse;
		}
		
	}

	
	@Override
	public ServiceResponse getUser(int id) {
		try {
			ServiceResponse serviceResponse = ServiceResponse.builder().entityCount(1).resMessage("Success: Found the User Details").resObject(userRepo.findById(id)).status(HttpStatus.OK).statusCode(1).build();
			return serviceResponse;
		}catch(Exception e) {
			e.printStackTrace();
			ServiceResponse serviceResponse = ServiceResponse.builder().entityCount(0).resMessage("Failure: No Users Found").status(HttpStatus.BAD_REQUEST).statusCode(0).build();
			return serviceResponse;
		}
	}

	@Override
	public ResponseEntity<?> seviceCheck() {
		try {
			return new ResponseEntity<String>("API Service working fine.",HttpStatus.OK);
		}catch(Exception e ) {
			return new ResponseEntity<String>("API Service is down."+e.getMessage(),HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
	

}
