package simple;

public class ZombieVillager implements Creature{

    int health;
    String name;

    public ZombieVillager(int health, String name){
        this.health = 45;
        this.name = name;
    }

    @Override
    public int attack(){
        return (int) ((Math.random() * 11) + 10);
    }

    @Override
    public String meet(){
        return "You encounter a zombie villager.";
    }

    @Override
    public void takeDamage(int damage){
        health -= damage;
    }

    @Override
    public int getHealth(){
        return health;
    }

    @Override
    public String getName(){
        return name;
    }

}
