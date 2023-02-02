package dmit2015.model;

import lombok.Getter;
import lombok.Setter;

/**
 * This class models a Rectangle shape.
 *
 * @author Braden Richards
 * @version 2023/01/20
 */
public class Rectangle {

    public void setLength(double length) {
        this.length = length;
    }
@Getter
@Setter

    /**
     * The length of this Rectangle
     */
    private double length;

    /**
     * The width of this Rectangle
     */
    private double width;
    public double getLength(){return length;}

    public void setWidth(double width) {
        this.width = width;
    }


    public double getWidth() {
        return width;
    }

    public double area() {return length * width;}

    public double perimeter() {return (2*length) + (2*width);}

    public double diagonal() { return Math.sqrt((width*width)+(length*length));}

    public Rectangle() {this.length = 1; this.width = 1;}

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public static void main(String[] args){

    }

}
