package lipeilin.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-08-19 14:53
 */
public class collection1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("nihao");//添加一个元素
        System.out.println(c);
        c.clear();//清空集合
        System.out.println(c);
        c.isEmpty();//判断是否为空
        c.contains("nihao");//判断集合中是否含有某个元素
        c.remove("nihao");//删除某个元素，如果有多个删除前面的
        c.toArray();//集合转换成数组
    }
}
