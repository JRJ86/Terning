package terning;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    /**@Auther Gruppe 31
     * Vi tester at en terning slår mellem 1 og 6, og ikke højere, ved at gentage slaget 10000 gange
     */
    @Test
    void eyeTest(){
        int eye;

        Dice d1 = new Dice();
        d1.rollMultiple(10000);


    }



}