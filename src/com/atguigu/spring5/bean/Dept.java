package com.atguigu.spring5.bean;

public class Dept {
    private String dname;

    public String getDname() {
        return dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
