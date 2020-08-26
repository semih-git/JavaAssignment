package OdevDemo;

public class Person {
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
        return ("+------ PERSON ------+"
                +"\nName:........."+name
                +"\nSurname:......"+surname
                +"\nAddress:......"+address);
    }
}


