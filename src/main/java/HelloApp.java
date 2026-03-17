/**
 * HelloApp - Use Cases 1 & 2: Display greetings in the console
 * 
 * This application demonstrates:
 * - UC1: Printing a basic greeting "Hello World"
 * - UC2: Accepting a name as command-line argument and displaying a personalized greeting
 * 
 * @author Riddhim
 * @version 2.0.0
 */
public class HelloApp {
    
    /**
     * Main method - entry point of the application
     * Handles both UC1 (basic greeting) and UC2 (personalized greeting with command-line args)
     * 
     * @param args command-line arguments (optional name for personalized greeting)
     */
    public static void main(String[] args) {
        // UC2: Accept command-line argument and display personalized greeting
        // If no arguments provided, display default greeting
        
        if (args.length > 0) {
            // User provided a name as command-line argument
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // No arguments provided, use default greeting
            System.out.println("Hello, World!");
        }
    }
}
