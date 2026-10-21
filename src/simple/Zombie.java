package simple;

import java.util.random.RandomGenerator;

public class Zombie implements Creature{
    int health;
    String name;

    public Zombie( String name) {
        this.health = 1000;
        this.name = name;
    }
    @Override
    public int attack() {
        return (int)(Math.random() * 11) + 10;
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
    public String meet(){
        return "from the dark forest there is a zombie emerging from the dark";
    }
}
