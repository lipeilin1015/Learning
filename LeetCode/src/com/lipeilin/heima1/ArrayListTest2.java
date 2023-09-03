package com.lipeilin.heima1;

import java.util.LinkedList;
import java.util.List;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-09-03 15:39
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        // 已知数组存放一批QQ号码，QQ号码最长为11位，
        // 最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
        // 将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        List list = new LinkedList();//创建集合
        for (int i = 0; i < strs.length; i++) {
            list.add(strs[i]);//添加元素
        }
        for (int i = 0; i < list.size(); i++) {//外层循环控制比较的元素
            String str = (String) list.get(i);//获取元素
            for (int j = i+1; j < list.size(); j++) {//内层循环控制被比较的元素
                String str2 = (String) list.get(j);//获取元素
                if (str.equals(str2)) {//比较
                    list.remove(j);//删除元素
                    j--;//删除元素后，后面的元素会往前移动一位，所以要j--
                }
            }
        }
        System.out.println(list);
    }
}
