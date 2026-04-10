/**
 * HelloApp - Use Case 7: Display Hello with Multiple Command-Line Arguments using String.join() Method
 * 
 * This use case demonstrates the use of the String.join() static method to efficiently concatenate
 * multiple names with a specified delimiter. This is the most concise and elegant approach.
 * 
 * @author Riddhim
 * @version 7.0.0
 */
public class HelloApp {
    public static void main(String[] args) {
        String names = (args.length > 0) ? String.join(", ", args) : "World";
        System.out.println("Hello, " + names + "!");
    }
}
