package dmit2015.model;
//package is to Java what namespace is to C#
public class Circle {

    //Do not use _prefix (ex. _radius unless we want it only for internal usage)
    private double radius;

    public double getRadius() {
        return radius;
    }
        //CHECKED exception example
    public void setRadius(double radius) throws Exception {
        //Validate the new value assigned to the Radius
        if (radius <= 0 ){
            throw new Exception("Radius must be a positive non-zero number");
        }
        this.radius = radius;
    }

    //RuntimeException example
//    public void setRadius(double radius) {
//        //Validate the new value assigned to the Radius
//        if (radius <= 0 ){
//            throw new RuntimeException("Radius must be a positive non-zero number");
//            //If you do not want to force a developer to handle an exception use RuntimeException
//            //If you do not use a try catch to catch a RuntimeException, the program will crash
//        }
//        this.radius = radius;
//    }

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        //The radius of circle1 should be 1
        //Area should be 3.1459
        //Perimeter should be 6.28
        System.out.printf("The radius of circle1 is %s\n",circle1.getRadius()); // \n is new line
        System.out.printf("The area of circle1 is %.5f\n", circle1.area()); //.5f does five decimal places
        System.out.printf("The perimeter of circle1 is %.2f\n\n", circle1.perimeter()); //.2 does to two decimal places

        try{
            //Change the radius of circle1 to 5
            circle1.setRadius(5);
            //radius should be 5
            //Area should be 78.53982
            //Perimeter should be 31.41593
            System.out.printf("The radius of circle1 is %s\n",circle1.getRadius()); // %s is string   |  \n is new line
            System.out.printf("The area of circle1 is %.5f\n", circle1.area()); //.5f does five decimal places
            System.out.printf("The perimeter of circle1 is %.5f\n\n", circle1.perimeter()); //.2 does to two decimal places
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
