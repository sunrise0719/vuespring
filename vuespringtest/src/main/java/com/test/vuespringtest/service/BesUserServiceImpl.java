package com.test.vuespringtest.service;

import com.test.vuespringtest.entity.BesUser;
import com.test.vuespringtest.mapper.BesUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BesUserService")
public class BesUserServiceImpl implements BesUserService {

    @Autowired
    private BesUserMapper userMapper;
    @Override
    public List<BesUser> getBesUser() {
        return userMapper.findAll();
    }
}
