package OdevDemo;

import java.util.ArrayList;

public class Database {
    static ArrayList<Candidate> candidateList = new ArrayList<>();
    static ArrayList<Person> personList = new ArrayList<>();
    static ArrayList<Employee> employeeList = new ArrayList<>();

    public static void addCandidate(Candidate candidate) {
        candidateList.add(candidate);
        personList.add(candidate);
    }
    public static void showCandidate() {
        for (Candidate candidate : candidateList) {
            System.out.println(candidate);
        }
    }
    public static void addPerson(Person person) {
        personList.add(person);
    }
    public static void showPerson() {
        for (Person person : personList) {
            System.out.println(person);
        }
    }
    public static void addEmployee(Employee employee) {
        employeeList.add(employee);
        personList.add(employee);
    }
    public static void showEmployee(){
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
    public static Candidate searchCandidate(String name) {
        Candidate returnedCandidate = null;
        for (Candidate candidate : candidateList) {
            if (candidate.name.equals(name)) {
                returnedCandidate = candidate;
                addEmployee(returnedCandidate);
                removeCandidate(returnedCandidate);
                break;
            }else{
                System.out.println(">>>The candidate could not be found. Please check the name.");
            }
        }
        return returnedCandidate;
    }
    public static void removeCandidate(Candidate returnedCandidate){
        candidateList.remove(returnedCandidate);
    }
    public static void addEmployee(Candidate candidate) {
        Employee newEmployee = new Employee(candidate.name, candidate.surname,candidate.address,candidate.talent,"Production");
        employeeList.add(newEmployee);
        System.out.println(">>>candidate successfully added to the employee class.....");
    }
    public static Candidate searchCandidateForTalent(String talent) {
        Candidate returnedTalent =null;
        for (Candidate candidate : candidateList) {
            if (candidate.talent.equals(talent)) {
                returnedTalent= candidate;
                System.out.println(returnedTalent);
            }else{
                System.out.println(">>>Talent not found.");
            }
        }return returnedTalent;
    }
}
