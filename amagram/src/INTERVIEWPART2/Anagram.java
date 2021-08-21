package INTERVIEWPART2;

public class Anagram {

	public static void main(String[] args) {
		

		//to check that two strings are anagram
		String a="hence";
		String b="hencf";
		 boolean x= false;
		 if(a.length()==b.length())
			  {
			 
			 
		for(int i=0;i<a.length();i++)
		{
			 char c=a.charAt(i);
			for(int j=0;j<b.length();j++)
			{
				 char d=b.charAt(j);
				 if(c==d)
				 {	
					 x = true;
					 break;
					 
				 }	
				 else {
					 x = false;
				      }
				
			}
			
			
			
		}
		 }
		 else {
			System.out.println( "it is not anagram");
		 }
		System.out.println(x);
		
		
		
	}

}
