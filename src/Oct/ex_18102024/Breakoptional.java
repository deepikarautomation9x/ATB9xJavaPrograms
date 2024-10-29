package Oct.ex_18102024;

public class Breakoptional {
    public static void main(String[] args) {
        int i=0;
        for( i=0; i<10 ;i++);
        switch(i){
            case 0:

            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Working day");
                break;
            case 5:
                case 6:
                case 7:
                    case 8:
                        case 9:
                            case 10:
                    System.out.println("Weekend");
                    break;
            default:
                System.out.println("Invalid input");

        }
    }
}
