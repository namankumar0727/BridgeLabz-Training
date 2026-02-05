# BridgeLabz-Training
### 📅 Week 7: Software Design Pattern Priciples 

---

## Day 1: Introduction to Design Principles
**Date:** 1 February 2026

## Topics Covered
- SOLID Principles
  - Single Responsibility Principle (SRP)
  - Open/Closed Principle (OCP)
  - Liskov Substitution Principle (LSP)
  - Interface Segregation Principle (ISP)
  - Dependency Inversion Principle (DIP)
- General Design Principles
  - Don't Repeat Yourself (DRY)
  - Keep It Simple, Stupid (KISS)
  - You Aren't Gonna Need It (YAGNI)

## Overview
- Design principles provide guidelines for writing clean, maintainable, scalable, and extensible software
- They reduce tight coupling, improve readability, and simplify future enhancements

## Why Design Principles Matter
- Improve maintainability and scalability
- Reduce code duplication and complexity
- Encourage loose coupling and high cohesion
- Make systems easier to extend and test

---


---

## Day 2: Introduction to GoF Design Patterns & UML Designing
**Date:** 2 February 2026

## Topics Covered
- Introduction to GoF Design Patterns
  - What are Design Patterns
  - Gang of Four (GoF) Overview
  - Purpose and Benefits of Design Patterns
- Categories of GoF Design Patterns
  - Creational Patterns
  - Structural Patterns
  - Behavioral Patterns

## Design Patterns Studied
- Singleton Pattern
  - Ensures only one instance of a class exists
  - Provides a global point of access
- Factory Pattern
  - Creates objects without exposing instantiation logic
  - Promotes loose coupling
- Observer Pattern
  - Defines one-to-many dependency between objects
  - Notifies observers on state change
- Builder Pattern
  - Separates object construction from representation
  - Useful for creating complex objects step by step

## UML Designing
- Class diagrams for design pattern representation
- Identifying relationships
  - Association
  - Inheritance
  - Dependency
- Visualizing object interactions and responsibilities

## Why Use Design Patterns?
- Reusable and proven solutions
- Improves code flexibility and maintainability
- Encourages best practices in software design
- Makes systems easier to understand and extend

## Questions Practice
- Smart University Library Management System
- Library Management System (LMS) with GoF Patterns

Code Reference: [Pattern design question](https://github.com/namankumar0727/BridgeLabz-Training/tree/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/DesignPatternPractice/src/com/designpattern)


---

## Day 3: Introduction to Java Multithreading

## Core Concepts
- Process
  - Independent program execution with its own memory space
  - Can contain multiple threads
  - Lives until all non-daemon threads finish
- Thread
  - Smallest unit of execution
  - Shares process memory with independent execution paths
  - Cannot exist without a process

## What is Multithreading?
- Allows multiple threads to execute concurrently
- Improves performance through parallel execution
- Enhances responsiveness in GUI and server applications

## Pros and Cons of Multithreading
- Pros
  - Efficient CPU utilization
  - Faster execution using parallelism
  - Better performance on multi-core systems
  - Improved application responsiveness
  - Thread failures do not crash the entire process
- Cons
  - Increased code complexity
  - Difficult debugging and testing
  - Risk of deadlock and starvation
  - Synchronization overhead

## Thread Lifecycle
- New
- Runnable
- Running
- Blocked / Non-Runnable
- Terminated

## Creating Threads in Java
- Extending the Thread class
- Implementing the Runnable interface

## Thread Class Features
- start(), run()
- getName(), setName()
- sleep(), join(), yield()
- isAlive(), getState()
- getPriority(), setPriority()
- interrupt(), isInterrupted()

## Thread Types
- User Threads
- Daemon Threads

## Key Takeaways
- Multithreading improves performance but requires careful design
- Proper synchronization is critical
- Prefer Runnable for better design flexibility
- Deprecated methods like stop() and suspend() should be avoided

## Practice Problems
- Download Manager
- Banking System with Multiple Transactions
- Restaurant Order Processing System
- Thread State Monitoring System
- Print Shop Job Scheduler

Code Reference: [Multithreading-questions](https://github.com/namankumar0727/BridgeLabz-Training/tree/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/DesignPatternPractice/src/com/multithreading)
