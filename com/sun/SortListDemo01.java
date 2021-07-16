package com.sun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序集合 对集合进行自然排序（从小到大）
 * 他只能对list 排序 对set 不可以 因为set是 无序的
 */


public class SortListDemo01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(30);
        list.add(60);
        list.add(20);
        list.add(10);
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);

        //c纯字符串
        List<String> list1 = new ArrayList<>();
        list1.add("戴拿");
        list1.add("煎饼侠");
        list1.add("钢铁侠");
        list1.add("蜘蛛侠");
        list1.add("雷欧");
        list1.add("赛罗");
        list1.add("迪迦");

        //System.out.println("list1 = " + list1);
       // Collections.sort(list1);
        //System.out.println("list1 = " + list1);

        //对象的排序（应用的地方广）
        Person p1 = new Person();
        p1.setName("戴拿");
        p1.setHeight(400);
        p1.setAge(60);
        Person p2 = new Person();
        p2.setName("赛罗");
        p2.setHeight(600);
        p2.setAge(20);
        Person p3 = new Person();
        p3.setName("雷欧");
        p3.setHeight(110);
        p3.setAge(10);
        Person p4 = new Person();
        p4.setName("诸葛亮");
        p4.setHeight(320);
        p4.setAge(30);
        Person p5 = new Person();
        p5.setName("大郎");
        p5.setHeight(550);
        p5.setAge(50);
    List<Person>personList = new ArrayList<Person>();
    personList.add(p1);
    personList.add(p2);
    personList.add(p3);
    personList.add(p4);
    personList.add(p5);

        System.out.println("personList = " + personList);
    Collections.sort(personList);
        System.out.println("personList = " + personList);


    }
}
