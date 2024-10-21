package Oct.ex_17102024task;

import java.util.Scanner;

public class Traingleclassifiertask {
    public static void main(String[] args) {
       /* Triangle Classifier:
        Write a program that classifies a triangle based on its side lengths.
        Given three input values representing the lengths of the sides,
        determine if the triangle is equilateral (all sides are equal),
         isosceles (exactly two sides are equal), or scalene (no sides are equal).
         Use an if-else statement to classify the triangle.
                side1, side2, side2 → eq, iso, scalene */
        //int side1 = 10, side2 = 20, side3 = 30;
        //take input from three sides
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        //Always check negative case as well
        if(side1<=0 || side2<= 0 || side3<=0){
            System.out.println("Invalid input: Cant except negative numbers");
        }else if (side1 == side2 && side1 == side3) {
            System.out.println("******Equilateral triangle ********");
        }else if(side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles.");
        }else {
            System.out.println("The triangle is scalene.");
        }

    }
}
