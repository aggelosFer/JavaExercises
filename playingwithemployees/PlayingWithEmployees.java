/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playingwithemployees;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author revle
 */
public class PlayingWithEmployees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee teacher1 = new Teacher("Nick", 1000);
        Employee teacher2 = new Teacher("Mary",800);
        Employee receptionist = new Receptionist("Peter", 1200);
        Employee director1 = new Director("Andy", 2000);
        Employee director2 = new Director("Jonathan", 2500);
        
        List<Employee> employees = new ArrayList();
        employees.add(teacher1);
        employees.add(teacher2);
        employees.add(receptionist);
        employees.add(director1);
        employees.add(director2);
        
        for(Employee employee:employees){
            employee.work();
        }
        
        List<Advisable> advisors = new ArrayList();
        List<Driving> drivers = new ArrayList();
        //how many advisers and drivers do we have??
        
//        boolean isAdvisable = teacher1 instanceof Advisable;
//        System.out.println("teacher1 advisable:"+isAdvisable);
        
        int sumAdvisable=0;
        int sumDriving=0;
        for(Employee employee:employees){
            if(employee instanceof Advisable){
                sumAdvisable++;
            }
            if(employee instanceof Driving){
                sumDriving++;
            }
        }
        System.out.println(sumAdvisable+" Advisors");
        System.out.println(sumDriving+" Drivers");
        
    }
    
}
