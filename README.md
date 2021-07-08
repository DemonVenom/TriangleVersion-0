# TriangleVersion-0


⦁	Design and implement a class Triangle. A constructor should accept the lengths of a triangle’s 3 sides (as integers) and verify that the sum of any 2 sides is greater than the 3rd (i.e., that the 3 sides satisfy the triangle inequality). The constructor should mark the triangle as valid or invalid (a boolean); do not throw an exception. Provide get and set methods for the 3 sides, and recheck for validity in the set methods. Provide a toString method to display the triangle and whether it is a valid triangle. Provide 4 other boolean-returning methods: isRight, isIsosceles (only 2 sides are equal), isEquilateral, and isInvalid (or isValid). Provide a driver in a separate source file to test your class by prompting the user for the triangle sides. Sample outputs:

    Enter side 1 (an integer): => 3
    Enter side 2 (an integer): => 3
    Enter side 3 (an integer): => 3
    Triangle with sides: 3 3 3
    is not a right triangle
    is an isosceles triangle
    is an equilateral triangle

    Enter side 1 (an integer): => 1   
    Enter side 2 (an integer): => 1
    Enter side 3 (an integer): => 2
    Triangle with sides: 1 1 2
    is not a valid triangle
