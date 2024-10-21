package Oct.ex_18102024;

public class ifcondition_switchInterview {
    public static void main(String[] args) {
        int a = 10;
        switch (a){}      //output = Valid systax as int is allowed (Nothing is printed)

        //Example 2
        public static void main(String[] args) {
            char ch = 'A'; // 65
            switch (ch) {
                case 65:
                    System.out.println("A");
            }

//        boolean b = true; not allowed in case of switch
//        switch (b) {
//        }

            long a11 = 30l;
            switch ((int) a11) {
            }

            int a = 98;
            switch (a){
                case 98:
                    System.out.println("98");
//            case 98: Dublicate cases not allowed
//                System.out.println("98");
            }

        }
    }
    }
}
