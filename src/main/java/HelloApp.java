/**
 * HelloApp - Use Case 2: Display Hello with Command-Line Argument
 * 
 * This use case builds on UC1 by accepting a name as a command-line argument.
 * If a name is provided, it prints "Hello, <name>!", otherwise it defaults to "Hello, World!"
 * 
 * @author Riddhim
 * @version 2.0.0
 */
public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
