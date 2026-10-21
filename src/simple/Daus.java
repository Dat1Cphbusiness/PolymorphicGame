package simple;

public class Daus implements Creature {
    int health;
    String name;


    public Daus(String name) {
        this.health = 1000;
        this.name = name;
    }

    @Override
    public int attack() {
        return 20;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String meet() {
        return "Ved første møde og frem, skal du forberede dig på det værste!";
    }
}