# Technical Questions & Answers

When answering these questions, it's essential to show your ability to communicate technical concepts in an easy-to-understand manner and describe your work processes.

## General
1. What is a SAN, and how is it used?
> SAN stands for a Storage Area Network. This is a high-speed, specialized network that gives block-level network access to storage. SANs are used to improve application availability, enhance performance, increase storage utilization and effectiveness and improve data security and protection.
2. When is it appropriate to denormalize database design?
> Denormalization is a database optimization technique used to improve a database's performance for specific queries. Denormalization may be needed when improvements need to be made to a database for it to meet your application requirements. However, denormalization will have an impact on what your database is able to do, so it's important to make sure it's needed for scalability or performance before choosing to use it as an optimization technique.
3. What is the role of continuous integration systems in the automated-build process?
> Continuous integration is a developmental process that requires developers to integrate code into a shared repository several times throughout the day. Each time the code is integrated, it's verified by the automated build. This allows for early detection of defects and problems within the codebase.
4. What is Big O notation
> Big O notation is a way to describe the performance or complexity of an algorithm - specifically how its runtime or space requirements grow as the input size increases. it's about scaling behavior, not exact time.

Common Big O complexities:

| Big O        | Name / Description             | Example Algorithms / Operations          |
|--------------|--------------------------------|-------------------------------------------|
| O(1)         | Constant time                  | Accessing an element in an array or HashMap |
| O(log n)     | Logarithmic time               | Binary search, tree operations (balanced BST) |
| O(n)         | Linear time                    | Loop through an array or list             |
| O(n log n)   | Linearithmic time              | Merge sort, quicksort (average case), heapsort |
| O(n²)        | Quadratic time                 | Bubble sort, selection sort, nested loops |
| O(2ⁿ)        | Exponential time               | Recursive Fibonacci, brute-force subsets  |
| O(n!)        | Factorial time                 | Traveling salesman, permutations brute-force |



5. What are SOLID Principles?
> Single Responsibility — class does one thing well. <br>
> Open/Closed — open to extension, closed to modification. <br>
> Liskov — subclass should substitute parent without breaking logic.<br>
> Interface Segregation — prefer smaller interfaces over fat ones.<br>
> Dependency Inversion — high-level modules should not depend on low-level modules.

