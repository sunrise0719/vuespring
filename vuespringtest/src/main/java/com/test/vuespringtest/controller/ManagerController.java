package com.test.vuespringtest.controller;

import com.test.vuespringtest.entity.Manager;
import com.test.vuespringtest.pojo.ResponeResult;
import com.test.vuespringtest.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

@CrossOrigin
@RestController
@RequestMapping("/ManagerController")
public class ManagerController {

    @Autowired
    private ManagerService managerService;
    @RequestMapping("/login")
    @ResponseBody
    public ResponeResult getManager(@RequestBody Manager requestUser){

        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getManagerName();
        username = HtmlUtils.htmlEscape(username);

        String userpwd = requestUser.getManagerPwd();
        userpwd = HtmlUtils.htmlEscape(userpwd);

        Manager manager=new Manager();
        manager.setManagerName(username);
        manager.setManagerPwd(userpwd);
        return managerService.getManager(manager);
    }
}
