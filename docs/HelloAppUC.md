# HelloApp Use Case Documentation

**Author:** Riddhim

## Use Case 1: Print a Basic Greeting in the Console

### Description
UC1 is the foundation of the HelloApp project. This use case focuses on printing a basic greeting message ("Hello World") to the console. It demonstrates the most fundamental concept in programming: output to the console using Java.

### Disadvantages of Previous Use Case(s)
**N/A** - This is the first use case, serving as the starting point for the application.

### Preconditions
- Java Development Kit (JDK) 11 or higher must be installed
- The system must have a terminal or command-line interface available
- The HelloApp.java file must be compiled

### Main Flow

#### Step 1: Program Initialization
- The Java Runtime Environment (JRE) loads the HelloApp class
- The main method is identified as the entry point
- The JRE begins executing the main method

#### Step 2: Console Output
- The `System.out.println("Hello World")` statement is executed
- The text "Hello World" is sent to the standard output stream
- A newline character is appended automatically by `println()`

#### Step 3: Program Termination
- After the main method completes execution, the program terminates
- The console displays the output and returns control to the user

### Postconditions
- The message "Hello World" has been displayed on the console
- The program has terminated successfully with no errors
- The system is ready for the next command

### Hints

1. **System.out vs System.err**
   - `System.out` is used for normal output
   - `System.err` is used for error messages

2. **println() vs print()**
   - `println()` adds a newline character at the end
   - `print()` does not add a newline

3. **String Literals**
   - Text enclosed in double quotes is a String literal
   - The content must exactly match what you want to display

4. **Main Method Signature**
   - The main method must be `public static void main(String[] args)`
   - This is the standard entry point for Java applications

5. **Class Name and File Name**
   - The public class name must match the filename
   - In this case: `HelloApp.java` contains the `HelloApp` class

### Code Snippets and Examples

#### Basic UC1 Implementation
```java
public class HelloApp {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

#### Compilation and Execution
```bash
# Compile the Java file
javac HelloApp.java

