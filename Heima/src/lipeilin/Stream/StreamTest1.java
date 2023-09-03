package lipeilin.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-09-01 17:53
 */
public class StreamTest1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"张三丰","张无忌","周芷若","赵敏","张强","张三","李四","王五","张三丰");
        System.out.println(names);
        //找出姓张的三个字的人，放入一个新的集合中
        List<String> newNames = new ArrayList<>();
        for(String name : names){
            if(name.startsWith("张") && name.length() == 3){
                newNames.add(name);
            }
        }
        System.out.println(newNames);

        //使用Stream流来做
        names.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(name -> System.out.println(name));
    }
}
