package com.github.flj.guavatest.mapper;

import com.github.flj.guavatest.entity.Teacher;
import org.springframework.stereotype.Service;

@Service
public interface TeacherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}