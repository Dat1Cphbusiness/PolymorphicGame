package simple;

import java.util.Random;

public class HumanBandit implements Creature{
    private String name;
    private int health;

    public HumanBandit(String name) {
        this.health = 20;
        this.name = name;
    }

    @Override
    public int attack() {
        Random random = new Random();
        if (health < 10) {
            return random.nextInt(12) + 1;
        } else {
            return random.nextInt(7) + 1;
        }
    }

    @Override
    public String meet() {
        return "spots a abandoned camp. As you investigate the camp, some bushes rattle..." +
                "\n" + "A human bandit jumps out of the bush, with a word drawn";
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
