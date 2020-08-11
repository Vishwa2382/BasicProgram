package static_kw;


class StaticEx2
{
	static int j=11;
	public static void count()
	{
		int i=12;
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		//return i;
	}
}

class StaticEx2a extends StaticEx2
{
	int sum()
	{
		int k;
		k=i+j;
		System.out.println("Sum:= "+k);
	}
}

public class Static_Method 
{

	public static void main(String[] args)
	{
		StaticEx2 obj1 = new StaticEx2();
		obj1.count();
		
		StaticEx2.count();
	}

}
