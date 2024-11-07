package Nov.ex_05112024_oops;

public class Lab140Otherwaytocreateobj {
    public static void main(String[] args) {
        Dog1 s1 = new Dog1();
        s1.name = "Tommy";
        s1.age = 5;
        s1.sleep();
        s1.bark();
        s1.eat(10);
        s1.play();
        System.out.println(s1 +"\n" + s1.name + "\n"+ s1.age );
    }
}
//to create class in same program
//Disadvantage - it remains private
class Dog1{
    String name;
    int age;
    String breed;
    String color;
    double weight;

    //Behaviuor
    void bark(){
        System.out.println("my dog" + name + "barks loud");
    }
void sleep(){
        System.out.println("my dog" + name + "sleeps");
}
int eat(int a){
        System.out.println("My dog eats" + a + "times a day");
                return a;
}
void play()
    {
        System.out.println("My dog " +name + " is Playing");
    }
}
