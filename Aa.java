package com.hp.a;

import java.util.ArrayList;

public class Aa {
    // main
    public static void main(String[] args) {
        System.out.println("输出的快捷键 sout");//sout

        String name = "xxx";
        System.out.println("name = " + name);//soutv 可以显出 变量
        System.out.println("aaa.main"); //soutm是输出  方法名称
        System.out.println("args = [" + args + "]"); // soutp 是输出 方法的参数

        int age = 17;
        if(age<18){  //if的快捷键 ifn
            System.out.println("kjsn");


        }
        ArrayList<String>strings = new ArrayList<>(); //快捷键 alt+enter
        strings.add("哈哈哈");
        strings.add("哈哈哈");
        strings.add("哈哈哈"); // ctrl + d 快捷复制 ； Ctrl + y 快速删除
        //ctrl + z 一步撤回  ，ctrl + shift +z 多部撤回
        for (String string : strings) { //iter
            System.out.println("string = "+string);

        }
        Bb b1 = new Bb();
        b1.setPrice(5555.0D);
        b1.setColor("黑色");
        b1.setTypeName("黑衣人");
        System.out.println("b1 = "+b1);//

        Bb b2 = new Bb();
        b2.setPrice(5555.0D);
        b2.setColor("黑色");
        b2.setTypeName("黑衣人");
        System.out.println("b2 = "+b2);//

        System.out.println(b1 == b2); //false

        phone p1 = phone.getInstance();
        phone p2 =  phone.getInstance();
        System.out.println(p1 == p2);//true
    }
}