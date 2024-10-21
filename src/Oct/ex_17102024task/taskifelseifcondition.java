package Oct.ex_17102024task;

import java.util.Scanner;

public class taskifelseifcondition {
    // ✅ Grade Calculator:
// Write a program that calculates and displays the letter grade
// for a given numerical score (e.g., A, B, C, D, or F)
// based on the following grading scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
    public static void main(String[] args) {
        System.out.println("Grade calculator");
        Scanner sc = new Scanner (System.in);
        int marks = sc.nextInt();
        char grade = 'F';
        if(marks >=90 && marks <= 100)
        {
            grade = 'A';
            System.out.println(" Grade 1st achieved =" + grade);
        }else if (marks >=80 && marks <= 89)
        {
            grade = 'B';
            System.out.println("Grade B achieved = " + grade);
        }else if (marks >=70 && marks <= 79)
        {
            grade = 'C';
            System.out.println("Grade C achieved =" + grade);
        }else if (marks >=60 && marks <= 69)
        {
            grade = 'D';
            System.out.println("Grade D achieved =" +grade);
        }else if(marks >=0 && marks <= 59)
        {
            grade = 'E';
            System.out.println("Grade E achieved =" +grade);
        }else
        {
            System.out.println ("Invalid input: Enter valid input from 0 to 100 ");
        }

    }
}
