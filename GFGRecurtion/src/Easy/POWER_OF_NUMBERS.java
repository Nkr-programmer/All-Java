package Easy;

import java.util.Scanner;


//BINARY EXPONANTITION
//https://disq.us/url?url=https%3A%2F%2Fdiscuss.codechef.com%2Ft%2Fa-tutorial-on-fast-modulo-multiplication-exponential-squaring%2F2899%3AIJrbHbCae077YQwDlRJAgrpvvQg&cuid=3952990



public class POWER_OF_NUMBERS {
    public static long rev(long n)
    {
        long rev_num = 0;
         while(n > 0) 
          { 
            rev_num = rev_num*10 + n%10; 
            n = n/10; 
          } 
          return rev_num;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
        //testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    PowerProblem obj=new PowerProblem();
		    
		    int N;
		    
		    
            //input N
		    N=sc.nextInt();
		    int R=0;
		    
		    	    
            // reverse the given number n
		    R=(int)rev(N);
		    
	
            //power of the number to it's reverse
		    long ans=(long)obj.power(N,R);
		    System.out.println(ans);
		    
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class PowerProblem
{
public long modfun(long n, long  R)
{
    // Base cases 
    if (n == 0) 
        return 0; 
    if (R == 0)  //power zero mean answer is 1
        return 1; 
  
    // If R is even 
    long y; 
    if (R % 2 == 0) { 
        y = modfun(n, R/2);  //finding r/2 power as power is even then storing answer in y and---
        y = (y * y) % 1000000007; //---if power is even like 2^4 we can simply do (2^2)*(2^2)
    } 
  
    // If R is odd 
    else { 
        y = n % 1000000007; 
        y = (y * modfun(n, R - 1) % 1000000007) % 1000000007; //--- reduce the power by 1 to make it even. The reducing power
        //by one can be done if we take one n out. Like 2^3 can be written as 2*(2^2)
    } 
  
    return ((y + 1000000007) % 1000000007);  //finally return the answer (y+mod)%mod = (y%mod+mod%mod)%mod = (y%mod)%mod
    }
    
    
long power(int N,int R)
{
    return modfun(N,R)%1000000007;
    
}

}