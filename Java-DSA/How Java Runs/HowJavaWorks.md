# How Java Works - Complete Guide

## 1. JDK vs JRE vs JVM

```
┌─────────────────────────────────────────────────────────┐
│                        JDK                              │
│  (Java Development Kit)                                 │
│                                                         │
│   ┌─────────────────────────────────────────────────┐   │
│   │                    JRE                          │   │
│   │  (Java Runtime Environment)                     │   │
│   │                                                 │   │
│   │   ┌─────────────────────────────────────────┐   │   │
│   │   │              JVM                        │   │   │
│   │   │  (Java Virtual Machine)                 │   │   │
│   │   │                                         │   │   │
│   │   │  - Runs bytecode                        │   │   │
│   │   │  - Memory management                    │   │   │
│   │   │  - Garbage collection                   │   │   │
│   │   └─────────────────────────────────────────┘   │   │
│   │                                                 │   │
│   │   + Libraries (rt.jar, etc.)                    │   │
│   │   + Java Class Libraries                        │   │
│   └─────────────────────────────────────────────────┘   │
│                                                         │
│   + javac (compiler)                                    │
│   + jar (packaging tool)                                │
│   + javadoc (documentation)                             │
│   + debugging tools                                     │
└─────────────────────────────────────────────────────────┘
```

### Simple Explanation:

| Component | What it is | Who needs it |
|-----------|-----------|--------------|
| **JVM** | Engine that runs Java code | Everyone |
| **JRE** | JVM + Libraries to run Java apps | Users who only run Java apps |
| **JDK** | JRE + Tools to develop Java apps | Developers who write Java code |

---

## 2. How Java Code Runs - Complete Flow

```
┌──────────────┐     ┌──────────────┐     ┌──────────────┐
│  Hello.java  │────>│    javac     │────>│ Hello.class  │
│ (Source Code)│     │  (Compiler)  │     │  (Bytecode)  │
└──────────────┘     └──────────────┘     └──────────────┘
                                                 │
                                                 ▼
                     ┌───────────────────────────────────┐
                     │              JVM                  │
                     │  ┌─────────────────────────────┐  │
                     │  │     Class Loader            │  │
                     │  │  (Loads .class files)       │  │
                     │  └─────────────────────────────┘  │
                     │                 │                 │
                     │                 ▼                 │
                     │  ┌─────────────────────────────┐  │
                     │  │   Bytecode Verifier         │  │
                     │  │  (Checks code is safe)      │  │
                     │  └─────────────────────────────┘  │
                     │                 │                 │
                     │                 ▼                 │
                     │  ┌─────────────────────────────┐  │
                     │  │   Execution Engine          │  │
                     │  │  - Interpreter              │  │
                     │  │  - JIT Compiler             │  │
                     │  └─────────────────────────────┘  │
                     │                 │                 │
                     │                 ▼                 │
                     │           OUTPUT                  │
                     └───────────────────────────────────┘
```

### Step by Step:

1. **Write Code** - You write `Hello.java`
2. **Compile** - `javac Hello.java` creates `Hello.class` (bytecode)
3. **Class Loader** - Loads the .class file into memory
4. **Bytecode Verifier** - Checks if code is safe (no security issues)
5. **Execution Engine** - Runs the code
   - **Interpreter**: Reads line by line (slow)
   - **JIT (Just-In-Time)**: Converts hot code to machine code (fast)

---

## 3. JVM Memory Structure

