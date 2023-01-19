package dmit2015.model;

public class Rectangle {

    public void setLength(double length) {
        this.length = length;
    }

    private double length;

    public double getLength(){return length;}

    public void setWidth(double width) {
        this.width = width;
    }

    private double width;

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
