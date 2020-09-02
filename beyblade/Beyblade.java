package beyblade;

public class Beyblade {
    //fields
    private String beybladeName;
    private int rotationSpeed;
    private int attackPower;
    //constructor

    public Beyblade(String beybladeName, int rotationSpeed, int attackPower) {
        this.beybladeName = beybladeName;
        this.rotationSpeed = rotationSpeed;
        this.attackPower = attackPower;
    }
    public void attack(){
        System.out.println(beybladeName+" "+"attackPower       :"+attackPower+" rotationSpeed: "+
                rotationSpeed+" with attack..");
    }
    public void showInfo(){
        System.out.println("beyblade name           :"+beybladeName);
        System.out.println("beyblade rotation speed :"+rotationSpeed);
        System.out.println("beyblade attack power   :"+attackPower);
    }

    public String getBeybladeName() {
        return beybladeName;
    }
}
