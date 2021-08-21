package hash;

import java.util.Vector;

public class Hash_function<K,V> {




		public Hash_function() {


		}
static int size=20;
	static	 String num[]= new String[size];
	static	 String nums[]= new String[size];
	static	 Vector numse[]= new Vector[size];
	public static void main(String[] args) {

		
//		
//		x.put("hack", 1);
//		x.put("hacked", 2);
//	
//		System.out.println(x.containsKey("hack"));
//		
insertionlinear("hong"); 
insertionlinear("ball"); 
insertionlinear("cat"); 
insertionlinear("hnog"); 
System.out.println();
searchlinear("hnog");
	
	System.out.println();

insertionQuadratic("hongs"); 
insertionQuadratic("balls"); 
insertionQuadratic("cats"); 
insertionQuadratic("hnogs"); 
System.out.println();
searchQuadratic("cats");
	

System.out.println();

insertiondouble("hongsman"); 
insertiondouble("ballsman"); 
insertiondouble("catsman"); 
insertiondouble("hnogsman"); 
System.out.println();
searchdouble("catsman");

System.out.println();
searchall();

System.out.println();

insertioncollistion("honged"); 
insertioncollistion("ballsed"); 
insertioncollistion("catsed"); 
insertioncollistion("hnoged"); 
System.out.println();
	}

	private static void insertionlinear(String s) {
		// TODO Auto-generated method stub
		int c= hash_function(s);

		while(num[c]!=null)
		{	c=(c+1)%size;}
		num[c]=s;
		System.out.println(num[c]+""+c);
	}
	private static void searchlinear(String s)
	{
		int c= hash_function(s);

		while(num[c]!=null&& num[c]!=s)
		{	c=(c+1)%size;}
		if(num[c]==s)
		System.out.println(num[c]+""+c);
	}


	private static void insertiondouble(String s) {
		// TODO Auto-generated method stub
		int c= hash_function(s);
        int d=hash_function1(s);
		while(nums[c]!=null)
		{	c=(c+d)%size;}
		nums[c]=s;
		System.out.println(nums[c]+""+c);
	}
	private static void searchdouble(String s)
	{
		int c= hash_function(s);
		int d= hash_function(s);
		while(nums[c]!=null&& nums[c]!=s)
		{	c=(c+d)%size;}
		if(nums[c]==s)
		System.out.println(nums[c]+""+c);
	}

	private static void insertionQuadratic(String s) {
		// TODO Auto-generated method stub
		int c= hash_function(s);
int h=1;
		while(num[c]!=null)
		{	c=(c+h*h)%size;h++;}
		num[c]=s;
		System.out.println(num[c]+""+c);
	}
	private static void searchQuadratic(String s)
	{
		int c= hash_function(s);
int h=1;
		while(num[c]!=null&& num[c]!=s)
		{	c=(c+h*h)%size;h++;}
		if(num[c]==s)
		System.out.println(num[c]+""+c);
	}
	
	private static void insertioncollistion(String s) {
		// TODO Auto-generated method stub
		int c= hash_function(s);
		numse[c].add(s);
		System.out.println(num[c]+""+c);
	}
	
	
	
	
	private static void searchall() {
		for(int i=0;i<nums.length;i++)
			if(nums[i]!=null)
				System.out.println(nums[i]+" "+i);
	}
	
	private static int hash_function(String s) {

		int hash=0;
		for(int i=0;i<s.length();i++)
			hash += s.charAt(i);
		hash= hash%19;
		return hash;
	}
	private static int hash_function1(String s) {

		int hash=0;
		for(int i=0;i<s.length();i++)
			hash += s.charAt(i);
		hash= hash%23;
		return hash;
	}

	
	

}
