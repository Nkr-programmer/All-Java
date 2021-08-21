package oops;

class desk{
	int a,b;
	desk(int a){
		///a=d;
		this.a=a;
		System.out.println("hello");
	}
	desk(int a,int b){
		///a=d;
		this.a=a;
		this.b=b;
		System.out.println("hello excellance"+a+" "+b);
	}
	desk(){
		
		System.out.println("hello everyone");
	}
	
	
}


public class Contrutors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		desk pot=new desk(87);
		desk pot1=new desk();
		desk pot2=new desk(87,98);
System.out.println(pot.a);


	}

}
