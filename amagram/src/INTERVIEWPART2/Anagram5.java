package INTERVIEWPART2;

public class Anagram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  a="helloeve";
		String  c="jffkgjje";
		char x;
		boolean v=true;

		// // two optimization one is to 7-j and second is two check
		
		// loop should be 8-1 times run
	 char b[]=	a.toCharArray();
	 char d[]=	c.toCharArray();
	 
		for(int j=0;j<7;j++)
		{
			
		
		     for(int i=0;i<7-j;i++)
		    {
		
		if (b[i]>b[i+1])
		{
		x=b[i+1];
		b[i+1]=b[i];
		b[i]=x;
		 v=false;
		}
		
		
	        }	
		 if(v=false)
		 {
			 break;
		 }
		}
		
		
		
		
		
		for(int j=0;j<7;j++)
		{
			
		
		     for(int i=0;i<7-j;i++)
		    {
		
		if (d[i]>d[i+1])
		{
		x=d[i+1];
		d[i+1]=d[i];
		d[i]=x;
		 v=false;
		}
		
		
	        }	
		 if(v=false)
		 {
			 break;
		 }
		}
		
		
		
		
		
		
//imp		
		for(char h:b)
		{
		System.out.print(h);
		}
		
		System.out.println();
		
//imp		
		for(char h:d)
		{
		System.out.print(h);
		}
		System.out.println();
		
		
		
		
		
		if(b.equals(d))
		{
			System.out.println("yo bro amagram");
			
		}
		else {
			
			System.out.println("chal bye amagram nahi hai");
		}
		
	}

}
