package simple;

import java.util.Random;

public class SpuderMan implements Creature {
    private final Random random = new Random();
    private final String name;
    private int health;

    public SpuderMan(String name) {
        this.name = name;
        this.health = 100;
    }


    @Override
    public int attack() {
        return random.nextInt(4) + 1;
    }

    @Override
    public String meet() {
        return "a guy in a skin tight red suit swings in, misses the landing and crashes into a trash can.";
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getName() {
        return name;
    }
}