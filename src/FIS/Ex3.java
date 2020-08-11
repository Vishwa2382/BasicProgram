package FIS;

public class Ex3
{

	public static void main(String[] args)
	{
		//StringBuffer sb = new StringBuffer("vishwa");
		StringBuffer sb1 = new StringBuffer("vishwa");
		System.out.println("Sb1: "+sb1);
		System.out.println("Capacity: "+sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer("k");
		System.out.println("Sb2: "+sb2);
		System.out.println("Capacity: "+sb2.capacity());
		
		StringBuffer sb3;
		sb3=sb1.append(sb2);
		System.out.println("Sb3: "+sb3);
		System.out.println("Capacity: "+sb3.capacity());
		
	
		System.out.println("*****************************");
		
		StringBuilder sb11 = new StringBuilder("vishwa");
		System.out.println("SB11 val "+sb11);
		System.out.println("SB11 Capacity: "+sb11.capacity());
		
		StringBuilder sb12 = new StringBuilder("k");
		System.out.println("Sb12: "+sb12);
		System.out.println("Capacity: "+sb12.capacity());
		
		StringBuilder sb13;
		sb13=sb11.append(sb12);
		System.out.println("Sb13: "+sb13);
		System.out.println("Sb13: "+sb13.capacity());
		
		
		System.out.println("********************");
		StringBuffer sb21 = new StringBuffer("vishwa");
		
		System.out.println("Append "+ sb21.append(true)+ "  "+ sb21.capacity());


	}
	
}