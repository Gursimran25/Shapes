/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

/**
 *
 * @author User
 */
public abstract class Square extends Rectangle {
    
    public Square(double height, double width) {
        super(height, width);
    }
    
    public double getArea(){
        return height * height;
    }
    
    public double getPerimeter(){
        return 4 * height;
    }
    
}
