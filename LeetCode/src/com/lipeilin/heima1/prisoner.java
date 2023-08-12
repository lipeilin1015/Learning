package com.lipeilin.heima1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-08-09 16:36
 */
public class prisoner {
    public static ArrayList<People> peoples = new ArrayList<>();
    public static void main(String[] args) {
        Random rm = new Random();
        for (int i = 1; i <=100 ; i++) {
            while (true){
                int code = rm.nextInt(200)+1;
                if(repeat(code)){
                    People p = new People(code,i);
                    break;
                }
           }
        }

    }
    public static boolean repeat(int code){//判断是否重复
        for (People people : peoples) {
            if (people.getCode()==code){
                return false;
            }
        }
        return true;
    }
}
