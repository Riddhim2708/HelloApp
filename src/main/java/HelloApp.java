/**
 * HelloApp - Use Case 4: Display Hello with Multiple Command-Line Arguments
 * 
 * This use case extends UC3 to handle multiple names provided as command-line arguments.
 * It uses String.join() to combine multiple names with commas.
 * 
 * @author Riddhim
 * @version 4.0.0
 */
public class HelloApp {
    public static void main(String[] args) {
        String names = (args.length > 0) ? String.join(", ", args) : "World";
        System.out.println("Hello, " + names + "!");
    }
}
