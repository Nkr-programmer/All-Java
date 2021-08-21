package school;

import java.util.Scanner;

public class One_to_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    //creating an object of class Print
		    Print obj=new Print();
		    int N;
		    
		    //input N
		    N=sc.nextInt();
		    
		    //calling printNos() methdo
		    //of class Print
		    obj.printNos(N);
		   
		    
		}
	
	}

}
class Print
{
    
    static void printutil(int N){
        if(N==0)return ;
        
        printutil(N-1);
        System.out.print(N+" ");        
    }
    
   static  void printNos(int N)
    {
printutil(N);
 System.out.println();
 return;
    }
}
