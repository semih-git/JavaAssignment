package Shape;

public class Square extends Shape{

    public Square(int boyut1) {
        super(boyut1);
    }

    @Override
    public void draw() {
        System.out.println("drawing a square...");
    }

    @Override
    public void erase() {
        System.out.println("a square is erased...");
    }

    @Override
    public double calculateArea() {
        return boyut1*boyut1;
    }

    @Override
    public double calculateCircumference() {
        return 4*boyut1;
    }
}
