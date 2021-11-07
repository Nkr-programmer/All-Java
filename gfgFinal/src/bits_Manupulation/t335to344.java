package bits_Manupulation;

import java.util.*;

public class t335to344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//// IMPPP  https://www.geeksforgeeks.org/bitwise-operators-in-c-cpp/
	}
//1
	//Count set bits
	//O(logn)
	 static int setBits(int N) {
	        int x=0;
	        while(N>=1){
	            if(N%2==1){x++;}N=N/2;
	        }
	        return x;
	    }
	 //3
	 //Bit Difference
	 public static int countBitsFlip(int a, int b){
	        int g=a^b;
	        return setBits(g);
	    }
	 //5
//	 check if value is 2^x or not
	 public static boolean isPowerofTwo(long n){
	        return setBits(n)==1;
	    }
	  static int setBits(long N) {
	        int x=0;
	        while(N>=1){
	            if(N%2==1){x++;}N=N/2;
	        }
	        return x;
	    }   
	  //6
//Find position of set bit 
	    static int c=0;
	  	    static int findPosition(int N) {
		        c=0;
		        if(setBist(N)!=1)return -1;
		        else return c;
		    }
		    static int setBist(int N) {
			        int x=0;
			        while(N>=1){
			            if(N%2==1){x++;}N=N/2;
			        c++;}
			        return x;
			    }
	
		    //9
		    //Calculate square of a number without using *, / and pow()
		  //x<<y  =x*(2^y)   left shift   x>>y =x/(2^y) right shift
public static int square(int num)
{
	if(num<0)num=-num;
	int r=0,t=num,result=0;
	while(t>0)
	{
		int pos=0,curr=1;
	while((curr<<1)<=t) {curr=curr<<1;++pos;}
	result=result+(num<<pos);
	t=t-curr;
	}
return result;
}
//10
//Power Set 
// O(2^n)
public List<String> AllPossibleStrings(String s)
{
    List<String>a=new ArrayList<String>();
    char arr[]=s.toCharArray();
    permute(new String(arr),s.length(),-1,"",a);
    Collections.sort(a);
    a.remove("");
    return a;
}
public void permute(String s,int n,int i,String curr,List<String>a)
{
    if(i==n)return;
    a.add(curr);
    for(int j=i+1;j<n;j++)
    {
        curr+=s.charAt(j);
        permute(s,n,j,curr,a);
        curr=curr.substring(0,curr.length()-1);
    }
return;
}
}