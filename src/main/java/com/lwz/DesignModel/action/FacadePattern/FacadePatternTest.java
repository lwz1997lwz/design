package com.lwz.DesignModel.action.FacadePattern;

/**
 * @program: springboot_demo
 * @description: 外观模式测试类
 * 意图：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * 主要解决：降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口。
 * 种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。
 *
 * https://www.runoob.com/design-pattern/facade-pattern.html
 * @author: Linweizhe
 * @create: 2020-01-19 15:56
 **/
public class FacadePatternTest {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
