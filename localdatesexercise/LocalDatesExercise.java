/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localdatesexercise;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author revle
 */
public class LocalDatesExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        List<BootCamp> list = new ArrayList();
        
        for(int i=0;i<3;i++){
            System.out.println("Enter bootcamp name:");
            String name = input.next();
            System.out.println("Enter starting date(dd/MM/yyyy):");
            String startingDateString = input.next();
            LocalDate startingDate = dateInput(startingDateString);
            System.out.println("Enter ending date(dd/MM/yyyy):");
            String endingDateString = input.next();
            LocalDate endingDate = dateInput(endingDateString);
            
            BootCamp bcamp = new BootCamp(name,startingDate,endingDate);
            list.add(bcamp);
        }
            
        System.out.println("Enter date(dd/MM/yyyy):");
        String checkDateString = input.next();
        LocalDate checkDate = dateInput(checkDateString);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        boolean available = false;
        for(BootCamp b:list){
            boolean isAfter = checkDate.isAfter(b.getStartingDate());
            boolean isBefore = checkDate.isBefore(b.getEndingDate());
            if(isAfter==true && isBefore==true){
                System.out.println("Bootcamp "+b.getName()+" is available. It starts "+b.getStartingDate().format(formatter)+" and ends "+b.getEndingDate().format(formatter));
                available = true;
            }
        }
        if(available==false){
            System.out.println("Sorry, no bootcamps available");
        }
            
        
        
    }
    
    public static LocalDate dateInput(String userInput){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(userInput,dateFormat);
        return date;
    }
    
    
}
