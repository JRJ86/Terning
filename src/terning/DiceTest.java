package terning;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {


    /**@author Gruppe 31
     * Vi tester at en terning slår mellem 1 og 6, og ikke højere, ved at gentage slaget 10000 gange
     */
    @Test
    void eyeTest(){
        Dice d1 = new Dice();
        for (int i=0;i<10000;i++) {
            int antalEyes = d1.roll();
            assertTrue((antalEyes >= 1 && antalEyes <= 6));
        }
    }

    /**
     * @author Gruppe 31
     * Vi tester om kastet med værdi 1 forekommer 10000 +- 400 gange ved 60000 slag
     * SPOILER hyppigheden er ikke indenfor intervallet.
     */
    @Test
    void terningKast1() {
        Dice d1 = new Dice();
        int sum=0;
        for (int i = 0; i < 60000; i++) {
            int antalEyes = d1.roll();
                if ( antalEyes == 1) {
                sum += 1; }
        }
        System.out.println(sum);
        assertTrue(sum>=9600 && sum<=10400);

    }
    /**
     * @author Gruppe 31
     * Vi tester om kastet med værdi 2 forekommer 10000 +- 400 gange ved 60000 slag
     * SPOILER hyppigheden er ikke indenfor intervallet.
     */
    @Test
    void terningKast2() {
        Dice d1 = new Dice();
        int sum=0;
        for (int i = 0; i < 60000; i++) {
            int antalEyes = d1.roll();
            if ( antalEyes == 2) {
                sum += 1; }
        }
        System.out.println(sum);
        assertTrue(sum>=9600 && sum<=10400);

    }
    /**
     * @author Gruppe 31
     * Vi tester om kastet med værdi 3 forekommer 10000 +- 400 gange ved 60000 slag
     * SPOILER hyppigheden er ikke indenfor intervallet.
     */
    @Test
    void terningKast3() {
        Dice d1 = new Dice();
        int sum=0;
        for (int i = 0; i < 60000; i++) {
            int antalEyes = d1.roll();
            if ( antalEyes == 3) {
                sum += 1; }
        }
        System.out.println(sum);
        assertTrue(sum>=9600 && sum<=10400);

    }
    /**
     * @author Gruppe 31
     * Vi tester om kastet med værdi 4 forekommer 10000 +- 400 gange ved 60000 slag
     * SPOILER hyppigheden er ikke indenfor intervallet.
     */
    @Test
    void terningKast4() {
        Dice d1 = new Dice();
        int sum=0;
        for (int i = 0; i < 60000; i++) {
            int antalEyes = d1.roll();
            if ( antalEyes == 4) {
                sum += 1; }
        }
        System.out.println(sum);
        assertTrue(sum>=9600 && sum<=10400);

    }
    /**
     * @author Gruppe 31
     * Vi tester om kastet med værdi 5 forekommer 10000 +- 400 gange ved 60000 slag
     * SPOILER hyppigheden er ikke indenfor intervallet.
     */
    @Test
    void terningKast5() {
        Dice d1 = new Dice();
        int sum=0;
        for (int i = 0; i < 60000; i++) {
            int antalEyes = d1.roll();
            if ( antalEyes == 5) {
                sum += 1; }
        }
        System.out.println(sum);
        assertTrue(sum>=9600 && sum<=10400);

    }
    /**
     * @author Gruppe 31
     * Vi tester om kastet med værdi 6 forekommer 10000 +- 400 gange ved 60000 slag
     * SPOILER hyppigheden er ikke indenfor intervallet.
     */
    @Test
    void terningKast6() {
        Dice d1 = new Dice();
        int sum=0;
        for (int i = 0; i < 60000; i++) {
            int antalEyes = d1.roll();
            if ( antalEyes == 6) {
                sum += 1; }
        }
        System.out.println(sum);
        assertTrue(sum>=9600 && sum<=10400);
    }


}