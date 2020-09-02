package beyblade;

public class Dragon extends Beyblade{
    private String secretMonster;
    private String secretAbility;

    public Dragon(String beybladeName, int rotationSpeed, int attackPower, String secretMonster, String secretAbility) {
        super(beybladeName, rotationSpeed, attackPower);
        this.secretMonster = secretMonster;
        this.secretAbility = secretAbility;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("secret monster name     :"+secretMonster);
    }
}
