
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baileyanderson
 */
public class SalesTax {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your purchase total");
    
        float inputPurchase = keyboard.nextFloat();
        
        float stateSalesTax = 0.04F;
        float countySalesTax = 0.02F;
       
        float stateSalesTaxTotal = stateSalesTax * inputPurchase;
        float countySalesTaxTotal = countySalesTax * inputPurchase;
        float salesTaxTotal = countySalesTaxTotal + stateSalesTaxTotal;
        float purchaseTotal = inputPurchase + salesTaxTotal;
        
        System.out.println("Purchase Price: " + "$" + inputPurchase);
        System.out.println("State Sales Tax Total: " + "$" +  stateSalesTaxTotal);
        System.out.println("County Sales Tax Total: " + "$" +  countySalesTaxTotal);
        System.out.println("Tax Total: " + "$" +  salesTaxTotal);
        System.out.println("Sale Total: " + "$" + purchaseTotal);
        
        
        }
        
       
          
}
