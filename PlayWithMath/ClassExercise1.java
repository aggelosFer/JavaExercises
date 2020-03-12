/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classexercise1;

import java.util.Scanner;

/**
 *
 * @author revle
 */
public class ClassExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = input.next();
        System.out.println("OK, " + name + ". Are you male (M) or female (F)?");
        String gender = input.next();
        System.out.println("How old are you, " + name + "?");
        int age = input.nextInt();
        int ageDiff;
        if(age<=5){
            System.out.println("You are too young for this app.");
            ageDiff = 5 - age;
            System.out.println("Come back in "+ageDiff+" years when you will be a student.");
        }else if(age>5 && age <=18){
            System.out.println("Oh, you are a student.");
            ageDiff = 18 - age;
            System.out.println("Keep up ... "+ageDiff+" more years left and and afterwards you will make money.");
        }else{
            System.out.println("Well, you must be employed.");
            ageDiff = age - 18;
            System.out.println("You finished school "+ageDiff+" years ago.");
        }
        if((2020-age)<1980){
            ageDiff = 1980-(2020-age);
            System.out.println("You were "+ageDiff+" years old in 1980 and in 2040 you will be "+(age+20));
        }else{
            System.out.println("You were not born in 1980 and in 2040 you will be "+(age+20));
        }
        System.out.println("What's your favorite season, " + name + "?");
        System.out.println("1. Winter");
        System.out.println("2. Spring");
        System.out.println("3. Summer");
        System.out.println("4. Autumn");
        int season = input.nextInt();
        if (season == 1) {
            System.out.println("It must be cold outside.");
        } else if (season == 2) {
            System.out.println("Ohh, flowers are very beautiful these days.");
        } else if (season == 3) {
            System.out.println("Let's go for swimming.");
        } else {
            System.out.println("The trees are full of brown leaves.");
        }
        System.out.println("Now, " + name + ", how tall are you?");
        double height = input.nextDouble();
        System.out.println("And how much do you weigh?");
        int weight = input.nextInt();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You have normal weight.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
        int daysAlive = age * 365;
        int sum = 0;
        while (daysAlive > 0) {
            sum = sum + daysAlive % 10;
            daysAlive = daysAlive / 10;
        }
        if (sum > 6) {
            sum = sum % 7;
        }
        if (sum == 0) {
            System.out.println("Your lucky day is Monday.");
        } else if (sum == 1) {
            System.out.println("Your lucky day is Tuesday.");
        } else if (sum == 2) {
            System.out.println("Your lucky day is Wednesday.");
        } else if (sum == 3) {
            System.out.println("Your lucky day is Thursday.");
        } else if (sum == 4) {
            System.out.println("Your lucky day is Friday.");
        } else if (sum == 5) {
            System.out.println("Your lucky day is Saturday.");
        } else {
            System.out.println("Your lucky day is Sunday.");
        }
        if (sum == 2 && age >= 20 && age <= 40) {
            if (gender.equals("M")) {
                if (age >= 20 && age <= 25) {
                    System.out.println("Welcome, " + name + ".");
                } else {
                    System.out.println("Welcome, Mr." + name + ".");
                }
            } else {
                System.out.println("Are you married?(Y/N)");
                String married = input.next();
                if (married.equals("Y")) {
                    System.out.println("Welcome, Mrs, " + name + ".");
                } else {
                    System.out.println("Welcome, Ms, " + name + ".");
                }
            }
        } else if (sum != 2) {
            System.out.println("You can't enter because your lucky day is not Wednesday.");
        } else if (age < 20) {
            System.out.println("You can't enter because you are too young.");
        } else {
            System.out.println("You can't enter because you are too old.");
        }
    }
}
