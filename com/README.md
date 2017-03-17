# Java Designs Pattern

Here's is an implementation of some Designs Pattern from scratch.
Code source files are available in the package `com.patternObsTest`.

__What is a Design Pattern ?__
   > a software design pattern is a general reusable solution to a commonly occurring problem within a given context in s software design --- Wikipedia

# Pattern Observer
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

     
