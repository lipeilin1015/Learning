package com.lipeilin.leetcode1;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-09-02 15:01
 */
class leet26 {
    public int removeDuplicates(int[] nums) {
        int n =nums.length;
        if (n==0){
            return 0;
        }
        int fast = 1;
        int slow = 1;
        while (fast<n){
            if (nums[fast]!=nums[fast-1]){
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }

}
