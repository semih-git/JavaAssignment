package Geometry;

public class Geometry {
    private Geometry(){}

    public static double getCircleArea(double radius){
        if(radius<0){
            System.out.println("yaricap negatif deger alamaz..");
            return -1;
        }
        return Math.PI*radius*radius;
    }
    public static double getRectangleArea(double length, double width){
        if(length<0 || width<0){
            System.out.println("uzunluk ve genislik negatif olamaz..");
            return -1;
        }
        return length*width;
    }
    public static double getTriangArea(double base, double height){
        if(base<0||height<0){
            System.out.println("taban veya yukseklik negatif olamaz..");
            return -1;
        }
        return base*height*0.5;
    }

}
