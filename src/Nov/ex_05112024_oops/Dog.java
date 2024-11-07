package Nov.ex_05112024_oops;

public class Dog {
    // State
    String name;
    int age;
    String breed;
    String color;
    int height;
    boolean bark;

    // Behaviour
    void sleeps() {
        System.out.println("Dog sleeps");
    }

    void bark() {
        System.out.println("Dog is barking");
    }

    int eat(int a){
        return a;
    }
    void run(){}
    void walk(){
        System.out.println("Dog is walking");
    }
}
