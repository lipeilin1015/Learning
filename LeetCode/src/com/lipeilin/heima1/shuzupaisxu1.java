package com.lipeilin.heima1;

import java.util.Arrays;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-08-12 9:29
 */
public class shuzupaisxu1 {
    public static void main(String[] args) {
        //选择排序，从小到大排序
        int[] arr = {2,5,3,9,3};
        for (int i = 0; i < arr.length-1; i++) {
            //遍历数组
            //记住每次遍历到的下标
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    minIndex = j;
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
                }
            }
            if (i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
