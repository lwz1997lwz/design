package com.lwz.DesignModel.create.singleton;

/**
 * @program: springboot_demo
 * @description: 饿汉式单例模式 静态代码块初始化
 * @author: Linweizhe
 * @create: 2019-12-10 23:02
 **/
public class SingletonTest2 {
    private static final SingletonTest2 instance;

    static {
        instance = new SingletonTest2();
    }

    private SingletonTest2() {

    }

    private static SingletonTest2 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonTest2 instance1 = SingletonTest2.getInstance();
        SingletonTest2 instance2 = SingletonTest2.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
