import java.util.Scanner;

public class Q5 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of inner circle in cm : ");
        double ri = input.nextDouble();
        System.out.print("Enter radius of outer circle in cm : ");
        double ro = input.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        System.out.println("Area of a circular region : " + (outerCircle.computeArea() - innerCircle.computeArea()) + " cm\u00B2");
        System.out.println("Circumference of the outer circle is "+ (outerCircle.computeCircumference()) + "cm" );
        System.out.println("Circumference of the inner circle is "+ (innerCircle.computeCircumference()) + "cm" );
    }
}

class Circle{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double computeArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}