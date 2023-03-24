package homework_week_6_wednesday;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Programme_15_SwapTheValue {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value : ");
        int first = scanner.nextInt();
        System.out.println("Enter the second variable value : ");
        int second = scanner.nextInt();
        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapTheValue(first, second);
        // closing the scanner object
        scanner.close();

    }
    //Swapping the value of the variables
    public void swapTheValue(int first, int second){
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + first + " and second variable is : " + second);
        c = first;
        first = second;
        second = c;
        System.out.println("After the swapping, The values of first variable is : " + first + " and the second variable is : " + second );
    }

}
