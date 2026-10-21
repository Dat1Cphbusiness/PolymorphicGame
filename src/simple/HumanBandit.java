package simple;

public class HumanBandit implements Creature{
    private String name;
    private int health;

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public String meet() {
        return "spots a abandoned camp. As you investigate the camp, some bushes rattle..." +
                "\n" + "";
    }

    @Override
    public void takeDamage(int damage) {

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
