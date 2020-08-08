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
public abstract class Rectangle {
    protected double height;
    protected double width;
    
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
}
