package simple;

public class Tiger implements Creature {

    private int health;
    private String name;
    private boolean isMad;

    public Tiger(String name) {
        this.health = 10;
        this.name = name;
    }

    @Override
    public int attack() {
        if (isMad)
            return 6;
        else
            return 4;
    }

    public void takeDamage(int damage) {
        if (isMad)
            health -= damage - 2;
        else
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
        return "a tiger is running up on you";
    }
}
