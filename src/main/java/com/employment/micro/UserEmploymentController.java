package com.employment.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserEmployment")
@EnableHystrix
public class UserEmploymentController {

	@Autowired
	private UserEmploymentRepo userEmploymentRepo;
	
	@GetMapping("/{userID}")
	public UserEmploymentEntity getEmploymentDetails(@PathVariable("userID") Integer userID) {
	
		UserEmploymentEntity user = userEmploymentRepo.findById(userID).
				orElse
				(new UserEmploymentEntity(9999, "No USer Found","No USer Found","No USer Found"));
		
		return user;
	}
	
}
