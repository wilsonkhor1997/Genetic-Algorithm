/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.ga;

/**
 *
 * @author wilso
 */
public class Exercise1GA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String college = new String ("College of Arts and Sciences ");
        String town = new String ("UUM Sintok"); // part (a)
        int stringLength;
        String change1, change2, change3;
        stringLength = college.length(); // part (b)
        System.out.println (college + " contains " + stringLength + " characters.");
        change1 = college.toUpperCase(); // part (c)
        System.out.println ("The string is all in upper case: " + change1);
        change2 = change1.replace('O', '*'); // part (d)
        System.out.println ("All capital O's are replaced with the asterisk character: " + change2);
        change3 = college.concat(town); // part (e)
        System.out.println ("The final string is " + change3);
        }
}
