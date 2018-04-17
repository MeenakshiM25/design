# design
# creational patterns:
   * Singleton                - single instnce
   * Factory  
   (abstract&factory method)  - create classes dynamically based on input ,abstract the creation part and instantiate classes represented                     by common interface
   * prototype                - used when obj creation is difficult and provided cloned copy 
   * builder                  - used when object cannot be created in a single step and also encapsulate creation
# behavioural patterns:
   * Template Method          - define algorithm of steps but lets it subclasses define impl of those algorithm without changing the                                     structure
   * Intrepreter              - for language, define representation of its grammar ,use it to interpret sentences to another                                             form/language
   * Chain Of Responsibility  - have set of objects in the chain.requested is passed to one by one object .object checks if it can                                       handle the request.if so ,handles request otherwise passes control to other objects in the chain
   * Command                  - command encapsulate diff req as object and passes to invoker.invoker doesnt know how to handle it .when                                 it recieves a servce request, passes control to command (command.execute()) and then command passes                                     request to  reciever which handles request
   * Strategy                 - we take changing behavours out and create interface and set of impl and inject those behaviours at                                       runtime using composition
   * State                    - 
   * Observer                 - defines one to many dependencies between objs.when state of obj changes ,it updates dependents                                           dynamically
   * Mediator                 - defines an object that encapsulates how set of objects interact.promotes loose coupling
   * Iterator                 - iterate over set of aggrgate objects (java.lang.iterator)
   * Visitor                  - represents operations to be performed on elements in structure without making much changes to element                                   classes.traverser helps visitor to traverse and  get state of all objects in structure and perform                                       various operation on the state
   * Memento                  - to restore an object to previous state when user request to do so
   * null object              - when you dont have meaningful obj to return,you can return null obj that performs nothing as you dont 
                                 client to handle it
# structural patterns:
   * Decorator                - attaches additional responsibilites to obj dynamically.
   * Adaptor                  - converts interface of one class to interface of another class reqd by client
   * Facade                   - simplifies an interface.provide unified interface to set of interfaces making it easy for subsystem to                                   be used
   * Composite                - 
   * Flyweight                - instead of creating many instances of obj that can cause bad design,create stateless object and another                                 object to maintain state of all instances of obj
   * Proxy                     -
   * Bridge                   - Decouple abstraction from implementation so that those two can vary independently

http://www.oodesign.com/
https://dzone.com/articles/design-patterns-bridge
