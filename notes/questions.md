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
 > answer
5. Explain the key differences between streams & collections
 > 1. Storage: Collections store elements, while streams do not store elements but rather process them on the fly.
 > 2. Processing: Collections are processed sequentially, whereas streams can be processed in parallel.
 > 3. Lazy vs Eager: Streams are lazy, meaning operations are executed only when the terminal operation is invoked. Collections are eager, meaning all operations are executed immediately.
## Java
1. Why do people call Java the "platform-independent programming language?"
 > One of the primary purposes for Java code was to create a programming language developers could use across multiple platforms without having to change the source code each time. Platform independence means the execution of your program doesn't depend on the operating system being used. Earlier programming languages, such as C and C++, require developers to compile separate source code for every operating system.
2. What are constructors in Java? Are there copy constructors in Java? What is constructor chaining?
 > A constructor initializes a newly created object. Java supports copy constructor, but it's a requirement to write your own code to do it. Constructor chaining is calling a constructor from another constructor. However, you cannot call a sub-class constructor using a super-class constructor.
3. What's an abstract class? How are abstract classes similar or different in Java from C++?
 > aaa
4. What's object cloning?
 > a
5. What are the differences between HashMap and HashTable in Java?
 > a
6. How is inheritance in C++ different from Java?
 > a
7. Can you overload or override static methods in Java?
 > a
8. What's the purpose of a Java class?
 > a
9. What's the difference between implementing and extending classes in Java?
 > a
10. What's a variable?
 > a
11. How can we declare a variable?
 > a
12. What's the use of casting in Java?
 > a
13. List some good practices for creating methods in a Java class.
 > a
14. Enumerate the syntaxes that can create a Java main() method for application development in Java.
 > a
15. What are the different types of Java comments?
 > a
16. What's a switch statement in Java?
 > a
17. How many types of Java loops are there?
 > a
18. Describe the different types of Java looping constructs and how you can use them.
 > a
19. How do you define a nested class in Java?
 > a
20. Can you explain the purpose of a constructor in Java class?
 > a 
21. What's an exception and how do you handle them in Java?
 > aaa
22. What's the difference between a thread and a process?
 > aa
23. When do you use an anonymous inner class?
 > aa
24. What's the purpose of anonymous inner classes?
 > w
25. What are the different types of iterators in Java?
 > w
26. How do you create an iterator in Java?
 > w
27. What's the difference between Hashtable, TreeMap and TreeSet in Java?
 > w
28. How can you optimize code to help improve performance in Java applications?
 > w
29. Which method do you use to control system resources in multithreaded environments in Java programming language?
 > w
30. Explain how to handle errors using try-catch blocks in your code.
 > a
31. Interfaces vs Abstract classes: similarities
> Similarities:
> 1. Both can define abstract methods	
> 2. Both can be implemented/extended	
> 3. Both can be used for polymorphism	
> 4. Both can have static methods (for Interfaces in Java 8+)
> 5. Both can have default method implementations (for Interfaces in Java 8+)
> 6. Neither can be instantiated directly
32. Interfaces vs Abstract classes: differences
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
33. When should we use abstract classes and when interfaces?
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
34. Where should we use an `ArrayList` and where should we prefer a `LinkedList`?
> `ArrayList`: better for read-heavy logic; `LinkedList`: better for write-heavy logic
35. Explain what autoboxing & unboxing means
> Autoboxing: automatic conversion the Java compiler makes between primitive types & wrapper classes
> Unboxing: the other way
```text
  ┌  autoboxing  ⇘
int             Integer
  ⇖  unboxing    ┘
```
36. What does the `final` word do in Java? How can we update the value of a final variable?
> Final means. Reflection
37. What is variable shadowing?
> If the instance variable (within a class, outside of a method) & a local variable (inside a method) have the same name
38. What is failfast in Java? What is failsafe?
> Concurrent mod exception, e.g. for-i loop wherein we update the i value so the loop gets wonky
39. What are hash map collisions?
> a
40. Explain the differences & similarities between `Comparator` & `Comparable` interfaces
> a
41. What does the `synchronized` word do in Java?
> a
42. What does the `@Transient` annotation do in Java?
> a
43. Explain `try-with-resources`:
> a
44. `HashMap` vs `LinkedHashMap` vs `TreeMap`
> `HashMap`: stores pairs of key-values
> `LinkedHashMap`: stores pairs of key-values while keeping their sequence
> `HashMap`: aa
45. Checked & unchecked expectations
> a
46. What does `volatile` do in Java?
> In Java, the `volatile` keyword is used for variables that are shared between threads.
> When a variable is declared `volatile`, it guarantees two things:
> 1. Visibility: When one thread updates the variable, all other threads immediately see the new value.
> 2. No caching: Threads will always read the value directly from main memory, not from a cached copy.
>
> Example Use Case: It's commonly used in simple flags (like a `boolean stop` flag) to signal one thread from another without needing full synchronization.
> 
> But note: `volatile` does not guarantee atomicity. For compound actions (like `count++`), you still need synchronization or atomic classes like `AtomicInteger`.

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
