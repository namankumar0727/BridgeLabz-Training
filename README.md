## 📅 Week 3 – Day 1: Data Structures (Linked Lists)  
**📆 Date:** 2 January 2026  

---

### 🔹 Topics Covered

- Introduction of Data Structures  
- Key Features of Data Structures in Java  
- Types of Data Structures in Java  
### Singly Linked List
- Each node contains data and a reference to the next node.
- Traversal is possible only in one direction.
- Efficient insertion and deletion compared to arrays.
  
### Doubly Linked List 
- Each node contains data, previous, and next references.
- Traversal is possible in both forward and backward directions.
- Requires extra memory due to additional pointer.
  
### Circular Linked List  
- Last node points back to the first node.
- No NULL references in the list.
- Useful in applications like circular queues and scheduling.

### ✅ Practice Summary
- Solved **multiple problems** based on Linked List concepts  
- Practiced operations such as:
  - Insertion and deletion
  - Traversal techniques
  - Understanding node structure and pointers  
- Strengthened understanding of linear data structures  
- Focused on problem-solving and logical implementation  

**Code Link:** [LinkedList and its types](https://github.com/namankumar0727/BridgeLabz-Training/tree/DSA-practice/DSA-Practice/gcr-codebase/JavaDsaPractice/src/com/linkedlist)

---

## Day 2: Stack, Queue & Hashing  
**📆 Date:** 4 January 2026  

### 🔹 Topics Covered

- **Stack**
  - Linear data structure following LIFO (Last In First Out)
  - Operations: push, pop, peek
  - Used in function calls, expression evaluation, and undo operations

- **Queue**
  - Linear data structure following FIFO (First In First Out)
  - Operations: enqueue, dequeue, front
  - Used in scheduling, buffering, and resource management

- **HashMap & Hashing Function**
  - HashMap stores data in key–value pairs
  - Hashing function converts keys into hash codes
  - Enables fast insertion, deletion, and searching
  - Handles collisions using techniques like chaining

### ✅ Practice Summary
- Solved **multiple problems** based on Stack and Queue operations  
- Practiced usage of HashMap for efficient data storage and retrieval  
- Understood working of hashing functions and collision handling  
- Focused on time complexity and performance optimization  

**Code Link:** [Hashmap, Stack & Queue](https://github.com/namankumar0727/BridgeLabz-Training/tree/DSA-practice/DSA-Practice/gcr-codebase/JavaDsaPractice/src/com/stackandqueues)

---
## Day 3: Sorting Algorithms  
**📆 Date:** 5 January 2026  

### 🔹 Topic Overview
Sorting is a fundamental operation in computer science used to arrange elements in a specific order (ascending or descending).  
Different sorting algorithms are used based on data size, performance needs, and memory constraints.

### 🔹 Sorting Algorithms Covered

- **Bubble Sort**
  - Simple comparison-based sorting algorithm
  - Repeatedly swaps adjacent elements if they are in the wrong order
  - Suitable for small datasets and learning basics

- **Insertion Sort**
  - Builds the sorted list one element at a time
  - Efficient for small or nearly sorted datasets

- **Selection Sort**
  - Repeatedly selects the minimum element and places it at the correct position
  - Simple but inefficient for large datasets

- **Merge Sort**
  - Divide and Conquer algorithm
  - Recursively divides the array and merges sorted subarrays
  - Efficient and stable sorting technique

- **Quick Sort**
  - Divide and Conquer algorithm using a pivot element
  - Very fast in average cases
  - Widely used in real-world applications

- **Heap Sort**
  - Based on Binary Heap data structure
  - Converts array into a heap and sorts elements
  - Efficient and does not require extra memory

- **Counting Sort**
  - Non-comparison based sorting algorithm
  - Works efficiently for small range integer values

- **Radix Sort**
  - Non-comparison based sorting technique
  - Sorts numbers digit by digit
  - Used for large datasets with fixed digit length

- **Bucket Sort**
  - Distributes elements into buckets and sorts them individually
  - Effective when input is uniformly distributed

### ✅ Practice Summary
- Studied multiple sorting algorithms and their working principles  
- Compared sorting techniques based on time and space complexity  
- Understood use-cases for comparison and non-comparison based sorting  
- Strengthened algorithmic thinking and problem-solving skills  

**Code Link :** [Sorting algorithms](https://github.com/namankumar0727/BridgeLabz-Training/tree/DSA-practice/DSA-Practice/gcr-codebase/JavaDsaPractice/src/com/sorting)

---

## 🗓 Day 5: Runtime Analysis & Big O Notation
**📆 Date:** 7 January 2026  

### 🔹 Topics Covered

#### 1️⃣ Algorithm Analysis
- Time and space complexity fundamentals  
- Big O Notation for performance evaluation  
- Best-case, average-case, and worst-case analysis  

#### 2️⃣ Optimization Techniques
- Choosing appropriate data structures  
- Reducing nested loops and redundant computations  
- Using memoization and dynamic programming  
- Avoiding inefficient recursion  
- Optimizing memory usage  

#### 3️⃣ Performance Benchmarking
- Execution time measurement using `System.nanoTime()`  
- Comparative analysis of algorithms and data structures  

### ✅ Practice Summary
Solved **6 performance analysis problems** focused on runtime optimization:
- Linear Search vs Binary Search Performance Comparison  
- Sorting Large Data (Bubble Sort vs Merge Sort vs Quick Sort)  
- String vs StringBuilder vs StringBuffer Performance  
- FileReader vs InputStreamReader Efficiency  
- Recursive vs Iterative Fibonacci Comparison  
- Searching Performance: Array vs HashSet vs TreeSet  

### 🧠 Scenario-Based Implementations (OOPM)
- **BookBazaar** – Digital Bookstore System  
- **LoanBuddy** – Loan Approval Automation  
- **ParkEase** – Smart Parking Management System  

**Code Link :** [Day 05 – Runtime Analysis & Optimization](https://github.com/namankumar0727/BridgeLabz-Training/tree/DSA-Practice/DSA-Practice/gcr-codebase/JavaDsaPractice/src/com/complexityanalysis)

---

## 🧠 Solved Scenario-Based Questions on DSA  
**📆 Date:** 10 January 2026  

### 🔹 Problem Statements

#### 1️⃣ BookShelf – Library Organizer *(HashMap + Linked List)*
- Library system where books are arranged based on **genre** and **author**  
- Uses a **HashMap** to map `genre → list of books`  
- Each genre contains a **LinkedList** of books  
- The list is dynamically updated when books are **borrowed** or **returned**

#### 2️⃣ BrowserBuddy – Tab History Manager *(Doubly Linked List + Stack)*
- Custom browser developed by Neha  
- Each open tab maintains its browsing history  
- Supports **Back** and **Forward** operations  
- Uses a **Doubly Linked List** to manage browsing history  
- Uses a **Stack** to store closed tabs for reopening  

#### 3️⃣ AmbulanceRoute – Emergency Patient Navigation *(Circular Linked List)*
- Hospital buildings connected in a circular sequence:  
  `Emergency → Radiology → Surgery → ICU → Emergency`  
- Ambulance follows a **Circular Linked List**  
- Helps determine the nearest available unit for emergency treatment  

👉 **Code Reference :** 👉 [Scenario-Based Questions](https://github.com/namankumar0727/BridgeLabz-Training/tree/DSA-Practice/DSA-Practice/Scenerio-based/DsaScenerioBased/bin/com)

---

## 🧠 Solved Scenario-Based Questions on DSA  
**📆 Date:** 12 January 2026  

### 🔹 Problem Statements

#### 1️⃣ CallCenter – Customer Queue Manager *(Queue + HashMap)*
- Telecom call center where customers are queued based on **call time**  
- **Priority customers** are handled using a special queue  
- A **HashMap** tracks how many times each user has called during the current month  

#### 2️⃣ TrainCompanion – Compartment Navigation System *(Doubly Linked List)*
- Long-distance train application for passenger navigation  
- Passengers can move to the **next** or **previous** compartment  
- Allows searching for services like **pantry** and **WiFi**  
- Each compartment is represented as a node in a **Doubly Linked List**  

#### 3️⃣ TextEditor – Undo/Redo Functionality *(Stack)*
- Basic text editor developed by Shanaya  
- Every action (insert, delete, format) is pushed onto a **Stack**  
- **Undo** operation pops the last action from the stack  
- **Redo** operation uses a second stack to reapply undone actions  

### 🔗 Code Reference
👉 **Code Reference :** 👉 [Scenario-Based Questions](https://github.com/namankumar0727/BridgeLabz-Training/tree/DSA-Practice/DSA-Practice/Scenerio-based/DsaScenerioBased/bin/com)

---
## 🧠 Solved Scenario-Based Questions on DSA  

**📆 Date:** 13 January 2026  

## 📘 Java DSA Scenario

### 🔹 Problem Statements

#### 1️⃣ TrafficManager – Roundabout Vehicle Flow  
*(Circular Linked List + Queue)*  
- Manages vehicle movement at a roundabout  
- Circular linked list represents continuous traffic flow  
- Queue manages vehicle entry and exit  

#### 2️⃣ BookShelf – Library Organizer  
*(HashMap + Linked List)*  
- Organizes books by **category and order**  
- HashMap for fast category lookup  
- Linked List maintains book sequence  

#### 3️⃣ SmartCheckout – Supermarket Billing Queue  
*(Queue + HashMap)*  
- Handles customer billing at checkout counters  
- Queue manages customer order  
- HashMap stores item prices and quantities  

#### 4️⃣ ParcelTracker – Delivery Chain Management  
*(Singly Linked List)*  
- Tracks parcel movement through delivery centers  
- Each node represents a delivery stage  

#### 5️⃣ ExamProctor – Online Exam Review System  
*(Stack + HashMap + Functions)*  
- Reviews student answers during online exams  
- Stack manages answer revisions  
- HashMap stores question–answer mappings  

👉 **Code Reference :** 👉 [Scenario-Based Questions]([Scenario-Based Questions](https://github.com/namankumar0727/BridgeLabz-Training/tree/DSA-Practice/DSA-Practice/Scenerio-based/DsaScenerioBased/bin/com))

---

## 🧠 Solved Scenario-Based Questions on DSA  

**📆 Date:** 15 January 2026  

## 🔢 Sorting Algorithm Scenarios

### 🔹 Problem Statements

#### 1️⃣ HospitalQueue – Patient Sorting by Criticality  
*(Bubble Sort)*  
- Hospital system to manage patients based on **criticality level**  
- Patients with higher criticality are prioritized  
- **Bubble Sort** is used to repeatedly compare and swap patients until sorted  

#### 2️⃣ SmartShelf – Real-Time Book Arrangement  
*(Insertion Sort)*  
- Digital bookshelf system that arranges books as they are added  
- New books are inserted into their correct position  
- **Insertion Sort** efficiently handles nearly sorted data  

#### 3️⃣ ZipZipMart – Daily Sales Summary Report  
*(Merge Sort)*  
- E-commerce platform generating daily sales reports  
- Large sales data is divided and merged in sorted order  
- **Merge Sort** ensures stable and efficient sorting for big datasets  

#### 4️⃣ EventManager – Ticket Price Optimizer  
*(Quick Sort)*  
- Event management system to optimize and sort ticket prices  
- Uses a **pivot-based partitioning** approach  
- **Quick Sort** provides fast average-case performance  

#### 5️⃣ ExamCell – Student Rank Generator  
*(Merge Sort)*  
- Examination system that generates student ranks based on marks  
- Handles large numbers of students efficiently  
- **Merge Sort** maintains correct ordering and consistency  

👉 **Code Reference :** 👉 [Scenario-Based Questions]([Scenario-Based Questions](https://github.com/namankumar0727/BridgeLabz-Training/tree/DSA-Practice/DSA-Practice/Scenerio-based/DsaScenerioBased/bin/com))

---

## 🧠 Solved Scenario-Based Questions on DSA  

**📆 Date:** 16 January 2026  

- **RoboWarehouse** – Shelf Loading Robot *(Insertion Sort)*
- **CinemaHouse** – Movie Time Sorting *(Bubble Sort)*
- **CropMonitor** – Sensor Data Ordering *(Quick Sort)*
- **ArtExpo** – Sort Artists by Registration Time *(Insertion Sort)*
- **FleetManager** – Vehicle Maintenance Scheduler *(Merge Sort)*

👉 **Code Reference :** 👉 [DSA Scenerio-Based]([Scenerio Based Questions ](https://github.com/namankumar0727/BridgeLabz-Training/tree/DSA-Practice/DSA-Practice/Scenerio-based/DsaScenerioBased/bin/com))
