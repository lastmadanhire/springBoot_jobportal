package com.jobportal.jobportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobportal.jobportal.entity.UserType;

@Service
public interface UserTypeService {

    public List<UserType> getAll();

}
