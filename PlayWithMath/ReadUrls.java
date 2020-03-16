/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readurls;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author revle
 */
public class ReadUrls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        String filename = "C:\\Users\\revle\\Documents\\Ferfelis\\urls.txt";
        File file = new File(filename);
        printSubdomain(file);
        printUrlsContaining(file);
        
    }
    
    public static void printSubdomain(File file) throws FileNotFoundException{
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String line = input.nextLine();
            System.out.println(line.substring(line.indexOf(".")+1, line.indexOf(".com")));
        }
        input.close();
    }
    
    public static void printUrlsContaining(File file) throws FileNotFoundException{
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String line = input.nextLine();
            boolean contains = line.contains("java");
            if(contains==true){
                System.out.println(line);
            }
        }
    }
}
