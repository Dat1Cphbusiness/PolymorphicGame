package simple;

import java.util.Random;

public class Demon implements Creature {
    private int health;
    private String name;

    public Demon(String name) {
        this.health = 200;
        this.name = name;
    }

    @Override
    public int attack() {
        Random r = new Random();
        return r.nextInt(10) + 1;
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

    public String meet() {
        return "emerges from the dark hole and drags you into the underworld!";
    }
}
