package ch16pc03;
import java.util.Scanner;

/**
 * String Reverser
 * Using recursion reverse a string of characters input by the user
 * @author frank
 */
public class Ch16pc03 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String string, result;
        
        // Instantiate Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Request input from user
        System.out.println("Welcome to the String Reverser.");
        System.out.print("Please enter text to be reversed: ");
        string = keyboard.nextLine();
        
        // Call the recursive reverser method
        result = reverse(string);
        
        // Display results to the user
        System.out.println("The text you input '" + string + "' is '" + result + "' reversed.");
    }
    
    /**
     * Reverse the sequence of characters in a string
     * @param string String The text to be reversed
     * @return String The reversed text
     */
    private static String reverse(String string) {
        if (string == null || string.length() <= 1) {
            return string;
        }
        return reverse(string.substring(1)) + string.charAt(0);
    }
}
