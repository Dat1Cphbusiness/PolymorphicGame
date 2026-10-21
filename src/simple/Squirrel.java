package simple;

import java.util.Random;

public class Squirrel implements Creature {
    private String name;
    private int health;
    private boolean acornIsInvolved;


    // return a number between 0 and 10
    // attack can depend on different things that you decide
    // it can be random, it can depend on current health, it can grow for each attack, it can always be 10 - you decide
    public int attack(){
        isAcornInvolved();
        Random r = new Random();
        if (acornIsInvolved){
            return 12;
        }
        return r.nextInt(7);
    }

    // return a String to end the sentence "You are walking and "
    // it could for example be "a giant spider emerges from the dark corner" or " a happy troll jumps out of the woods"
    public String meet(){
        StringBuilder s = new StringBuilder("You are walking and ");
        if (isAcornInvolved()){
            s.append("an acorn falls directly in front of you.");
        } else s.append("a small squirrel appears in front of you.");
        s.append("The squirrel stares at you with deep, thoughtless eyes.");
        return s.toString();
    }

    // receive damage and do something (for instance decrease health)
    public void takeDamage(int damage){
        health -= damage;
    }

    // return a number between 0 and 10
    // when health is 0, the creature dies
    // you decide how to calculate health
    // you can decrease it every time takeDamage() is called
    public int getHealth(){
        if (health < 0) {
            health = 0;
            return health;
        } else return health;
    }

    // let the creature have a name
    public String getName(){ return name; }

    private boolean isAcornInvolved(){
        Random r = new Random();
        acornIsInvolved = r.nextBoolean();
        return acornIsInvolved;
    }
}

