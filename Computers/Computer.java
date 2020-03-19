/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexercise;

/**
 *
 * @author revle
 */
public abstract class Computer {
    private String brand;
    protected int price;
    private static int computersCreated;
    
    public abstract void setPrice(int price);

    private Computer(int price) {
        this.price = price;
        computersCreated++;
    }

    public Computer(String brand, int price) {
        this(price);
        this.brand = brand;
    }
    
    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    public static int getComputersCreated() {
        return computersCreated;
    }
    
    
    
}
