package simple;

import java.util.Random;

public class Orc implements Creature{
    private String name;
    private int health;

    public Orc(String name) {
        this.name = name;
        this.health = 1;
    }

    @Override
    public int attack() {
        Random r = new Random();
        if (r.nextInt() % 2 == 0) {
            return 9;
        }
        return 2;
    }

    @Override
    public String meet() {
        return "You met a big scary orc :)";
    }

    @Override
    public void takeDamage(int damage) {
        Random r = new Random();
        if (r.nextInt() % 2 == 0) {
            health -= damage/2;
            return;
        }
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
