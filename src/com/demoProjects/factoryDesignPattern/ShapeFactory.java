package com.demoProjects.factoryDesignPattern;

public class ShapeFactory {
    public Shape getShape(String shapeName) {
        switch (shapeName) {
            case "FactoryDesignPattern.Circle" :
                return new Circle();
            case "FactoryDesignPattern.Rectangle" :
                return new Rectangle();
            case "FactoryDesignPattern.Square" :
                return new Square();
        }
        return null;
    }
}
