package OdevDemo;

import java.util.ArrayList;

public class Candidate  extends Person{
    String talent;

    @Override
    public String toString() {
        return ("+---------- CANDIDATE ----------+"
                +"\nName:........."+name
                +"\nSurname:......"+surname
                +"\nAddress:......"+address
                +"\ntalent:......."+talent);
    }
    public Candidate(String name, String surname, String address, String talent) {
        super(name, surname, address);
        this.talent = talent;
    }
    public boolean hasTalent(String talent){
        if (this.talent.equals(talent)){
            return true;
        }else{
            return false;
        }
    }
}
