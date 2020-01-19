package com.lwz.DesignModel.action.FacadePattern;

/**
 * @program: springboot_demo
 * @description:
 * @author: Linweizhe
 * @create: 2020-01-19 16:30
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("this is rectangle");
    }

}
