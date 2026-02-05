# BridgeLabz-Training
### 📅 Week 6 – Java Functional Programming

---

## Day 1: Lambda Expressions & Method References
**Date:** 27 January 2026

## Topics Covered
- Lambda Expressions
- Functional Interfaces
- Target Typing & Type Inference
- Closures & Effectively Final Variables
- Method References
- Types of Method References
- Java Functional Programming features (Java 8+)
- Writing concise, readable, and expressive code using lambdas and method references

## Why Lambda Expressions?
- Reduce boilerplate code
- Improve code readability
- Enable functional-style programming
- Widely used with Streams API

## Why Method References?
- Cleaner alternative to simple lambdas
- Improves clarity when calling existing methods
- Encourages code reuse

## Questions Practice
- Solved multiple problems using lambdas and method references
- Smart Home Lighting Automation
- Custom Sorting in E-Commerce
- Notification Filtering
- Invoice Object Creation
- Name Uppercasing
- Hospital Patient ID Printing

Code Reference: [Java Lambda & Method References](https://github.com/namankumar0727/BridgeLabz-Training/tree/Java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Features/src/com)

---

## Day 2: Interfaces & Functional Interfaces
**Date:** 28 January 2026

## Topics Covered
- Defining and Implementing Interfaces (Best Practices)
- Functional Interfaces
- Default Methods in Interfaces
- Static Methods in Interfaces
- Marker Interfaces
- Java interface design and functional programming concepts
- Abstraction, loose coupling, and multiple inheritance using interfaces

## Best Practices for Interfaces
- Keep interfaces small and focused (Single Responsibility)
- Prefer functional interfaces for lambda compatibility
- Use default methods sparingly
- Avoid breaking changes in public interfaces

## Why Functional Interfaces?
- Exactly one abstract method
- Enable usage of lambda expressions
- Improve code flexibility and readability

## Default & Static Methods
- Default methods allow behavior addition without breaking implementations
- Static methods belong to the interface, not the implementing class

## Marker Interfaces
- Do not contain methods
- Used to mark a class with special behavior
- Examples: Serializable, Cloneable

## Questions Practice
- Smart Device Control Interface
- Multi-Vehicle Rental System
- Digital Payment Interface
- Temperature Alert System
- String Length Checker
- Background Job Execution
- Password Strength Validator
- Unit Conversion Tool
- Date Format Utility
- Payment Gateway Integration
- Data Export Feature
- Smart Vehicle Dashboard
- Data Serialization for Backup
- Cloning Prototype Objects
- Sensitive Data Tagging

Code Reference: [Java Interfaces Practice](https://github.com/namankumar0727/BridgeLabz-Training/tree/Java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Features/src/com)

---

## Day 3: Stream Operations & Parallel Streams
**Date:** 29 January 2026

## Topics Covered
- Intermediate Operations
  - filter
  - map
  - flatMap
  - distinct
  - sorted
  - peek
  - limit
  - skip
- Terminal Operations
  - collect
  - forEach
  - reduce
  - count
  - anyMatch
  - allMatch
  - noneMatch
- Stateless vs Stateful Operations
  - Stateless: filter, map
  - Stateful: sorted, distinct
- Ordered vs Unordered Streams
  - Ordered streams preserve encounter order
  - Unordered streams allow performance optimization
- Parallel Streams
  - Enable multi-threaded processing
  - Improve performance for large data sets
  - Order not guaranteed unless preserved
- forEach(): Iterable vs Stream
  - Iterable forEach is sequential and ordered
  - Stream forEach may be unordered, especially in parallel streams

## Questions Practice
- Top 5 Trending Movies
- Hospital Doctor Availability
- Insurance Claim Analysis
- Filtering Expiring Memberships
- Transforming Names for Display

Code Reference: [Stream Operations & Parallel Streams](https://github.com/namankumar0727/BridgeLabz-Training/tree/Java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Features/src/com)


---

## Day 4: Collectors – Roles and Capabilities
**Date:** 30 January 2026

## Concept
- Collectors in Java 8 are utility methods used with Stream.collect()
- Used to accumulate stream elements into collections, maps, strings, or statistical summaries

## Roles of Collectors
- Transform Data
- Aggregate Data
- Group Data
- Partition Data

## Common Collector Capabilities
- toList(), toSet(), toMap()
- joining()
- groupingBy()
- partitioningBy()
- summarizingInt()

## Example
Map<Character, List<String>> grouped =
Arrays.asList("apple", "banana", "avocado")
.stream()
.collect(Collectors.groupingBy(s -> s.charAt(0)));

## Questions Practice
- Student Result Grouping
- Word Frequency Counter
- Order Revenue Summary
- Employee Salary Categorization
- Library Book Statistics

Code Reference: Collectors – [Roles and Capabilities](https://github.com/namankumar0727/BridgeLabz-Training/tree/Java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Features/src/com)
