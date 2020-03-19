/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playingwithemployees;

/**
 *
 * @author revle
 */
public class Director extends Employee implements Driving, Advisable{

    public Director(String name, int salary) {
        super(name, salary);
    }
    
    public void guide(){
        System.out.println(getName()+" Director is guiding");
    }

    @Override
    public void drive() {
        System.out.println(getName()+" Director is driving");
    }

    @Override
    public void giveAdvice() {
        System.out.println(getName()+" Director is giving advice");
    }

    @Override
    public void work() {
        guide();
    }
    
}
