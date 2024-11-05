package Oct.ex_28102024Strings;

public class Stringfunctions {

        public static void main(String[] args)
        {

            String str = "Hello, World!";
            String anotherStr = "Java Programming";

            //Basic String function examples

            System.out.println("Original String: "+str);

            //1. Length of the string
            System.out.println("Length : "+str.length());

            //2.character at specific index --> starts from 0
            System.out.println("Character at index 1: "+str.charAt(1));
            System.out.println("Character at index 1: "+str.charAt(7));

            //3.Substring --> starts from 0 till (end-1)
            System.out.println("Substring: "+str.substring(0,5));
            System.out.println("Substring: " +str.substring(0,13));

            //4.Contains --> true or false
            System.out.println("Contains : " +str.contains("World"));
            System.out.println("Contains: " +str.contains("No"));

            //5.Starts With --> returns true or false
            System.out.println("Starts with Hello: " +str.startsWith("Hello"));
            System.out.println("Starts with Hello: " +str.startsWith("Mine"));

            //6.Ends With --> True or false
            System.out.println("Ends with World: " + str.endsWith("World!"));
            System.out.println("Ends with World: " + str.endsWith("Hello"));

            //7.Index of-->returns the position of the first occurrence of specified character(s) in a string
            System.out.println("Index of : " +str.indexOf("World"));
            System.out.println("Index of : " +str.indexOf("!"));
            System.out.println("Index of : " +str.indexOf("Hello"));

            //8.Last index of-->returns the position of the last occurrence of specified character(s) in a string.
            System.out.println("Last index of : " + str.lastIndexOf("Hello"));
            System.out.println("Last index of : " + str.lastIndexOf("World"));
            System.out.println("Last index of : " + str.lastIndexOf("o"));

            //9.Equals - returns true or false
            System.out.println("Equals: " +str.equals("Hello World"));
            System.out.println("Equals: " +str.equals("Hello, World!"));
            System.out.println("Equals: " +str.equals("World!"));

            //10.Equals Ignore case
            System.out.println("Equals Ignore case: "+str.equalsIgnoreCase("hello, world"));


            //11.concatenate
            System.out.println("Concatenate: " +str.concat(" Java "));
            System.out.println("Concatenate: " +str.concat(" Welcome to Java Programming."));

            //12.Replace
            System.out.println("Replace: "+str.replace("World" , "Java"));

            //13.To Upper Case
            System.out.println("To Uppper case: " + str.toUpperCase());

            //14.To Lower case
            System.out.println("To Lower Case : "+str.toLowerCase());

            //15.Trim
            System.out.println("Trimmed String: " +str.trim());


        }

    }

