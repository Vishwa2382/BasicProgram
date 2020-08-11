package Array.com;
class NGE
{
	public static void m1(int a[])
	{
		System.out.println(a.length);
		int i;
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
}

public class ArrayEx1 
{
	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4};
		m1(ar);
		
		System.out.println(ar.length);
		int i;
		for(i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}

	
}