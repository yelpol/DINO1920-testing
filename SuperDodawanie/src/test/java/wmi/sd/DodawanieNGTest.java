/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wmi.sd;

import java.util.Random;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author bikol
 */
public class DodawanieNGTest {

    public DodawanieNGTest() {
    }

    /**
     * Test of dodawanie method, of class Dodawanie.
     */
   // @Test
    public void testDodawanie1() {
        System.out.println("dodawanie");
        String a = "1";
        String b = "1";
        String expResult = "2";
        String result = Dodawanie.dodawanie(a, b);
        assertEquals(result, expResult);
    }
    
     //   @Test
    public void testDodawanie2() {
        System.out.println("dodawanie");
        Random  r = new Random();
        for(int i = 0;i<10;i++){
            int aa = r.nextInt(100);
            int bb = r.nextInt(100);
            String a = Integer.toString(aa);
            String b = Integer.toString(bb);
            
            String expResult = Integer.toString(aa + bb);
            String result = Dodawanie.dodawanie(a, b);
            assertEquals(result, expResult);
        }
    }
    @Test
    public void testPizzy(){
        String result = Dodawanie.dodawanie("Ser", "ser");
        assertEquals(result, "ser i ser :)");

        result = Dodawanie.dodawanie("Ser", "szynka");
        assertEquals(result, "ser i szynka :)");

        result = Dodawanie.dodawanie("Ser", "Ananas");
        assertEquals(result, "Nie.");

        result = Dodawanie.dodawanie("cebula", "bigos");
        assertNotEquals(result, "cebula i bigos :)");
    }
    @Test
    public void mergingTest(){
        String result = Dodawanie.dodawanie("BARDZO DZIWNY STRIIING!", "DURIG");
        assertEquals(result, "BARDZO DZIWNY STRIIING!"+"DURIG");

        result = Dodawanie.dodawanie("fasfasfa", "Dafsoafsopa");
        assertEquals(result, "fasfasfa" +"Dafsoafsopa");
    }
}