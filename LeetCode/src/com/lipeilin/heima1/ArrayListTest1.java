package com.lipeilin.heima1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-09-03 15:31
 */
public class ArrayListTest1 {
    public static void main(String[] args) {
        //产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100+1);
        }
        List list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=10) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