6. [What's the difference between Authentication & Authorization?](https://www.freecodecamp.org/news/whats-the-difference-between-authentication-and-authorisation)

| **Authentication**                        | **Authorization**                           |
| ----------------------------------------- | ------------------------------------------- |
| Verifies **who you are**                  | Determines **what you are allowed to do**   |
| Checks identity (e.g., username/password) | Checks permissions and access rights        |
| Happens **before** authorization          | Happens **after** successful authentication |
| Answers: *“Are you really this user?”*    | Answers: *“Can you access this resource?”*  |


## Java
1. Why do people call Java the "platform-independent programming language?"
> One of the primary purposes for Java code was to create a programming language developers could use across multiple platforms without having to change the source code each time. Platform independence means the execution of your program doesn't depend on the operating system being used. Earlier programming languages, such as C and C++, require developers to compile separate source code for every operating system.
2. What are constructors in Java? Are there copy constructors in Java? What is constructor chaining? What happens when you create a new object in Java?
> A constructor initializes a newly created object. Java supports copy constructor, but it's a requirement to write your own code to do it. Constructor chaining is calling a constructor from another constructor. However, you cannot call a sub-class constructor using a super-class constructor.
3. What's an abstract class? How are abstract classes similar or different in Java from C++?
> An abstract class in Java is a class that cannot be instantiated on its own and may contain abstract methods (methods without a body). It’s meant to be extended by subclasses, which provide implementations for the abstract methods. We cannot create an instance of an abstract class.

| Feature                        | Java Abstract Class               | C++ Abstract Class (Pure Virtual)       |
|-------------------------------|---------------------------------|-----------------------------------------|
| Syntax to declare              | `abstract` keyword               | Use `= 0` to declare pure virtual method |
| Instantiation                 | Cannot instantiate abstract class | Cannot instantiate abstract class       |
| Methods                       | Can have both abstract and concrete methods | Can have both pure virtual and concrete methods |
| Multiple inheritance          | Not allowed with classes (only via interfaces) | Allowed                                 |
| Interfaces                   | Separate concept (interfaces)   | Pure virtual classes serve similar role |
| Constructors                 | Can have constructors           | Can have constructors                    |
| Fields (state)               | Can have instance variables     | Can have member variables                |
| Method implementation sharing| Allows code reuse via concrete methods | Allows code reuse via implemented methods |



4. What's object cloning?
> Object cloning in Java is the process of creating a copy of an existing object. <br>
> Done by implementing the Cloneable interface and overriding the clone() method from Object class.<br>
> The default clone() does a shallow copy — meaning it copies the object’s fields but not the objects those fields refer to.<br>
> For a deep copy, you need to manually clone nested objects inside.

5. What are the differences between HashMap and HashTable in Java?

| Feature              | HashMap                           | Hashtable                        |
|----------------------|----------------------------------|---------------------------------|
| Synchronization      | **Not synchronized** (not thread-safe) | **Synchronized** (thread-safe)  |
| Null keys/values     | Allows one null key and multiple null values | Does **not allow** null keys or null values |
| Performance          | Faster (due to lack of synchronization) | Slower (synchronized methods)   |
| Legacy API           | Part of **Java Collections Framework** (since Java 1.2) | Legacy class (from Java 1.0)    |
| Iterator             | Uses **fail-fast** iterator       | Uses **enumeration** (not fail-fast) |
| Usage                | Preferred in single-threaded or externally synchronized contexts | Used in legacy multi-threaded code |



6. How is inheritance in C++ different from Java?
> Java restricts multiple inheritance for simplicity and uses interfaces for that purpose. <br>
> C++ allows multiple inheritance but requires careful handling of ambiguities and destructor management. <br>
> Polymorphism requires explicit `virtual` in C++, while Java’s method overriding is virtual by default.

| Feature                         | Java Inheritance                     | C++ Inheritance                      |
|---------------------------------|------------------------------------|------------------------------------|
| Multiple inheritance            | **Not allowed** with classes (only via interfaces) | **Allowed** (multiple base classes) |
| Default inheritance access      | Classes use **single inheritance**; inheritance is `public` by default (if specified) | Default is **private** inheritance if not specified |
| Virtual functions              | Methods are **not virtual by default**; need `virtual` keyword for runtime polymorphism | Methods must be declared `virtual` to enable polymorphism |
| Abstract classes & interfaces  | Supports both (interfaces are separate) | Uses abstract classes with pure virtual functions; no separate interface keyword |
| Constructor chaining           | Subclass constructors must explicitly call superclass constructors using `super()` | Base class constructors called automatically or explicitly in initializer list |
| Object slicing                 | Avoided by using references or pointers | Can happen if object is assigned by value to base class variable |
| Destructor behavior            | Has **no explicit destructors** like C++, relies on GC | Needs **virtual destructor** in base class to avoid resource leaks |


7. Can you overload or override static methods in Java?
> *Overloading* means having multiple methods with the same name but different parameters (different signature). Static methods can be overloaded just like instance methods. <br>
> *Overriding*: Static methods belong to the class, not instances, so overriding (which is based on runtime polymorphism) does not apply. If a subclass defines a static method with the same signature, it hides the superclass method, but this is called method hiding, not overriding.
8. What's the purpose of a Java class?
> The purpose of a Java class is to serve as a blueprint or template for creating objects. It defines the structure (fields/attributes) and behavior (methods) that the objects created from it will have.
> * Encapsulates data (variables) and functions (methods) into one unit.
> * Supports object-oriented programming principles like encapsulation, inheritance, and polymorphism.
> * Enables code reuse and modularity by defining reusable components.
> * Allows you to create instances (objects) representing real-world entities or concepts.

9. What's the difference between implementing and extending classes in Java?

| Aspect                | Extending (Inheritance)                                          | Implementing (Interfaces)                                                         |
| --------------------- | ---------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| Keyword               | `extends`                                                        | `implements`                                                                      |
| What you inherit      | Inherits **concrete and/or abstract classes** (methods + fields) | Implements **methods declared in interfaces** (no fields, only method signatures) |
| Number allowed        | Single inheritance (one superclass only)                         | Multiple interfaces allowed                                                       |
| Purpose               | To **reuse code** and create an **is-a** relationship            | To provide a **contract** that classes must follow                                |
| Method implementation | Can inherit implemented methods and override                     | Must provide implementation for all abstract methods in interface                 |
| Fields                | Can inherit instance variables                                   | Interfaces cannot have instance fields (only constants)                           |
| When to use           | When you want to inherit behavior/state                          | When you want to define a capability or role                                      |

10. What's a variable?
> A variable in programming (including Java) is a named storage location in memory that holds a value which can change during program execution.
> * Has a name (identifier) to reference it.
> * Has a data type that defines what kind of values it can hold (e.g., `int`, `String`).
> * Can store data temporarily while the program runs.
> * The value of a variable can be changed (hence “variable”).


11. How can we declare a variable?
> ```Java
> int age = 25;          // 'age' is a variable of type int holding the value 25
> String name = "John";  // 'name' is a variable of type String holding "John"
> ```
12. What's the use of casting in Java?
> Casting in Java is used to convert a variable from one data type to another. <br>
> Why use casting?
>   * To change the type of a value explicitly when needed.
>   * To treat an object reference as a different type within an inheritance hierarchy.
>   * To work around type compatibility in situations like method calls, assignments, or arithmetic.
>
> Two casting types
>   * *Primitive casting*: Convert between primitive types (int, double, etc.), e.g.: `int i = (int) 3.14;`
>   * *Reference casting*: Convert between related object types (upcasting/downcasting), e.g. `Animal a = (Dog) new Animal();`
13. List some good practices for creating methods in a Java class.
> 1. *Clear and Descriptive Names*: Method names should clearly describe what the method does. Use verbs like calculateTotal(), sendEmail(), getUserName().
> 2. *Single Responsibility*: Each method should perform one clear task or responsibility. Avoid methods that try to do too much.
> 3. *Keep Methods Short*: Shorter methods are easier to read, understand, and maintain. If a method grows too long, consider splitting it.
> 4. *Use Proper Access Modifiers*: `private` if they’re internal helpers, `public` only for methods meant to be called from outside the class, `protected` or `package-private` as needed.
> 5. *Avoid Side Effects*: Methods should minimize unexpected changes to the state or external systems. Prefer methods that return results without changing global or shared state.
> 6. *Use Parameters Wisely*: Keep the number of parameters manageable (usually no more than 3-4), Use objects or parameter objects if many values are needed.
> 7. *Document Methods* (e.g. Javadoc)
> 8. *Handle Exceptions Properly*: Decide whether to catch exceptions inside the method or throw them. Avoid swallowing exceptions silently.
> 9. *Return Meaningful Values*: Methods should return useful information or void if no return is needed. Avoid returning ambiguous or null values without documentation.
> 10. *Consistent Naming Conventions*: Follow Java naming conventions: camelCase for methods, meaningful names.

14. Enumerate the syntaxes that can create a Java `main()` method for application development in Java.
> The Java main method is the entry point of a standalone Java application. Here are the common valid syntaxes to declare the main method:
> ```java
> public static void main(String[] args)
> // public: accessible by JVM
> // static: JVM can call without creating an instance
> // void: does not return anything
> // String[] args: command-line arguments
>
> // Alternatives:
> public static void main(String args[])      	// Array syntax with `[]` after variable name
> public static void main(String... args)	        // Uses varargs (Java 5+)
> public static void main(final String[] args)	// Using `final` modifier on parameter
> ```
15. What are the different types of Java comments?
> 1. *Single line comments*: used for short comments, e.g. `// comment`
> 2. *Multi-line comments (Block comments)*: Useful for longer explanations or temporarily commenting out blocks of code, can span multiple lines, e.g. `/* this is a comment */`
> 3. *Javadoc comments*: Used to generate API documentation with the javadoc tool. Typically placed before classes, methods, or fields., e.g.: `/** This is a javadoc comment */`
16. What's a switch statement in Java?
> A switch statement in Java is a control flow statement that allows you to execute different blocks of code based on the value of a variable (called the "switch expression"). It’s a cleaner alternative to multiple if-else statements when comparing a variable against many possible values.
17. How many types of Java loops are there? Describe the different types of Java looping constructs and how you can use them.
> 4:

| Loop Type                   | Description                                                                                                      |
| --------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| **for**                     | Executes a block a specific number of times, with initialization, condition, and update expressions in one line. |
| **while**                   | Executes as long as a condition is true; checks condition before each iteration.                                 |
| **do-while**                | Executes the block at least once, then repeats while the condition is true (checks after the iteration).         |
| **enhanced for (for-each)** | Iterates over elements of arrays or collections; cleaner syntax for traversing collections.                      |


18. How do you define a nested class in Java?
> A nested class in Java is a class defined within another class. Nested classes help logically group classes that are only used in one place and increase encapsulation.
19. What types of nested classes are there?

| Type                    | Description                                                                                                    |
| ----------------------- | -------------------------------------------------------------------------------------------------------------- |
| **Static nested class** | A static class defined inside another class; behaves like a top-level class but scoped inside the outer class. |
| **Inner class**         | A non-static nested class; associated with an instance of the outer class.                                     |
| **Local class**         | A class defined inside a method or block; scope limited to that method/block.                                  |
| **Anonymous class**     | A local class without a name; used for instant implementation, typically for interfaces or abstract classes.   |



20. Can you explain the purpose of a constructor in Java class?
> A constructor is a special method in a class that is called automatically when an object of that class is created. Its main purpose is to initialize the new object.
>
> Key points:
> * Same name as the class
> * No return type, not even void
> * Can be overloaded (multiple constructors with different parameters)
> * If you don’t define any constructor, Java provides a default no-argument constructor
> * Used to set initial values for object attributes or perform setup tasks
>
> Why use constructors?
> * To ensure the object starts its life with a valid state
> * To simplify object creation with initial parameters
> * To encapsulate initialization logic in one place
21. What's an exception and how do you handle them in Java? (Checked & unchecked exceptions)
> An exception in Java is an event that occurs during the execution of a program that disrupts the normal flow of instructions - typically an error or unexpected condition. <br>
> An `Exception` represents problems or abnormal conditions like division by zero, file not found, or null pointer access.<br>
> Subclasses of `java.lang.Exception` (checked exceptions) and `java.lang.RuntimeException` (unchecked exceptions). <br><br>
> To handle:
> ```java
>   try { // Code that might throw an exception
>     int result = 10 / 0;
> } catch (ArithmeticException e) { // Handle the exception
>     System.out.println("Cannot divide by zero!");
> } finally { // Optional block that always executes
>     System.out.println("Execution completed.");
> }
 > ```
22. Explain `try-with-resources`:

> It's a special form of the `try` statement introduced in Java 7. <br>
> Designed to automatically close resources (like files, streams, database connections) when the block finishes — no need for explicit finally blocks.<br>
> Works with any resource that implements the `java.lang.AutoCloseable` interface (including `Closeable`).<br>
> Ensures automatic resource management, prevents resource leaks (like forgetting to close a file). & makes code cleaner and easier to maintain.
> ```java
> try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
>     String line;
>     while ((line = br.readLine()) != null) {
>         System.out.println(line);
>     }
> } catch (IOException e) {
>     e.printStackTrace();
> }
> // br is automatically closed here, even if an exception occurs
> ```

23. What's the difference between a thread and a process?
> * A process is a self-contained program instance with its own memory.
> * A thread is a smaller execution unit inside a process that shares memory and resources with sibling threads.

| Aspect              | Process                                                        | Thread                                                                    |
| ------------------- | -------------------------------------------------------------- | ------------------------------------------------------------------------- |
| **Definition**      | An independent program in execution, with its own memory space | A lightweight unit of execution within a process                          |
| **Memory**          | Has its own separate memory (address space)                    | Shares memory (heap) and resources with other threads in the same process |
| **Overhead**        | More overhead due to separate memory and resources             | Less overhead, faster context switching                                   |
| **Communication**   | Inter-process communication (IPC) needed to communicate        | Can directly communicate via shared variables                             |
| **Creation**        | Created by the OS                                              | Created by the process (or by other threads)                              |
| **Execution**       | Runs independently                                             | Runs concurrently within the same process                                 |
| **Fault Isolation** | Fault in one process usually does not affect others            | Fault in one thread can affect the entire process                         |

24. What's the difference between `Hashtable`, `TreeMap` and `TreeSet` in Java?
> * *Hashtable*: Thread-safe hash-based map, no ordering, no null keys/values.
> * *TreeMap*: Sorted map by keys, not thread-safe, allows one null key.
> * *TreeSet*: Sorted set of unique elements (keys only), no duplicates, no nulls.

25. `HashMap` vs `LinkedHashMap` vs `TreeMap`
> * `HashMap`: stores pairs of key-values
> * `LinkedHashMap`: stores pairs of key-values while keeping their sequence
> * `HashMap`: aa

26. What is the difference between `ConcurrentHashMap` and `HashMap`?

| Feature                        | HashMap                                                                                           | ConcurrentHashMap                                                                           |
| ------------------------------ | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| **Thread Safety**              | Not thread-safe; concurrent modifications can cause data corruption or exceptions                 | Thread-safe; designed for concurrent access without locking the entire map                  |
| **Synchronization**            | No built-in synchronization                                                                       | Uses internal locking (lock striping) for better concurrency                                |
| **Null keys/values**           | Allows one `null` key and multiple `null` values                                                  | Does **not** allow `null` keys or values                                                    |
| **Performance in concurrency** | Poor when accessed by multiple threads; needs external synchronization                            | High concurrency; multiple threads can read/write simultaneously with minimal contention    |
| **Use case**                   | Single-threaded or externally synchronized access                                                 | Multi-threaded environments requiring thread-safe map with high performance                 |
| **Iteration consistency**      | Fail-fast iterator (throws `ConcurrentModificationException` if map is modified during iteration) | Weakly consistent iterator (reflects some but not necessarily all changes during iteration) |


27. Interfaces vs Abstract classes: similarities
> Similarities:
> 1. Both can define abstract methods
> 2. Both can be implemented/extended
> 3. Both can be used for polymorphism
> 4. Both can have static methods (for Interfaces in Java 8+)
> 5. Both can have default method implementations (for Interfaces in Java 8+)
> 6. Neither can be instantiated directly

28. Interfaces vs Abstract classes: differences
> Differences:
> 1. Inheritance
     >    * Interface: Multiple allowed
>    * Abstract: single only
> 2. Fields
     >    * Interface: `public static final` only
>    * Abstract: can have instance fields
> 3. Constructors
     >    * Interface: no
>    * Abstract: can define
> 4. Method types
     >    * Interface: Abstract, `default`, `static` (Java 8+)
>    * Abstract: Abstract, concrete
> 5. Access modifiers
     >    * Interface: All methods implicitly `public` (before Java 9)
>    * Abstract: Can use `private`, `protected`, etc.
> 6. State
     >    * Interface: Cannot hold state (no instance variables)
>    * Abstract: Can hold instance state
> 7. Use cases
     >    * Interface: Capability or behaviour
>    * Abstract: Base class for shared code/state

29. When should we use abstract classes and when interfaces?
> Inheritance when:
> * You are defining a capability, like Comparable, Iterable, or a listener.
> * You want multiple unrelated classes to implement a shared API.
> * You don’t need to store state.
> * You want to benefit from Java 8+ features like default or static methods for convenience.
    > Abstract class when:
> * You want to define a base class with shared code and state (fields).
> * You want to provide common constructor logic.
> * You want to control access (e.g., protected methods).
> * You are building a class hierarchy where inheritance makes semantic sense.


30. Where should we use an `ArrayList` and where should we prefer a `LinkedList`?
> * `ArrayList`: better for read-heavy logic
> * `LinkedList`: better for write-heavy logic

31. Explain what autoboxing & unboxing means
> Autoboxing: automatic conversion the Java compiler makes between primitive types & wrapper classes
> Unboxing: the other way
```text
  ┌  autoboxing  ⇘
int             Integer
  ⇖  unboxing    ┘
```

32. What does the `synchronized` word do in Java? What are the differences between `synchronized`, `volatile`, and `Lock`? What does `volatile` really do in terms of memory visibility?
> `synchronized` is a keyword used to control access to a block of code or method so that only one thread can execute it at a time for a given object (monitor).
> * It prevents race conditions by ensuring mutual exclusion.
> * It also establishes happens-before relationships, so changes made inside synchronized blocks are visible to other threads entering synchronized blocks on the same monitor.
>
> The `volatile` keyword is used for variables that are shared between threads.
> * When a variable is declared `volatile`, it guarantees two things:
    >   1. Visibility: When one thread updates the variable, all other threads immediately see the new value.
>   2. No caching: Threads will always read the value directly from main memory, not from a cached copy.
> * When a variable is declared volatile, reads and writes go straight to and from the main memory, not just CPU caches.
> * This means when one thread updates a volatile variable, other threads immediately see that update.
> * Writes to a volatile variable happen-before any subsequent reads of that variable.
> * This prevents threads from caching the variable locally and ensures fresh values are always read.
> * However, volatile does NOT provide atomicity for compound operations (like count++), only visibility.

| Feature                  | `synchronized`                                            | `volatile`                                                    | `Lock` (java.util.concurrent.locks.Lock)                                   |
| ------------------------ | --------------------------------------------------------- | ------------------------------------------------------------- | -------------------------------------------------------------------------- |
| **Purpose**              | Ensures **mutual exclusion** (only one thread at a time)  | Ensures **visibility** of changes to variables across threads | Provides **explicit locking** with more features (e.g., tryLock, fairness) |
| **Locking**              | Implicit locking via object monitor                       | No locking; only guarantees visibility                        | Explicit lock and unlock calls needed                                      |
| **Scope**                | Can synchronize entire methods or blocks                  | Only for variables                                            | Can lock arbitrary code blocks with flexible control                       |
| **Reentrancy**           | Synchronized blocks are **reentrant**                     | Not applicable                                                | Usually reentrant (e.g., ReentrantLock)                                    |
| **Performance**          | May cause blocking, potentially slower in high contention | Lightweight, minimal overhead                                 | More flexible and can be more performant in complex scenarios              |
| **Deadlock Possibility** | Possible if multiple locks used improperly                | Not applicable                                                | Possible if lock acquisition order not managed                             |
| **Features**             | Basic mutual exclusion and visibility                     | Visibility only, no mutual exclusion                          | Advanced features: tryLock, timed lock, interruptible lock                 |

33. Explain the key differences between streams & collections
> 1. Storage: Collections store elements, while streams do not store elements but rather process them on the fly.
> 2. Processing: Collections are processed sequentially, whereas streams can be processed in parallel.
> 3. Lazy vs Eager: Streams are lazy, meaning operations are executed only when the terminal operation is invoked. Collections are eager, meaning all operations are executed immediately.

34. How do you manage transactions in Java?
> JDBC: `conn.setAutoCommit(false)` / `conn.commit()` / `conn.rollback()` <br>
> Spring / Hibernate: `@Transactional` annotation <br>

35. What is a DataSource, and how is it different from DriverManager?
> DataSource is a more modern, flexible way to get DB connections.<br>
> Supports connection pooling, distributed transactions, and JNDI lookup.<br>
> Unlike DriverManager, it’s not hardcoded — it’s often managed by the application server.<br>

36. What is JNDI and how does it work
> JNDI (Java Naming and Directory Interface) is used to look up resources like DB connections, JMS queues, EJBs, etc.
> Promotes decoupling: you don’t hardcode connection strings — the container (e.g., Tomcat) configures it.

37. How is dependency injection handled in Java EE?
> Via annotations like @Inject, @EJB, @Resource, @PersistenceContext.
> CDI (Contexts and Dependency Injection) enables flexible, decoupled beans

38. How is connection pooling managed in Java EE?
> * Application servers (e.g., Tomcat, GlassFish) manage a connection pool for DataSource.
> * Configured via server config files or web.xml (older) / annotations (newer).
> * Pooling reduces the overhead of frequent DB connection creation.

39. What is variable shadowing?
> If the instance variable (within a class, outside a method) & a local variable (inside a method) have the same name

40. What are Java generics?
> Java Generics allow you to write code that works with different data types while providing compile-time type safety., e.g. `List<String> list = new ArrayList<>();`: the `list` contains `String` items only

41. What problems can occur with multithreading?
> * *Race Conditions*: when multiple threads access and modify shared data simultaneously without proper synchronization. Leads to unpredictable and incorrect results.
> * *Deadlocks*: When two or more threads are waiting for each other’s locks and none can proceed.
> * *Livelocks*: Threads keep changing state in response to each other but still can’t make progress.
> * *Starvation* : A thread never gets CPU time or access to resources because other threads keep dominating them.
> * *Data Inconsistency*: Happens when reads/writes to shared variables aren’t properly synchronized.
> * *Difficulty in Debugging and Testing*: since non deterministic behaviour
> * *Performance Overheads*: Poor thread management can cause:
    >    1. Excessive context switching
>    2. High memory usage
>    3. Decreased overall performance

42. How would you make a class thread-safe?
> 1. Use `synchronized` methods or blocks
> 2. Use `volatile` for visibility
> 3. Use atomic classes, e.g. `java.util.concurrent.atomic`
> 4. Use thread-safe collections, e.g. `ConcurrentHashMap`, `CopyOnWriteArrayList`
> 5. Use explicit locks (`Lock lock = new ReentrantLock();`)
> 6. Make the class immutable (No setters, final fields, initialized via constructor.)

43. Why and when would you use `ReentrantLock` over `synchronized`?
> You would use `ReentrantLock` over `synchronized` when you need more advanced locking control than `synchronized` provides.
> * You need timeout or interruptible locking.
> * You want fair locking (e.g., FIFO order).
> * You need multiple wait conditions (Condition objects).
> * You're building complex concurrent utilities or frameworks.

44. What’s the difference between `Thread` and `Runnable`?
> **Runnable** – Interface (Preferred for flexibility)
> Represents a task to be executed in a thread.
> Does not itself create or manage a thread.
> You pass a Runnable to a Thread object to run it.
> ```java
> Runnable task = () -> System.out.println("Running...");
> Thread thread = new Thread(task);
> thread.start();
> ```
> **Thread** – Class (Extends Runnable)
> Represents an actual thread of execution.
> You can subclass Thread and override its run() method, but this is less flexible.
> ```java
> class MyThread extends Thread {
>     public void run() {
>         System.out.println("Running...");
>     }
> }
> Thread t = new MyThread();
> t.start();
> ```

45. Explain the Java class loading process.
> The Java class loading process is how the Java Virtual Machine (JVM) loads .class files into memory so they can be used at runtime. It involves 3 main phases:
> 1. Loading
     >     * The JVM locates the .class file (from disk, JAR, etc.) using a ClassLoader.
>     * Converts bytecode into a Class object.
>     * Each class is loaded only once per ClassLoader.
>     * Java uses a hierarchical ClassLoader model:
        >       * Bootstrap ClassLoader (loads core Java classes)
>       * Extension ClassLoader (loads JDK extension libraries)
>       * Application ClassLoader (loads classes from your app’s classpath)
> 2. Linking
     >     * Links the loaded class into the JVM runtime.
>     * 3 substeps:
        >       1. *Verification*: Confirms bytecode is valid and safe to run
>       2. *Preparation*: Allocates memory for class variables and sets default values (`0`, `null`)
>       3. *Resolution*: Replaces symbolic references (e.g., class names) with direct memory references
> 3. Initialization
     >     * JVM executes static initializers and assigns final values to static fields.
>     * Happens only once per class when it’s first used (e.g., method call or instantiation).

46. What are memory areas in the JVM?
> The JVM divides memory into several logical areas to manage code, data, and execution efficiently.
> 1. Method Area (or Metaspace in Java 8+):
     >   * Stores class metadata, static variables, and constants.
>   * Shared among all threads.
> 2. Heap
     >   * Stores objects and instance variables.
>   * Shared across all threads.
>   * Managed by the Garbage Collector (GC).
> 3. Stack
     >   * Stores method frames (local variables, operand stack, return addresses).
>   * Each thread has its own stack.
>   * Memory is pushed/popped per method call.
> 4. Program Counter (PC) Register
     >   * Holds the address of the current instruction being executed.
>   * Each thread has its own PC.
> 5. Native Method Stack
     >   * Used for native (non-Java) code execution via JNI.
>   * One per thread.

47. What guarantees does the Java Memory Model (JMM) provide?

| Guarantee                      | Description                                                                                                                                                                        |
| ------------------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Visibility**                 | Changes made by one thread to shared variables become visible to other threads **after a happens-before relationship** (e.g., via synchronization, volatile).                      |
| **Atomicity**                  | Operations on **`long` and `double` are atomic only if declared `volatile`**; otherwise, smaller operations like reads/writes of primitives (except 64-bit) are atomic by default. |
| **Ordering (happens-before)**  | The JMM defines rules about how and when changes made by one thread become visible and in what order other threads see them — **to avoid reordering surprises**.                   |
| **Synchronization guarantees** | Locks (`synchronized`), `volatile`, and other concurrency utilities establish **happens-before relationships** to ensure consistent views of memory.                               |
| **Safe publication**           | Objects must be safely published (e.g., through synchronization, final fields, or volatile references) to ensure other threads see fully constructed objects.                      |

48. What does the `final` word do in Java? How can we update the value of a final variable?
> In Java, the `final` keyword is used to mark a variable, method, or class as unchangeable in specific ways:
>
> A. A `final` variable means its value cannot be changed once it's assigned.
> * For primitive types (like int, float, char), final makes the value immutable.
> * For reference types (like objects), final means the reference cannot be changed, but the object's internal state can still be modified.
> ```java
> final int x = 10;
> x = 20; // Compilation error!
>
> final List<String> list = new ArrayList<>();
> list.add("hello"); // OK
> list = new ArrayList<>(); // Compilation error!
> ```
> B. A method marked as `final` cannot be overridden by subclasses.
> ```java
> class Parent {
>     final void display() {
>         System.out.println("Hello");
>     }
> }
>
> class Child extends Parent {
>     // void display() { } // Error: Cannot override final method
> }
> ```
> C. A `final` class cannot be subclassed.
> ```java
> final class MyClass { }
>
> class YourClass extends MyClass { } // Error!
> ```
> You cannot reassign a `final` variable once it has been assigned. However:
> * For reference types, you can modify the object, just not the reference.
> * For blank final variables (not initialized at declaration), you can assign once (e.g., in a constructor or static block).
> ```java
> class Example {
 > final int a;
>
>  Example(int value) {
>   this.a = value; // Allowed because it's the first and only assignment
 > }
> } 
> ```

49. How does the `happens-before` relationship work in Java?
> The `happens-before` relationship in Java is a key concept in the Java Memory Model (JMM) that helps determine visibility and ordering guarantees in multithreaded programs.<br>
> In simple terms, if one action happens-before another, then the first is guaranteed to be visible to and ordered before the second.<br>
> It's used to reason about which changes to memory made by one thread are visible to other threads.<br>
> In multithreaded programming, without synchronization, one thread’s updates to variables may not be visible to another thread, or may appear out of order due to CPU or compiler optimizations. The happens-before rule provides the foundation for safe communication between threads.<br>

50. How does `ExecutorService` work?
> In Java, `ExecutorService` is part of the `java.util.concurrent` package and provides a higher-level replacement for working directly with threads. It manages a pool of threads, allowing you to submit tasks for execution without manually creating or managing threads.

51. What are `Future` and `Callable`, and how are they different from `Runnable`?
> 1. `Runnable`
     >    * Introduced in: Java 1.0
>    * Purpose: Represents a task that can be executed by a thread.
>    * Return value: Does **not** return a result.
>    * Throws exceptions: **Cannot** throw checked exceptions.
>    * Example:
     >    ```java
>    Runnable task = () -> System.out.println("Running task");
>    new Thread(task).start();
>    ```
> 2. `Callable<V>`
     >    * Introduced in: Java 5 (`with java.util.concurrent`)
>    * Purpose: Represents a task that returns a result and may throw an exception.
>    * Return value: Returns a result of type V.
>    * Throws exceptions: Can throw checked exceptions.
> ```java
> Callable<Integer> task = () -> {
>    Thread.sleep(500);
>    return 42;
> };
> ```
> 3. `Future<V>`
     >    * Introduced in: Java 5
>    * Purpose: Represents the result of an asynchronous computation.
>    * It's returned when a `Callable` or `Runnable` is submitted to an `ExecutorService`.
>    * Provides methods to:
       >        * Get the result (`get()`)
>        * Cancel the task (`cancel()`)
>        * Check if the task is complete (`isDone()`)
> ```java
> ExecutorService executor = Executors.newSingleThreadExecutor();
> Callable<Integer> task = () -> 21 * 2;
> Future<Integer> future = executor.submit(task);
>
> Integer result = future.get(); // blocks until result is ready
> System.out.println("Result: " + result);
>
> executor.shutdown();
> ```
> Use Case Difference:
> * Use `Runnable` when you don’t need to return anything or handle checked exceptions.
> * Use `Callable` + `Future` when you need to get a result or handle errors after the task finishes.

52. What are `CountDownLatch`, `Semaphore`, and `CyclicBarrier` used for?

| Feature       | `CountDownLatch`           | `Semaphore`               | `CyclicBarrier`                |
| ------------- | -------------------------- | ------------------------- | ------------------------------ |
| Main Use      | Wait for N tasks to finish | Limit concurrent access   | Sync threads at common barrier |
| Reusable?     | ❌ One-time use             | ✅ Yes                     | ✅ Yes                          |
| Waiting Style | One or more threads wait   | Threads block for permit  | All threads wait at barrier    |
| Trigger Style | Countdown hits 0           | Permits acquired/released | All parties call `await()`     |

53. What are some best practices when using multithreading in Java?
> * Use `java.util.concurrent` utilities (`ExecutorService`, `CountDownLatch`, etc.) instead of manually managing threads.
> * Prefer `Callable` + `Future` over `Runnable` if you need results or exception handling.
> * Avoid shared mutable state — prefer immutable objects or thread-safe data structures.
> * Use synchronization wisely (`synchronized`, `ReentrantLock`) — avoid holding locks longer than necessary.
> * Avoid deadlocks — always acquire locks in a consistent global order.
> * Use `volatile` for visibility, not for atomicity.
> * Favor thread-safe classes like `ConcurrentHashMap`, `CopyOnWriteArrayList`.
> * Avoid busy waiting — use `wait`/`notify`, `Condition`, or blocking queues.
> * Use thread pools instead of creating threads manually (`Executors.newFixedThreadPool()`).
> * Shut down executors properly using `shutdown()` or `try-with-resources` (Java 19+).
> * Minimize thread creation — it's expensive; reuse via pools.
> * Catch and log exceptions in worker threads to avoid silent failures.
> * Benchmark and profile — use tools to identify bottlenecks and race conditions.

54. When do you use an anonymous inner class?
> You use an anonymous inner class in Java when you need to create a one-time-use class—typically for quick implementation of an interface or subclass—without formally declaring a separate class.
> e.g.: Custom behavior for a method call:
> ```java
> Collections.sort(list, new Comparator<String>() {
> public int compare(String a, String b) {
> return a.length() - b.length();
> }
> });
> ```
> When to use it:
> * You need a simple override or implementation (usually just 1–2 methods).
> * You don’t plan to reuse the class elsewhere.
> * The logic is local and contextual, making it clearer to read inline.

55. What are the different types of iterators in Java?
> 1. Iterator
     >   * `java.util.Iterator`
>   * Used with all Collection types
>   * Methods:
      >      * `hasNext()`
>      * `next()`
>      * `remove()` (optional operation)
>   * Direction: Forward-only
>   * Fail-fast: Throws ConcurrentModificationException on structural modification during iteration.
> 2. ListIterator
     >   * `java.util.ListIterator`
>   * Used with List types (`ArrayList`, `LinkedList`)
>   * extends `Iterator`
>   * Bidirectional iteration (`previous()`, `hasPrevious()`)
>   * Modify list during iteration (`add()`, `set()`, `remove()`)
>   * Index access (`nextIndex()`, `previousIndex()`)
> 3. Enumeration
     >   * `java.util.Enumeration`
>   * Used with legacy classes like `Vector`, `Hashtable`
>   * Methods:
      >      * `hasMoreElements()`
>      * `nextElement()`
>   * Direction: Forward-only
>   * Limitation: Cannot remove elements, considered outdated.
> 4. Spliterator
     >   * `java.util.Spliterator` (Java 8+)
>   * Used with: Streams, Collections
>   * Supports: Parallel iteration
>   * Key Features:
      >      * `tryAdvance()`
>      * `trySplit()` for parallelism
>      * Used internally by the Stream API

56. How do you create an iterator in Java?
> 1. Iterator interface
> ```java
> List<String> list = List.of("A", "B", "C");
> Iterator<String> it = list.iterator();
>
> while (it.hasNext()) {
> System.out.println(it.next());
> }
> ```
> 2. Custom Iterator
     > `class CounterIterator implements Iterator<Integer> {...`
> 3. Using an Anonymous Class or Lambda (Java 8+)
     > `Iterable<String> iterable = () -> List.of("X", "Y", "Z").iterator();`

57. What is fail-fast in Java? What is fail-safe?
> * A fail-fast iterator throws a ConcurrentModificationException if the collection is structurally modified (e.g., add/remove) after the iterator is created, except via the iterator's own methods.
> * A fail-safe iterator does not throw ConcurrentModificationException because it iterates over a copy of the collection or uses concurrent data structures.

58. What are hash map collisions? Why should you implement `equals()` and `hashCode()` together?
> When two different keys produce the same hash code, they end up in the same bucket in the hash table. This is called a collision. The map handles collisions by linking entries or using trees internally.
>
> * `hashCode()` determines the bucket for the key.
> * `equals()` checks if keys are actually equal within that bucket.
>
> If you override one without the other, collections like HashMap won't work correctly — you may get inconsistent lookups, duplicates, or lost entries.

59. What does the `@Transient` annotation do in Java?
> The `@Transient` annotation in Java is used to mark a field to be ignored by persistence frameworks, meaning the field won't be saved to or loaded from the database.

60. Explain the differences & similarities between `Comparator` & `Comparable` interfaces

| Feature             | Comparable                          | Comparator                     |
| ------------------- | ----------------------------------- | ------------------------------ |
| Implemented by      | The class itself                    | Separate class or lambda       |
| Method              | `compareTo(T o)`                    | `compare(T o1, T o2)`          |
| Purpose             | Natural ordering                    | Custom or multiple orderings   |
| Used in sorting     | Default sort (no comparator needed) | Sort with specified comparator |
| Java 8+ convenience | Can use default & static methods    | Supports lambdas & method refs |


61. How can you optimize code to help improve performance in Java applications?
> * Use efficient algorithms and data structures.
> * Minimize object creation; reuse objects when possible.
> * Prefer primitive types over boxed types to avoid autoboxing overhead.
> * Use StringBuilder for string concatenation in loops.
> * Avoid unnecessary synchronization; use concurrent collections if needed.
> * Use thread pools instead of creating new threads frequently.
> * Cache expensive or frequently used results.
> * Avoid busy waiting; use blocking or wait/notify mechanisms.
> * Use lazy initialization where appropriate.
> * Profile and benchmark to find actual bottlenecks.
> * Use JVM options and tuning (e.g., garbage collector settings).
> * Leverage parallel streams or concurrency for CPU-bound tasks.

62. Which method do you use to control system resources in multithreaded environments in Java programming language?
> To control system resources in multithreaded Java programs, you typically use `Semaphore` from `java.util.concurrent`.

63. What are sealed classes?
> Sealed classes restrict which other classes or interfaces can extend or implement them. (introduced in Java 15+)
>
> Use Them:
> * To control inheritance.
> * To make code more secure, predictable, and easier to maintain.
> ```java
> public sealed class Shape permits Circle, Rectangle {
>     // only Circle and Rectangle can extend Shape
> }
> 
> final class Circle extends Shape {}
> final class Rectangle extends Shape {}
> ```

64. What is Compile-Time Polymorphism (aka Static Polymorphism) in Java?
> It refers to method overloading, where the method to be called is determined at compile time.
> * Achieved via method overloading (same method name, different parameters).
> * Decision made by the compiler, not at runtime.
> * Improves code readability and flexibility.

65. Can we make array volatile in Java?
> Yes, you can make an array volatile in Java but only the reference which is pointing to an array, not the whole array. If one thread changes the reference variable to points to another array, that will provide a volatile guarantee, but if multiple threads are changing individual array elements they won't be having happens before guarantee provided by the volatile modifier.

66. Can volatile make a non-atomic operation to atomic?
> Volatile is not about atomicity, but there are cases where you can use a volatile variable to make the operation atomic.
> 
> One example is having a long field in your class. If you know that a long field is accessed by more than one thread e.g. a counter, a price field or anything, you better make it volatile.
> 
> Why? because reading to a long variable is not atomic in Java and done in two steps;
> 
> If one thread is writing or updating long value, it's possible for another thread to see half value (fist 32-bit). While reading/writing a volatile long or double (64 bit) is atomic.

67. Which one would be easy to write? synchronization code for 10 threads or 2 threads?
> In terms of writing code, both will be of same complexity because synchronization code is independent of a number of threads.
> Choice of synchronization though depends upon a number of threads because the number of thread present more contention,
> so you go for advanced synchronization technique e.g. lock stripping, which requires more complex code and expertise.

68. How do you call wait() method? using if block or loop? Why?
> `wait()` method should always be called in loop because it's possible that until thread gets CPU to start running again the condition might not hold, so it's always better to check condition in loop before proceeding, example:
> ```java
> // The standard idiom for using the wait method
> synchronized (obj) {
> while (condition does not hold)
>   obj.wait(); // (Releases lock, and reacquires on wakeup)
>   ... // Perform action appropriate to condition
> }
> ```
## Spring Boot
1. What is the difference between Java EE and Spring?
> Java EE is standardized (now Jakarta EE), runs on containers like WildFly.<br>
> Spring is more lightweight, community-driven, flexible, and now more widely used.<br>
> Java EE has EJBs, CDI, JPA, etc. Spring uses its own equivalents (`@Service`, `@Autowired`, Spring Data JPA).
2. What is dependency injection? What’s the difference between dependency injection and inversion of control?
> DI:
> * Dependency Injection is a design pattern where an object’s dependencies (other objects it needs) are provided to it, rather than the object creating them itself.
> * It promotes loose coupling and better testability by separating the creation of dependencies from their usage.
> * In Spring Boot, DI is mainly done by the framework automatically injecting beans into your classes (via constructors, setters, or fields).
    > IoC:
> * Inversion of Control is a broader principle where the control of object creation and flow is “inverted” from the program itself to an external framework or container.
> * Instead of your code controlling when and how objects are created, the IoC container manages this lifecycle and wiring.
> * Dependency Injection is one way to implement IoC.
3. How is DI handled in Spring vs Java EE?
> * Spring: @Autowired, @Component, @Service
> * Java EE: @Inject, @EJB, @Resource
4. What happens if an exception is thrown inside a `@Transactional` method?
> By default, Spring rolls back for unchecked exceptions (`RuntimeException`) but not for checked ones unless specified.
4. Can you nest transactions in Spring? What is propagation?
> Spring does not support true nested transactions with full independent commit/rollback out-of-the-box because most databases don’t support it directly.<br>
> However, Spring provides a “nested” transaction propagation mode (`PROPAGATION_NESTED`), which works only if the underlying database supports savepoints.<br>
> With `PROPAGATION_NESTED`, the inner transaction creates a savepoint. If the inner transaction rolls back, it rolls back to the savepoint without affecting the outer transaction.<br>
> If the database doesn’t support savepoints, `PROPAGATION_NESTED` behaves like `PROPAGATION_REQUIRED`.<br><br>
> Transaction propagation defines how a transaction behaves when called from another transaction — basically, how Spring manages the transactional context between methods.<br>
> It controls whether a method should join an existing transaction, start a new one, or run without a transaction.<br>

5. [Describe Spring Response Status Exception](https://www.baeldung.com/spring-response-status-exception)
> `ResponseStatusException` is a runtime exception in Spring used to return a specific HTTP status code and error message from a REST controller.
> Purpose: To manually trigger HTTP error responses (like 404, 400, 403) with custom reasons, without using @ResponseStatus on a class.
> e.g.: `throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");`
> If you want to globally handle exceptions, use `@ControllerAdvice` with `ExceptionHandler` instead.

## Databases

1. What are the different types of SQL statements?
> 1. DDL (Data Definition Language)
     >   * Define or modify database structure
>   * Examples: `CREATE`, `ALTER`, `DROP`, `TRUNCATE`
> 2. DML (Data Manipulation Language)
     >   * Manage data within tables
>   * Examples: `INSERT`, `UPDATE`, `DELETE`, `MERGE`
> 3. DQL (Data Query Language)
     >   * Retrieve data from the database
>   * Example: `SELECT`
> 4. DCL (Data Control Language)
     >   * Control access and permissions
>   * Examples: `GRANT`, `REVOKE`
> 5. TCL (Transaction Control Language)
     >   * Manage transactions
>   * Examples: `COMMIT`, `ROLLBACK`, `SAVEPOINT`

2. When would you use a JOIN, and what types of joins are there?
> Use a JOIN in SQL when you want to combine rows from two or more tables based on a related column between them, usually to fetch related data in a single query.
>
> 1. `INNER JOIN` :Returns only matching rows between tables.
> 2. `LEFT (OUTER) JOIN`: Returns all rows from the left table + matching rows from the right table (or NULL if no match).
> 3. `RIGHT (OUTER) JOIN`: Returns all rows from the right table + matching rows from the left table (or NULL if no match).
> 4. `FULL (OUTER) JOIN` : Returns all rows when there is a match in either left or right table.
> 5. `CROSS JOIN`: Returns the Cartesian product of both tables (all combinations).
> 6. `SELF JOIN`: Joins a table to itself to compare rows within the same table.

3. What’s the difference between WHERE and HAVING?

| Clause   | Filters On      | Used With Aggregates?  | Runs Before/After Grouping |
| -------- | --------------- |------------------------| -------------------------- |
| `WHERE`  | Individual rows | No                     | Before                   |
| `HAVING` | Grouped results | Yes                    | After                    |


4. What is SQL injection, and how can you prevent it in Java?
> SQL Injection is a security vulnerability where an attacker injects malicious SQL code into a query, often through user input, to manipulate the database.
>
> How to Prevent It in Java:
> 1. Use Prepared Statements (Recommended)
> 2. Use ORM frameworks (e.g., Hibernate, JPA): They manage queries safely under the hood.
> 3. Validate and sanitize input (Especially for custom SQL or raw queries.)
> 4. Least privilege principle: Limit DB access rights for the application user.
> 5. Avoid dynamic SQL unless absolutely necessary.

5. Is Hibernate safe from SQL injection? Why or why not?
> Yes, Hibernate is generally safe from SQL injection, if used correctly because:
> 1. Uses parameterized queries internally: HQL/JPQL and Criteria API bind parameters securely. Also Prevents malicious input from being treated as code.
> 2. Prevents SQL injection by design: Query inputs are treated as data, not executable SQL.
     > It is not safe if:
> * We Concatenate user input directly into HQL or native SQL: `Query q = session.createQuery("FROM User WHERE name = '" + userInput + "'");`
> * Use native SQL queries without parameter binding: `Query q = session.createSQLQuery("SELECT * FROM users WHERE id = " + id);`

6. What is a database transaction?
> A database transaction is a sequence of one or more SQL operations treated as a single logical unit of work.
>
> * Atomicity – All operations succeed or none do.
> * Consistency – Maintains database integrity before and after the transaction.
> * Isolation – Concurrent transactions don’t interfere with each other.
> * Durability – Once committed, changes are permanent—even after a crash.

7. What are the pros and cons of using Hibernate vs. plain JDBC or SQL?
> Pros:
> 1. Reduces boilerplate
> 2. Automatic object mapping
> 3. Transparent caching
> 4. Built-in transaction and connection management
>
> Cons:
> 1. Can be slower/more complex for large or custom queries
> 2. Learning curve
> 3. Hard to debug generated SQL
8. When would you choose native SQL over Hibernate?
> 1. Complex Queries: Advanced joins, subqueries, database-specific functions that are hard or impossible in HQL/JPQL.
> 2. Performance Optimization: Native SQL may run faster for heavily optimized or fine-tuned queries.
> 3. Legacy Systems: When integrating with existing SQL or stored procedures.
> 4. Bulk Operations: For large batch updates/inserts where Hibernate’s entity management overhead is costly.
> 5. Database-Specific Features: Using vendor-specific SQL (e.g., `LIMIT`, `TOP`, `WITH` clauses).
> 6. Read-Only Reporting: For reporting tools or analytics where you don’t need entity management.


9. What are lazy vs. eager loading in Hibernate, and why do they matter?
> These terms refer to how and when Hibernate fetches related entities from the database.
> 1. Lazy Loading (default)
     >    * Loads related entities only when accessed.
>    * Improves performance by avoiding unnecessary queries.
>    * Requires an active Hibernate session when accessed.
> 2. Eager Loading
     >    * Loads related entities immediately with the main entity.
>    * May lead to performance issues if too much data is fetched.
>    * Good when you always need the related data.

| Feature     | Lazy Loading                  | Eager Loading              |
| ----------- | ----------------------------- | -------------------------- |
| Performance | More efficient                | Can cause over-fetching    |
| Queries     | On-demand                     | Immediate (joins)          |
| Risk        | `LazyInitializationException` | N+1 query problem          |
| Use Case    | Optional/rarely-used data     | Always-needed associations |


10. What’s the N+1 query problem, and how do you avoid it in Hibernate?
> When we fetch a list of parent entities (1 query), and then for each parent, Hibernate fires a separate query to load its children (N queries).<br>
> ==> Total: 1 + N queries, which hurts performance badly.
>
> How to Avoid It
> 1. Use JOIN FETCH in HQL/JPQL:
> 2. Batch Fetching: Configure Hibernate to fetch collections in batches:
> 3. Entity Graphs (JPA 2.1+): Define which associations to fetch eagerly at runtime.
> 4. FetchMode.JOIN (in Criteria API): Use Criteria with explicit joins.

## Design Principles
1. What’s the difference between cohesion and coupling? Why is low coupling and high cohesion desirable?
> * *Cohesion*: How closely related the responsibilities of a class or module are. <br>
> * *High cohesion* = good (e.g., UserService handles only user-related logic).
> * *Coupling*: How dependent one class is on another.<br>
> * *Low coupling* = good (fewer direct dependencies = better modularity).
2. How have you used polymorphism in a real project?
> (E.g., an interface PaymentProcessor with CreditCardProcessor, PayPalProcessor implementations)
3. What’s the difference between interface-based and inheritance-based design?
> * Prefer interfaces to avoid tight coupling
> * Inheritance is for IS-A relationships.
4. What’s the benefit of encapsulation in class design?
> * Hides implementation details
> * Protects invariants
5. When would you use abstract classes vs interfaces?
> * Abstract class = partial implementation & shared state
> * Interface = capability/contract.
6. What’s a design principle you consciously applied in your last project? (example)
> One design principle I consciously applied in my last project was the Single Responsibility Principle (SRP)—part of the SOLID principles.
>
> I was working on a Java-based backend service that handled user registration, including:
> * Input validation
> * Business rule enforcement
> * Sending confirmation emails
> * Persisting to the database
>
> Instead of putting all logic in a single service class, I separated responsibilities into clearly focused components:
> * UserValidator – validated input and constraints
> * UserService – contained core business logic
> * EmailService – handled email notifications
> * UserRepository – persisted data using JPA
>
> The result:
> * Easier to test each unit in isolation
> * Changes were localized, e.g., updating email logic didn’t affect user logic
> * Code was cleaner, easier to read, and more maintainable
>
> Applying SRP helped me avoid the "god class" anti-pattern and made collaboration across the team much smoother.

7. Have you used the Strategy, Factory, or Observer pattern in your code?
> Strategy Pattern
> * for interchangeable business logic
> * e.g.:  In a payment processing module, where different payment types (e.g., credit card, PayPal, wallet) required different processing logic.
> * Helped me avoid `if-else` chains and made it easy to plug in new strategies.
> ```java
> public interface PaymentStrategy {
>     void pay(double amount);
> }
>
> public class PayPalPayment implements PaymentStrategy { ... }
> public class CreditCardPayment implements PaymentStrategy { ... }
>
> public class PaymentContext {
>     private PaymentStrategy strategy;
>
>     public PaymentContext(PaymentStrategy strategy) {
>         this.strategy = strategy;
>     }
>
>     public void processPayment(double amount) {
>         strategy.pay(amount);
>     }
> }
> ```
>
> Factory Pattern
> for flexible object creation
> e.g. To create report exporters (PDF, Excel, CSV) based on user input.
> This removed the need to instantiate the correct class manually and centralized control.
> ```java
> public interface ReportExporter { void export(); }
>
> public class PdfExporter implements ReportExporter { ... }
> public class CsvExporter implements ReportExporter { ... }
>
> public class ExporterFactory {
>     public static ReportExporter getExporter(String type) {
>         return switch(type) {
>             case "PDF" -> new PdfExporter();
>             case "CSV" -> new CsvExporter();
>             default -> throw new IllegalArgumentException("Unknown type");
>         };
>     }
> }
> ```
> Observer Pattern
> * for decoupled event handling
> * e.g. In a notification system where user actions (like signup or purchase) triggered multiple listeners: send email, log analytics, update dashboard.
> * Allowed me to add/remove listeners easily without modifying core logic.
> ```java
> public interface Observer {
>     void update(String eventData);
> }
>
> public class EmailService implements Observer { ... }
> public class AnalyticsService implements Observer { ... }
>
> public class Subject {
>     private List<Observer> observers = new ArrayList<>();
>     public void addObserver(Observer obs) { observers.add(obs); }
> 
>     public void notifyAll(String data) {
>         for (Observer o : observers) o.update(data);
>     }
> }
> ```


## Technical Interviews Tips
```
Tip #1: Ask clarifying questions
Tip #2: Hardcoded -> Dumb -> Better
Tip #3: Talk. Out loud.
Tip #4: Stay in a logical flow
Tip #5: Show what you know
```

## Extra tricks
1. Know the common problems, review the CS fundamentals & algorithms
2. It's usually ok to look at the docs
3. Watch for visual cues
4. If remote, have a good setup
5. Be personable!
6. When dealing with mathematics problems, check for and handle overflow and underflow if you are using a typed language like Java and C++. At the very least, mention that overflow or underflow is possible and ask whether you need to handle it.


## Coding Challenges - Steps
1. Verify setup
2. Always validate input first
3. Write pure functions as often as possible.
