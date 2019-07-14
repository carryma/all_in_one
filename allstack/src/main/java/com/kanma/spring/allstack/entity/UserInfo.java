package com.kanma.spring.allstack.entity;

/**
 * @ Author ：Ma Kang
 * @ Date   ：Created on 2019/7/14 18:41
 */
public class UserInfo {

    private String name;
    private String tel;
    private String hobby;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}