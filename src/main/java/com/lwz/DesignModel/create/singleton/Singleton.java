package com.lwz.DesignModel.create.singleton;

/**
 * @program: springboot_demo
 * @description: 饿汉式单例模式
 * @author: Linweizhe
 * @create: 2019-12-10 22:56
 **/
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {

    }

    private static Singleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
