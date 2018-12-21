package com.github.flj.guavatest.mapper;

import com.github.flj.guavatest.entity.Person;
import org.springframework.stereotype.Repository;

//@Service
@Repository
public interface PersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}