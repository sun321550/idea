package com.Myio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要创建的文件的名字:");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        if(!file.exists()){
            file.createNewFile();
        }else{
            int index = 1;
            //文件名
            String name = fileName.substring(0, fileName.indexOf("."));
            //后缀
            String postfix = fileName.substring(fileName.indexOf(".")+1);
            while(true){
                //修改文件名，添加"副本<编号>"内容
                fileName = name+"_副本"+index+"."+postfix;
                //打桩查看生成的新文件名
                System.out.println(fileName);
                //创建File表示该文件
                file = new File(fileName);
                //若不存在就创建，并停止循环，否则继续判断
                if(!file.exists()){
                    file.createNewFile();
                    break;
                }
                index++;
            }
        }

        System.out.println("文件创建完毕!");
    }


}
