package simple;

public final class Shrek implements Creature {
    private final String name;
    private int health;
    private boolean inSwamp;

    public Shrek(String name) {
        this.name = name;
        this.health = 8;
        this.inSwamp = true;
    }

    @Override
    public int attack() {
        if (this.inSwamp) {
            return 5;
        }
        return 2;
    }

    @Override
    public String meet() {
        if (this.inSwamp) {
            return "suddenly you see Shrek emerging from the depths of his swamp.";
        }
        return "you see Shrek walking slowly towards you.";
    }

    @Override
    public void takeDamage(int amount) {
        this.health -= amount;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setInSwamp(boolean inSwamp) {
        this.inSwamp = inSwamp;
    }
}
