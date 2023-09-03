package com.lipeilin.leetcode1;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-09-02 15:42
 */
public class leet27 {
    public int removeElement(int[] nums, int val) {
//        给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
//
//不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
//
//元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
        int n = nums.length;
        if (n==0){
            return 0;
        }
        int fast = 0;
        int slow = 0;
        while (fast<n){
            if (nums[fast]!=val){
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
        //详细解释一下
        //1.定义两个指针，一个快指针，一个慢指针
        //2.快指针遍历数组，慢指针指向不等于val的值
        //3.快指针遍历完数组，慢指针指向的就是不等于val的值

    }
}
