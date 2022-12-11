import java.util.Scanner;
public class ASCII {

    public static void main(String[] args) {
        // object scanner type to get string from the user 
        Scanner ch = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String CHAR = ch.nextLine();
        // loop on the string to get the ascii value of every letter of the string
        for (int i =0 ; i< CHAR.length() ; i++) {
            // USE CHARAT()METHOD TO CONVERT THE STRING TYPE OF THE LETTER IN INDEX (i) TO CHAR TYPE AND GET ITS ASCII VALUE
            int ascii = CHAR.charAt(i);
            // print the ascii of every letter 
            System.out.println("The ASCII value of " + CHAR.charAt(i) + " is: " + ascii);
        }
    }
}