import java.util.Scanner;

public class Q3 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length in centimeters:");
        float cmValue = input.nextFloat();

        float totalInches = (float) (cmValue/2.54);
        int feet = (int)totalInches/12;
        int inches = (int)totalInches%12;

        System.out.println(cmValue + " is equal to " + feet + " feets and " + inches + " inches");

    }
}
