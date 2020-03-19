/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author revle
 */
public class AbstractExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sony = "Sony";
        String acer = "Acer";
        String asus = "Asus";
        String lenovo = "Lenovo";
        Computer desktop1 = new Desktop(900, sony, true);
        Computer laptop1 = new Laptop(700, acer, true);
        Computer tablet1 = new Tablet(50, asus, false);
        Computer desktop2 = new Desktop(800, sony, true);
        Computer laptop2 = new Laptop(1100, acer, true);
        Computer tablet2 = new Tablet(90, asus, false);
        Computer desktop3 = new Desktop(750);
        Computer laptop3 = new Laptop(400, acer, true);
        Computer tablet3 = new Tablet(120, lenovo, false);
        Computer laptop4 = new Laptop(500);
        
        List<Computer> computers = new ArrayList();
        computers.add(desktop1);
        computers.add(laptop1);
        computers.add(tablet1);
        computers.add(desktop2);
        computers.add(laptop2);
        computers.add(tablet2);
        computers.add(desktop3);
        computers.add(laptop3);
        computers.add(tablet3);
        computers.add(laptop4);
        
        int sumSony =0;
        int sumAsus =0;
        int sumAcer =0;
        int sumLenovo =0;
        int sumUnknown =0;
        int sumTotal =0;
        for(Computer c:computers){
            if(c.getBrand().equals(sony)){
                sumSony+=c.getPrice();
            }else if(c.getBrand().equals(acer)){
                sumAcer+=c.getPrice();
            }else if(c.getBrand().equals(asus)){
                sumAsus+=c.getPrice();
            }else if(c.getBrand().equals(lenovo)){
                sumLenovo+=c.getPrice();
            }else{
                sumUnknown+=c.getPrice();
            }
        }
        sumTotal= sumSony+sumAcer+sumAsus+sumLenovo+sumUnknown;
        System.out.printf("%s Computers cost %d$\n",sony,sumSony);
        System.out.printf("%s Computers cost %d$\n",acer,sumAcer);
        System.out.printf("%s Computers cost %d$\n",asus,sumAsus);
        System.out.printf("%s Computers cost %d$\n",lenovo,sumLenovo);
        System.out.printf("%s Computers cost %d$\n","Unknown",sumUnknown);
        System.out.printf("%s price of all Computers is %d$\n","Total",sumTotal);
        
        int sumLaptop =0;
        int sumDesktop =0;
        int sumTablet =0;
        
        boolean isDesktop = laptop1 instanceof Desktop;
        boolean isLaptop = laptop1 instanceof Laptop;
        boolean isTablet = laptop1 instanceof Tablet;
        boolean isComputer = laptop1 instanceof Computer;
        boolean isObject = laptop1 instanceof Object;
        System.out.println("laptop1 isDesktop:"+isDesktop);
        System.out.println("laptop1 isLaptop:"+isLaptop);
        System.out.println("laptop1 isTablet:"+isTablet);
        System.out.println("laptop1 isComputer:"+isComputer);
        System.out.println("laptop1 isObject:"+isObject);
        
        for(Computer c:computers){
            if(c instanceof Desktop){
                sumDesktop+=c.getPrice();
            }else if(c instanceof Laptop){
                sumLaptop+=c.getPrice();
            }else if(c instanceof Tablet){
                sumTablet+=c.getPrice();
            }
        }
        System.out.printf("%s Computers cost %d$\n","Laptop",sumLaptop);
        System.out.printf("%s Computers cost %d$\n","Desktop",sumDesktop);
        System.out.printf("%s Computers cost %d$\n","Tablet",sumTablet);
        
    }
    
}
