package lipeilin.ArrSort1;

import java.util.Arrays;

public class ArraysTest1 {
    public static void main(String[] args) {
        Student[] student = new Student[3];
        student[0] = new Student("关羽",180.5,24);
        student[1] = new Student("刘备",180.5,23);
        student[2] = new Student("张飞",180.5,25);
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));
    }
}
