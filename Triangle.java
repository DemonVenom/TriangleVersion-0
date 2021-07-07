
import java.io.*;
import java.util.Scanner;

public class Triangle {

    // Create array of integers to store triangle sides
    int[] triangleSides = new int[3];
    // Create booleans to confirm aspects of the triangle
    boolean isTriangle, isRightTriangle, isIsoscelesTriangle, isEquilateralTriangle;


    // Create a class constructor for the Triangle class
    public Triangle() {

        // Create new scanner
        Scanner scnr = new Scanner(System.in);

        // Create for loop to iterate through array indexes
        for (int i = 0; i < 3; i++) {

            // Instruct the user to input triangle side value at index i
            System.out.printf("Enter side %d (an integer): => ", i+1);

            // Store value in triangle side array
            triangleSides[i] = scnr.nextInt();

        }

        // Store result of isValid method into isTriangle boolean, marking if it is valid or invalid
        isTriangle = isValid(triangleSides, isTriangle);

    }



    public String toString(int[] triangleSides, boolean isTriangle) {

        // Display the triangle
        // ...and whether it is a valid triangle
        if (isTriangle == true) {

            // Report to the user that the triangle is invalid
            return String.format("Triangle with sides: %d %d %d",
                    triangleSides[0], triangleSides[1], triangleSides[2]);
        }
        else {
            return String.format("Triangle with sides: %d %d %d\nis not valid triangle",
                    triangleSides[0], triangleSides[1], triangleSides[2]);
        }
    }


    public static boolean isRight(int[] triangleSides, boolean isRightTriangle) {

        // Use pythagorean theorem to in every possible side variation to find if triangle is a right triangle
        if (((triangleSides[0]*triangleSides[0]) == ((triangleSides[1]*triangleSides[1]) + (triangleSides[2]*triangleSides[2]))) ||
                ((triangleSides[1]*triangleSides[1]) == ((triangleSides[0]*triangleSides[0]) + (triangleSides[2]*triangleSides[2]))) ||
                ((triangleSides[2]*triangleSides[2]) == ((triangleSides[0]*triangleSides[0]) + (triangleSides[1]*triangleSides[1])))) {

            // If one of the variations proves pythagorean theorem, set boolean to true
            isRightTriangle = true;
        }
        // If not, set boolean to false
        else {
            isRightTriangle = false;
        }
        return isRightTriangle;
    }

    public static boolean isIsosceles(int[] triangleSides, boolean isIsoscelesTriangle) {

        // Use congruent sides in every possible side variation to find if triangle is a isosceles triangle
        if ((triangleSides[0] == triangleSides[1]) ||
                (triangleSides[0] == triangleSides[2]) ||
                (triangleSides[1] == triangleSides[2]))  {
            // If one of the variations proves congruence, set boolean to true
            isIsoscelesTriangle = true;
        }
        // If not, set boolean to false
        else {
            isIsoscelesTriangle = false;
        }
        return isIsoscelesTriangle;
    }

    public static boolean isEquilateral(int[] triangleSides, boolean isEquilateralTriangle) {

        // Use transitive property to find if triangle is equilateral
        if ((triangleSides[0] == triangleSides[1]) && (triangleSides[0] == triangleSides[2])) {
            // If transitive property is proved, set boolean to true
            isEquilateralTriangle = true;
        }
        // If not, set boolean to false
        else {
            isEquilateralTriangle = false;
        }
        return isEquilateralTriangle;
    }


    public static boolean isValid(int[] triangleSides, boolean isTriangle) {

        // Verify that the 3 sides satisfy the triangle inequality to find if it is a triangle
        if (triangleSides[0] + triangleSides[1] > triangleSides[2]
                && triangleSides[1] + triangleSides[2] > triangleSides[0]
                && triangleSides[0] + triangleSides[2] > triangleSides[1]) {

            // If triangle triangle inequality is satisfied, set boolean to true
            isTriangle = true;
        }
        // If not, set boolean to false
        else {
            isTriangle = false;
        }
        return isTriangle;
    }


}


