/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3.ga;

/**
 *
 * @author wilso
 */
import java.util.Scanner;
public class Exercise3GA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);  
        Scanner myObj1 = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        Scanner myObj3 = new Scanner(System.in);
        
        System.out.print("Color: ");
        String color = myObj.nextLine(); 
        System.out.print("Food: ");
        String food = myObj1.nextLine();
        System.out.print("Animal: ");
        String animal = myObj2.nextLine();
        System.out.print("Name: ");
        String name = myObj3.nextLine();
        
        System.out.println(); 
        System.out.println("I had a dream that " + name + " ate a " +color +" " +animal +" and said it tasted like " +food +"!");  // Output user input
    }
    
}
