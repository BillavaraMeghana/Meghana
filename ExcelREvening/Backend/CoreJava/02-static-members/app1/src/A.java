class A 
{
	
	static int i;//field, property, attribute

	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
/*
1. static is a keyword or reserver word.
2. we can declare a variable with static word.
3. static means something that doesnt change very often.
4. static members are also called as class members.

     how static members are processed?
	 --------------------------------
	 1. All the static members gets loaded whenever the class is loading
	 to the memory.
	 2. In case of static variables they are going to be loaded with their
	 default values Ex: ==> 0, double ==> 0.0, boolean ==> false, 
	 String ==> null etc...
	 3.After all the static members gets loaded to the memory, the next step
	 is that all the static members gets initialized and executed from top 
	 tpo bottom only onec.
	 4. All the static members gets loaded, initialized and executed from top
	 to bottom only once for one execution when the class is loadfing to the
	 memory.
	 5. After the static members gets loaded, initialized and executed from top
	 to bottom control comes to the main method. starts execution from main 
	 method.

Interview questions ==> Is there any posibility of excecuting something 
before the execution of main method??
Ans: Yes. All the static members gets loaded, initialized and executed 
before the execution of main method.
	 */