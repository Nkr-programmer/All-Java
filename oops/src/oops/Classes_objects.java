package oops;
//we can not use 2 public for class

 class start{
	//properties of class	
	 
	boolean first=false;
 String second="falser";
 int gash=978;
 double hence=90909.9;
 
 
  //if inialised then approrite for those who doesnot declased in main class

 
 public void flag() {
	 
System.out.println("hey we gonna first");	 
 }
//behavior of class	
 public void gush() {
	 System.out.println("hey we gonna second  "+first+"   "+gash+"  "+hence+"  "+second+"  ");	 
	 
 }
 
 
}

public class Classes_objects {

	public static void main(String[] args) {
	
		
		
		
		start jokkey=new start();
		start jokkers=new start();
		
		jokkey.first=true;
		jokkey.second="truelar";
		jokkey.gash=999;
		jokkey.hence=99999.99;
		
		
		
		
		
jokkey.flag();		
jokkey.gush();	

jokkers.flag();		
jokkers.gush();	


	}

}
