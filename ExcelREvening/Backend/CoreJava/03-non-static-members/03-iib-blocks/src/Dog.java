class Dog 
{
	String name, breed, gender, nature;
	int age;
	double height, weight;

	Dog(String name, String breed, String gender, String nature, int age,
		double height, double weight)
	{
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.gender = gender;
		this.nature = nature;
		this.height = height;
		this.weight = weight;
	}

	public static void main(String[] args) 
	{
		Dog charlie = new Dog("Charlie", "labrador", "Male", "Animal", 6, 2.5, 6.4);
		System.out.println("Your dog details: " + "Dog Name: " + charlie.name + "," + 
		"Dog Breed: " + charlie.breed + "," + "Dog Gender: " + charlie.gender + 
		"," + "Dog Nature: " + charlie.nature + "," + "Dog Age: " + charlie.age + 
		"," + "Dog Height: " + charlie.height + "," + "Dog Weight: " + charlie.weight);
       System.out.println("---------------------------");
	   Dog baby = new Dog("Baby", "Indian Periah", "Female", "Animal", 3, 2.0, 5.3);
		System.out.println("Your dog details: " + "Dog Name: " + baby.name + "," + 
		"Dog Breed: " + baby.breed + "," + "Dog Gender: " + baby.gender + 
		"," + "Dog Nature: " + baby.nature + "," + "Dog Age: " + baby.age + 
		"," + "Dog Height: " + baby.height + "," + "Dog Weight: " + baby.weight);
       System.out.println("---------------------------");
       Dog ruby = new Dog("ruby", "Indian Periah", "Male", "Animal", 6, 2.5, 6.4);
	   System.out.println("Your dog details: " + "Dog Name: " + ruby.name + "," + 
		"Dog Breed: " + ruby.breed + "," + "Dog Gender: " + ruby.gender + 
		"," + "Dog Nature: " + ruby.nature + "," + "Dog Age: " + ruby.age + 
		"," + "Dog Height: " + ruby.height + "," + "Dog Weight: " + ruby.weight);
       }
}
