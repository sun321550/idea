package com.Myio;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Text1 {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        String name = file.getName();
        System.out.println("名字:"+name);

        long length = file.length();
        System.out.println("大小:"+length+"字节");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lastModified = file.lastModified();
        System.out.println("最后修改时间:"+sdf.format(new Date(lastModified)));
    }
}
