package com.github.flj.guavatest.entity;

public class Person {
    private Integer id;

    private String name;

    private Integer sex;

    private Integer age;

    private String province;

    private String city;

    private String district;

    private String address;

    private String tel;

    public Person(Integer id, String name, Integer sex, Integer age, String province, String city, String district, String address, String tel) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.province = province;
        this.city = city;
        this.district = district;
        this.address = address;
        this.tel = tel;
    }

    public Person() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }
}