/**
 * HelloApp - Use Cases 1-4: Display greetings in the console
 * 
 * This application demonstrates:
 * - UC1: Printing a basic greeting "Hello World"
 * - UC2: Accepting a name as command-line argument and displaying a personalized greeting
 * - UC3: Handling optional argument with default value using ternary operator
 * - UC4: Processing multiple command-line arguments and greeting all names
 * 
 * @author Riddhim
 * @version 4.0.0
 */
public class HelloApp {
    
    /**
     * Main method - entry point of the application
     * Handles UC1-UC4: From basic greeting to multiple name processing
     * 
     * @param args command-line arguments (optional names for personalized greetings)
     */
    public static void main(String[] args) {
        // UC4: Accept multiple command-line arguments and display personalized greeting for all
        // If no arguments provided, defaults to "World"
        
        String names = (args.length > 0) ? String.join(", ", args) : "World";
        System.out.println("Hello, " + names + "!");
    }
}
