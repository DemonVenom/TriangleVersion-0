
import java.io.*;
import java.util.Scanner;

public class Driver {

    // Provide a driver in a separate source file to test your class by prompting the user for the triangle sides

    public static void main(String[] args) {

        // Create object of class Triangle to call the constructor
        Triangle myObj = new Triangle();

        // Call toString method
        String triangleValidity = myObj.toString(myObj.triangleSides, myObj.isTriangle);
        System.out.println(triangleValidity);


        // If isTriangle boolean is true, call isRight, isIsosceles, and isEquilateral methods
        if (myObj.isTriangle == true) {

            myObj.isRightTriangle = myObj.isRight(myObj.triangleSides, myObj.isRightTriangle);
            myObj.isIsoscelesTriangle = myObj.isIsosceles(myObj.triangleSides, myObj.isIsoscelesTriangle);
            myObj.isEquilateralTriangle = myObj.isEquilateral(myObj.triangleSides, myObj.isEquilateralTriangle);


            // Use isRightTriangle booleans to report back to the user
            if (myObj.isRightTriangle == true) {
                System.out.println("is a right triangle");
            } else {
                System.out.println("is not a right triangle");
            }

            // Use isIsoscelesTriangle booleans to report back to the user
            if (myObj.isIsoscelesTriangle) {
                System.out.println("is an isosceles triangle");
            } else {
                System.out.println("is not an isosceles triangle");
            }

            // Use isEquilateralTriangle booleans to report back to the user
            if (myObj.isEquilateralTriangle == true) {
                System.out.println("is an equilateral triangle");
            } else {
                System.out.println("is not an equilateral triangle");
            }


        }
        // Create new line
        System.out.println();


    }
}