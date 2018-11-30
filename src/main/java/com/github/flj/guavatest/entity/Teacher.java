package com.github.flj.guavatest.entity;

public class Teacher {
    private Integer id;

    private String teacherNo;

    private Integer personId;

    public Teacher(Integer id, String teacherNo, Integer personId) {
        this.id = id;
        this.teacherNo = teacherNo;
        this.personId = personId;
    }

    public Teacher() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo == null ? null : teacherNo.trim();
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }
}