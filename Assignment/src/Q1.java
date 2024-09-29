import java.util.Scanner;

public class Q1 {
    public static void main (String []args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an odd length word");
        String oddWord = input.nextLine();
        int length = oddWord.length();
        if (length % 2 == 0){
            System.out.println("This is not an odd word!");
        } else {
            char middleChar = oddWord.charAt(length/2);
            System.out.println(middleChar);
        }
    }
}