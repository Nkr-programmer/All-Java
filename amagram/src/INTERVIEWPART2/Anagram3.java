package INTERVIEWPART2;

public class Anagram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hence";
		String b="hcene";
	boolean o=false;
		int a1[]=new int[256];
		int b1[]=new int[256];
		
		
		for(char h:a.toCharArray())
		{
		int l=(int)h;
		a1[l]++;
		}
		
//		for(char h=0;h<a.length();h++)
//		{
//			System.out.print(a[h].toCharArray);
//		}
//		
		
		for(char h:b.toCharArray())
		{
		int l=(int)h;
		b1[l]++;
		}
		
		
		for(int i=0;i<256;i++)
		{
			if(a1[i]==b1[i])
			{
				o= true;
				
			}
			else {
				o= false;
				break;
			}
			
		}
		
		
		
		if(o==true) {
			
			System.out.println("amalgram");
		}
		else {
			
			System.out.println(" not amalgram");
		}
		

		
		
		
	
		
		
		
		
	}

}
