/**
 * HelloApp - Use Case 3: Display Hello with Ternary Operator
 * 
 * This use case refactors UC2 to use a ternary operator for cleaner code.
 * It demonstrates a more concise way to handle the conditional logic.
 * 
 * @author Riddhim
 * @version 3.0.0
 */
public class HelloApp {
    public static void main(String[] args) {
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + name + "!");
    }
}
