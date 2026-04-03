# AGENTS.md - CoreJavaLearning Project Guide

## Project Overview
**coreJavaLearning** is a comprehensive educational Java repository focused on Data Structures & Algorithms (DSA), Java 8+ features, and multithreading concepts. This is a learning resource organized by topic, not a production application. All code is exploratory and example-driven.

## Project Structure & Key Conventions

### Core Organization Pattern
```
src/
├── Main.java                 # Entry point (demo/test runner)
├── recursion/                # Recursion pattern examples (e.g., RecursionExample1AddTwoNumbers.java)
├── datastructures/           # Graph, tree, connected components implementations
├── java8/                    # Java 8+ features (lambdas, streams)
│   └── streams/              # Stream API challenges with EmployeeRecord.java as test data
└── multithreadingPractice/   # Concurrency basics, synchronization examples
    └── basics/               # ExploreSynchronized.java shows Thread + Runnable patterns
```

### File Naming Conventions
- **Example files**: `RecursionExample{N}{TopicName}.java` - numbered demos
- **Challenge files**: `Stream{Name}Beginner.java`, `{Topic}Challenge.java`
- **Test/Reference files**: Files may contain sample `main()` methods but are not unit tests (no JUnit present)
- **Learning documents**: `*_problems.md` files (easy_problems.md, medium_problems.md, hard_dsa_problems.md, dsa_problems.md)

### Build & Runtime Environment
- **Java Version**: JDK 25 (see `coreJavaLearning.iml` LANGUAGE_LEVEL="JDK_25")
- **Build Tool**: None (IntelliJ IDEA project structure - no Maven/Gradle)
- **Compilation**: Direct `javac` compilation from command line or IDE
- **Execution**: Static `main()` methods in individual classes or via Main.java entry point
- **Docker Support**: Exists (`Dockerfile`, `docker-compose.yml`) for containerized demos

### Project Metadata Files
- **Problem Collections**: `easy_problems.md` (333 problems), `medium_problems.md` (333 problems), `hard_dsa_problems.md` (333 problems) - reference documentation, NOT auto-generated
- **Challenge Guides**: `src/java8/Java-lambda-streams-challenges.md` - structured progression (Beginner → Intermediate → Advanced)
- **Utilities**: `TEMP.json`, `output_fixed_length.txt` - temporary scratch files for testing

## Key Code Patterns & Examples

### Streams & Functional Programming (src/java8/streams/)
- **Data Model**: `EmployeeRecord.java` - Record type with salary, department fields; static factory `getEmplyeeRecordList()`
- **Pattern**: Use `Predicate<EmployeeRecord>` for filtering, `Collectors.groupingBy()` for aggregation
- **Example**: StreamChallengeBeginner.java shows filtering (salary > 80k), distinct, count, max/min with `reduce()`
- **Key Learning**: Streams don't mutate; always return new collections

### Multithreading (src/multithreadingPractice/basics/)
- **Pattern**: `Task implements Runnable` with shared List state
- **Example**: ExploreSynchronized.java - 3 threads accessing shared taskList; demonstrates synchronized keyword
- **Key Pattern**: Thread naming with `setName()`, `start()` (not `run()`), optional `join()` for coordination

### Recursion (src/datastructures/recursion/)
- **Pattern**: Recursive methods with base cases; often work with arrays/primitives
- **Example Files**: RecursionExample{N}* demonstrates patterns like decimal-to-binary conversion, brace matching
- **Key Convention**: Examples are numbered and topic-named for easy discovery

## Development Workflow

### Running Code
```
# Compile individual file
javac src/java8/streams/StreamChallengeBeginner.java

# Run via Main.java with arguments
java -cp src Main "arg1" "arg2"

# Run without arguments (uses default loop)
java -cp src Main
```

### Adding New Examples
1. Create file in appropriate package directory (e.g., `src/recursion/RecursionExample5YourTopic.java`)
2. Include `package` statement matching folder structure
3. Add static `main()` method or implement `Runnable` for multithreading
4. Document with problem description comments

### Testing Strategy
- **No automated tests** (no JUnit dependency)
- Validation via manual console output inspection
- Some files contain inline assertions or print-based verification (e.g., ExploreSynchronized output tracking)

## Critical Integration Points & External Dependencies

### Zero External Dependencies
- Pure Java standard library only (java.util, java.lang, java.util.stream, java.util.concurrent)
- No frameworks, no build tool configuration

### Problem Reference Documents
- **333 Problems per Difficulty**: easy_problems.md (1-333), medium_problems.md (334-666), hard_dsa_problems.md (667-999)
- **Format**: Each problem has: Topic tags, Problem statement, Input/Output examples
- **Not Executable**: These are reference/study materials, NOT auto-generated from code

### Docker for Learning
- Dockerfile demonstrates Java containerization with JDK 25
- docker-compose.yml available but exploratory (learning infrastructure patterns)
- Main.java accepts CLI args and prints greetings/numbers (demo entry point)

## AI Agent Guidance

### When Modifying Code
- Keep file organization by topic/pattern (don't flatten structure)
- Maintain static factory methods in record/model classes (e.g., EmployeeRecord.getEmplyeeRecordList())
- Add new packages before adding new major topics
- Include `package` statements and appropriate imports even for learning examples

### When Documenting
- Problem markdown files are **reference only** - do NOT expect code to match 100%
- Example file names should follow `ExampleN{Topic}` or `Challenge{Name}` pattern
- Main.java is the primary entry point; keep it simple for demos

### Build Considerations
- All files must compile with JDK 25; use modern Java features where appropriate (Records, Text Blocks, Streams)
- No IDE-specific code; prioritize standard library solutions

---

**Last Updated**: 2026-03-22  
**Language Level**: Java 25 (JDK_25)  
**Project Type**: Educational / DSA Learning Repository

