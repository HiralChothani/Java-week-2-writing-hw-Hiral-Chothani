package homework_week_6_wednesday;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the Triangle :");
      int length = scanner.nextInt();
        System.out.println("Enter height value of the Triangle : ");
        int height = scanner.nextInt();
        areaOfTriangle(length, height);
        // Closing the scanner object
        scanner.close();
    }

    // Calculating the area of the Triangle with no return type with parameter method
    public static void areaOfTriangle(int length, int height){
        double area = (length*height) / 2;
        System.out.println("The Area of a triangle is : " + area);
    }

}
