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
public class Receptionist extends Employee implements Driving{

    public Receptionist(String name, int salary) {
        super(name, salary);
    }
    
    public void greet(){
        System.out.println(getName()+" Receptionist is greeting");
    }

    @Override
    public void drive() {
        System.out.println(getName()+" Receptionist is driving");
    }

    @Override
    public void work() {
        greet();
    }
    
}
