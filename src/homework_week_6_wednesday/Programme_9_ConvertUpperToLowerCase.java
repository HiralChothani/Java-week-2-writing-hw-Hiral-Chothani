package homework_week_6_wednesday;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the uppercase string : ");
        String upperCase = scanner.nextLine();
        // object creation to call method
        Programme_9_ConvertUpperToLowerCase obj = new Programme_9_ConvertUpperToLowerCase();
        obj.convertUpperCaseToLowerCase(upperCase);
        // Closing scanner object
        scanner.close();
    }

    // Conversion of Uppercase to Lowercase method
    public void convertUpperCaseToLowerCase(String text){
        System.out.println("The lowercase value is : " + text.toLowerCase());
    }

}
