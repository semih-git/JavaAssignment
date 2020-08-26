package OdevDemo;
/*
Java Assignment II
Implement a data entry system from command line:
You should have three classes:

Person: Has name (String), surname(String), address(String) attributes and toString method that prints information like below:
    Name:......Coding
    Surname:...Book
    Address:...USA

Candidate: Will inherit from Person class. Will have attribute talent((String array) and a hasTalent method that takes a String parameter and returns true if that candidate has the talent otherwise false.
This class should overwrite toString method of her parent

Employee: Will inherit from Candidate class, it will have just one attribute called department (String)

Your program will have below features (you will decide how those works):
1-Add Candidate
2-Add Employee
3-Add Employee from candidate
4-Search candidate for talent
5-Print (will print everyone, use polymorphism here)
 */
public class Main {
    public static void main(String[] args) {
        UserInterface UI = new UserInterface();
        UI.start();
    }
}
