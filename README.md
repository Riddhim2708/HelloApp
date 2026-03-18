# HelloApp

A progressive Java console application that demonstrates core programming concepts through incremental use case implementations. This project serves as a learning tool for Java fundamentals, starting with simple console output and evolving toward more complex features.

## Repository

**GitHub:** [Riddhim2708/HelloApp](https://github.com/Riddhim2708/HelloApp)

## Project Overview

HelloApp is a structured learning project that introduces Java development concepts incrementally:

- **UC1:** Basic console output - Print "Hello World"
- **UC2:** Command-line arguments - Accept and display a user's name
- **UC3:** Conditional logic - Use ternary operators for cleaner code
- **UC4:** Array handling - Process multiple command-line arguments

## Features

The project progressively introduces:
- **Console I/O:** System.out.println() for output
- **Command-line Arguments:** Parsing args[] from the main method
- **Conditional Logic:** If-else statements and ternary operators
- **String Manipulation:** String concatenation and String.join()
- **Future Enhancements:** Standard input, collections, persistence, and banner format

## Technology Stack

- **Language:** Java 17
- **Build Tool:** Apache Maven
- **Version Control:** Git & GitHub

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.6 or later

### Building the Project

```bash
mvn clean compile
```

### Running the Application

```bash
# Default (no arguments)
mvn exec:java -Dexec.mainClass="HelloApp"

# With a single name
mvn exec:java -Dexec.mainClass="HelloApp" -Dexec.args="Alice"

# With multiple names
mvn exec:java -Dexec.mainClass="HelloApp" -Dexec.args="Alice Bob Charlie"
```

## Expected Output

```
Hello, World!
Hello, Alice!
Hello, Alice, Bob, Charlie!
```

## Branch Structure

- **main:** Production-ready code with all completed use cases
- **dev:** Development branch with integrated features
- **feature/UC*:** Feature branches for individual use cases

## Author

Riddhim

---

**Status:** Active Development | **Last Updated:** March 2026
