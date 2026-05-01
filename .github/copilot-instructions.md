# Copilot Instructions for UTS Bookstore System

## Project Overview
This is a Java-based bookstore management system implemented as a university assignment. Each student implements a specific data structure module. See [README.md](README.md) for detailed project description, roles, and module specifications.

## Build and Run Commands
- **Compile all**: `javac -cp Shared *.java */*.java` (run from project root)
- **Run main class**: `java -cp .;Shared Main` (Windows) or `java -cp .:Shared Main` (Linux/Mac)
- **Note**: No build tool; use JDK directly. Implementations are currently incomplete—start with Shared classes.

## Architecture and Boundaries
- **Modular design**: Separate folders for each student's data structure (e.g., Ibnu(S1)/BookCatalog.java implements dynamic array).
- **Shared entities**: Book, Customer, Transaction classes in Shared/ folder.
- **Data structures**: ArrayList (catalog), Queue (customers), Stack (undo), HashMap (genres), Deque (orders).
- **Integration**: No main integration yet; create a driver class to test modules.

## Project Conventions
- **Naming**: PascalCase for classes, camelCase for methods/variables.
- **Structure**: Flat hierarchy with student folders and Shared/.
- **Packages**: Default package; suggest adding `package bookstore;` for organization.
- **Documentation**: Use Javadoc comments; extend README.md for build instructions.

## Potential Pitfalls
- **Classpath issues**: Always include Shared/ in -cp; missing causes ClassNotFoundException.
- **Platform differences**: Use `;` (Windows) or `:` (Linux/Mac) for classpath separators.
- **Incomplete code**: Most .java files are stubs; implement core logic before testing.
- **No tests**: Add manual testing or JUnit for data structure validation.

## Key Files and Patterns
- **Shared/**: Core OOP entities—implement these first.
- **Student folders**: Exemplify data structure implementations; focus on one module at a time.
- **README.md**: Link for architecture and specs; avoid duplication here.