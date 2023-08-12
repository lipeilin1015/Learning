package com.lipeilin.bean;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-08-07 15:28
 */
public class Schedule {//看诊情况
    private LocalDate today; //记录日期
    //上午
    private boolean morning;//是否看诊
    private LocalTime mstart;//开始
    private LocalTime mend;//结束时间
    private int mTotalNumber;//总人数
    private int mAppointNumber;//预约人数

    //下午
    private boolean afternoon;//是否看诊
    private LocalTime astart;//开始
    private LocalTime aend;//结束时间
    private int aTotalNumber;//总人数
    private int aAppointNumber;//预约人数

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public boolean isMorning() {
        return morning;
    }

    public void setMorning(boolean morning) {
        this.morning = morning;
    }

    public LocalTime getMstart() {
        return mstart;
    }

    public void setMstart(LocalTime mstart) {
        this.mstart = mstart;
    }

    public LocalTime getMend() {
        return mend;
    }

    public void setMend(LocalTime mend) {
        this.mend = mend;
    }

    public int getmTotalNumber() {
        return mTotalNumber;
    }

    public void setmTotalNumber(int mTotalNumber) {
        this.mTotalNumber = mTotalNumber;
    }

    public int getmAppointNumber() {
        return mAppointNumber;
    }

    public void setmAppointNumber(int mAppointNumber) {
        this.mAppointNumber = mAppointNumber;
    }

    public boolean isAfternoon() {
        return afternoon;
    }

    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    public LocalTime getAstart() {
        return astart;
    }

    public void setAstart(LocalTime astart) {
        this.astart = astart;
    }

    public LocalTime getAend() {
        return aend;
    }

    public void setAend(LocalTime aend) {
        this.aend = aend;
    }

    public int getaTotalNumber() {
        return aTotalNumber;
    }

    public void setaTotalNumber(int aTotalNumber) {
        this.aTotalNumber = aTotalNumber;
    }

    public int getaAppointNumber() {
        return aAppointNumber;
    }

    public void setaAppointNumber(int aAppointNumber) {
        this.aAppointNumber = aAppointNumber;
    }
}
