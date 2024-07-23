package com.hcl.bloodmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.bloodmanagement.model.UserDetails;
import com.hcl.bloodmanagement.model.Users;
@Repository
public interface LoginRepository extends  JpaRepository<UserDetails, Long>{

	//public Users findByNameAndPassword(String userName,String password);  
	@Query("from UserDetails u where u.userName=:userName and u.password=:password")
	UserDetails findUserByNameAndPassword(@Param("userName")String userName, @Param("password")String password);
	
//	@Query(value = "insert into users(name,password) values (:userName,:password)")
//	Users saveUserDetails(@Param("userName")String userName, @Param("password")String password);
}
