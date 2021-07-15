package com;

import java.util.LinkedList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println("list:"+list);
        String e = list.get(1);
        System.out.println("第二个元素:"+e);
        //设置集合第三个元素
        list.set(2, "3");
        System.out.println("list:"+list);
        //将元素"2"设置到第二个位置上
        list.add(1,"2");
        System.out.println("list:"+list);


    }

}
