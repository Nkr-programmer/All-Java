package reversestringbyfunction;

public class Reversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a= "   i      love      ,      u      so      much      hard      time    ";
		  String c=a.trim(); 
		 
		String b[]=c.split("      ");
//		for( String f:b)
//		{
//			
//			System.out.print(f+"");
//			
//		}
	 for(int i=7;i>=0;i--)
	 {
		 System.out.print(b[i]+" ");
		 
	 }
  
		
		//loop hole is if the spsce between words is inconsistant then
	 //it will not work and acc to equal space between words 
	// it is not automatic    ("      ")
		
		
		
		
	}

}
