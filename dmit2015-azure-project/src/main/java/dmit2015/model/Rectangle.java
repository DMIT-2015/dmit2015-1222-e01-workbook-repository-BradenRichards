package dmit2015.model;

public class Rectangle {

    private double length;

    public double getLength(){return length;}

    private double width;

    public double getWidth() {
        return width;
    }

    public double area = length * width;

    public double perimeter = (2*length) + (2*width);

    public double diagonalLength = Math.sqrt((width*width)+(length*length));

    public Rectangle() {this.length = 1; this.width = 1;}

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }


}
