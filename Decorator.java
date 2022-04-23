

abstract class Pizza 
{
	protected String ingredient;
	
	public String getIngredient()
	{
		return this.ingredient;
	}	
	
	abstract int getValue();
}


class ThinCrust extends Pizza
{
	public ThinCrust()
	{
		this.ingredient = "ThinCrust";
	}
	
	public int getValue()
	{
		return 40;
	}
}

class ThickDough extends  Pizza
{
	public ThickDough()
	{
		this.ingredient= "ThickDough";
	}
	
	public int getValue()
	{
		return 50;
	}
}

abstract class Topping extends Pizza
{
	protected  String ingredient;
	protected Pizza pizza;
	protected int value;
	
	public String getIngredient()
	{
		return pizza.getIngredient() + ", " + this.ingredient;		
	}
	
	public int getValue()
	{
		return this.value + pizza.getValue();
	}
	
}


class Cheese extends Topping
{	
	public Cheese(Pizza pizza)
	{
		this.pizza = pizza;
		this.ingredient = "Cheese";
		this.value = 5;
	}		
}

class Pepperoni extends Topping
{	
	public Pepperoni(Pizza pizza)
	{
		this.pizza = pizza;
		this.ingredient = "Pepperoni";
		this.value = 2;
	}	
}


class Decorator 
{
	public static void main (String args[])
	{
		Pizza pizza = new ThinCrust();
		pizza = new Cheese(pizza);
		pizza = new Cheese(pizza);
		pizza = new Cheese(pizza);		
		pizza = new Pepperoni(pizza);		
		System.out.println("\n" + "Pizza:" + pizza.getIngredient() + "\n" + "Valor:" + pizza.getValue() + "\n");			
	}
}


