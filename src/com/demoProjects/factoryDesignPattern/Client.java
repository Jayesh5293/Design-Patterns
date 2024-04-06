package com.demoProjects.factoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("FactoryDesignPattern.Circle");
        System.out.println(shape.calculateArea());
    }
}
