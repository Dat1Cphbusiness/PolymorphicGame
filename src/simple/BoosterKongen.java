package simple;

public class BoosterKongen implements Creature {

    int health;
    String name;


    public BoosterKongen(String name) {
        this.health = 20;
        this.name = name;
    }

    public boolean isJustCracked() {
        return health<=20;
    }

    @Override
    public int attack() {
        if (isJustCracked()) {
            return 10;
        } else {
            return 5;
        }
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
    public String meet() {
        return "the can cracks open and the living liquid begins flowing out";
    }
}
