# Lambda-Expression
Demonstrate  Lambda Expression in java  



## Lambda expressions are added in Java 8 and provide below functionalities.

* Enable to treat functionality as a method argument, or code as data.  

* A function that can be created without belonging to any class.  

* A lambda expression can be passed around as if it was an object and executed on demand.

## Approach Without Lambda Expression

```java
interface A {
 public void m1();
}

class B implements A {
 
 @Override
 public void m1() {
  System.out.println("m1 method");
 }

}

class Main {
 public static void main(String args[]) {
  B obj = new B();
  obj.m1(); 
 }
}

```

## Approach With Lambda Expression

```java
interface A {
 public void m1();
}

class Main {
 public static void main(String args[]) {
  A a = ()->  System.out.println("m1 method");
  a.m1(); 
 }
}

```



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
