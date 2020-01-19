package com.lwz.DesignModel.action.FacadePattern;

/**
 * @program: springboot_demo
 * @description: 创建一个外观类，用于隐藏系统内部接口的复杂性
 * @author: Linweizhe
 * @create: 2020-01-19 16:30
 **/
public class ShapeMaker {
    private Circle circle;
    private Rectangle rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }
    void drawCircle() {
        circle.draw();
    }

    void drawRectangle() {
        rectangle.draw();
    }

}
