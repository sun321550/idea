package com.hp.Atmmain.Uitl;

public class TextUitl {
    // welcome 的界面
    // static 修饰方法 1 可以 直接 被 类名.方法()
    // 还有 关于static 静态 代码块。 他一般适用于

    public static void welcome(){
        System.out.println("**************");
        System.out.println("先生/女士");
        System.out.println("欢迎使用ATM取款机");
        System.out.println("**************");
    }

    public static void oneLeveOption(){
        System.out.println("*****************************************");
        System.out.println("********请输入你想要的操作类型：*********");
        System.out.println("********1.余额查询        2.取款*********");
        System.out.println("********3.转账            4.存款*********");
        System.out.println("********5.退卡                  *********");
        System.out.println("*****************************************");
    }
}
