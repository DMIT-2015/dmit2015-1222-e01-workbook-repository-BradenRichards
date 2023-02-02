package dmit2015.model;
//package is to Java what namespace is to C#

/**
 * This class models a circle shape
 *
 * @author Braden Richards
 * @version 2023-01/20
 *
 */
public class Circle {
    /**
     * The radius of this circle
     */
    //Do not use _prefix (ex. _radius unless we want it only for internal usage)
    private double radius;

    /**
     * Returns radius of this circle
     * @return the radius of this circle
     */
    public double getRadius() {
        return radius;
    }


        //CHECKED exception example
//    public void setRadius(double radius) throws Exception {
//        //Validate the new value assigned to the Radius
//        if (radius <= 0 ){
//            throw new Exception("Radius must be a positive non-zero number");
//        }
//        this.radius = radius;
//    }

    /**
     * Change the radius of this circle
     * @param radius the new radius of this circle
     */
    //RuntimeException example
    public void setRadius(double radius) {
        //Validate the new value assigned to the Radius
        if (radius <= 0 ){
            throw new RuntimeException("Radius must be a positive non-zero number");
            //If you do not want to force a developer to handle an exception use RuntimeException
            //If you do not use a try catch to catch a RuntimeException, the program will crash
        }
        this.radius = radius;
    }

    /**
     * Creates a circle with a radius of 1
     */
    public Circle() {
        this.radius = 1;
    }

    /**
     * Creates a circle with a specific radius
     * @param radius the new radius of this circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Compute and return the area of this circle
     * @return the area of this circle
     */
    public double area(){
        return Math.PI * radius * radius;
    }

    /**
     * Compute and return the perimeter of this circle
     * @return the perimeter of this cricle
     */
    public double circumference(){
        return 2 * Math.PI * radius;
    }

    /**
     * Compute and return the diameter of this circle
     * @return the diameter of this circle
     */
    public double diameter(){
        return 2*radius;
}

    /**
     * Console application to demonstrate usage of Circle object
     * @param args
     */
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        //The radius of circle1 should be 1
        //Area should be 3.1459
        //Perimeter should be 6.28
        System.out.printf("The radius of circle1 is %s\n",circle1.getRadius()); // \n is new line
        System.out.printf("The area of circle1 is %.5f\n", circle1.area()); //.5f does five decimal places
        System.out.printf("The circumference of circle1 is %.2f\n\n", circle1.circumference()); //.2 does to two decimal places

        try{
            //Change the radius of circle1 to 5
            circle1.setRadius(5);
            //radius should be 5
            //Area should be 78.53982
            //Perimeter should be 31.41593
            System.out.printf("The radius of circle1 is %s\n",circle1.getRadius()); // %s is string   |  \n is new line
            System.out.printf("The area of circle1 is %.5f\n", circle1.area()); //.5f does five decimal places
            System.out.printf("The circumference of circle1 is %.5f\n\n", circle1.circumference()); //.2 does to two decimal places
        }catch(Exception ex){

        }

        //Change the radius of circle1 to -25
        //It should throw an exception
        try{
            circle1.setRadius(-25);
            System.out.println("A exception should have been thrown");
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
