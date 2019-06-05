# Application Controller Pattern Example
An example of the Application Controller Pattern using Java

## Class diagram of the Application Controller Pattern
![Class Diagram of Application Controller Patern Image](/media/AppControllerClassDiagram.png "Application Controller Pattern Class Diagram Image")

Note that the Application Controller uses a map of some kind to store the different commands it knows how to handle.  Those commands are classes that implement the *Handler* interface.  The interface provides a contract to the application controller model that any of the targets it stores will have a method or property of a specific name.

## Sequence diagram of the Application Controller Pattern
![Sequence Diagram of Application Controller Pattern Image](/media/AppControllerSequenceDiagram.png "Application Controller Pattern Sequence Diagram Image")

This sequence diagram shows how the flow of the application will proceed using the Application Controller Pattern.
1. When the application needs to do something (in this example, login) it will give that command with any applicable data to the application controller.
2. The application controller will retrieve the appropriate handler class from the map containing all the commands it knows how to execute.
3. Now that the Application Controller has the appropriate handler, it executes the method on that handler.
    - Remember that the Application Controller know what method to call because of the Handler interface.

This is a simple example, but it begins to show how abstracting away a lot of the details of your application through the Application Controller Pattern provides a degree of extensibility to your application. To add new functionality you only need to add a new hander class implementing the interface, and add the command to the application controller.

--------

*The class diagram and sequence diagram used in this document are from https://github.com/yenrab/doing_more_with_java