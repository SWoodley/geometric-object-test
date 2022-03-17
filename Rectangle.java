/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz10;

/**
 *
 * @author Rig
 */
public class Rectangle extends GeometricObject {
    private double length;
    private double width;
    
    public Rectangle(String color, boolean filled, double length, double width) {
                    super(color, filled);
                    this.length = length;
                    this.width = width;
               }
    
    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }
    
    public Rectangle() {
         super();
         this.width = 1;
         this.length = 1;
    }

    public double getWidth() {
         return width;
    }
    public void setWidth(double width) {
         this.width = width;
    }
    public double getLength() {
         return length;
    }
    public void setLength(double length) {
         this.length = length;
    }     

    public double getArea() {
         return width * length;

    }

    public double getPerimeter(){
        return (width*2) + (length*2);
    }
    
    public void printObject(){
        System.out.println("The perimeter of this rectangle is " + this.getPerimeter()
        + "\nThe area of this rectangle is " + this.getArea());
    }   
}
