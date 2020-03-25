/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countvowelsrecapexercise;

import java.util.Scanner;

/**
 *
 * @author revle
 */
public class CountVowelsRecapExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string:");
        String string = input.next();
        int counter = 0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)== 'a' || string.charAt(i)== 'A' || string.charAt(i)== 'e' || string.charAt(i)== 'E' || string.charAt(i)== 'o' || string.charAt(i)== 'O' || string.charAt(i)== 'u' || string.charAt(i)== 'U' || string.charAt(i)== 'i' || string.charAt(i)== 'I'){
                counter++;
            }
        }
        System.out.println("This string has "+counter+" vowels.");
    }
    
}
