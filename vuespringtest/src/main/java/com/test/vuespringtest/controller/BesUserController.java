package com.test.vuespringtest.controller;

import com.test.vuespringtest.entity.BesUser;
import com.test.vuespringtest.service.BesUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/besUser")
public class BesUserController {
    @Autowired
    private BesUserService besUserService;

    @RequestMapping("/findAll")
    public List<BesUser> findAll(){
        return besUserService.getBesUser();
    }
}
