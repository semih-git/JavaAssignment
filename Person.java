
/*
Java Assignment II
Implement a data entry system from command line:
You should have three classes:
Person: Has name (String), surname(String), address(String) attributes and
toString method that prints information like below:
    Name:......Coding
    Surname:...Book
    Address:...USA
Candidate: Will inherit from Person class. Will have attribute talent((String array) and
a hasTalent method that takes a String parameter and returns true if that candidate has the talent otherwise false.
This class should overwrite toString method of her parent

Employee: Will inherit from Candidate class, it will have just one attribute called department (String)

Your program will have below features (you will decide how those works):
1-Add Candidate
2-Add Employee
3-Add Employee from candidate
4-Search candidate for talent
5-Print (will print everyone, use polymorphism here)

 */

import java.util.Scanner;

public class Person {
    //Attributes
    String name;
    String surname;
    String address;
    //Constructor
    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }
    //toString Metod
    @Override
    public String toString(){
        return ("Name:......"+name+"  "
                +"\nSurname:..."+surname+"  "
                +"\nAddress:..."+address);
    }
}

class Candidate extends Person{
    String talent;

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", talent='" + talent + '\'' +
                '}';
    }

    //    @Override
//    public String toString(){
//        return super.toString() + "\ntalent:...." + talent;
//    }

    public Candidate(String name, String surname, String address, String talent) {
        super(name, surname, address);
        this.talent = talent;
    }
    public boolean hasTalent(String talents){
        if (this.talent.equals(talents)){
            return true;
        }else{
            return false;
        }
//        return this.talent.equals(talents)
    }
}

class Employee extends Candidate {
    String deparment;

    public Employee(String name, String surname, String address, String talent, String deparment){
        super(name, surname, address, talent);
        this.deparment = deparment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", talent='" + talent + '\'' +
                ", deparment='" + deparment + '\'' +
                '}';
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person p1 = new Person("ali","veli","usa");
        Candidate c1 = new Candidate("ahmet","kaya","eu","usta");
        Employee e1 = new Employee("kim","koc","eu","cirak","ofis");
        Person  p3 = new Candidate("ali","riza","tr","kalfa");
        System.out.println(p1);
        System.out.println();
        System.out.println(c1);
        System.out.println(e1);
        System.out.println(p3);

    }


}


