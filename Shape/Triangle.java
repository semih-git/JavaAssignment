package Shape;

public class Triangle extends Shape{

    public Triangle(int boyut1, int boyut2, int height) {
        super(boyut1, boyut2, height);
    }

    @Override
    public void draw() {
        System.out.println("drawing a triangle...");
    }

    @Override
    public void erase() {
        System.out.println("a triangle is erased...");
    }

    @Override
    public double calculateArea() {
        return (double)(boyut1*height/2);
    }

    @Override
    public double calculateCircumference() {
        return boyut1+boyut2+height;
    }
}
