package Nov.ex_05112024_oops;

public class Lab139_oops_object_class {
    //on;y view the memory address
    public static void main(String[] args) {
        Studentclass s1 = new Studentclass();
        //Studentclass - class loader
        // s1 = obj refrence
        //new studentclass() - new object creation.
        //now class consists of attribute and behaviuors
        //Attributes
        s1.name = "Deepika"; // can access attribute
        s1.age = 30;
        s1.eat (10); ////can access bahaviour also
        System.out.println (s1);

        Studentclass s2 = new Studentclass();
        s1.name = "Sweety"; // can access attribute
        s1.age = 50;
        s1.eat (50); ////can access bahaviour also
        System.out.println (s2);
//Output = will share only the memory addresses.not objects
    }

}
