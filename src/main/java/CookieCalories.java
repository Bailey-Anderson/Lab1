
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baileyanderson
 */
public class CookieCalories {
    public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
        
    System.out.println("How many cookies did you eat?");
    
    float cookiesEaten = keyboard.nextFloat();
    
    double bagOfCookies = 40;
    double cookieServings = 10;
    double cookieServingCalories = 300;
    double cookiesPerServing = 4;
   
    double calorieTotal = (cookiesEaten / cookiesPerServing) * cookieServingCalories;
    
    System.out.println("The total calories for " + cookiesEaten + " cookies is: ");
    System.out.println(calorieTotal + " calories");
    
    }
   
}
