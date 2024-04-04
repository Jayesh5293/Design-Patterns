
public class ShapeFactory {
    public Shape getShape(String shapeName) {
        switch (shapeName) {
            case "Circle" :
                return new Circle();
            case "Rectangle" :
                return new Rectangle();
            case "Square" :
                return new Square();
        }
        return null;
    }
}