# Run the compiled class
java HelloApp
```

#### Expected Output
```
Hello World
```

#### Alternative Variations

**Using print() instead of println():**
```java
System.out.print("Hello World");
```
Output: `Hello World` (without newline at the end)

**Using multiple println statements:**
```java
System.out.println("Hello");
System.out.println("World");
```
Output:
```
Hello
World
```

**Using concatenation:**
```java
String greeting = "Hello";
String target = "World";
System.out.println(greeting + " " + target);
```
Output: `Hello World`

**Using formatted output:**
```java
System.out.printf("Hello World\n");
```
Output: `Hello World`

### Concepts Learned

#### 1. **Public Access Modifier**
- The `public` keyword makes the class accessible from anywhere
- Allows other classes and external programs to access this class
- Required for the entry point class in an application

#### 2. **Static Keyword**
- The `static` keyword means the method belongs to the class, not to instances
- Static methods can be called without creating an object of the class
- The main method must be static to serve as the program entry point

#### 3. **Void Return Type**
- The `void` keyword indicates the method returns no value
- The main method performs actions but doesn't return a result to the JRE
- Useful for methods that perform actions rather than compute values

#### 4. **Main Method Signature**
- `public static void main(String[] args)` is the standard Java entry point
- The JRE specifically looks for this exact method signature
- The `args` parameter receives command-line arguments as an array of Strings

#### 5. **System.out PrintStream**
- `System.out` is a static reference to the standard output stream (console)
- It is an instance of the `PrintStream` class
- PrintStream provides methods like `println()`, `print()`, and `printf()`

#### 6. **String Literals**
- String literals are sequences of characters enclosed in double quotes
- They are immutable in Java (cannot be changed after creation)
- Java stores identical String literals in a common memory area (String Pool)

#### 7. **Output Methods Comparison**

| Method | Description | Newline |
|--------|-------------|---------|
| `println(String)` | Prints a string and a newline | Yes |
| `print(String)` | Prints a string without a newline | No |
| `printf(String, ...)` | Prints formatted output | No (unless included in format) |

#### 8. **Java Program Execution Flow**
1. Source code (.java) is written
2. Compiler (javac) converts it to bytecode (.class)
3. JRE (java) loads and executes the bytecode
4. The main method is the starting point of execution

#### 9. **Console/Standard Output (stdout)**
- The default output stream for console-based applications
- Text sent to System.out appears in the terminal/console
- Different from file output or GUI windows

#### 10. **Program Termination**
- When the main method completes, the program terminates
- If there are no errors, the program exits with status 0
- If there's an unhandled exception, the program exits with a non-zero status

### Testing Checklist

- [ ] Java source file creates without syntax errors
- [ ] File compiles successfully with `javac`
- [ ] Program runs without throwing exceptions
- [ ] Output displays "Hello World" exactly as specified
- [ ] Output appears on a new line (due to println)
- [ ] Program terminates gracefully after output

### Next Steps

Once UC1 is mastered, proceed to:
- **UC2**: Accept one name via command-line input and greet that user
  - Learn how to use command-line arguments
  - Understand how to access the `args` array
  - Implement personalized greetings

### Additional Resources

- [Java Documentation - System.out](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/System.html#out)
- [Java Documentation - PrintStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html)
- [Java Naming Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-136091.html)

---

## Use Case 2: Display Greeting with Command-Line Argument

### Description
UC2 enhances the basic functionality of UC1 by accepting a user's name as a command-line argument and displaying a personalized greeting. This introduces the concept of command-line input and conditional logic to customize application behavior based on user input.

### Disadvantages of Previous Use Case
UC1 is limited because it only displays a static message. To make the application more interactive and useful, it should accept user input and personalize the output based on that input. UC2 addresses this limitation by enabling user input through command-line arguments.

### Preconditions
- Java Development Kit (JDK) 11 or higher must be installed
- The system must have a terminal or command-line interface available
- The HelloApp.java file must be compiled
- User may optionally provide a name as the first command-line argument

### Main Flow

#### Scenario 1: With Command-Line Argument
- User runs the application with a name argument: `java HelloApp John`
- Application initializes and the JRE loads the HelloApp class
- The main method checks if arguments exist using `args.length > 0`
- Since arguments were provided, the application reads the name from `args[0]`
- Application displays "Hello, John!" to the console
- Application terminates successfully

#### Scenario 2: Without Command-Line Arguments
- User runs the application without arguments: `java HelloApp`
- Application initializes and the JRE loads the HelloApp class
- The main method checks if arguments exist using `args.length > 0`
- Since no arguments were provided, the application uses a default greeting
- Application displays "Hello, World!" to the console
- Application terminates successfully

### Postconditions
- A personalized greeting has been displayed based on the command-line argument provided (or a default greeting if no argument)
- The program has terminated successfully with no errors

### Hints

1. **Command-line Arguments**
   - Arguments are passed to the main method as the String[] args parameter
   - Access the first argument using args[0], second using args[1], etc.

2. **Array Length Check**
   - Always check if arguments exist before accessing them to avoid ArrayIndexOutOfBoundsException
   - Use `args.length > 0` to verify at least one argument exists

3. **String Concatenation**
   - Use the + operator to combine strings: `"Hello, " + name + "!"`
   - Multiple strings can be concatenated in sequence

4. **Conditional Execution**
   - Use if-else statements to control program flow
   - Different code paths execute based on whether arguments are provided

5. **Default Values**
   - Always provide a fallback value when user input is optional
   - Ensures predictable behavior even when user doesn't provide input

### Code Snippets and Examples

#### UC2 Implementation
```java
public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
```

#### Compilation and Execution

**Compile the Java file:**
```bash
javac HelloApp.java
```

**Run with a name argument:**
```bash
java HelloApp Alice
```
Output: `Hello, Alice!`

**Run without arguments:**
```bash
java HelloApp
```
Output: `Hello, World!`

#### Using Maven

**Compile the project:**
```bash
mvn compile
```

**Run with a name argument:**
```bash
mvn exec:java -Dexec.mainClass="HelloApp" -Dexec.args="Alice"
```
Output: `Hello, Alice!`

**Run without arguments:**
```bash
mvn exec:java -Dexec.mainClass="HelloApp"
```
Output: `Hello, World!`

#### Alternative Implementation with Multiple Names

```java
public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        } else {
            System.out.println("Hello, World!");
        }
    }
}
```

This variation greets each name provided as an argument.

### Concepts Learned by Implementing UC2

#### 1. **Command-Line Arguments**
Command-line arguments are parameters passed to the program when it is executed. They are accessible through the `args` array in the main method signature. This allows the program to receive input without requiring interactive prompts.

#### 2. **Array Length Property**
The `args.length` property returns the number of command-line arguments provided. This is essential for checking if arguments exist before accessing array elements, preventing ArrayIndexOutOfBoundsException errors at runtime.

#### 3. **Array Indexing**
Arrays in Java are zero-indexed, meaning the first element is at index 0. The first argument is accessed using `args[0]`, the second using `args[1]`, and so forth. Attempting to access an index that doesn't exist throws an exception.

#### 4. **String Concatenation**
The `+` operator is used to combine strings together. For example:
- `"Hello, " + "Alice"` results in `"Hello, Alice"`
- `"Hello, " + name + "!"` combines three parts into a single string

#### 5. **Conditional Logic - If-Else Statement**
The if-else structure allows programs to execute different code based on conditions:
```java
if (condition) {
    // Code executes if condition is true
} else {
    // Code executes if condition is false
}
```

#### 6. **Boolean Expressions**
Expressions like `args.length > 0` evaluate to true or false. The `>` operator is a relational operator that checks if the left operand is greater than the right operand.

#### 7. **Default Values and Error Prevention**
Providing default/fallback values when user input is optional ensures the program behaves predictably. Instead of crashing when no input is provided, the program can offer a sensible default behavior.

#### 8. **Variable Declaration and Assignment**
Variables store values that can be used throughout the program. The statement `String name = args[0];` declares a String variable and assigns it the value of the first command-line argument.

#### 9. **Method Parameters and Data Types**
The `String[] args` parameter indicates that the main method receives an array of String objects. Understanding parameter types and how they're passed is fundamental to using command-line arguments.

#### 10. **Program Input and User Interaction**
UC2 demonstrates how programs can accept user input through command-line arguments, making applications interactive and flexible. Users can customize program behavior by providing different inputs.

### Testing Checklist

- [ ] Java source file compiles without syntax errors
- [ ] Program runs with no arguments and displays "Hello, World!"
- [ ] Program runs with one argument (e.g., "Alice") and displays "Hello, Alice!"
- [ ] Program runs with multiple arguments and greets the first one
- [ ] Output appears on a new line (due to println)
- [ ] Program terminates gracefully without errors
- [ ] Maven compilation command succeeds
- [ ] Maven execution with parameters works correctly

### Example Output

**Test Case 1: With name "John"**
```
Input: java HelloApp John
Output: Hello, John!
```

**Test Case 2: With name "Alice"**
```
Input: java HelloApp Alice
Output: Hello, Alice!
```

**Test Case 3: Without arguments**
```
Input: java HelloApp
Output: Hello, World!
```

**Test Case 4: Multiple arguments (only first is used)**
```
Input: java HelloApp John Doe
Output: Hello, John!
```

### Next Steps

Once UC2 is mastered, proceed to:
- **UC3**: Support optional argument handling with a default greeting path
  - Extend the program to handle more sophisticated argument patterns
  - Learn about switch statements and additional conditional logic
- **UC4**: Handle multiple command-line names in one execution
  - Implement loops to process all arguments
  - Learn about iteration and data processing

---

## Use Case 3: Display Greeting with Command-Line Argument or Default Message

### Description
UC3 enhances UC2 by providing a default value when no command-line argument is supplied. This use case combines the basic greeting functionality with graceful handling of missing input, making the application more robust and user-friendly. Users can now run the program with or without arguments without encountering errors.

### Disadvantages of Previous Use Case
UC2 only accepts a single command-line argument. If a user runs the program without providing an argument, the application will crash with an `ArrayIndexOutOfBoundsException`. This makes the program fragile and less user-friendly. UC3 addresses this limitation by providing a sensible default value ("World") when no argument is supplied.

### Preconditions
- Java Development Kit (JDK) 11 or higher must be installed
- The system must have a terminal or command-line interface available
- The HelloApp.java file must be compiled
- User may optionally provide a name as a command-line argument

### Main Flow

#### Scenario 1: With Command-Line Argument
- User runs the application with a name argument: `java HelloApp John`
- Application initializes and checks if arguments were provided
- The ternary operator evaluates: `args.length > 0` is true
- Application assigns `args[0]` ("John") to the name variable
- Application displays "Hello, John!" to the console
- Application terminates successfully

#### Scenario 2: Without Command-Line Arguments
- User runs the application without arguments: `java HelloApp`
- Application initializes and checks if arguments were provided
- The ternary operator evaluates: `args.length > 0` is false
- Application assigns the default value "World" to the name variable
- Application displays "Hello, World!" to the console
- Application terminates successfully

### Postconditions
- A personalized greeting has been displayed with either the provided name or the default "World"
- The program has terminated successfully without errors

### Hints

1. **Check Array Length Before Access**
   - Always verify `args.length` before accessing array elements
   - Use `args.length > 0` to check if at least one argument exists

2. **Ternary Operator Syntax**
   - Format: `condition ? valueIfTrue : valueIfFalse`
   - Compact way to assign values based on a condition
   - Improves code readability and reduces boilerplate

3. **Default Values**
   - Provide sensible defaults for optional inputs
   - "World" is a common default in greeting applications

4. **Defensive Programming**
   - Always anticipate missing or invalid input
   - Handle edge cases gracefully to prevent runtime errors

### Code Snippets and Examples

#### UC3 Implementation (Using Ternary Operator)
```java
public class HelloApp {
    public static void main(String[] args) {
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + name + "!");
    }
}
```

#### UC3 Alternative Implementation (Using if-else)
```java
public class HelloApp {
    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }
        System.out.println("Hello, " + name + "!");
    }
}
```

#### Compilation and Execution

**Compile the Java file:**
```bash
javac HelloApp.java
```

**Run with a name argument:**
```bash
java HelloApp Alice
```
Output: `Hello, Alice!`

**Run without arguments (uses default):**
```bash
java HelloApp
```
Output: `Hello, World!`

#### Using Maven

**Compile the project:**
```bash
mvn compile
```

**Run with default:**
```bash
mvn exec:java -Dexec.mainClass="HelloApp"
```
Output: `Hello, World!`

**Run with argument:**
```bash
mvn exec:java -Dexec.mainClass="HelloApp" -Dexec.args="Alice"
```
Output: `Hello, Alice!`

### Concepts Learned by Implementing UC3

#### 1. **Ternary Operator (Conditional Operator)**
The ternary operator (`? :`) is a shorthand for if-else statements:
- **Syntax:** `condition ? valueIfTrue : valueIfFalse`
- **Components:**
  - Condition: Boolean expression (e.g., `args.length > 0`)
  - valueIfTrue: Value assigned if condition is true (e.g., `args[0]`)
  - valueIfFalse: Value assigned if condition is false (e.g., `"World"`)
- **Example:** `String name = (args.length > 0) ? args[0] : "World";`

#### 2. **Default Values**
Providing default/fallback values ensures the application doesn't fail when expected input is missing:
- Improves user experience
- Prevents runtime exceptions
- Makes programs more user-friendly and robust
- Common pattern in real-world applications

#### 3. **Defensive Programming**
Defensive programming means writing code that anticipates and handles potential issues:
- Check array lengths before accessing elements
- Validate user input before using it
- Provide graceful error handling
- Prevents crashes and unexpected behavior

#### 4. **Operator Precedence**
Understanding the order of operations is crucial:
- Parentheses have highest precedence
- In `(args.length > 0) ? args[0] : "World"`, parentheses ensure the condition is evaluated first
- Using parentheses explicitly clarifies intent and prevents errors

#### 5. **Control Flow with Ternary vs If-Else**
Both accomplish the same goal but have different use cases:
- **Ternary:** Best for simple, one-line conditional assignments
- **If-else:** Better for complex logic or multiple statements

#### 6. **Null Safety and Edge Cases**
Be aware of edge cases:
- Empty arguments array (`args.length == 0`)
- What happens if user provides empty string as argument
- How to handle unexpected input types

#### 7. **Program Flexibility**
Designing programs to work with optional inputs:
- Makes applications more versatile
- Accommodates different user preferences
- Enhances overall usability
- Shows professional coding practices

### Testing Checklist

- [ ] Java source file compiles without syntax errors
- [ ] Program runs without arguments and displays "Hello, World!"
- [ ] Program runs with one argument and displays correct personalized greeting
- [ ] Program runs with different names and displays each correctly
- [ ] Output appears on a new line (due to println)
- [ ] Program terminates gracefully without errors
- [ ] Maven compilation command succeeds
- [ ] Maven execution with and without parameters works correctly

### Example Output

**Test Case 1: With name "Alice"**
```
Input: java HelloApp Alice
Output: Hello, Alice!
```

**Test Case 2: With name "Bob"**
```
Input: java HelloApp Bob
Output: Hello, Bob!
```

**Test Case 3: Without arguments (default)**
```
Input: java HelloApp
Output: Hello, World!
```

### Next Steps

Once UC3 is mastered, proceed to:
- **UC4**: Handle multiple command-line names in one execution
  - Learn about looping through arrays
  - Understand String.join() method
  - Process multiple inputs in a single execution

---

## Use Case 4: Display Greeting with Multiple Command-Line Arguments

### Description
UC4 extends the functionality of UC3 by allowing multiple names to be passed as command-line arguments in a single execution. The application processes all provided names and displays a single personalized greeting for everyone. If no names are provided, it defaults to "World". This use case demonstrates array iteration and string manipulation techniques.

### Disadvantages of Previous Use Case
UC3 only accepts a single command-line argument. If a user wants to greet multiple people, they would need to run the program multiple times, which is inefficient and doesn't reflect real-world scenarios. UC4 addresses this by allowing multiple names to be passed in a single run using `String.join()` to combine them with proper formatting.

### Preconditions
- Java Development Kit (JDK) 11 or higher must be installed
- The system must have a terminal or command-line interface available
- The HelloApp.java file must be compiled
- User may optionally provide zero or more names as command-line arguments

### Main Flow

#### Scenario 1: With Multiple Command-Line Arguments
- User runs the application with multiple names: `java HelloApp Alice Bob Charlie`
- Application initializes and checks if arguments were provided
- The ternary operator evaluates: `args.length > 0` is true
- Application uses `String.join(", ", args)` to combine all names: "Alice, Bob, Charlie"
- Application displays "Hello, Alice, Bob, Charlie!" to the console
- Application terminates successfully

#### Scenario 2: With Single Argument
- User runs the application with one name: `java HelloApp John`
- Application initializes and checks if arguments were provided
- The ternary operator evaluates: `args.length > 0` is true
- Application uses `String.join(", ", args)` to return: "John"
- Application displays "Hello, John!" to the console
- Application terminates successfully

#### Scenario 3: Without Any Arguments
- User runs the application without arguments: `java HelloApp`
- Application initializes and checks if arguments were provided
- The ternary operator evaluates: `args.length > 0` is false
- Application assigns the default value "World"
- Application displays "Hello, World!" to the console
- Application terminates successfully

### Postconditions
- A personalized greeting has been displayed with all provided names separated by commas, or defaults to "Hello, World!"
- The program has terminated successfully without errors
- All names are included in a single greeting message

### Hints

1. **String.join() Method**
   - Format: `String.join(delimiter, array)`
   - Efficiently combines all array elements with a delimiter
   - Returns a single string with elements separated by the delimiter

2. **Array Iteration**
   - Can use for loops to process array elements
   - `String.join()` is more efficient for simple joining operations
   - Useful for understanding how arrays work internally

3. **Multiple Arguments Handling**
   - All arguments in `args` should be processed, not just the first one
   - Use `args.length` to determine how many arguments were provided
   - Empty args array indicates no arguments provided

4. **Delimiter Formatting**
   - Use ", " (comma-space) as delimiter for readability
   - Ensures proper spacing between names
   - Follows standard English formatting conventions

### Code Snippets and Examples

#### UC4 Implementation (Using String.join())
```java
public class HelloApp {
    public static void main(String[] args) {
        String names = (args.length > 0) ? String.join(", ", args) : "World";
        System.out.println("Hello, " + names + "!");
    }
}
```

#### UC4 Alternative Using StringBuilder
```java
public class HelloApp {
    public static void main(String[] args) {
        String names;
        if (args.length > 0) {
            names = String.join(", ", args);
        } else {
            names = "World";
        }
        System.out.println("Hello, " + names + "!");
    }
}
```

#### Compilation and Execution

**Compile the Java file:**
```bash
javac HelloApp.java
```

**Run with multiple names:**
```bash
java HelloApp Alice Bob Charlie
```
Output: `Hello, Alice, Bob, Charlie!`

**Run with single name:**
```bash
java HelloApp John
```
Output: `Hello, John!`

**Run without arguments (uses default):**
```bash
java HelloApp
```
Output: `Hello, World!`

#### Using Maven

**Compile the project:**
```bash
mvn compile
```

**Run with multiple arguments:**
```bash
mvn exec:java -Dexec.mainClass="HelloApp" -Dexec.args="Alice Bob Charlie"
```
Output: `Hello, Alice, Bob, Charlie!`

**Run with single argument:**
```bash
mvn exec:java -Dexec.mainClass="HelloApp" -Dexec.args="John"
```
Output: `Hello, John!`

**Run without arguments:**
```bash
mvn exec:java -Dexec.mainClass="HelloApp"
```
Output: `Hello, World!`

### Concepts Learned by Implementing UC4

#### 1. **Array Handling**
Understanding how to work with arrays is fundamental:
- Access array elements using indices: `args[0]`, `args[1]`, etc.
- Check array length with `args.length`
- All command-line arguments are stored in the `args` array
- Arrays are zero-indexed (first element is at index 0)

#### 2. **String.join() Method**
`String.join()` is a efficient way to combine array elements:
- **Signature:** `String.join(delimiter, array)`
- **Delimiter:** String to place between elements (e.g., ", ")
- **Returns:** Single string with all elements joined by delimiter
- **Advantages:** Clean, readable, efficient for large arrays

#### 3. **For Loop (Review)**
For loops allow iteration through arrays:
```java
for (int i = 0; i < args.length; i++) {
    // Process args[i]
}
```
- Useful when you need element index
- Can break or continue based on conditions

#### 4. **Array Iteration Patterns**
Different ways to iterate through arrays:
- Traditional for loop: Good when you need the index
- Enhanced for loop: Simpler syntax when you don't need the index
- Using utility methods like `String.join()`: Most efficient for simple operations

#### 5. **StringBuilder (Concept Introduction)**
StringBuilder efficiently builds strings in loops:
- More efficient than concatenation with `+` operator in loops
- Mutable, unlike String
- Reduces memory overhead when building large strings
- Common pattern in performance-sensitive code

#### 6. **Variable Scope**
Understanding where variables are accessible:
- Variables declared in if/else blocks have limited scope
- Ternary operator assigns to a single variable with broader scope
- Important for code organization and preventing errors

#### 7. **User Experience with Multiple Inputs**
Practical considerations for multi-parameter applications:
- Single execution mode is better than multiple runs
- Users expect to provide all inputs at once
- Proper formatting (commas, spaces) improves readability
- Scalability: Works with any number of names

#### 8. **Delimiter Usage**
Proper formatting is important:
- ", " (comma-space) is standard in English
- Improves readability of output
- Different delimiters for different contexts
- Important for professional-looking output

### Testing Checklist

- [ ] Java source file compiles without syntax errors
- [ ] Program runs without arguments and displays "Hello, World!"
- [ ] Program runs with one argument and displays correct greeting
- [ ] Program runs with two arguments and displays both names correctly
- [ ] Program runs with three or more arguments and displays all names
- [ ] All names are properly separated by commas and spaces
- [ ] Output appears on a new line (due to println)
- [ ] Program terminates gracefully without errors
- [ ] Maven compilation command succeeds
- [ ] Maven execution with various argument counts works correctly

### Example Output

**Test Case 1: Multiple names**
```
Input: java HelloApp Alice Bob Charlie
Output: Hello, Alice, Bob, Charlie!
```

**Test Case 2: Single name**
```
Input: java HelloApp John
Output: Hello, John!
```

**Test Case 3: No arguments (default)**
```
Input: java HelloApp
Output: Hello, World!
```

**Test Case 4: Two names**
```
Input: java HelloApp Emma David
Output: Hello, Emma, David!
```

### Next Steps

Once UC4 is mastered, proceed to:
- **UC5**: Read a single name from standard input
  - Learn about `Scanner` class
  - Handle interactive user input (not command-line arguments)
  - Understand input validation

---

## More Use Cases Coming Soon

- UC5: Read a single name from standard input
- UC6: Read and process multiple names from standard input
- UC7: Store entered names in memory and list them on request
- UC8: Add removal support for stored names
- UC9: Extract input-processing logic into dedicated methods
- UC10: Move name-management responsibilities into a separate class
- UC11: Persist names to storage and reload them across runs
- UC12: Render greeting text in banner-style output for enhanced display
