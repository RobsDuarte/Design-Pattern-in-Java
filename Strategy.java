interface Animal
{
	public void sound();
	
}

class Cat implements Animal
{
	public void sound()
	{
		System.out.println("meow");
	}
}

class Dog implements Animal
{
	public void sound()
	{
		System.out.println("woof woof");
	}
}

class Bird implements Animal
{
	public void sound()
	{
		System.out.println("chirp chirp");
	}
}

class Sound
{
	public static void whatsTheSoundOf(Animal animal)
	{
		System.out.println("\n");
		animal.sound();		
	}
}


class Strategy
{
	public static  void main(String args[])
	{
		Bird bird = new Bird();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Sound.whatsTheSoundOf(bird);	
		Sound.whatsTheSoundOf(dog);
		Sound.whatsTheSoundOf(cat);
	}
}


