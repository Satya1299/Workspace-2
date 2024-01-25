package com.springsecurity.springSecurityy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.springSecurityy.entity.User;

@Repository
public interface userRepository extends JpaRepository<User, Long>{

}
