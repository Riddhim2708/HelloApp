/**
 * HelloApp - Use Case 5: Display Hello with Multiple Command-Line Arguments using Enhanced For Loop
 * 
 * This use case demonstrates the use of an enhanced for loop (for-each loop) to iterate through
 * command-line arguments. If no arguments are provided, it displays the default greeting.
 * Uses conditional logic to avoid trailing commas.
 * 
 * @author Riddhim
 * @version 5.0.0
 */
public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            for (String name : args) {
                if (nameBuilder.length() > 0) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
            }
            System.out.println("Hello, " + nameBuilder + "!");
        }
    }
}
