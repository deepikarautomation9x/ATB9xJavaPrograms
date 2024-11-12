package Nov.ex_06112024_Constructors;

public class Lab142constructorclass {
    public static void main(String[] args) {
        Car c1 = new Car(); //New will allocate value from default car() class automatically.
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

        //2 attribute to define value
        Car Nano =new Car() ;
        Nano.name = "Figo";
        System.out.println(Nano.name);
    }
}
