package com.Myio;

import java.io.File;
import java.io.IOException;

/**
 * file 文件
 * File 你真行 可读可写可执行
 */
public class IoLiu {
    public static void main(String[] args) throws IOException {
        File file = new File("io01.txt");
        System.out.println("file = " + file);
        String name = file.getName();
        System.out.println("name = " + name);
        long length = file.length();
        System.out.println("length = " + length);
        try {
            boolean newFile = file.createNewFile();
            System.out.println("newFile = " + newFile);
        } catch (IOException e) {

            System.out.println("不能创建新文件");
            e.printStackTrace();
        }
        //查看文件是否存在 一定更要有这个代码，不然文件会覆盖
        boolean exists = file.exists();
        if (exists) {
            System.out.println("文件已存在 boilean 值= " + exists);


        } else {
            System.out.println("文件不存在 boolean 值= " + exists);
            boolean create = file.createNewFile();
            System.out.println("文件创建成功 " + create);

        }
        boolean isFile = file.isFile();
        System.out.println("是否是文件 = " + isFile);
        boolean isDirectory = file.isDirectory();
        System.out.println("是否是目录 = " + isDirectory);
        boolean hidden = file.isDirectory();
        System.out.println("是否是隐藏文件 = " + hidden);


        System.out.println("file = " + file);
        name = file.getName();
        System.out.println("name = " + name);
        length = file.length();
        System.out.println("length = " + length);

    }
    }


