package Shape;

public abstract class Shape {

    int boyut1;
    int boyut2;
    int height;

    public Shape(int boyut1, int boyut2, int height) {
        this.boyut1 = boyut1;
        this.boyut2 = boyut2;
        this.height = height;
    }

    public Shape(int boyut1, int boyut2) {
        this.boyut1 = boyut1;
        this.boyut2 = boyut2;
    }

    public Shape(int boyut1) {
        this.boyut1 = boyut1;
    }

    public abstract void draw();
    public abstract void erase();
    public abstract double calculateArea();
    public abstract double calculateCircumference();
}
