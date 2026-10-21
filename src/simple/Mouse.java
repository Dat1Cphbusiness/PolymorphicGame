package simple;

public class Mouse implements Creature{

    private String name;
    private int health;


    public Mouse(String name) {
        this.name = name;
        setHealth(10);
    }

    public int attack() {

        return 2;
    }

    @Override
    public String meet() {
        return "a little mouse is running towards you";
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    public void setHealth(int health){
        this.health = health;
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
