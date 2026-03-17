# HelloApp Use Case Documentation

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

## More Use Cases Coming Soon

- UC2: Accept one name via command-line input and greet that user
- UC3: Support optional argument handling with a default greeting path
- UC4: Handle multiple command-line names in one execution
- UC5: Read a single name from standard input
- UC6: Read and process multiple names from standard input
- UC7: Store entered names in memory and list them on request
- UC8: Add removal support for stored names
- UC9: Extract input-processing logic into dedicated methods
- UC10: Move name-management responsibilities into a separate class
- UC11: Persist names to storage and reload them across runs
- UC12: Render greeting text in banner-style output for enhanced display
