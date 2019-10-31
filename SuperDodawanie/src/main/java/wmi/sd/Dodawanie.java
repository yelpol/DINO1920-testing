/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmi.sd;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author bikol
 */
public class Dodawanie {
    public static String dodawanie(String a, String b){
        PizzaFactory pizzaFactory = new PizzaFactory();
        if (pizzaFactory.CanMakePizza(a,b)){
            return pizzaFactory.Make(a,b);
        }
        try {
            int aa = Integer.parseInt(a);
            int bb = Integer.parseInt(b);

            if (aa <= 100 && bb <= 100) {
                return Integer.toString(aa + bb);
            }
        }
        catch (java.lang.NumberFormatException e) {
          //lecimy dalej!
        }
        //proszę dodawać nowe ficzery tutaj o
        //     |
        //    \/


        //jeżeli żaden inny nasz feature nie obsługuje tych stringów to po prostu je zmergujmy
        return a+b;
    }
    static class PizzaFactory{
        /*Jedyna na świecie fabryka produkująca pizzę ze stringów!*/

        //masz nowy pomysł na składniki? Dodaj je
       List<String> allowedIngridients = Arrays.asList("ser", "kiełbasa", "sos czosnkowy", "szynka", "kukurydza", "kurczak");
        List<String> forbiddenIngridients = Arrays.asList("ananas", "keczup", "musztarda");

        PizzaFactory(){

        }
        boolean CanMakePizza(String a, String b){
           return  (allowedIngridients.contains(a.toLowerCase())||forbiddenIngridients.contains(a.toLowerCase())) &&( allowedIngridients.contains(b.toLowerCase())||forbiddenIngridients.contains(b.toLowerCase()));
        }
       String Make(String ingridient1, String ingridient2){
            if (forbiddenIngridients.contains(ingridient1.toLowerCase()) || forbiddenIngridients.contains(ingridient2.toLowerCase())){
                return "Nie.";
            }
            else{
                return ingridient1.toLowerCase()+" i "+ingridient2.toLowerCase()+" :)";
            }
        }
    }
}
