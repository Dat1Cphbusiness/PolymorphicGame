package simple;

import java.util.Random;

public class Dwarf implements Creature {
    int health;
    String name;
    int thickSkin = 1;

    public Dwarf(String name) {
        this.health = 25;
        this.name = name;
    }

    @Override
    public int attack() {
        Random random = new Random();
        return random.nextInt(5, 10);
    }

    @Override
    public String meet() {
        return "A tiny hairy creature approaches, ITS A DWARF!";
    }

    @Override
    public void takeDamage(int damage) {
        health = damage - thickSkin;

    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

