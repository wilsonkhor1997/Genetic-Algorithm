/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4.ga;

/**
 *
 * @author wilso
 */
public class Exercise4GA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int addition;
        String str = "2018";
	//This will return the first char of the string
	char ch1 = str.charAt(0);
		
	//This will return the 6th char of the string
	char ch2 = str.charAt(1);
		
	//This will return the 12th char of the string
	char ch3 = str.charAt(2);
		
	//This will return the 21st char of the string
	char ch4 = str.charAt(3);
		
	System.out.println(ch1);
	System.out.println(ch2);
	System.out.println(ch3);
	System.out.println(ch4);
        System.out.println();
        
        addition=Integer.parseInt(String.valueOf(ch1))+Integer.parseInt(String.valueOf(ch2))+Integer.parseInt(String.valueOf(ch3))+Integer.parseInt(String.valueOf(ch4));
        System.out.println(addition);
    }
    
}
