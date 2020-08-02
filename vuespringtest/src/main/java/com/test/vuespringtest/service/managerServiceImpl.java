package com.test.vuespringtest.service;

import com.test.vuespringtest.entity.Manager;
import com.test.vuespringtest.mapper.ManagerMapper;
import com.test.vuespringtest.pojo.ResponeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ManagerService")
public class managerServiceImpl implements ManagerService {
    @Autowired
    private ManagerMapper managerMapper;
    @Override
    public ResponeResult getManager(Manager manager) {
        Manager mana=managerMapper.getManagerByManager(manager);
        ResponeResult rs=new ResponeResult();
        if(mana==null){
            rs.setCode(0);
            rs.setMsg("it has no this manager");
        }else{
            rs.setCode(1);
            rs.setMsg("login success");
        }
        return rs;
    }
}
