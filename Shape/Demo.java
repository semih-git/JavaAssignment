package Shape;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Shape machine working...");
            System.out.println("Exit for Q: ");
            System.out.println("Which Shape do you want to produce? [Circle/Rectangle/Square/Triangle]");
            String option = scanner.nextLine();
            if(option.equalsIgnoreCase("q")){
                System.out.println("Thank you, by by...");
                break;
            }else{
                Shape shape = ShapeFactory.produceShape(option);
                if(shape==null){
                    System.out.println("please write a valid shape name: ");
                }else{
                    shape.draw();
                    shape.erase();
                    System.out.println("calculateArea: "+shape.calculateArea());
                    System.out.println("calculateCircumference: "+shape.calculateCircumference());
                    System.out.println("%%%%%%%%%%%%%%%%");
                }
            }
        }
    }
}
