package Sept.ex_20092024;

public class Task_Triangle_clasifier {
    public static void main(String[] args) {
        //Triangle Classifier ( If)
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine
        // if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or
        // scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side3 ->
        double side1 = 10;
        double side2 = 10;
        double side3 = 10;
        if (side1 == side2 && side2 == side3 && side3 == side1) {
            System.out.println("It's a equilateral Triangle where all sides are equal");
        } else if(side1 == side2 && side2 != side3 && side3 != side1){
            System.out.println("It's an isosceles Triangle where two sides are equal");
            }
        else if (side1 != side2 && side2 != side3 && side3 != side1){
            System.out.println("It's a scalene Triangle where no sides are equal");
        }
              }
}
