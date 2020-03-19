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
public class Laptop extends Computer{
    private boolean hasWifi;

    public Laptop(int price) {
        super("Unknown", price);
        hasWifi = false;
    }

    public Laptop(int price, String brand, boolean wifi) {
        super(brand, price);
        this.hasWifi = wifi;
        setPrice(price);
    }

    @Override
    public void setPrice(int price) {
        if(hasWifi==true){
            this.price = price+20;
        }
    }
}
