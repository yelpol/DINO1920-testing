/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmi.sd;

/**
 *
 * @author bikol
 */
public class Dodawanie {
    public static String dodawanie(String a, String b){
        if(!isInteger(a)) {
            return dodawanieFloatDoInt(a, b);
        } else {
            int aa = Integer.valueOf(a);
            int bb = Integer.valueOf(b);

            if(aa<=100 && bb<=100){
                return Integer.toString(aa+bb);
            }
            
            //moje start
            if(!isInteger(b)){
                return "Niedozwolona operacja";
            }
            if(aa>=1000 && aa<=1200){
                int wynik = aa + bb;
                return "HEX: " + Integer.toHexString(wynik);
            } //koniec
            else if (aa>1200 && aa<=1300) {
                int wynik = aa + aa;
                return "SPECJALNY WYNIK HEX DLA CIEBIE: " + Integer.toHexString(wynik);
            }

            return "etam co mnie to";
        }
    }
    
    private static boolean isInteger(String s){
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e){ 
            return false; 
        }
        return true;
    }
            
    private static String dodawanieFloatDoInt(String a, String b){
        float aa = Float.valueOf(a);
        int bb = Integer.valueOf(b);
        System.out.println(aa+bb);
        return Float.toString(aa+bb);
    }
}
