import java.util.Scanner;
public class removeComma {
    // function to remove comma
    public static String Rem_comma(String str) {
        String text = str;
        String comma = ",";
        String textWithoutComma = "";
        // loop to convert evry char of the string into char data type 
        for (int i =0 ; i < text.length() ; i++) {
            // check if the char in index (i) is comma or not 
            if(!(Character.toString(text.charAt(i)).equals(comma))){
                // if it is not comma will store it into new variable with string data type 
                textWithoutComma = textWithoutComma + Character.toString(text.charAt(i));
            }
        }

        // return the string whithout comma
        return  textWithoutComma;
    }
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the string with comma : ");
        String text = str.nextLine();
        text = text.replace(",",""); // USING BUILT IN METHOD 
        System.out.println("Using built in method : " + text);
        System.out.println(Rem_comma(text));
    }
}