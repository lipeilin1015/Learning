package com.lipeilin.luogu;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-09-02 14:43
 */
public class P5703 {
    public static void main(String[] args) {

        /*
        * # 【深基2.例5】苹果采购

## 题目描述

现在需要采购一些苹果，每名同学都可以分到固定数量的苹果，并且已经知道了同学的数量，请问需要采购多少个苹果？

## 输入格式

输入两个不超过 $10^9$ 正整数，分别表示每人分到的数量和同学的人数。

## 输出格式

一个整数，表示答案。保证输入和答案都在 int 范围内的非负整数。

## 样例 #1

### 样例输入 #1

```
5 3
```

### 样例输出 #1

```
15
```*/
        //限制两个数不超过10^9

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b);
    }
}
