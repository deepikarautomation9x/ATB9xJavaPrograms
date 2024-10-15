package Oct.ex_14102024;

public class Labwideningcasting {
    public static void main(String[] args) /* {
        //Widening Casting (automatically) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    } */

//Example 1- create a program to calculate the percentage of a user's score in relation to the maximum score in a game.
{int score = 400;
int maxscore = 600;
//percentage is in decimal so we can use float
float percentage = (float)score/maxscore * 100f;
System.out.println("Student percentage is " + percentage);
}
        }