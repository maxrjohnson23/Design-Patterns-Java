# Design Patterns   
## Examples of common Design Patterns in Java

### Pattern Categories: Structural, Creational, Behavioral
1. **Structural Patterns**
   1. Adaptor
      * Simple, easy to implement solution
      * Integration with legacy code
      * Can provide multiple adaptors
   2. Bridge
      * Designed upfront for uncertainty and change
      * Can be more complex to implement
      * Provides flexibility
      * More than just composition and Object Oriented principles 
   3. Composite
      * Generalizes a hierarchical structure
      * Can simplify things too much, rely on runtime behavior checks
      * Easier for clients to use
      * Composite != Composition
   5. Decorator
      * Original object stays the same
      * Unique way to add functionality
      * Often confused with simple inheritance, but does not modify the base object
      * Can be more complex for clients
   6. Facade
      * Simplifies client interface
      * Easy pattern to implement
      * Commonly used as a refactoring pattern
   7. Flyweight
      * Great for Memory Management using immutable objects
      * Utilizes multiple patterns (Factory)
      * Used heavily in Java Core API
   8. Proxy Pattern
      * Used extensively in DI/IoC Frameworks
      * Utilities built in the Java API for implementing proxy
      * Only one instance, can't chain different functions easily
      
2. **Creational Patterns**
   1. Singleton
      * Guarantee one instance
      * Easy to implement
      * Solves a well-defined problem
      * Don't overuse it
   2. Builder
      * Creative way to deal with complexity of object creation
      * Negates need for exposed setters & telescoping constructors
      * Easy to implement with few drawbacks
      * Can use inner or separate class
   3. Prototype
      * Guarantee unique instance each time
      * Lightweight construction with using "new"
      * Often refactored in later to address a performance issue
   4. Factory
      * Encapsulates instantiation logic
      * Parameter driven, defers creation to subclass
      * Uses common interface
      * Opposite of a Singleton
   5. Abstract Factory
      * Factory of similar Factories
      * Problem specific, can be complex to implement
      * Heavy abstraction of underlying components
      * Typically used in frameworks
3. **Behavioral Patterns**
   1. Chain of Responsibility
      * Decouples sender and receiver
      * Configurable at runtime
      * Hierarchical in nature
      * Be careful with large chains and unhandled requests
   2. Command
      * Encapsulate each request as an object
      * Decouple sender from processor
      * Few drawbacks
      * Often used for undo functionality
   3. Interpreter
      * Useful when defining a grammar
      * Rules or validation
      * Special case pattern for specific case
      * May also consider the Visitor pattern
   4. Iterator
      * Efficient way to traverse collections
      * Hides underlying algorithm
      * Simplify client code
      * Enables foreach in Java
   5. Mediator
      * Loose coupling between objects
      * Simplified communication
      * Mediator can become complex
      * Can be used with Command pattern
   6. Memento
      * Capture Object state
      * Can be heavy with large objects and long history
      * Ability to recreate state
   7. Observer Pattern
      * Decoupled communication
      * Built in functionality in Java API
      * Can be used with mediator
      
      