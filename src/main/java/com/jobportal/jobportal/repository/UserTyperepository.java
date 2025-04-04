package com.jobportal.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.jobportal.entity.UserType;

public interface UserTyperepository extends JpaRepository<UserType, Integer> {

}
