/**
 * HelloApp - Use Case 6: Display Hello with Multiple Command-Line Arguments using substring() to Remove Trailing Delimiter
 * 
 * This use case demonstrates the use of the substring() method to remove the trailing delimiter
 * after constructing the string with an enhanced for loop. This is a cleaner approach than
 * using conditional logic inside the loop.
 * 
 * @author Riddhim
 * @version 6.0.0
 */
public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            // Remove the trailing ", "
            if (nameBuilder.length() > 0) {
                nameBuilder.setLength(nameBuilder.length() - 2);
            }
            System.out.println("Hello, " + nameBuilder + "!");
        }
    }
}
