class M 
{
	M()
	{
        System.out.println("M()");
	}
}
class N extends M
{
	N()
	{
		System.out.println("From N()");
	}
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("from N main");
	}
}
/*
Super calling statement
-------------------------
- In each and every constructor body as a first statement compiler only keeps
'super();'
- This 'super();' is going to call the super class no-arg constructor.
- super calling statement we can keep in the constructor body as well as 
method only.
- According to the argument that we supply to the super, it is going to call
the super class constructor.

- There is class called Object that is the inbuilt class.
- Object class is the super-most class in java.
- each and every class(inbuilt, user defined class) extends Object class either directly or
indirectly
- for each class Object is the super class either directly or
indirectly
-From the Object class most important members which is required by all the classes 
would be inheriting to the sub-classes.

direct sub-class
-----------------------------
Ex1:
class M
Ex2:
class M extends object

In the constructor body if we are keeping this 'this()' calling statement then
compiler will not keep 'super()'
- one constructor is calling another constructor is refered to as 
'constructor chaining'
/*