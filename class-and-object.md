**CLASS**

A class is a user-defined blueprint or prototype from which objects are created.
It represents the set of properties or methods that are common to all objects of one type.
Using classes, you can create multiple objects with the same behavior instead of writing their code multiple times.
This includes classes for objects occurring more than once in your code. 
In general, class declarations can include these components in order: 

1. Modifiers: A class can be public or have default access (Refer to this for details).
2. Class name: The class name should begin with the initial letter capitalized by convention.
3. Superclass (if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
4. Interfaces (if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
5. Body: The class body is surrounded by braces, { }.

**OBJECT**

An object is a basic unit of Object-Oriented Programming that represents real-life entities.
A typical Java program creates many objects, which as you know, interact by invoking methods. 
The objects are what perform your code, they are the part of your code visible to the viewer/user. 
An object mainly consists of: 

1. State: It is represented by the attributes of an object. It also reflects the properties of an object.
2. Behavior: It is represented by the methods of an object. It also reflects the response of an object to other objects.
3. Identity: It is a unique name given to an object that enables it to interact with other objects.
4. Method: A method is a collection of statements that perform some specific task and return the result to the caller.
A method can perform some specific task without returning anything. Methods allow us to reuse the code without retyping it, which is why they are considered time savers. 
In Java, every method must be part of some class, which is different from languages like C, C++, and Python. 

***Example***
```
public class GFG { 
	
	static String Employee_name; 
	static float Employee_salary; 

	static void set(String n, float p) { 
		Employee_name = n; 
		Employee_salary = p; 
	} 

	static void get() { 
		System.out.println("Employee name is: " +Employee_name ); 
		System.out.println("Employee CTC is: " + Employee_salary); 
	} 

	public static void main(String args[]) { 
		GFG.set("Rathod Avinash", 10000.0f); 
		GFG.get(); 
	} 
} 
```
