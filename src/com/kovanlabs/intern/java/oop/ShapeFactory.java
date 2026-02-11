package com.kovanlabs.intern.java.oop;

public class ShapeFactory {
    public static void main(String[] args){
        Shape[] shapes = {new Circle(2),new Square(4), new Circle(7)};
        double totalArea=0;
        for(Shape shape : shapes){
            totalArea+=shape.area();
        }
        System.out.println(totalArea);
    }
}
abstract class Shape{
    abstract double area();
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius;
    }
}

class Square extends Shape{
    double side;
    Square(double side){
        this.side = side;
    }
    @Override
    double area(){
        return side*side;
    }
}
