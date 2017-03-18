# Java Designs Pattern

Here's is an implementation of some Design Patterns from scratch :p

__What is a Design Pattern ?__
   > A software design pattern is a general reusable solution to a commonly occurring problem within a given context in software design --- Wikipedia

In Java, Design Patterns are dived into tree parts : *Creational*, *Structural* and *Behavioral*.

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
Pattern Singleton: one Class, one Instance.
    Singleton is one of the Gangs of Four Design patterns and comes in the Creational Design Pattern category.
There are many implementations of this pattern, but we will implement the Thread Safe one.
Classes are in the package `com.Singleton`;

    ```Java

        import  com.singleton.SingletonThreadSafe;

      public class SingletonTest {
        public static void main(String[] args){

          SingletonThreadSafe sing = SingletonThreadSafe.getInstance();
          System.out.println(sing);

          // Now let's instanciate another class

          SingletonThreadSafe sing1 = SingletonThreadSafe.getInstance();

          System.out.println(sing1);

          //What the hell, the two instances have the same reference :o
        }
      }
    ```
# Pattern Factory