```
┌─────────────────────────────────────────────────────────────┐
│                      JVM MEMORY                             │
├─────────────────────────────────────────────────────────────┤
│                                                             │
│  ┌─────────────────────────────────────────────────────┐    │
│  │                    HEAP MEMORY                      │    │
│  │         (Objects are stored here)                   │    │
│  │                                                     │    │
│  │   ┌───────────────┐    ┌────────────────────────┐   │    │
│  │   │  Young Gen    │    │      Old Gen           │   │    │
│  │   │               │    │   (Tenured Gen)        │   │    │
│  │   │ ┌───────────┐ │    │                        │   │    │
│  │   │ │   Eden    │ │    │  Long-living objects   │   │    │
│  │   │ └───────────┘ │    │  stored here           │   │    │
│  │   │ ┌────┐ ┌────┐ │    │                        │   │    │
│  │   │ │ S0 │ │ S1 │ │    │                        │   │    │
│  │   │ └────┘ └────┘ │    │                        │   │    │
│  │   │  (Survivor)   │    │                        │   │    │
│  │   └───────────────┘    └────────────────────────┘   │    │
│  └─────────────────────────────────────────────────────┘    │
│                                                             │
│  ┌─────────────────────────────────────────────────────┐    │
│  │                  STACK MEMORY                       │    │
│  │     (Method calls, local variables, references)     │    │
│  │                                                     │    │
│  │   ┌─────────────────────────────────────────────┐   │    │
│  │   │ Method 3: int z = 30                        │   │    │
│  │   ├─────────────────────────────────────────────┤   │    │
│  │   │ Method 2: int y = 20                        │   │    │
│  │   ├─────────────────────────────────────────────┤   │    │
│  │   │ Method 1 (main): int x = 10                 │   │    │
│  │   └─────────────────────────────────────────────┘   │    │
│  └─────────────────────────────────────────────────────┘    │
│                                                             │
│  ┌──────────────────┐  ┌──────────────────┐                 │
│  │   Method Area    │  │   PC Register    │                 │
│  │ (Class data,     │  │ (Current         │                 │
│  │  static vars,    │  │  instruction)    │                 │
│  │  constant pool)  │  │                  │                 │
│  └──────────────────┘  └──────────────────┘                 │
│                                                             │
│  ┌──────────────────────────────────────────────────────┐   │
│  │              Native Method Stack                     │   │
│  │        (For native code like C/C++)                  │   │
│  └──────────────────────────────────────────────────────┘   │
│                                                             │
└─────────────────────────────────────────────────────────────┘
```

### Memory Areas Explained:

| Memory Area | What it stores | Thread Safe? |
|-------------|----------------|--------------|
| **Heap** | Objects, instance variables | Shared (Not thread safe) |
| **Stack** | Local variables, method calls | Each thread has own stack |
| **Method Area** | Class info, static variables | Shared |
| **PC Register** | Current instruction address | Each thread has own |

---

## 4. Stack vs Heap

```
         STACK                              HEAP
    ┌─────────────┐                 ┌─────────────────────┐
    │ name = ref──┼────────────────>│  "Satvik"           │
    │ age = 25    │                 │  String Object      │
    │ obj = ref───┼────────────────>│                     │
    └─────────────┘                 │  ┌───────────────┐  │
                                    │  │ Student Object│  │
                                    │  │ name: "John"  │  │
                                    │  │ age: 20       │  │
                                    │  └───────────────┘  │
                                    └─────────────────────┘
```

### Key Differences:

| Stack | Heap |
|-------|------|
| Stores primitive values & references | Stores actual objects |
| LIFO (Last In First Out) | No order |
| Fast access | Slower access |
| Auto cleanup when method ends | Garbage Collector cleans |
| Small size | Large size |
| Thread safe (each thread = own stack) | Shared between threads |

### Example:
```java
public void example() {
    int x = 10;              // x stored in STACK
    String name = "Hello";   // reference in STACK, "Hello" in HEAP
    Student s = new Student(); // reference in STACK, object in HEAP
}
```

---

## 5. String Pool (Very Important!)

```
                         HEAP MEMORY
    ┌─────────────────────────────────────────────────────┐
    │                                                     │
    │   ┌─────────────────────────────────────────────┐   │
    │   │           STRING POOL                       │   │
    │   │      (Special area in Heap)                 │   │
    │   │                                             │   │
    │   │    ┌─────────┐  ┌─────────┐  ┌─────────┐    │   │
    │   │    │ "Hello" │  │ "World" │  │ "Java"  │    │   │
    │   │    └─────────┘  └─────────┘  └─────────┘    │   │
    │   │         ▲            ▲                      │   │
    │   │         │            │                      │   │
    │   └─────────┼────────────┼──────────────────────┘   │
    │             │            │                          │
    │   String s1─┘            │                          │
    │   String s2──────────────┘                          │
    │                                                     │
    │   ┌─────────────────────────────────────────────┐   │
    │   │         OUTSIDE STRING POOL                 │   │
    │   │                                             │   │
    │   │    ┌─────────┐                              │   │
    │   │    │ "Hello" │ <── new String("Hello")      │   │
    │   │    └─────────┘                              │   │
    │   └─────────────────────────────────────────────┘   │
    │                                                     │
    └─────────────────────────────────────────────────────┘
```

