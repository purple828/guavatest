package com.github.flj.guavatest.mapper;

import com.github.flj.guavatest.entity.Classes;
import org.springframework.stereotype.Service;

@Service
public interface ClassesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
}