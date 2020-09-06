package Shape;

public class Rectangle extends Shape{

    public Rectangle(int boyut1, int boyut2) {
        super(boyut1, boyut2);
    }

    @Override
    public void draw() {
        System.out.println("drawing a rectangle...");
    }

    @Override
    public void erase() {
        System.out.println("a rectangle is erased...");
    }

    @Override
    public double calculateArea() {
        return boyut1*boyut2;
    }

    @Override
    public double calculateCircumference() {
        return 2*(boyut1+boyut2);
    }
}
