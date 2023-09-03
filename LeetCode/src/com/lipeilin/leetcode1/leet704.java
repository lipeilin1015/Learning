package com.lipeilin.leetcode1;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-09-03 11:13
 */
public class leet704 {
    public int search(int[] nums, int target){
        if (nums.length==0){
            return -1;
        }
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]<target){
                left = mid+1;
            }else if (nums[mid]>target){
                right = mid-1;
            }
        }
        return -1;
    }
}
