package Nov.ex_05112024_oops;

public class Lab139_dogsobjectclass {
    public static void main(String[] args) {
//creating 5 objects and creating thier attributes after fetching values from class
        System.out.println("***Dog 1 info****");
        Dog s1= new Dog();
        s1.name ="Tommy";
        s1.age = 5;
        s1.bark();
        s1.eat(10);
        System.out.println(s1);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.bark);


        System.out.println("***Dog 2 info****");
        Dog s2= new Dog();
        s2.name = "Tiger";
        s2.age = 10;
        s2.bark();
        s2.eat(20);
        System.out.println(s2);

        System.out.println("***Dog 3 info****");

        Dog s3= new Dog();
            s3.name = "Rover";
                s3.age = 15;
            s3.bark();
            s3.eat(30);
            System.out.println(s3);

            Dog s4= new Dog();
            s4.name = "Puppy";
            System.out.println(s4.name);
            System.out.println(s4);

            Dog s5= new Dog();
            s5.name = "Kitty";
            System.out.println(s5.name);
            System.out.println(s5);


    }
}
