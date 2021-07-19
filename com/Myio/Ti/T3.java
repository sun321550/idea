
package com.Myio.Ti;

import java.text.SimpleDateFormat;
import java.util.Date;


public class T3 {

    public static void main(String[] args) {

        Thread thread = new MyThread();
        thread.start();

    }

}


// 通过继承Thread类 来重写run方法
class MyThread extends Thread {

    //通过正则式来设置输出的时间格式
    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");

    //重写run()方法
    public void run() {
        while (true) {
            String str = s.format(new Date());
            System.out.println(str);
            try {
                //间隔时间1秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}