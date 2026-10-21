package simple;

import simple.Creature;

import java.util.Random;

    public class Enemy implements Creature {
        private int health;
        private String name;

        public Enemy(String name) {
            this.health = 200;
            this.name = name;
        }

        @Override
        public int attack() {
            Random r = new Random();
            return r.nextInt(10) + 1;
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

        public String meet() {

            return "comes out of the dark hole and pulls you into the underworld!";
        }
    }
