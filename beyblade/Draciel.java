package beyblade;

public class Draciel extends Beyblade{
    private String secretMonster;

    public Draciel(String beybladeName, int rotationSpeed, int attackPower, String secretMonster) {
        super(beybladeName, rotationSpeed, attackPower);
        this.secretMonster = secretMonster;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("secret monster name     :"+secretMonster);
    }
}
