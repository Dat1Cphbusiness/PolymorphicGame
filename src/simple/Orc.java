package simple;

public class Orc implements Creature {
    private String name;
    private int health;
    private boolean lowHealth;

    public Orc(String name) {
        this.name = name;
        this.health = 10;
        this.lowHealth = false;
    }

    public int attack() {
        if (lowHealth) {
            return 6;
        } else {
            return 3;
        }
    }

    public void takeDamage(int damage) {
        if (lowHealth) {
            damage /= 2;
        }
        health -= damage;
        lowHealth = isLowHealth();
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String meet() {
        return "you hear a loud roar and a giant orc comes charging towards you";
    }

    private boolean isLowHealth() {
        if (health < health / 2) {
            return true;
        }
        return false;
    }
}
