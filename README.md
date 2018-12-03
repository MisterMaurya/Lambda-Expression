# Lambda-Expression
Demonstrate  Lambda Expression in java  

## Lambda expressions are added in Java 8 and provide below functionalities.

* Enable to treat functionality as a method argument, or code as data.  

* A function that can be created without belonging to any class.  

* A lambda expression can be passed around as if it was an object and executed on demand.

## Lambda Expression is Nothing But Anonymous Function Or Closures
* No Return type
* No Name
* No modifier

## Change Normal Method convert to lambda Expression

* Example 1 :

```java
public void m1() {
 System.out.println("Hello");
}

// Lambda Expression

() - >{ System.out.println("Hello");};

// Within the lambda body have only one line curly braces are not mandatory

// We can write like this

() -> System.out.println("Hello");

```

* Example 2 :

```java
public void m1(int a,int b) {
 System.out.println("Sum : "+(a+b));
}

// Lambda Expression

(a,b) - >{  System.out.println("Sum : "+(a+b)); };

// We can write like this because lambda body have only one line

(a,b) - > System.out.println("Sum : "+(a+b)); 

```

* Example 3 :

```java
public int square(int a) {
return a*a;
}

// Lambda Expression

(n) - > n*n;

// We can also write like this 
// if only one argument are passing then the parenthesis are optional

n- > n * n;



```
## Conclusions :
* Lambda expression can have any number of arguments like zero,one ......
* For one argument lambda expression parenthesis are optional. 
* If body contain only one statement curly braces are optional.

## Marker Interfaces 
A marker interface in Java is an interface with no fields or methods. Put more simply, an empty interface in Java is called a marker interface. Examples of marker interfaces are the Serializable , Cloneable and Remote interfaces. These are used to indicate some information to compilers or JVMs.


## How to call/invoke lambda expression

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
