package com.github.ynfeng.designpatterns.prototype;

public class Application {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.height = 100;
        rectangle.width = 120;
        rectangle.x = 10;
        rectangle.y = 20;
        rectangle.color = 255;
        Shape newRectangle = rectangle.clone();
        System.out.println(newRectangle.color);

        Circle circle = new Circle();
        circle.radius = 10;
        circle.color = 0;
        circle.x = 0;
        circle.y = 0;
        circle.clone();
        Shape newCircle = circle.clone();
        System.out.println(newCircle.color);
    }
}
