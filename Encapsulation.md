## Encapsulation

It is defined as the wrapping up of data under a single unit. It is the mechanism that binds together the code and the data it manipulates.
Another way to think about encapsulation is that it is a protective shield that prevents the data from being accessed by the code outside this shield. 

  - Technically, in encapsulation, the variables or the data in a class is hidden from any other class and can be accessed only through any member function of the class in which they are declared.
  - In encapsulation, the data in a class is hidden from other classes, which is similar to what data-hiding does. So, the terms “encapsulation” and **“data-hiding”** are used interchangeably.
  - Encapsulation can be achieved by declaring all the variables in a class as private and writing public methods in the class to set and get the values of the variables.


**Demonstration of Encapsulation:**
```
//Encapsulation using private modifier 

//Employee class contains private data called employee id and employee name 
class Employee { 
	private int empid; 
	private String ename; 
} 
```
