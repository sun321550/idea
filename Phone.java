package com.hp.a;

/**555
 * 标准的单例模式
 * String 框架默认 单例模式
 */
public class phone {

    private static phone ourInstance = new phone();

    public static phone getInstance() {
        return ourInstance;
    }

    private phone() {
    }
}
