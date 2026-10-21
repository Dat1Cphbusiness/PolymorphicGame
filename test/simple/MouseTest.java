package simple;

import static org.junit.jupiter.api.Assertions.*;

class MouseTest {

    Mouse mouse = new Mouse("Mickey");

    @org.junit.jupiter.api.Test
    void attackTest() {
        int actual = mouse.attack();

        int expected = 2;

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void meet() {
    }

    @org.junit.jupiter.api.Test
    void takeDamage() {
    }

    @org.junit.jupiter.api.Test
    void setHealth() {
    }

    @org.junit.jupiter.api.Test
    void getHealth() {
    }

    @org.junit.jupiter.api.Test
    void getName() {
    }
}