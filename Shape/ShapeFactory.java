package Shape;

public class ShapeFactory {

    public static Shape produceShape(String ShapeType) {
        switch (ShapeType) {
            case "Circle":
                return new Circle(3);
            case "Rectangle":
                return new Rectangle(3,5);
            case "Square":
                return new Square(4);
            case "Triangle":
                return new Triangle(3,4,5);
        }return null;
    }
}