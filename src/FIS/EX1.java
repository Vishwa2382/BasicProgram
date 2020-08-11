package FIS;

class Ax
{
	public void axx() {
		System.out.println("AX");
	}
	
	
}

class C extends Ax
{
	System.out.println("ZB");
}

public class EX1
{

	public static void main(String[] args)
	{
		System.out.println("Hello");
		
		C obj = new C();
	}

}
