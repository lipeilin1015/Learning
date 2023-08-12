package com.lipeilin.bean;

import java.time.LocalDateTime;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-08-07 15:41
 */
public class Appointment {//预约
    private String userName;
    private char sex;
    private int tel;//电话
    private int age;
    private String desc;//病情描述
    private String departName;//科室名
    private String doctorId;//医生编号
    private LocalDateTime appointDateTime;//预约时间

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDateTime getAppointDateTime() {
        return appointDateTime;
    }

    public void setAppointDateTime(LocalDateTime appointDateTime) {
        this.appointDateTime = appointDateTime;
    }
}
