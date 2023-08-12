package com.lipeilin.frame;

import com.lipeilin.bean.Appointment;
import com.lipeilin.bean.Department;
import com.lipeilin.bean.Doctor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-08-07 16:18
 */
public class HospitalManager {
    //1.系统需要存储全部科室信息
    private ArrayList<Department> allDepartments = new ArrayList<>();
    //2.存储全部的预约详情
    private ArrayList<Appointment> appointments = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public void start(){
        while (true){
            System.out.println("===欢迎进入创角星医院信息管理系统===");
            System.out.println("1、科室管理-添加科室");
            System.out.println("2、科室管理-删除科室");
            System.out.println("3、科室管理-修改科室");
            System.out.println("4、医生管理-录入医生");
            System.out.println("5、医生管理-医生坐诊设置（可设置当天以及未来六天的坐诊情况）");
            System.out.println("6、医生管理-展示全部医生的坐诊信息（当天以及未来六天）");
            System.out.println("7、医生管理-挂号预约");
            System.out.println("8、搜索某个医生当前和未来六天的预约详情(展示每天预约的具体情况)");
            System.out.println("请输入操作:");
//            Scanner sc = new Scanner(System.in);
            switch (sc.next()){
                case "1":
                    addDepartment();
                    break;
                case "2":
                case "3":
                case "4":
                    addDoctor();
                    break;
                case "5":
                case "6":
                case "7":
                case "8":

            }
        }
    }

    private void addDoctor() {
        System.out.println("======录入医生======");
        Doctor doctor = new Doctor();
        while (true){
            //先选择科室
            System.out.println("请选择科室:");
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department =allDepartments.get(i);
                System.out.println((i+1)+"、"+department.getName());
            }
            System.out.println("输入科室编号:");
            //接收输入参数
            int command = sc.nextInt();
            if (command<1 || command>allDepartments.size()){
                System.out.println("选择有误，请重新选择");
                continue;
            }
            //得到科室
            Department department = allDepartments.get(command-1);
            doctor.setDepartmentName(department.getName());

            //录入
            doctor.setDoctorId(UUID.randomUUID().toString());

            System.out.print("请输入医生的姓名:");
            String name = sc.next();
            doctor.setName(name);
            System.out.print("请输入医生的性别:");
            String gender = sc.next();
            doctor.setGender(gender);
            System.out.print("请输入医生的年龄:");
            int age = sc.nextInt();
            doctor.setAge(age);
            System.out.print("请输入医生的主治方向:");
            String specialty = sc.next();
            doctor.setSpecialty(specialty);
            LocalDate now = LocalDate.now();
            now.plusDays(age);
        }
    }

    private void addDepartment(){
        System.out.println("========添加利室========");
        OUT:
        while (true) {
            System.out.println("请您输入科室名称:");
            String name = sc.next();
            // 判断名称是否存在
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                if (department.getName().equals(name)) {
                    System.out.println("科室已经存在,请重新输入");
                    continue OUT;
                }
            }
            Department department = new Department();
            department.setName(name);
            allDepartments.add(department);
            System.out.println("添加成功!");
            break;
        }
    }
}
