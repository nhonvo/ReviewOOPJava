package Chuong8_Generic;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("ve hinh chu nhat.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("ve hinh tron.");
    }
}

public class GenericTest5 {
    // tao phuong thuc chi chap nhan tham so la lop con cua Shape
    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();
            // đoi tuong s thuc hien phuong thuc draw()cua lop con
        }
    }

    public static void main(String args[]) {
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());
        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());
        drawShapes(list1);
        drawShapes(list2);
    }
}