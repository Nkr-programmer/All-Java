package operaters;

public class jackmine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 airthmatic +-*/%++ --
		int a=15;
		int b=7;
		double c= a/b ;
	System.out.println(c);
		
		int k=15;
		int l=7;
		double m= (double) a/b ;
	System.out.println(m);
		//2 bitwise  not and or xor oo 1 01 1 11 0 ^ symbol of xor
		//5 101
		//6 110
		//4 100
		int g=5;
        int z=6;
        int y = g & z;
        int h= g<<2;
       System.out.println(y);
       System.out.println(h);
        //1101  0110 0011
        //13      6   3 reverse is true
        //3 assingment =    ==    a= a+2
        
        //4 comarison <  >  <=  >=     !=  !>   !<
       System.out.println(g<z);
        
        //5 logical operaters boolean  &&  II   ! with both (&&use to check it doesnot check second condition
       //but &check both conditionbyte wise operater
        boolean u= true;
        boolean p= false;
        boolean s= u&&p;
      System.out.println(s);
      
	}

}
