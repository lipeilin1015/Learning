package com.lipeilin.leetcode1;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-08-09 16:22
 */
public class 两数之和 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i]+nums[i+1]==target){
                System.out.println("["+i+","+(i+1)+"]");
                break;
            }else if (nums[i]+nums[i+2]==target){
                System.out.println("["+i+","+(i+1)+"]");
                break;
            }
        }
    }
}
