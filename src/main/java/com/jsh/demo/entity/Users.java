package com.jsh.demo.entity;

/**
 * 用信息测试实体
 *
 */
public class Users {
    private Integer uid;
    private String uname;
    private Integer uage;
    private Character  usex;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public Character getUsex() {
        return usex;
    }

    public void setUsex(Character usex) {
        this.usex = usex;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                ", usex=" + usex +
                '}';
    }
}
