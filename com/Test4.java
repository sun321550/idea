package com;
import java.util.ArrayList;
import java.util.List;
public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println("list:"+list);
        //获取子集
        List<Integer> subList = list.subList(3, 7);
        for(int i=0;i<subList.size();i++){
            subList.set(i, subList.get(i)*10);
        }
        System.out.println("list:"+list);
        //删除7-9
        list.subList(7, 10).clear();
        System.out.println("list:"+list);
    }


}
