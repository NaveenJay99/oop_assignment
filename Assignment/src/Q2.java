import java.util.Scanner;

public class Q2 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first name");
        String fName = input.nextLine();
        System.out.println("Enter the middle name");
        String mName = input.nextLine();
        System.out.println("Enter the last name");
        String lName = input.nextLine();
        System.out.println(lName + ", " + fName + " "+ mName.charAt(0));

    }
}
