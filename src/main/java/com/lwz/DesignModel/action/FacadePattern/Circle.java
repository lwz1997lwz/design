package com.lwz.DesignModel.action.FacadePattern;

/**
 * @program: springboot_demo
 * @description:
 * @author: Linweizhe
 * @create: 2020-01-19 16:29
 **/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("this is circle");
    }
}
