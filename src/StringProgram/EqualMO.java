package StringProgram;

public class EqualMO {

	public static void main(String[] args)
	{
		String s1 = new String("Vishwa");
		String s2 = new String("Vishwa");
		
		StringBuffer sb1 = new StringBuffer("Vishwa");
		StringBuffer sb2 = new StringBuffer("Vishwa");
		
		System.out.println("Operator  " +"op: "+ s1==s2);
		System.out.println("s1.equals(s2)  "+ s1.equals(s2));
		
		System.out.println("**************StringBuffer****************");
		
		System.out.println(sb1==sb2);
		System.out.println("equals() sb  "+ sb1.equals(sb2));
		
		

	}

}
