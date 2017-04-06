# Java Design Patterns

Design Patterns are very popular among software developers. A design pattern is a well-described solution to
common software problem.

Some of benefits of using design patterns are :
  * Design patterns are already defined and provides industry standard approach to solve reccuring problem,
    so it saves time if we senibly use  the design pattern .
  * Using design pattern promotes reusability that leads to more robust and hightly maintenable code.
  * Since design patterns are already defined, it makes out code easy to understand and debug. It lead to faster developement and new members of team understand it easily.


__What is a Design Pattern ?__
   > A software design pattern is a general reusable solution to a commonly occurring problem within a given context in software design --- Wikipedia

__Java Design Patterns__ are divived into tree parts : *Creational*, *Structural* and *Behavioral*.

## CREATIONAL DESIGN PATTERNS

  Creational design pattens provide solution to instatiate an object in the best possible way for specific situations.
  The basic form of object creation could result in design problems or add unwanted complexity to the design. Creational design patterns solve this problem by __controlling the object creation__ by different ways.
  There are five creational design patterns that we will discuss on :

* Singleton Pattern
* Factory Pattern
* Abstract Factory Pattern
* Builder Pattern
* Prototype Pattern

### Pattern Singleton
 
 Pattern Singleton: > One Class, one Instance.

  Singleton is one of the Gangs of Four Design patterns and comes in the Creational Design Pattern category.
Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine. The singleton class must provide a global access point to get the instance of the class. Singleton pattern is used for logging, driver objects, caching and thread pool. Singleton design pattern is also used in other design patterns like __Abstract Factory__, __Builder__, __Prototype__, __Facade__ etc. Singleton design pattern is used in core java classes also, for example __java.lang.Runtime__ , __java.awt.Desktop__.

To implement Singleton pattern, there are really many approaches but all of them have following common concepts:

* A private constructor to avoid instantiation of the class,
* A private static variable from the same class that's the only instance of the class.
* public static method that returns the instance of the class, this is the global access point for the outer world to
  get the instance of the class.

We'll implement the thread safe one here. Classes are in the package `com.singleton`;

 ```java    
 import  com.singleton.SingletonThreadSafe;

   public class SingletonTest {
      public static void main(String[] args){
        SingletonThreadSafe sing = SingletonThreadSafe.getInstance();
        System.out.println(sing);

        // Now let's instanciate another class

        SingletonThreadSafe sing1 = SingletonThreadSafe.getInstance();

        System.out.println(sing1);

        //Now check out your console.... What the hell, the two instances have the same reference :o
        }
      }
  ```
### Pattern Factory

Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class from client program   to   the   factory   class.   Let’s   first   learn   how   to   implement   factory  pattern in java and then we will learn its benefits and we will see its usage in JDK.

* Super Class : Super class in factory pattern can be an interface, abstract class or a normaljava class. For our example, we have super class as abstract class with overridden toString() method for testing purpose.
  see `com.factory`.
* sub-classes: Let’s  say  we  have  two  sub-classes PC and Server with implementation in `com.factory`

Here's what we have in image :
  [](http://zupimages.net/up/17/13/7w9z.png)

Now let's write the test class.

  ```java
    import com.factory.FactoryClass ; //The factory class
    import com.factory.PC; //sub-class
    import com.factory.Server; //sub-class
    //PC and Server classes extend from Computer.

    public static void main(String[] args){

      FactoryClass fc = new FactoryClass();
      Computer comp1 = fc.getComputer("PC",16,499,4.3);
      System.out.println(comp1);


      Computer comp2 = fc.getComputer("Server",30,900,9);
      System.out.println(comp2);

    //Now you can see the output in your console.
    }
 ```
This pattern provides some advantages such as :

  * It provides approach to code for the interface rathan than the implementation.
  * It removes the instantiation of the actual implementation classes from client code, making it more robust.
  * It provides abstraction between implementation and client classes through inheritance.

  As examples of its  implementation in JDK we have :
  
  * *java.util.Calendar*, *ResourceBundle()* and *NumberFormat getInstance()*;
  * *valueOf()* method in wrapper classes like Boolean , Integer etc.

### Abstract Factory

This is one of the Creational Pattern and almost similar to Factory Pattern except the fact that it's most like
Factory of factories. If you're familiar with __factory design pattern in java__ , you'll notice that we have a single Factory class that returns the different sub-classes based on the input provided and the factory class uses if-else or switch statement to achieve this. Like our factory pattern post, we will use the same super class and sub-classes.
  Codes are available in `com.abstractFactory`.
Here's the implementation of the test class:

```java

    public class abstractFactoryTest{
      public static void main(String[] args){

        Computer c = ComputerFactory.getComputer(new PCFactory("4G","400G","2.9Ghz"));
        /* ComputerFactory class contains static method getComputer(abstractFactory fac) */
       System.out.print(c);

      }
    }
```

### Pattern Builder

Builder pattern is a creational design pattern as Factory Pattern and Abstract Factory Pattern. This pattern was introduced to solve some of the problems with Factory and Abstract Factory patterns when the Object contains a lot of attributes. This pattern deals with a static nested class and then copy all the arguments from the outer class to the Builder class.
The sample code where we have a Computer class and ComputerBuilder to build it are available in the package `com.builder.Computer`.
Here's a test program showing how to use Builder class to get object.


```java

  import com.builder.Computer;

public class TestBuilderPattenr{
  public static void main(String[] args){

      Computer comp = new Computer.ComputerBuilder(
      "500 GB","2 GB").setBluetoothEnabled(true)
      .setGraphicsCardEnabled(true).build(); // -)
      )
  }

}
```
There are really various implementations of this pattern in JDK : java.lang.StringBuilder#append() (unsynchronized) java.lang.StringBuffer#append() (synchronized) .

### Pattern Prototype

Prototype pattern is one of the Creational Design pattern, so it provides a mechanism of object creation. Prototype pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing. So this pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. This pattern uses java cloning to copy the object.

```java

import java.util.ArrayList;
import java.util.List;
public class Users implements Cloneable{
    private List<String> empList;

    public Users(){

      empList = new ArrayList<>();
      }

public Users(List<String> list){
this.empList=list;
}

//read some data from the database.
public void loadData(){
    empList.add("japak");
    empList.add("King");
    empList.add("David");
    empList.add("Romeo");
}

public List<String> getEmpList() {
    return empList;
}

  @Override
  public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
          temp.add(s);
          }
          return new Users(temp);
}
}

 //Notice that the clone method is overridden to provide a deep copy of the users list.
```

Here's the program that will show the benefit of the Prototype pattern usage.

```java
public class PrototypePatternTest {
  public static void main(String[] args) throws CloneNotSupportedException {
        Users usr = new Users();
          user.loadData();
//Use the clone method to get the User object
        Users useNew = (Users) user.clone();
        Users useNew1 = (Users) user.clone();
        List<String> list = useNew.getEmpList();
        list.add("John");

        List<String> list1 = usersNew1.getEmpList();
        list1.remove("Pankaj");
        System.out.println("users List: "+users.getEmpList());
        System.out.println("users New List: "+list);
        System.out.println("users New1 List: "+list1);
      }
}
```
