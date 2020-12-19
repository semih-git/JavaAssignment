package Shape;

public abstract class Shape {
    //abstract class field lari
    int boyut1;
    int boyut2;
    int height;
    //constructors (uc,iki ve bir parametre alabilen)
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
    //abstract class a ait abstract metodlar (bu class i extend eden class larin bu metodlari @override etmesi sart.)
    public abstract void draw();
    public abstract void erase();
    public abstract double calculateArea();
    public abstract double calculateCircumference();
}
