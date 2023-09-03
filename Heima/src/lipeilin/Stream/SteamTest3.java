package lipeilin.Stream;

import lipeilin.ArrSort1.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-09-02 8:11
 */
public class SteamTest3 {
    public static void main(String[] args) {
       /* //创建一个集合，存储多个字符串元素
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张三丰","张无忌","周芷若","赵敏","张强","张三","李四","王五","张三丰");
        //1.第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中
        //2.第一个队伍筛选之后只要前3个人；存储到一个新集合中
        //3.第二个队伍只要姓张的成员姓名；存储到一个新集合中
        //4.第二个队伍筛选之后不要前2个人；存储到一个新集合中
        //5.将两个队伍合并为一个队伍；存储到一个新集合中
        //6.根据姓名创建Person对象；存储到一个新集合中
        //7.打印整个队伍的Person对象信息。
        list.stream().filter(name -> name.length() == 3).limit(3).forEach(name -> System.out.println(name+"/t"));
        list.stream().filter(name -> name.startsWith("张")).skip(2).forEach(name -> System.out.println(name));
        list.stream().filter(name -> name.length() == 3).limit(3).filter(name -> name.startsWith("张")).skip(2).forEach(name -> System.out.println(name));*/
        List<Student> students = new ArrayList<>();
        Student s1= new Student("张三丰", 18, 100);
        Student s2= new Student("三丰", 12, 120);
        Student s3= new Student("丰", 15, 110);
        Student s4= new Student("张丰", 18, 170);
        Student s5= new Student("张三", 18, 1980);
        Collections.addAll(students,s1,s2,s3,s4,s5);
        students.stream().filter(s->s.getAge()>=140).forEach(s-> System.out.println(s));
    }
}
