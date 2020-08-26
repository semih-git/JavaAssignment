package OdevDemo;

public class Employee  extends Candidate{
    String department;

    public Employee(String name, String surname, String address, String talent, String department){
        super(name, surname, address, talent);
        this.department = department;
    }
    @Override
    public String toString() {
        return ("+---------- EMPLOYEE ----------+"
                +"\nName:........."+name
                +"\nSurname:......"+surname
                +"\nAddress:......"+address
                +"\ntalent:......."+talent
                +"\ndepartment:..."+department);
    }
}
