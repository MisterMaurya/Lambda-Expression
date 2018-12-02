# Lambda-Expression
Demonstrate  Lambda Expression in java  

> **Functional Interface**
```java
/** 
*A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit.
*From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.
*/

interface FunctionalInterface {

  public abstract void method();

  default void defaultMethod() {

  }

  static void staticMethod() {

  }

}
```
