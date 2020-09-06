package Shape;

public class Circle extends Shape{

    public Circle(int boyut1) {
        super(boyut1);
    }

    @Override
    public void draw() {
        System.out.println("drawing a circle...");
    }

    @Override
    public void erase() {
        System.out.println("a circle is erased...");
    }

    @Override
    public double calculateArea() {
        return Math.PI*boyut1*boyut1;
    }

    @Override
    public double calculateCircumference() {
        return 2*Math.PI*boyut1;
    }
}
