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
public class Tablet extends Computer{
    private boolean hasBluetooth;

    public Tablet(int price) {
        super("Unknown",price);
        hasBluetooth = false;
    }

    public Tablet(int price, String brand, boolean bluetooth) {
        super(brand, price);
        this.hasBluetooth = bluetooth;
        setPrice(price);
    }
    
    @Override
    public void setPrice(int price) {
        if(hasBluetooth==true){
            this.price = price+20;
        }
    }
    
}
