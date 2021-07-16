package com.Myio;

import java.io.File;
import java.io.FileFilter;
/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 *
 *
 */
public class Text5 {
    public static void main(String[] args) {
        File dir = new File(".");
        File []subs = dir.listFiles(new FileFilter(){
            public boolean accept(File file) {
                return file.isFile();
            }

        });
        for(File sub : subs){
            System.out.println("文件:"+sub.getName());
        }
    }


}
