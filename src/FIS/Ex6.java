package FIS;

class Parrent
{
	public void hello()
	{
		System.out.println("Parreent");
	}
}

class Child extends Parrent
{
	public void hello()
	{
		System.out.println("Child");
	}
}



public class Ex6 {

	public static void main(String[] args) 
	{

		Child c = new Child()
	;
		c.hello();
	}

}
