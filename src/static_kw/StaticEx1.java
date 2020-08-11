package static_kw;

public class StaticEx1 
{

	static int k=1;
	
	public static void main(String[] args) 
	{
		int i = 1;
		int j =1;
		
		
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		System.out.println("k= "+k);
		System.out.println("******2nd********");
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		System.out.println("k= "+k);
		System.out.println("****** 1st Obj ********");
		
		StaticEx1 obj1= new StaticEx1();
		
		System.out.println("i= "+obj1.k);
		System.out.println("i= "+obj1.k);
		
		System.out.println("****** 2nd Obj ********");
		
		StaticEx1 obj2= new StaticEx1();
		
		System.out.println("i= "+obj2.k);
		
	}

}
