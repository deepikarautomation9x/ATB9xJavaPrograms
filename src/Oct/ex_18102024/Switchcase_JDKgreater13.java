package Oct.ex_18102024;

public class Switchcase_JDKgreater13 {
    public static void main(String[] args) {
        //JDK>13 onwards special facility to pass multiple cases 001.002.003
        int itemcode = 003;
        switch(itemcode){
            case 001, 002, 003:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004, 006, 007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}