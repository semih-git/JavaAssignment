package beyblade;

import java.util.Scanner;

public class DemoBeyblade {
    public static void main(String[] args) {
        System.out.println("Beyblade machine working...");
        System.out.println("exit for q: ");
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Which beyblade do you want to produce? (Dragon-Draciel-Dranzer-Drayga): ");
            String option = scanner.nextLine();

            if (option.equals("q")){
                System.out.println("Thank you.. by by..");
                break;
            }else{
                Beyblade beyblade = BeybladeFactory.produceBeyblade(option);
                if(beyblade==null){
                    System.out.println("please write a valid beyblade name: ");
                }else{
                    beyblade.showInfo();
                    beyblade.attack();
                    System.out.println("----------");
                }
            }
        }
    }
}
