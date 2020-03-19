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
public class Desktop extends Computer{
    private boolean hasExtraLight;

    public Desktop(int price) {
        super("Unknown",price);
        hasExtraLight=false;
    }

    public Desktop(int price, String brand, boolean extraLight) {
        super(brand, price);
        this.hasExtraLight = extraLight;
        setPrice(price);
    }
    
    @Override
    public void setPrice(int price) {
        if(hasExtraLight==true){
            this.price = price+20;
        }
    }
    
}
