/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namesarrayrecapexercise;

/**
 *
 * @author revle
 */
public class NamesArrayRecapExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] arrayOfNames = {"Nikolas", "Anna", "Anastasia", "George", "Sofia", "Andrew", "Mary", "John"};
        for(String name:arrayOfNames){
            if(!name.startsWith("A")){
                System.out.println(name);
            }
        }
    }
    
}
