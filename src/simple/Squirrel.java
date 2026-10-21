package simple;

import java.util.Random;

public class Squirrel implements Creature {
    private String name;
    private int health;
    private boolean acornIsInvolved;

    Squirrel(String name){
        this.name = name;
        this.health = 40;
        this.acornIsInvolved = false;
    }


    public int attack(){
        Random r = new Random();
        if (isAcornInvolved()){
            return 12;
        }
        return r.nextInt(7);
    }

    public String meet(){
        StringBuilder s = new StringBuilder("You are walking and ");
        if (isAcornInvolved()){
            s.append("an acorn falls directly in front of you.");
        } else s.append("a small squirrel appears in front of you.");
        s.append("The squirrel stares at you with deep, thoughtless eyes.");
        return s.toString();
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    public int getHealth(){
        if (health < 0) {
            health = 0;
            return health;
        } else return health;
    }

    public String getName(){
        return name;
    }

    private boolean isAcornInvolved(){
        Random r = new Random();
        acornIsInvolved = r.nextBoolean();
        return acornIsInvolved;
    }
}

