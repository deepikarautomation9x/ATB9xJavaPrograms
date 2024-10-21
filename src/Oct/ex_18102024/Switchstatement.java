package Oct.ex_18102024;

import java.util.Scanner;

public class Switchstatement {
    public static void main(String[] args) {
        //Switch statement -Program to print numbers from 1 to 7 and number of week days as per num entered.
        //1 -mon , 2-tues so no.. 8 -Invalid(edge case)
        Scanner sc = new Scanner(System.in);
        System.out.println("Print nums from 1 to 7");
        int day = sc.nextInt();
        //Switch expression
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            //Add default:Apart from anything else it will say no idea what it is
            default:
                System.out.println("No idea , that day must be in heaven");
                break;


        }
        System.out.println("End to day");
    sc.close();

    }
}
