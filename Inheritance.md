## Inheritance

Inheritance is an important pillar of OOP (Object Oriented Programming).
It is the mechanism in Java by which one class is allowed to inherit the features (fields and methods) of another class. 
We are achieving inheritance by using extends keyword. Inheritance is also known as “is-a” relationship.

  - **Superclass:** The class whose features are inherited is known as superclass (also known as base or parent class).
  - **Subclass:** The class that inherits the other class is known as subclass (also known as derived or extended or child class). 
The subclass can add its own fields and methods in addition to the superclass fields and methods.
  - **Reusability:** Inheritance supports the concept of “reusability”, i.e.
when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. 
By doing this, we are reusing the fields and methods of the existing class.
**Demonstration of Inheritance :**
```
//base class or parent class or super class 
class A{ 
//parent class methods 
void method1(){} 
void method2(){} 
} 

//derived class or child class or base class 
class B extends A{ //Inherits parent class methods 
//child class methods 
void method3(){} 
void method4(){} 
}
```
