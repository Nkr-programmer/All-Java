package INTERVIEWPART2;

public class Anagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hence";
		String b="henee";
		 boolean x= false;
		 boolean n[]=new boolean [b.length()]; 
		 
		 
		 if(a.length()==b.length())
			  {
			 
			 
		for(int i=0;i<a.length();i++)
		{
			 char c=a.charAt(i);
			for(int j=0;j<b.length();j++)
			{
				 char d=b.charAt(j);
				 if((c==d)&&!n[j])
				 {	n[j]=true;
					 x = true;
					 break;
					 
				 }	
				 else {
					 x = false;
				      }
				
			}
			
			     if(x==false)
			         {
				
			        	break;
			         }
			
			
		}
		 }
		 else {
			System.out.println( "it is not anagram");
		 }
		System.out.println(x);
	}

}
