package simple;

import static org.junit.jupiter.api.Assertions.*;

class HumanBanditTest {

    @org.junit.jupiter.api.Test
    void attackTestUnder10HP() {
        // Arrange
        HumanBandit c = new HumanBandit("Banditten bandit");
        c.setHealth(10);

        // Act
        int actual = c.attack(); //0-12 (Hvis under 10 hp)
        boolean expected = true;
        boolean booleanActual = false;
        for (int i = 0; i < c.getAttackMaxRange(); i++) {
            if (actual == i) {
                booleanActual = true;
            }
        }

        // Assert
        assertEquals(expected, booleanActual);
    }

    @org.junit.jupiter.api.Test
    void attackTestOver10HP() {
        // Arrange
        HumanBandit c = new HumanBandit("Banditten bandit");

        // Act
        int actual = c.attack(); //0-12 (Hvis under 10 hp)
        boolean expected = true;
        boolean booleanActual = false;
        for (int i = 0; i < c.getAttackMaxRange(); i++) {
            if (actual == i) {
                booleanActual = true;
            }
        }

        // Assert
        assertEquals(expected, booleanActual);
    }

    @org.junit.jupiter.api.Test
    void meetTest() {
        // Arrange
        HumanBandit c = new HumanBandit("Banditten bandit");

        // Act
        String actual = c.meet();
        String expected = "spots a abandoned camp. As you investigate the camp, some bushes rattle..."
                + "\n" + "A human bandit jumps out of the bush, with a word drawn";

        // Assert
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void takeDamageTest() {
        // Arrange

        // Act

        // Assert
    }

    @org.junit.jupiter.api.Test
    void getHealthTest() {
        // Arrange

        // Act

        // Assert
    }

    @org.junit.jupiter.api.Test
    void getNameTest() {
        // Arrange

        // Act

        // Assert
    }
}