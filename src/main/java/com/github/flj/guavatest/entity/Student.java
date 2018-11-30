package com.github.flj.guavatest.entity;

public class Student {
    private Integer id;

    private Integer classesId;

    private Integer personId;

    public Student(Integer id, Integer classesId, Integer personId) {
        this.id = id;
        this.classesId = classesId;
        this.personId = personId;
    }

    public Student() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }
}