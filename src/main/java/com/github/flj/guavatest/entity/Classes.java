package com.github.flj.guavatest.entity;

public class Classes {
    private Integer id;

    private String classesName;

    private Integer headTeacherId;

    public Classes(Integer id, String classesName, Integer headTeacherId) {
        this.id = id;
        this.classesName = classesName;
        this.headTeacherId = headTeacherId;
    }

    public Classes() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName == null ? null : classesName.trim();
    }

    public Integer getHeadTeacherId() {
        return headTeacherId;
    }

    public void setHeadTeacherId(Integer headTeacherId) {
        this.headTeacherId = headTeacherId;
    }
}