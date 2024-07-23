package com.hcl.bloodmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.bloodmanagement.model.UserDetails;

@Repository

public interface UserRegistrationRepository extends  JpaRepository<UserDetails, Long>{

}
