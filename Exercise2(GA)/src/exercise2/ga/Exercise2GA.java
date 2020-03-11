/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2.ga;

/**
 *
 * @author wilso
 */
import java.util.Scanner;
import java.time.LocalDate; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
public class Exercise2GA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate myDateObj = LocalDate.now();
        DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Before formatting: " + myDateObj.format(myFormatObj1));
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
    
}
