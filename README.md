# Java Design Patterns

Here's is an implementation of some Design Patterns from scratch :p

__What is a Design Pattern ?__
   > A software design pattern is a general reusable solution to a commonly occurring problem within a given context in software design --- Wikipedia

In Java, Design Patterns are divived into tree parts : *Creational*, *Structural* and *Behavioral*.

# Pattern Observer
  Code source files are available in the package `com.patternObsTest`.
  The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.

  ```java

      // importing classes in the package
     import com.patternObsTest.*;

    public class test{
       public static void main(String[] args[]){

         Subject s = new Subject();
         Observer o = new Observer();
         Observer o2 = new Observer();
         Observer[] arr = {o,o2};

         s.attach(arr);

          /*now we set the value of the attribute length contains in the Subject.
            NOTE: the param is an enum (valLEngth)
           */

         s.setLength(valLength.Val2);
         //Now look at your console to see the result :p

       }

     }
  ```

# Pattern Singleton
Pattern Singleton: One Class, one Instance.
    Singleton is one of the Gangs of Four Design patterns and comes in the Creational Design Pattern category.
There are many implementations of this pattern, but we will implement the Thread Safe one.
Classes are in the package `com.Singleton`;
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
# Pattern Factory

  Factory Pattern is one of the Creational Design pattern and it's widely used in  JDK as well as frameworks like
Spring and Struts.
This pattern is used when we have a super class with multiple sub-classes and based on the input, we need to return one of the sub-class.

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

# Abstract Factory

This is one of the Creational Pattern and almost similar to Factory Pattern except the fact that it's most like
Factory of factories.
Source files are in the package `com.abstractFactory`.

```java

    public class abstractFactoryTest{
      public static void main(String[] args){

        Computer c = ComputerFactory.getComputer(new PCFactory("4G","400G","2.9Ghz"));
        /* ComputerFactory class contains static method getComputer(abstractFactory fac) */
       System.out.print(c);

      }
    }
````
