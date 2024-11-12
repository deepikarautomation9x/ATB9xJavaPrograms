package Nov.ex_06112024_Constructors;

import java.util.Scanner;

public class Lab143parameterizedconstrutor {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the model");
        String model_input =sc1.next();
        System.out.println("Enter the year");
        int year_input =sc1.nextInt();

Car2 t1 = new Car2("tesla", 2015);
System.out.println(t1.model);
System.out.println(t1.year);

t1.display();

Car2 t2 = new Car2(model_input, year_input);
System.out.println(t2.model);
System.out.println(t2.year);

t2.display();
    }

}
//note - same class name cannot be used as it is already defined in package.
class Car2 {
    String model;
    int year;

    //Parameterized Constructor
 Car2 (String model, int year){
     System.out.println("Parameterized Constructor");
     this.model=model;
     this.year= year;

    }

void display(){                 //function used to display the value and used with t1.display
     System.out.println("Car details --> " + this.model + this.year + "is good to buy");

}


}