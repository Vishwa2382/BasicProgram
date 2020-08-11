package Com.Cons;

class CoffeCup
{
	public void m1()
	{
		System.out.println("Task1");
	}
	public CoffeCup()
	{
		System.out.println("Default Constructor");
	}
	
	
}

public class ConsEx1 {

	public static void main(String[] args) 
	{
		CoffeCup c = new CoffeCup();
		c.m1();
	}

}
