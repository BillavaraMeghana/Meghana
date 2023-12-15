class B 
{
	B()
	{
        System.out.println("B()");
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("done");
	}
}
/*
1. if at least one constructor kept by the user then compiler will not be
keeping default constructor.
2. constructor name should be same as class name.
3. constructors cannot have return type.
4. constructors are not normal methods but internally they are special kind
of methods.
5. constructor is a non static.
6. constructors are used to initialize the objects.
7. constructors can take any number of arguments.
8. constructors must be having a body.
9.we can develop any no of valid statements inside the constructor body.
10. in one class we can develop any no of constructors but arguments must be 
different.
11. constructors must be develop within the class and outside of any method or
block.
*/