### String Literal vs new String()

```java
// LITERAL - Goes to String Pool
String s1 = "Hello";
String s2 = "Hello";
// s1 == s2  is TRUE (same memory location)

// NEW - Creates new object outside pool
String s3 = new String("Hello");
String s4 = new String("Hello");
// s3 == s4  is FALSE (different memory locations)
// s3.equals(s4)  is TRUE (same content)
```

### Why String Pool?
- **Saves Memory**: Same strings reuse same memory
- **Faster**: No need to create new object every time
- **Strings are Immutable**: Safe to share

### Important Methods:
```java
String s1 = new String("Hello");
String s2 = s1.intern();  // Puts string in pool and returns reference
```

---

## 6. Garbage Collection (GC)

```
        BEFORE GC                           AFTER GC
    ┌─────────────────┐                ┌─────────────────┐
    │      HEAP       │                │      HEAP       │
    │                 │                │                 │
    │  ┌───┐  ┌───┐   │                │  ┌───┐          │
    │  │ A │  │ B │   │   ─────────>   │  │ A │          │
    │  └───┘  └───┘   │    GC runs     │  └───┘          │
    │    ▲            │                │    ▲            │
    │    │     ┌───┐  │                │    │            │
    │  ref     │ C │  │                │  ref            │
    │          └───┘  │                │                 │
    │   (C has no     │                │  B & C removed  │
    │    reference)   │                │  (unreachable)  │
    └─────────────────┘                └─────────────────┘
```

### How GC Works:

1. **Mark**: Find all reachable objects (objects with references)
2. **Sweep**: Remove unreachable objects (no references pointing to them)
3. **Compact**: Move remaining objects together (optional)

### GC in Young Generation:

```
   EDEN                SURVIVOR 0           SURVIVOR 1
┌──────────┐          ┌──────────┐          ┌──────────┐
│ New      │  Minor   │ Survived │  Minor   │ Survived │
│ Objects  │   GC     │ Objects  │   GC     │ Objects  │
│ Created  │ ──────>  │ (age 1)  │ ──────>  │ (age 2)  │
│ Here     │          │          │          │          │
└──────────┘          └──────────┘          └──────────┘
                                                  │
                                                  │ After many GCs
                                                  ▼
                                          ┌──────────────┐
                                          │   OLD GEN    │
                                          │ (Long-lived  │
                                          │  objects)    │
                                          └──────────────┘
```

### Types of GC:

| GC Type | When it runs | What it cleans |
|---------|--------------|----------------|
| **Minor GC** | Young Gen is full | Young Generation |
| **Major GC** | Old Gen is full | Old Generation |
| **Full GC** | Entire heap | Everything (Stop the World!) |

---

## 7. Why Java is Platform Independent?

```
                    WRITE ONCE, RUN ANYWHERE
                    
    ┌─────────────┐
    │ Hello.java  │
    └──────┬──────┘
           │ compile (javac)
           ▼
    ┌─────────────┐
    │ Hello.class │──────────────────────────────────────┐
    │ (Bytecode)  │                                      │
    └──────┬──────┘                                      │
           │                                             │
     ┌─────┼─────────────────┬───────────────────┐       │
     │     │                 │                   │       │
     ▼     ▼                 ▼                   ▼       │
┌─────────────┐      ┌─────────────┐      ┌─────────────┐
│ Windows JVM │      │  Linux JVM  │      │  Mac JVM    │
└──────┬──────┘      └──────┬──────┘      └──────┬──────┘
       │                    │                    │
       ▼                    ▼                    ▼
┌─────────────┐      ┌─────────────┐      ┌─────────────┐
│Windows Code │      │ Linux Code  │      │  Mac Code   │
└─────────────┘      └─────────────┘      └─────────────┘
```

**Key Point**: Bytecode is same everywhere. JVM is different for each OS. JVM converts bytecode to machine code.

---

## 8. Class Loading

