package com.codegym;

import com.codegym.geometry.Circle;
import com.codegym.geometry.Rectangle;
import com.codegym.geometry.Square;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        double c = circle.getRadius();
        System.out.println("Hình tròn");
        System.out.println("bán kính lúc đầu: " + c);
        double percent = Math.floor(Math.random() * 100) + 1;
        System.out.println("percent: " + percent);
        circle.resize(percent);
        System.out.println("bán kính khi đc tăng kích thước: " + circle.getRadius());

        System.out.println("Hình chữ nhật");
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println("chiều dài lúc đầu " + rectangle.getLength());
        System.out.println("chiều rộng lúc đầu " + rectangle.getWidth());

        rectangle.resize(percent);
        System.out.println("Chiều dài sau khi tăng: " + rectangle.getLength());
        System.out.println("Chiều rộng sau khi tăng: " + rectangle.getWidth());

        System.out.println("Hình vuông");
        Square square = new Square(3);
        System.out.println("Kích thước lúc đầu " + square.getSide());
        square.resize(percent);
        System.out.println("Kích thước sau khi tăng " + square.getSide());
    }
}
