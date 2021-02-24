package com.employment.micro;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEmploymentRepo extends JpaRepository<UserEmploymentEntity, Integer>{

	Optional<UserEmploymentEntity> findByUserName(String userName);
	
	Optional<UserEmploymentEntity> findByUserDescription(String userDesc); 
	
}
