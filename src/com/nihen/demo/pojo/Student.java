package com.nihen.demo.pojo;

import java.util.Objects;

/**
 * @Description 学生类
 * @Author zhuguanglong
 * @Company
 * @Date 2021/08/26 15:17
 */
public class Student {

    private int sid;
    private String sname;
    private String sex;
    private int age;

    public Student() {
    }

    public Student(String sname, String sex, int age) {
        this.sname = sname;
        this.sex = sex;
        this.age = age;
    }

    public Student(int sid, String sname, String sex, int age) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.age = age;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sid == student.sid &&
                age == student.age &&
                Objects.equals(sname, student.sname) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, sex, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
