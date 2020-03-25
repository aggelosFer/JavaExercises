/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanglearearecapexercise;

/**
 *
 * @author revle
 */
public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int lenght, int breadth) {
        this.length = lenght;
        this.breadth = breadth;
    }
    
    public int area(){
        int area = length * breadth;
        return area;
    }
}
