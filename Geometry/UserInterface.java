package Geometry;

import Geometry.Geometry;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);

    public void start(){

        while(true){
            menu();
            int choice = scanner.nextInt();

            if(choice==1){
               calculateCircle();
            }else if(choice==2){
                calculateRectangle();
            }else if(choice==3){
                calculateTriangle();
            }else if(choice==4){
                System.out.println("...HOSCAKALIN...");
                break;
            }else{
                System.out.println("yanlis bir deger girdiniz. Lutfen 1-4 arasinda bir deger girin: ");
            }
        }
    }

    public void menu(){
        System.out.println("=== Geometry Calculator ===");
        System.out.println("===H=O=S=G=E=L=D=I=N=I=Z===");
        System.out.println("[1] - Calculate the area of a Circle");
        System.out.println("[2] - Calculate the area of a Rectangle");
        System.out.println("[3] - Calculate the area of a Triangle");
        System.out.println("[4] - Quit");
        System.out.print("enter your choice (1-4): ");
    }

    public void calculateCircle(){
        System.out.print("yaricapi giriniz: ");
        double yaricap = scanner.nextDouble();
        System.out.println("cemberin alani: "+ Geometry.getCircleArea(yaricap));
    }
    public void calculateRectangle(){
        System.out.print("uzunlugu giriniz: ");
        double uzunluk = scanner.nextDouble();
        System.out.print("genisligi giriniz: ");
        double genislik = scanner.nextDouble();
        System.out.println("dikdortgenin alani: "+Geometry.getRectangleArea(uzunluk,genislik));
    }
    public void calculateTriangle(){
        System.out.print("tabani giriniz: ");
        double taban = scanner.nextDouble();
        System.out.print("yuksekligi giriniz: ");
        double yukseklik = scanner.nextDouble();
        System.out.println("ucgenin alani: "+Geometry.getTriangArea(taban,yukseklik));
    }

}
