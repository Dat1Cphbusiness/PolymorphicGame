package simple;

public class Centaur implements Creature{

    int health;
    String name;

    public Centaur (String name) {
        this.health = 50;
        this.name = name;
    }


    @Override
    public int attack() {
        return 35;
    }

    @Override
    public String meet() {
        return "from the shadows of the ancient canopy, a thundering cadence of heavy hooves shakes the forest floor";
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
