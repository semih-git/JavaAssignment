package OdevDemo;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);

    public void start(){
        while(true){
            menu();
            int choice = Integer.valueOf(scanner.nextLine());
         //   scanner.nextLine(); // enter i yakalmasi icin bunu ekledim.
            if(choice==1){
                addCandidate();
            }else if(choice==2){
                addEmployee();
            }else if(choice==3){
                addEmployeeFromCandidate();
            }else if(choice==4){
                enterForTalent();
            }else if(choice==5){
                Database.showCandidate();
            }else if(choice==6){
                Database.showEmployee();
            }else if(choice==7){
                Database.showPerson();
            }else if(choice==8){
                System.out.println(".....g o o d b y e.....");
                break;
            }else{
                System.out.println(">>>You entered an incorrect value. Please enter a value between 1-8: ");
            }
        }
    }
    public void menu(){
        System.out.println("%%%%%%%%%%%%%%% W E L C O M E to Human Resources %%%%%%%%%%%%%%%");
        System.out.println("[1] - Add Candidate");
        System.out.println("[2] - Add Employee");
        System.out.println("[3] - Add Employee from candidate");
        System.out.println("[4] - Search candidate for talent");
        System.out.println("[5] - Show candidate");
        System.out.println("[6] - Show employee");
        System.out.println("[7] - Show All person");
        System.out.println("[8] - Quit");
        System.out.print(">>>Enter your choice (1-8): ");
    }
    public void addPerson(){
        System.out.println("name enter: ");
        String name = scanner.nextLine();
        System.out.println("surname enter: ");
        String surname = scanner.nextLine();
        System.out.println("address enter: ");
        String address = scanner.nextLine();
        Person p11 = new Person(name,surname,address);
        System.out.println(p11.toString());
    }
    public void addCandidate(){
        System.out.print("New Candidate name enter: ");
        String name = scanner.nextLine();
        System.out.print("New Candidate surname enter: ");
        String surname = scanner.nextLine();
        System.out.print("New Candidate address enter: ");
        String address = scanner.nextLine();
        System.out.print("New Candidate talent enter: ");
        String talent = scanner.nextLine();
        Candidate c11 = new Candidate(name,surname,address,talent);
        Database.addCandidate(c11);
        System.out.println(c11.toString());
    }
    public void addEmployee(){
        System.out.print("New Employee name enter: ");
        String name = scanner.nextLine();
        System.out.print("New Employee surname enter: ");
        String surname = scanner.nextLine();
        System.out.print("New Employee address enter: ");
        String address = scanner.nextLine();
        System.out.print("New Employee talent enter: ");
        String talent = scanner.nextLine();
        System.out.print("New Employee department enter: ");
        String department = scanner.nextLine();
        Employee e11 = new Employee(name,surname,address,talent,department);
        Database.addEmployee(e11);
        System.out.println(e11.toString());
    }
    public void addEmployeeFromCandidate(){
        System.out.print("Candidate name enter: ");
        String name = scanner.nextLine();
        Candidate candidate = findCandidate(name);
    }

    public Candidate findCandidate(String name){
        return Database.searchCandidate(name);
    }
    public void enterForTalent(){
        System.out.print(">>>Wanted talent enter: ");
        String talent = scanner.nextLine();
        Candidate wantedTalent = findTalent(talent);
    }

    public Candidate findTalent(String talent){
        return Database.searchCandidateForTalent(talent);
    }
}
