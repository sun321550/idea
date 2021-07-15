package com;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
public class Test2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("1");
        c.add("$");
        c.add("2");
        c.add("$");
        c.add("3");
        c.add("$");
        c.add("4");
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String str = it.next();
            if("$".equals(str)){
                it.remove();
            }
        }
        for(String str : c){
            System.out.println(str);
        }
    }


}
