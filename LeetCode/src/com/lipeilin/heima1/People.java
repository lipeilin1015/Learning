package com.lipeilin.heima1;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-08-09 17:08
 */
public class People {
    int code;
    int localcode;

    public People() {
    }

    public People(int code, int localcode) {
        this.code = code;
        this.localcode = localcode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getLocalcode() {
        return localcode;
    }

    public void setLocalcode(int localcode) {
        this.localcode = localcode;
    }
}
