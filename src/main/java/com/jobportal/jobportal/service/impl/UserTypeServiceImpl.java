package com.jobportal.jobportal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.jobportal.entity.UserType;
import com.jobportal.jobportal.repository.UserTyperepository;
import com.jobportal.jobportal.service.UserTypeService;

@Service
public class UserTypeServiceImpl implements UserTypeService {

    @Autowired
    private UserTyperepository userTyperepository;

    @Override
    public List<UserType> getAll() {
        return userTyperepository.findAll();
    }

}
