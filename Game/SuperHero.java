package Game;

import java.util.Random;

public class SuperHero {
    private String name;
    private int health;
    private boolean dead;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public SuperHero(String name) {
        this.name = name;
        this.health = 100;
        this.dead =false;
        System.out.println(this.name+" is created.. Health state "+this.health+" ");


    }
    public void attack (SuperHero rakip){
        Random randomGenerator = new Random();
        int damage = randomGenerator.nextInt(11);
        rakip.stateOfHealth(damage);

        System.out.print(this.getName()+" attack.("+damage+") --> " +
                rakip.getName()+ "'s remaining health "+rakip.getHealth()+" ");
        rakip.repeat(health);
        System.out.println();

    }
    public void stateOfHealth(int damage){
        if(this.health-damage<=0){
            this.health = 0;
            this.dead = true;
        }else{
            this.health = this.health - damage;
        }
    }
    public void repeat(int health){
        for (int i = 0; i <=health ; i++) {
            System.out.print("*");
            i++;
        }
    }
}
