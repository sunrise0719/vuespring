package com.test.vuespringtest.mapper;

import com.test.vuespringtest.entity.BesUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BesUserMapper {
    List<BesUser> findAll();
}
