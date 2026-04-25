import java.util.Scanner;

public class StringManipulation {

    public static void main(String[]args){

        Scanner scan= new Scanner(System.in);

        //Ask user for input
        System.out.println("Enter a string");
        String txt= scan.nextLine();

        //Convert to lowercase and uppercase
        String lower = txt.toLowerCase();
        String upper= txt.toUpperCase();

        //Get length of the string
        int length = txt.length();

        //Output result
        System.out.println("\n--- String information ---");
        System.out.println("Original " + txt);
        System.out.println("Lowercase " + lower);
        System.out.println("Uppercase " + upper);
        System.out.println("Length " + length);


        //Print each character on a new line

        System.out.println("\n--- Character ---");
        for(int i =0; i< txt.length();i++){
            System.out.println(txt.charAt(i));
        }

        scan.close();
    }
}
