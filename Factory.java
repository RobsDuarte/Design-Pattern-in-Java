import java.util.*;

interface Animal
{
	public void sound();
	
}

class Cat implements Animal
{
	public void sound()
	{
		System.out.println(" Cats does meow ");
	}
}

class Dog implements Animal
{
	public void sound()
	{
		System.out.println(" Dogs does woof woof ");
	}
}

class Bird implements Animal
{
	public void sound()
	{
		System.out.println(" Birds does chirp chirp ");
	}
}

class Unknown implements Animal
{
	public void sound()
	{
		System.out.println(" This animal is unknown\n ");
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

enum EAnimal
{
	Cat,
	Bird,
	Dog,
	Horse
}

class MyFactory
{	
	public static Animal create(EAnimal animal)
	{		
		switch (animal)
		{
			case Cat:
				return new Cat();
			case Dog:
				return new Dog();
			case Bird:
				return new Bird();
			default:	
				return new Unknown();
		}
	}
}

class Factory
{
	public static  void main(String args[])
	{		
		Animal animal;
		
		for(EAnimal animals : EAnimal.values())
		{
			animal = MyFactory.create(animals);
			Sound.whatsTheSoundOf(animal);
		}	
	}
}

