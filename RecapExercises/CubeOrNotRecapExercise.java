/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubeornotrecapexercise;

import java.util.Scanner;

/**
 *
 * @author revle
 */
public class CubeOrNotRecapExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = input.nextInt();
        long n = Math.round(Math.pow(num, 1/3.0));
        if(num==n*n*n){
            System.out.println(num+" is a cube.");
        }else{
            System.out.println(num+" is not a cube.");
        }
    }
    
}
