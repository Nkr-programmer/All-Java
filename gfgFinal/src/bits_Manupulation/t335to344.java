package bits_Manupulation;

import java.util.*;

public class t335to344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//// IMPPP  https://www.geeksforgeeks.org/bitwise-operators-in-c-cpp/
	}
	//a
    int MissingNumber(int arr[], int n) {
        int sum=0;n--;
        for(int i=0;i<n;i++){sum+=arr[i];}
        int t=(n*(n+1))/2;
        return n+1-(sum-t);
    }
    //e
    public int[] twoOddNum(int arr[], int n)
    {
        int s=0;
        for(int i=0;i<n;i++){s=s^arr[i];}
        int t=s&(~(s-1));
        int x=0,y=0;
        for(int i=0;i<n;i++)
        {
            if((arr[i]&t)>0)x^=arr[i];
            else y^=arr[i];
        }
     return new int[]{x>y?x:y,x<y?x:y};   
    }
    //i
    public static int search(int a[], int n)
    {
        int result=0;
        for(int i=0;i<32;i++)
        {
            int sum=0,x=(1<<i);
            for(int j=0;j<n;j++){if((a[j]&x)!=0)sum++;}
            if((sum%3)!=0){result|=x;}
        }
return result;
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
	 //2
	 //Non repeating numbers  //O(n)  O(1)
	 public int[] singleNumber(int[] nums)
	    { int s=0;
	        for(int i=0;i<nums.length;i++){s=s^nums[i];}
	        s=s&(-s);
	        int s1=0,s2=0;
	        for(int i=0;i<nums.length;i++)
	        {if((s&nums[i])>0){s1=s1^nums[i];}
	        else {s2=s2^nums[i];}}
	        return  new int[]{s1<=s2?s1:s2,s1>s2?s1:s2};
	        }
	
//1)if we go to 1 to n and count set bits of all numbers
	 //O(nlogn)
//2) //O(logn)
	   static int largest(int n)
	   {
	       int x = 0;
	       while ((1 << x) <= n)
	           x++;
	       return x - 1;
	   }
	   //3
		 //Bit Difference
		 public static int countBitsFlip(int a, int b){
		        int g=a^b;
		        return setBits(g);
		    }
		 //4
		 //Count total set bits
	       //Function to return sum of count of set bits in the integers from 1 to n.
	       public static int countSetBits(int n){
	       if(n<=1)return n;
	       int x=largest(n);
	           return (x*(int)(Math.pow(2,(x-1))))+
	           (n-(int)Math.pow(2,x)+1)+
	           countSetBits(n-(int)Math.pow(2,x));
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
	//7
    //Copy set bits in a range
		//    O(r) O(1) where r max bit limit possible
public static int convert(int x,int y,int l,int r)
{
	if(l<1||r>32)return x;
for(int i=l;i<=r;i++) 
{int m=1<<(i-1);
if((y&m)!=0) {x=x|m;}}
	return x;
}
//8
//Divide two integers without using multiplication, division and mod operator
//O(log(a))
public static long divide(int a,int b)
{
int sign=((a<0)^(b<0))?-1:1;
a=Math.abs(a);
b=Math.abs(b);
long ans=0;
int temp=0;
for(int i=31;i>=0;i--)
{
	if(temp+(b<<i)<=a)
	{temp+=b<<i;ans=ans|(1L<<i);}
}
if(sign==-1)ans=ans*-1;
return ans;
}
//2
public int divide2(int A, int B) {
    if (A == 1 << 31 && B == -1) return (1 << 31) - 1;
    int a = Math.abs(A), b = Math.abs(B), res = 0;
    for (int x = 31; x >= 0; x--)
        if ((a >>> x) - b >= 0) {
            res += 1 << x;
            a -= b << x;
        }
    return (A > 0) == (B > 0) ? res : -res;
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