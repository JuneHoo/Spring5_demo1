package com.atguigu.spring5.bean;

public class Emp {
    private String ename;
    private String gender;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    private Dept dept;


    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add() {
        System.out.println(ename+"::"+gender+"::"+dept);
    }


}
