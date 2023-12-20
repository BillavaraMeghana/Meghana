class A 
{
	int i;
}
class B extends A
{
	int j;

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
//these are the one of the basic pillar of object oriented Programming 
//Language
//1.Inheritance
//2.Abstraction
//3.Encapsulation
//4.Polymorphism
/*
Inheritance
---------------------------
- Aquiring the properties and behaviours of another class.
- A class can inherit properties(variables) and behaviours(methods) from another
class
- 'A' class is also called as BASE class == PARENT class == SUPER class
  'B' class is also called as DERIVED class == CHILD class == SUB class
- We can achieve inheritance using 'extends' keyword in case of classes.
- In case of extends the indication would be a solid line towards pointing to 
super type.
- we can inherit non static variables
- we can inherit non static methods
- we can inherit static variables

can we inherit main method also?
Yes. main method also inherits to the sub class but:
1. If the sub-class is having its own main method, then if we call the main 
method from the sub-class it will be always calling the sub-class main method
only.
2. If the sub class doesnt have its own main method, then if we call the main 
method from the sub-class it will be always calling the super-class main method
only.

- There are 5 types of Inheritance
--------------------------------------
1. Single inheritance - 1 class is extending to another class
2. multi-level inheritance
3. Multiple inheritance
4. Hierarchical inheritance
5. Hybrid inheritance

- The main use of inheritance is code re-usability.

*/