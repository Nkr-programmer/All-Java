package Constructors;
 class Non {
 String  h;
 int k;
	           
 	Non()
	{
		h="vulgure";
	}
 	
 	Non(String h)
	{
 		
 		//this keyword is used to fill current object as string h by object y which is used in mains
		this.h=h;
		//if string j         then this.h=j;
	}
	Non(String h,int k)
	{
 		
 		
		this.h=h;
		this.k=k;
	}
	
	
}
public class Xonstructors {
	
	Xonstructors(){
		
		System.out.println("hello brother");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xonstructors n=new Xonstructors();
		
		Non k=new Non();
		System.out.println(k.h);
		
		String y;
		int q=5;
		
		y="offo";
		Non hell=new Non(y); 
		System.out.println(hell.h);
		
		
		Non helboy=new Non(y,q); 
		System.out.println(helboy.h+" "+helboy.k);
	}

}
