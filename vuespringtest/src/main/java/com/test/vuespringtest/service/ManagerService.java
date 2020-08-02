package com.test.vuespringtest.service;

import com.test.vuespringtest.entity.Manager;
import com.test.vuespringtest.pojo.ResponeResult;

public interface ManagerService {
    ResponeResult getManager(Manager manager);
}
