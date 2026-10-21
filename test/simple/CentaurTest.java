package simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentaurTest {

    @Test
    void attackTest() {
        //ARRANGE
        Creature c = new Centaur("Nessus");
        Centaur centaur = (Centaur) c; //Downcast
        centaur.setHealth(50);

        //ACT
        int actual = centaur.attack();
        int expected = 35;

        //ASSERT
        assertEquals(expected, actual);
    }


}