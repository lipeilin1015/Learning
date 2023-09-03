package com.lipeilin.leetcode1;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-09-03 11:05
 */
public class leet92 {
    public boolean ispalindrome(int x){
        //用先转换成字符串，然后再分割的方法
        String s = String.valueOf(x);
        String[] split = s.split("");
        int i = 0;
        int j = split.length-1;
        while (i<j){
            if (!split[i].equals(split[j])){
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }
}
