package com.github.flj.guavatest.mapper;

import com.github.flj.guavatest.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}