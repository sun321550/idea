package com;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<String>();
        c1.add("one");c1.add("two");c1.add("three");
        System.out.println("c1:"+c1);
        Collection<String> c2 = new ArrayList<String>();
        c2.add("four");c2.add("five");c2.add("six");
        System.out.println("c2:"+c2);
        //c2元素存入c1
        c1.addAll(c2);
        System.out.println("已将c2元素全部存入c1");
        System.out.println("c1:"+c1);

        Collection<String> c3 = new ArrayList<String>();
        c3.add("one");c3.add("five");
        System.out.println("c1是否包含c3所有元素:"+c1.containsAll(c3));

        //删除c1中的two
        c1.remove("two");
        System.out.println("删除了c1集合中的元素two");
        System.out.println(c1);
    }
}



