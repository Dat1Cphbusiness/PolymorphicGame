package simple;

import java.util.Random;

public class Goblin implements Creature{

    private String name;
    private int health;
    private final Random random = new Random();

    public Goblin (String name) {
        this.name = name;
        this.health = 3;
    }

    @Override
    public String meet () {
        return "a goblin has jumped out from behind a rock ready for an ambush GET READY";
    }

    public int getHealth () {
        return health;
    }

    @Override
    public int attack () {
        return random.nextInt(2) + 1;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public String getName() {
        return name;
    }
}

