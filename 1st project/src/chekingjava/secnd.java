package chekingjava;

public class secnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// automatic typecasting ** widening
	int a= 5 ;
	double b= a;
			
		System.out.println(b);
		//manual type casting **narrowing
		//doesnot work on string
		double q = 26.98;
		
		int  t= (int)q  ;
		System.out.println(t);

	}

}
