/**
 * HelloApp - Use Cases 1-3: Display greetings in the console
 * 
 * This application demonstrates:
 * - UC1: Printing a basic greeting "Hello World"
 * - UC2: Accepting a name as command-line argument and displaying a personalized greeting
 * - UC3: Handling optional argument with default value using ternary operator
 * 
 * @author Riddhim
 * @version 3.0.0
 */
public class HelloApp {
    
    /**
     * Main method - entry point of the application
     * Handles UC1-UC3: From basic greeting to optional argument with default value
     * 
     * @param args command-line arguments (optional single name for personalized greeting)
     */
    public static void main(String[] args) {
        // UC3: Accept optional command-line argument with default value using ternary operator
        // If no arguments provided, defaults to "World"
        
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + name + "!");
    }
}
