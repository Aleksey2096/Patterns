# Software design pattern in Java & Python

## Behavioral patterns

### 1. Chain of Responsibility
The Chain of Responsibility pattern allows multiple objects to handle a request in a sequential manner, passing the request along a chain of potential handlers. Each handler decides whether to process the request or pass it to the next handler in the chain. This pattern decouples the sender of the request from the receiver, providing flexibility in determining how requests are processed. It's often used for event handling, logging, or approval workflows.

[Java example](src/main/java/com/example/patterns/behavioral/chain_of_responsibility/)

### 2. Command
The Command pattern encapsulates a request as an object, allowing clients to parameterize methods with different requests, queue requests, and log or undo them. This pattern provides a way to decouple the object that sends a command from the object that knows how to execute it. Commands can be stored, passed, and executed at a later time, supporting undo and redo operations. It's commonly used in menu-driven interfaces, transactional systems, and macro recording.

[Java example](src/main/java/com/example/patterns/behavioral/command/) (In this example the text editor creates new command objects each time a user interacts with it. After executing its actions, a command is pushed to the history stack. To perform the undo operation, the application takes the last executed command from the history and either performs an inverse action or restores the past state of the editor, saved by that command.)

### 3. Interpreter
The Interpreter pattern defines a representation for a grammar of a language and provides an interpreter to process sentences in the language. Each rule in the grammar is represented by a class, and the interpreter traverses the structure to evaluate sentences. This pattern is often used for programming languages, expression evaluation, and domain-specific languages (DSLs). It works best when the grammar is simple and does not require frequent changes.

[Java example](src/main/java/com/example/patterns/behavioral/interpreter/)

### 4. Iterator
The Iterator pattern provides a way to access the elements of a collection or aggregate object sequentially without exposing the underlying implementation. It defines an interface for traversing a collection, so that different types of collections can be iterated in a uniform manner. This pattern enhances flexibility and decouples the client from the collection's internal structure, allowing the same interface to be used across different types of collections.

[Java example](src/main/java/com/example/patterns/behavioral/iterator/)

