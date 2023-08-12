package com.lipeilin.heima1;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-08-12 9:47
 */
public class erfenchazhao {
    public static void main(String[] args) {
        int[] arr = {7,23,79,81,103,127,131,147};
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您要查找到数据:");
        int scan = sc.nextInt();
        System.out.println(binary(arr, scan));
    }
    public static String binary(int[] arr, int data){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]>data){
                right=mid-1;
            }
            else if (arr[mid]<data){
                left =mid+1;
            }
            else {
                return "您要找的数据在数组的第"+(mid+1)+"位";
            }
        }
        return "没有您要找的元素";
    }
}
