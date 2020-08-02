package com.test.vuespringtest.mapper;

import com.test.vuespringtest.entity.Manager;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManagerMapper {
    Manager getManagerByManager(Manager manager);
}
