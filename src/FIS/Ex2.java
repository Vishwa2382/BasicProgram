package FIS;

class One
{
	public final void method1()
	{
		System.out.println("Hello m1");
		
	}
	
}

class Two extends One
{
	
}

public class Ex2 
{
	
	public static void main(String[] args) 
	{
		Two obj = new Two();
		obj.method1();
	}
}