```
                    CLASS LOADING PROCESS
                    
    ┌─────────────────────────────────────────────────────┐
    │                  CLASS LOADERS                      │
    │                                                     │
    │   ┌─────────────────────────────────────────────┐   │
    │   │     Bootstrap Class Loader                  │   │
    │   │     (Loads core Java classes - rt.jar)      │   │
    │   └───────────────────┬─────────────────────────┘   │
    │                       │                             │
    │   ┌───────────────────▼─────────────────────────┐   │
    │   │     Extension Class Loader                  │   │
    │   │     (Loads extension classes - ext folder)  │   │
    │   └───────────────────┬─────────────────────────┘   │
    │                       │                             │
    │   ┌───────────────────▼─────────────────────────┐   │
    │   │     Application Class Loader                │   │
    │   │     (Loads your classes - classpath)        │   │
    │   └─────────────────────────────────────────────┘   │
    │                                                     │
    └─────────────────────────────────────────────────────┘
```

### Class Loading Steps:
1. **Loading**: Read .class file
2. **Linking**:
   - Verify: Check bytecode is valid
   - Prepare: Allocate memory for static variables
   - Resolve: Replace symbolic references with actual references
3. **Initialization**: Execute static blocks and initialize static variables

---

## 9. JIT Compiler (Just-In-Time)

```
    ┌─────────────────────────────────────────────────────┐
    │                EXECUTION ENGINE                     │
    │                                                     │
    │   Bytecode                                          │
    │      │                                              │
    │      ▼                                              │
    │   ┌─────────────────────────────────────────────┐   │
    │   │              INTERPRETER                    │   │
    │   │  - Reads bytecode line by line              │   │
    │   │  - Converts to machine code                 │   │
    │   │  - SLOW (repeats for same code)             │   │
    │   └─────────────────────────────────────────────┘   │
    │                                                     │
    │   When code runs many times (HOT CODE):             │
    │      │                                              │
    │      ▼                                              │
    │   ┌─────────────────────────────────────────────┐   │
    │   │             JIT COMPILER                    │   │
    │   │  - Compiles hot code to native machine code │   │
    │   │  - Stores compiled code in cache            │   │
    │   │  - FAST (no repeated interpretation)        │   │
    │   └─────────────────────────────────────────────┘   │
    │                                                     │
    └─────────────────────────────────────────────────────┘
```

### Why JIT is Fast?
- First few runs: Interpreter runs code (slow)
- JVM detects "hot spots" (frequently run code)
- JIT compiles hot code to machine code
- Next runs: Uses compiled code directly (super fast!)

---

## 10. Quick Reference Table

| Topic | Key Point |
|-------|-----------|
| **JDK** | Development kit (JRE + Tools) |
| **JRE** | Runtime (JVM + Libraries) |
| **JVM** | Runs bytecode |
| **Bytecode** | Platform independent code (.class) |
| **Stack** | Local variables, method calls, primitives |
| **Heap** | Objects, instance variables |
| **String Pool** | Stores string literals (saves memory) |
| **new String()** | Creates object outside pool |
| **GC** | Cleans unreachable objects automatically |
| **Young Gen** | New objects, Minor GC |
| **Old Gen** | Long-lived objects, Major GC |
| **JIT** | Compiles hot code for speed |

---

## 11. Common Interview Questions

### Q1: Why is String immutable?
- Security (can't change sensitive data)
- Thread safe
- String pool works because of immutability
- Hashcode caching

### Q2: What happens when you write `new String("Hello")`?
1. "Hello" is created in String Pool (if not exists)
2. New object is created in Heap (outside pool)
3. Total: 2 objects created!

### Q3: Stack overflow vs Heap overflow?
- **StackOverflowError**: Too many method calls (deep recursion)
- **OutOfMemoryError**: Heap is full (too many objects)

### Q4: When is object eligible for GC?
- When no reference points to it
- When reference is set to null
- When object goes out of scope

---

## 12. Memory Leak Example

```java
// BAD - Memory Leak
List<Object> list = new ArrayList<>();
while(true) {
    list.add(new Object());  // Objects keep adding, never removed
    // Eventually: OutOfMemoryError!
}

// GOOD - Proper cleanup
List<Object> list = new ArrayList<>();
// ... use list ...
list.clear();  // Clear when done
list = null;   // Allow GC to collect
```

---

**Remember**: Java manages memory for you, but you should still:
- Close resources (files, connections)
- Avoid creating unnecessary objects
- Use appropriate data structures
- Set references to null when done
