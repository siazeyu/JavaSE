package com.szy.test;

import java.text.SimpleDateFormat;
import java.util.*;

public class T1 {

    public static int num1;

    public static Integer num2;

    public static void main(String[] args) {


        // 输出结果
        System.out.println("--------- ==比较 ---------");
        String a = new String("123");
        System.out.println(a == "123");

        Integer i = new Integer(4);
        System.out.println(4 == i);

        System.out.println("--------- ++运算 ---------");
        int j = i++ + ++i;
        System.out.println(j);

        System.out.println("---------三元表达式---------");
        System.out.println(j > 8 ? 666 : 777);


        System.out.println("---------初始值---------");
        System.out.println(num1);

        System.out.println(num2);

        // 将String转为整型数据  -> 各种基本类型转换
        System.out.println("---------基本类型转换---------");


        System.out.println("---------double---------");
        double n1 = 0.1;
        double n2 = 0.2;
        System.out.println(n1 + n2 == 0.3);


        System.out.println("---------switch---------");
        switch (j) {
            case 8:
                System.out.println(8);
            case 9:
                System.out.println(9);
            case 10:
                System.out.println(10);
            case 11:
                System.out.println(11);
            default:
                System.out.println("default");
        }

        List<Integer> list = new ArrayList<>();
        for (int k = 11; k < 25; k+=2){
            list.add(k);
        }

        System.out.println("---------遍历移除---------");
        for (int k = 0; k < list.size(); k++){
            if (list.get(i) % 2 == 1){
                list.remove(i);
            }
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next() % 2 == 1){
                iterator.remove();
            }
        }

        list.forEach(System.out::println);


    }

    // 打印当前时间yyyy-MM-dd HH-mm-ss
    public static void printDate(){

    }

    // 数组排序
    public static int[] sort(int[] arr){

        return null;
    }

    // 打印当前时间戳
    public static void getSystemTime(){


    }

}
