import java.util.*;

interface Observer
{
	public void update();
}

class News
{
	ArrayList<Observer> observer = new ArrayList<Observer>();	
	
	public  void addClient(Observer client)
	{
		this.observer.add(client);
	}
	
	public  void removeClient(Observer client)
	{
		this.observer.remove(client);
	}
	public  void notifyClients()
	{
		this.observer.forEach(client -> client.update());
	}
	
}


class Client implements Observer
{
	String name;
	
	public  Client(String name)
	{
		this.name = name;
	}
	
	public  void update()
	{
		System.out.println(this.name + "," + "your favorite  news was updated!" + "\n");
	}
}

class ObserverExample
{
	public static void main(String args[])
	{	// Create a instance of a news
		News news_A = new News();	
		// Create some people 
		Client Maria = new Client("Maria");
		Client Marcelo = new Client("Marcelo");
		//Add the people that would like to see updates about this news_A
		news_A.addClient(Maria);
		news_A.addClient(Marcelo);
		// When theres something new about this theme, update all client that would like to read about the news
		news_A.notifyClients();				
	}
}
