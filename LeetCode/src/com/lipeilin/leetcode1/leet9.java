package com.lipeilin.leetcode1;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-09-03 10:53
 */
public class leet9 {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int div = 1;
        while (x/div>=10){
            div*=10;
        }
        while (x>0){
            int left = x/div;
            int right = x%10;
            if (left!=right){
                return false;
            }
            x = (x%div)/10;
            div/=100;
        }
        return true;
    }
}
