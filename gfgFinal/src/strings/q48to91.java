package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class q48to91 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//	       String str = "AACECAAAA";
//	        System.out.println(getMinCharToAddedToMakeStringPalin(str));	
//		System.out.println(runCustomers(2, "ABBAJJKZKZ".toCharArray()));
//		System.out.println(runCustomers(3, "GACCBDDBAGEE".toCharArray()));
//		System.out.println(runCustomers(3, "GACCBGDDBAEE".toCharArray()));
//		System.out.println(runCustomers(1, "ABCBCA".toCharArray()));
//		System.out.println(runCustomers(1, "ABCBCADEED".toCharArray()));
//		System.out.println(mobile());
//      xxxx();
//	char[][]	grid =
//		   {{'b','b','d','d','e','d','b','d','d'},
//			{'b','c','b','c','e','c','a','d','c'},
//			{'a','e','b','e','d','b','e','e','d'},
//			{'d','c','d','e','c','b','b','b','e'},
//			{'b','c','a','e','c','c','d','a','a'},
//			{'a','a','c','b','a','c','a','c','a'},
//			{'a','c','b','d','b','d','b','e','c'}
//			};
//		String word = "dcb";
//		int h[][]=searchWord(grid,word);
//		for(int i=0;i<h.length;i++)
//		{
//				System.out.println(h[i][0]+" "+h[i][1]);	
//		}
//		gross();
//	System.out.println(shufflecheck("s1d1","sd","11"));
//BMA();
	
        int l[] = {3, 2, 2, 5};
        int n = l.length;
        int M = 6;
        solveWordWrap (l, n, M);
}

	// 1
	// Reverse A string
	public void reverseString(char[] word) {
		int i = 0;
		int j = word.length - 1;
		while (i < j) {
			word[i] = (char) (word[i] ^ word[j]);
			word[j] = (char) (word[i] ^ word[j]);
			word[i] = (char) (word[i] ^ word[j]);
			i++;
			j--;
		}
	}

	// second way;
	public String reverseStrings(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	// 2
	// Valid Pallindrone
	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		// System.out.println(s+"ccc");
		int n = s.length();
		if (n == 0 || n == 1)
			return true;
		int i = 0, j = n - 1;

		while (i < j) {
			if (!((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))) {
				i++;
			} else if (!((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))) {
				j--;
			} else {
				if (s.charAt(i) != s.charAt(j))
					return false;
				i++;
				j--;
			}
			// System.out.println(s.charAt(i)+" "+s.charAt(j));
		}
		return true;
	}

	// 3
	static void printDups(String str) {
		HashMap<Character, Integer> count = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (!count.containsKey(str.charAt(i)))
				count.put(str.charAt(i), 1);
			else
				count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
		}

		for (Map.Entry mapElement : count.entrySet()) {
			char key = (char) mapElement.getKey();
			int value = ((int) mapElement.getValue());

			if (value > 1)
				System.out.println(key + ", count = " + value);
		}
	}
	// 4
	// Why strings areimmutable in java
//String is immutable in Java
	// because of the security, synchronization and concurrency, caching, and class
	// loading.

	// 5
	// A Program to check if strings are rotations of each other or not
	public static boolean areRotations(String a, String b) {
		if (a.length() != b.length())
			return false;
		String x = a.concat(b);
		// return x.contains(b);
		return patternSearch(a, b);
	}

	// contains O(nm) kmp used O(n+m)
	static boolean patternSearch(String pattern, String text) {
		int patternLength = pattern.length();
		int textLength = text.length();
		int[] lps = new int[patternLength];
		prepareLPSArray(pattern, lps);

		int i = 0;
		int j = 0;
		while (i < textLength) {
			if (text.charAt(i) == pattern.charAt(j)) {
				i++;
				j++;
			}

			if (j == patternLength) {
				return true;
			}

			if (i < textLength && text.charAt(i) != pattern.charAt(j)) {
				if (j != 0) {
					j = lps[j - 1];
				} else {
					i++;
				}
			}
		}

		return false;
	}

	static void prepareLPSArray(String pattern, int lps[]) {
		int patternLength = pattern.length();
		int len = 0, i = 1;
		while (i < patternLength) {
			if (pattern.charAt(i) == pattern.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len == 0) {
					lps[i] = len;
					i++;
				} else {
					len = lps[len - 1];
				}
			}
		}
	}
//6
	//Java Program to Check if a string is a valid shuffle of two distinct strings
	// O(n)
	public static boolean shufflecheck(String s, String s1, String s2) {
		if(s.length()!=(s1.length()+s2.length()))
			return false;
		char x[]= new char[256];
		int c=0;
		char x1[]= s1.toCharArray();
		char x2[]= s2.toCharArray();
		char result[]= s.toCharArray();
		for(int i=0;i<x1.length;i++)
		{if(x[x1[i]]==0) {c++;} x[x1[i]]++;}
		for(int i=0;i<x2.length;i++)
		{if(x[x2[i]]==0) {c++;}x[x2[i]]++;}
		
		for(int k=0;k<result.length;k++)
		{ x[result[k]]--;   
		if(x[result[k]]<0) {return false;}
		if(x[result[k]]==0) {c--;}
		}
		if(c==0)return true;
		return false;
	}
//7
	// Count and Say
	// creation O(n2) fetch O(1)
	static boolean kn = false;
	static String x[] = new String[30];

	public String countAndSay(int n) {
		if (kn == false) {
			known();
		}
		return x[n - 1];
	}

	public void known() {
		kn = true;
		x[0] = "1";
		for (int j = 1; j < 30; j++) {
			int z = 1;
			String yi = x[j - 1];
			char y[] = yi.toCharArray();
			int g = yi.length();
			for (int i = 1; i < g; i++) {
				if (y[i] == y[i - 1]) {
					z++;
				} else {
					if (x[j] == null) {
						x[j] = "";
					}
					x[j] = x[j] + z + y[i - 1];
					z = 1;
				}
			}
			if (x[j] == null) {
				x[j] = "";
			}
			x[j] = x[j] + z + y[g - 1];
		}
	}

//8
//    Longest Palindrome in a String 
	// brute force O(n3)
	static String longestPalin(String S) {
		int n = S.length(), start = 0, len = 1;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int f = 0;
				for (int k = 0; k < (j - i + 1) / 2; k++) {
					if (S.charAt(i + k) != S.charAt(j - k)) {
						f = 1;
					}
				}
				if (f == 0 && len < (j - i + 1)) {
					len = (j - i + 1);
					start = i;
				}
			}
		}
		String h = "";
		for (int i = start; i < start + len; i++) {
			h += S.charAt(i);
		}

		return h;
	}

	// O(n2) dp
	public String longestPalindrome(String S) {
		int n = S.length(), start = 0, len = 1;
		char[] s = S.toCharArray();
		boolean table[][] = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			table[i][i] = true;
		}

		for (int i = n - 2; i >= 0; i--) {
			if (s[i] == s[i + 1]) {
				table[i][i + 1] = true;
				len = 2;
				start = i;
			}
		}

		for (int k = 3; k <= n; k++) {
			for (int i = 0; i < n - k + 1; i++) {
				int j = i + k - 1;
				if (s[j] == s[i] && table[i + 1][j - 1]) {
					table[i][j] = true;
					if (k > len) {
						len = k;
						start = i;
					}
				}
			}
		}
		return S.substring(start, start + len);
	}

//O(n2) in  worst case
	public String longestPalindroe(String s) {
		int start = 0, max = 1, n = s.length();
		char x[] = s.toCharArray();
		int l = 0, h = 0;
		for (int i = 1; i < n; i++) {
			l = i - 1;
			h = i;
			while (l >= 0 && h < n && x[l] == x[h]) {
				if (h - l + 1 > max) {
					max = h - l + 1;
					start = l;
				}
				h++;
				l--;
			}

			l = i - 1;
			h = i + 1;
			while (l >= 0 && h < n && x[l] == x[h]) {
				if (h - l + 1 > max) {
					max = h - l + 1;
					start = l;
				}
				h++;
				l--;
			}

		}

		return s.substring(start, start + max);
	}
	// 9
	// Longest Repeating Subsequence
	// =>>> BUT USING LCS

	// Recurtion
	public int lcsRecursive(String s, String t, int i, int j) {
		if (i >= s.length() || j >= t.length()) {
			return 0;
		}

		if (s.charAt(i) == t.charAt(j)) {
			return lcsRecursive(s, t, i + 1, j + 1) + 1;
		} else {
			int a = lcsRecursive(s, t, i + 1, j);
			int b = lcsRecursive(s, t, i, j + 1);
			return Math.max(a, b);
		}
	}

	// memo
	private int[][] m;

	public int lcsMemoize(String s, String t, int i, int j) {
		if (i >= s.length() || j >= t.length()) {
			return 0;
		}

		int tmp = m[i][j];
		if (tmp > 0) {
			return tmp - 1;
		}

		int r;
		if (s.charAt(i) == t.charAt(j)) {
			r = lcsMemoize(s, t, i + 1, j + 1) + 1;
		} else {
			int a = lcsMemoize(s, t, i + 1, j);
			int b = lcsMemoize(s, t, i, j + 1);
			r = Math.max(a, b);
		}
		m[i][j] = r + 1;
		return r;
	}

	// dp O(n2) O(n2)
	public int lcsDynamic(String s, String t) {
		int[][] m = new int[s.length() + 1][t.length() + 1];
		for (int i = s.length() - 1; i >= 0; i--) {
			for (int j = t.length() - 1; j >= 0; j--) {
				if (s.charAt(i) == t.charAt(j)) {
					m[i][j] = m[i + 1][j + 1] + 1;
				} else {
					m[i][j] = Math.max(m[i + 1][j], m[i][j + 1]);
				}
			}
		}
		return m[0][0];
	}

	// // dp O(n2) O(n)
	public int lcsDynamicOpt(String s, String t) {
		int[] r0 = new int[t.length() + 1];
		int[] r1 = new int[t.length() + 1];
		for (int i = s.length() - 1; i >= 0; i--) {
			for (int j = t.length() - 1; j >= 0; j--) {
				if (s.charAt(i) == t.charAt(j)) {
					r0[j] = r1[j + 1] + 1;
				} else {
					r0[j] = Math.max(r1[j], r0[j + 1]);
				}
			}
			int[] tmp = r0;
			r0 = r1;
			r1 = tmp;
		}
		return r1[0];
	}

	// Longest Repeating Subsequence DP O(N2) O(N) JUST i!=j SMALL MODIFICATION
	public int LongestRepeatingSubsequence(String s) {
		int[] r0 = new int[s.length() + 1];
		int[] r1 = new int[s.length() + 1];
		for (int i = s.length() - 1; i >= 0; i--) {
			for (int j = s.length() - 1; j >= 0; j--) {
				if (s.charAt(i) == s.charAt(j) && i != j) {
					r0[j] = r1[j + 1] + 1;
				} else {
					r0[j] = Math.max(r1[j], r0[j + 1]);
				}
			}
			int[] tmp = r0;
			r0 = r1;
			r1 = tmp;
		}
		return r1[0];
	}

	// 10
	// Print all subsequences
	static List<String> al = new ArrayList<String>();

	private static void findsubsequences(String s, String ans) {
		if (s.length() == 0) {
			al.add(ans);
			return;
		}
		findsubsequences(s.substring(1), ans + s.charAt(0));
		findsubsequences(s.substring(1), ans);
	}
//11
	//Permutations of a given string
    List<String>xi= new ArrayList<String>();
    public List<String> find_permutation(String S) {
        char c[]= S.toCharArray();
        S=String.valueOf(c);
        int n=S.length();
        check(S,0,n-1);
        Collections.sort(xi);
return xi;
    }
    public void check(String s, int i,int j){
        if(i==j){xi.add(s); return;}
        
        for(int t=i;t<=j;t++)
        {
            s=swap(s,i,t);
            check(s,i+1,j);
            s=swap(s,i,t);
        }
    }
    public String swap(String s,int i,int j)
    {
        char c[]= s.toCharArray();
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;
        return String.valueOf(c);
    }

//12
//    Split the binary string into substrings with equal number of 0s and 1s
	// O(n)
	public static int bin(String s) {
		int c = 0, v = 0, t = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				c++;
			} else {
				v++;
			}

			if (c == v) {
				t++;
			}
		}
		if (t == 0) {
			return -1;
		}
		return t;
	}
	//13
	//Word Wrap
    public int solveWordWrap (int[] nums, int k)
  {
      // Code here 
      int n = nums.length;
      int currLen = 0;
      int cost = 0;
      int dp[] = new int[n];
      dp[n-1] = 0;
      for(int i = n-2; i >=0; i--){
          currLen = -1;
          dp[i] = Integer.MAX_VALUE;
          for(int j = i; j < n; j++){
              currLen += nums[j] +1;
              if(currLen > k){
                  break;
              }
              if(j == n-1){
                  cost = 0;
              }
              else{
                  cost = (k-currLen)*(k-currLen) + dp[j+1];
              }
              if(cost < dp[i]){
                  dp[i] = cost;
              }
          }
      }
      return dp[0];
  }
    // PRINT POSTIONS OF WORD WRAP
    
    
    static final int MAX = Integer.MAX_VALUE;
    
    // A utility function to print the solution
    static  int printSolution (int p[], int n)
    {
        int k;
        if (p[n] == 1)
        k = 1;
        else
        k = printSolution (p, p[n]-1) + 1;
        System.out.println("Line number" + " " + k + ": " +
                    "From word no." +" "+ p[n] + " " + "to" + " " + n);
        return k;
    }
 
 // l[] represents lengths of different words in input sequence.
// For example, l[] = {3, 2, 2, 5} is for a sentence like
// "aaa bb cc ddddd". n is size of l[] and M is line width
// (maximum no. of characters that can fit in a line)
    static  void solveWordWrap (int l[], int n, int M)
    {
        // For simplicity, 1 extra space is used in all below arrays
     
        // extras[i][j] will have number of extra spaces if words from i
        // to j are put in a single line
        int extras[][] = new int[n+1][n+1];
     
        // lc[i][j] will have cost of a line which has words from
        // i to j
        int lc[][]= new int[n+1][n+1];
     
        // c[i] will have total cost of optimal arrangement of words
        // from 1 to i
        int c[] = new int[n+1];
     
        // p[] is used to print the solution.
        int p[] =new int[n+1];
     
        // calculate extra spaces in a single line. The value extra[i][j]
        // indicates extra spaces if words from word number i to j are
        // placed in a single line
        for (int i = 1; i <= n; i++)
        {
            extras[i][i] = M - l[i-1];
            for (int j = i+1; j <= n; j++)
            extras[i][j] = extras[i][j-1] - l[j-1] - 1;
        }
        
        // Calculate line cost corresponding to the above calculated extra
        // spaces. The value lc[i][j] indicates cost of putting words from
        // word number i to j in a single line
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j <= n; j++)
            {
                if (extras[i][j] < 0)
                    lc[i][j] = MAX;
                else if (j == n && extras[i][j] >= 0)
                    lc[i][j] = 0;
                else
                    lc[i][j] = extras[i][j]*extras[i][j];
            }
        
        }  
        // Calculate minimum cost and find minimum cost arrangement.
        // The value c[j] indicates optimized cost to arrange words
        // from word number 1 to j.
        c[0] = 0;
        for (int j = 1; j <= n; j++)
        {
            c[j] = MAX;
            for (int i = 1; i <= j; i++)
            {
                if (c[i-1] != MAX && lc[i][j] != MAX &&
                   (c[i-1] + lc[i][j] < c[j]))
                {
                    c[j] = c[i-1] + lc[i][j];
                    p[j] = i;
                }
            }
        }
     

        for(int v:c) 
        		System.out.print(v+" ");
               printSolution(p, n);
    }
 
	//14
	//edit distance
	//O(3^n)

    public int editDistances(String s, String t) {
      return edits(s,t,s.length(),t.length());
    }
    public int edits(String s, String t, int m, int n){
        if(m==0)return n;
        if(n==0)return m;
        if(s.charAt(m-1)==t.charAt(n-1))return edits(s,t,m-1,n-1);
        return 1+Math.min(edits(s,t,m-1,n-1),Math.min(edits(s,t,m-1,n),edits(s,t,m,n-1)));
    }

	//memo
	//O(m*n)
	int dx[][];
    public int editDistance(String s, String t) {
int m=s.length(),n=t.length();
        dx= new int[m+1][n+1];
for(int[] k:dx){Arrays.fill(k,-1);}
      return edit(s,t,m,n);
    }
    public int edit(String s, String t, int m, int n){
        if(m==0)return n;
        if(n==0)return m;
        if(dx[m][n]!=-1)return dx[m][n];
        if(s.charAt(m-1)==t.charAt(n-1))return dx[m][n]= edit(s,t,m-1,n-1);
        return dx[m][n]=1+Math.min(edit(s,t,m-1,n-1),Math.min(edit(s,t,m-1,n),edit(s,t,m,n-1)));
    }
	//15
	//Next Permutation
	//O(n)
	static List<Integer> nextPermutation(int n, int arr[]){
	    List<Integer>x= new ArrayList<Integer>();
	    if(n==1){x.add(arr[0]);return x;} 
	    
	    int j=n-1,kn=-1;
	    while(j!=0){
	        if(arr[j-1]<arr[j]){kn=j-1;break;}
	        else{j--;}
	    }
	    
	    if(kn==-1){reverse(arr,0,n-1);}
	    else{
	        int a=0,b=n-1;
	        while(kn<b)
	        {
	            if(arr[kn]<arr[b]){a=b;break;}
	            else{b--;}
	        }
	        swap(arr,a,kn);
	        reverse(arr,kn+1,n-1);
	    }
	    for(int i=0;i<n;i++)
	    {
	        x.add(arr[i]);
	    }
	    return x;
	    }
	    public static void swap(int arr[],int a,int b)
	    {
	        int temp=arr[a];
	        arr[a]=arr[b];
	        arr[b]=temp;
	        
	    }
	    public static void reverse(int arr[],int x,int y)
	    {
	         while(x<y){
	                int kk=arr[y];
	                arr[y]=arr[x];
	                arr[x]=kk;
	            x++;y--;
	            }
	    }
	    //Next Greater Element III
	    //O(n)
	    public int nextGreaterElement(int ni) {
	         char[] arr = (ni + "").toCharArray();
	         int n=arr.length, j=n-1,kn=-1;
		    while(j!=0){
		        if(arr[j-1]<arr[j]){kn=j-1;break;}
		        else{j--;}
		    }
		    
		    if(kn==-1){return -1;}
		    else{
		        int a=0,b=n-1;
		        while(kn<b)
		        {
		            if(arr[kn]<arr[b]){a=b;break;}
		            else{b--;}
		        }
		        swap(arr,a,kn);
		        reverse(arr,kn+1,n-1);
		    }int k=0;
		    for(int i=0;i<n;i++)
		    {
	            int h=k;
	        	    k=k*10+(arr[i]-'0');
	            if(k<h)return -1;
	            
		    }
	        
		    return k;
		    }
		    public  void swap(char arr[],int a,int b)
		    {
		        char temp=arr[a];
		        arr[a]=arr[b];
		        arr[b]=temp;
		        
		    }
		    public  void reverse(char arr[],int x,int y)
		    {
		         while(x<y){
		                char kk=arr[y];
		                arr[y]=arr[x];
		                arr[x]=kk;
		            x++;y--;
		            }
		    }

//16
//balanced parenthesis problem
	//O(n)
	public boolean isValid(String s) {
        int n=s.length();
        char[]x= s.toCharArray();
        Stack<Character>t= new Stack<Character>();
        for(int i=0;i<n;i++)
        {
            if(x[i]=='('||x[i]=='{'||x[i]=='[')
            {t.push(x[i]);}
            else{
                if(t.isEmpty())return false;
                
                if(t.peek()=='{'&&x[i]=='}')
                {t.pop();}
                else
                     if(t.peek()=='['&&x[i]==']')
                {t.pop();}
                else
                     if(t.peek()=='('&&x[i]==')')
                {t.pop();}
                else{return false;}
                }
            }
        return t.isEmpty();
    }
//17
	//Word Break
	// O(2^N) recurtion
        
	    public static int wordBreak(String A, ArrayList<String> B )
	    {h.clear();
	        for(String k:B)
	        {h.add(k);}
	      return wordBreaks(A)==true?1:0;
	    }
	    public static boolean wordBreaks(String a)
	    {
	        int len=a.length();
	        if(len==0)return true;
	        for(int i=1;i<=len;i++)
	        {
	            if(h.contains(a.substring(0,i))&&wordBreaks(a.substring(i,len)))return true;
	        }
	        return false;
	    }
	    //memo O(n2)
	    static  HashSet<String>h= new HashSet<String>();
        
	  	static Boolean[] mem;
	    public static boolean wordBreak(String s, List<String> wordDict) {
	        mem=new Boolean[s.length()];
	        return wordBreaked(0,s,new HashSet<String>(wordDict));   
	    }
	    private static boolean wordBreaked(int p, String s, Set<String> dict){
	        int n=s.length();
	        if(p==n) {
	            return true;
	        }
	        if(mem[p]!=null) {
	            return mem[p];
	        }
	        for(int i=p+1;i<=n;i++) {
	            if(dict.contains(s.substring(p,i))&&wordBreaked(i,s,dict)) { 
	                return mem[p]=true;
	            }
	        }
	        return mem[p]=false;
	    }
// different approach
	    HashMap<String,Boolean> xt=new HashMap<String,Boolean>(); 
	    public boolean wordBrea(String s, List<String> wordDict) {
	        if(s.length()==0)return true;
	        if(xt.containsKey(s))return xt.get(s);
	        for(String l:wordDict)
	        {int k=l.length();
	            if(s.indexOf(l)==0)
	            {
	                if(wordBrea(s.substring(k),wordDict))return true;
	            }
	        }
	        xt.put(s,false);
	        return false;
	    }
	
	//18
	
	//RabinKarp 
	//O(m+n) avg    // worst O(mn) in case of hash function faillure
	public final static int d = 256;
//	   String txt = "GEEKS FOR GEEKS";
//       String pat = "GEEK";
    static void search(String pat, String txt, int q)
    {
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;
 
        for (i = 0; i < M-1; i++)
            h = (h*d)%q;
        for (i = 0; i < M; i++)
        {
        	// Hash Values of those 2 string
            p = (d*p + pat.charAt(i))%q; 
            t = (d*t + txt.charAt(i))%q;
        }
      for (i = 0; i <= N - M; i++)
        {
           if ( p == t )
            {
                for (j = 0; j < M; j++)
                {if (txt.charAt(i+j) != pat.charAt(j))break;}
                if (j == M)
                    System.out.println("Pattern found at index " + i);
            }
              if ( i < N-M )
            {
                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q;
       if (t < 0)
                t = (t + q);
            }
        }
    }
     
     
	// 19
//KMP ALGO'S LONGEST PREFIX SUFFIX STRING
	static int lps(String pattern) {
		int patternLength = pattern.length();
		int[] lpss = new int[patternLength];
		return prepareLPSArrays(pattern, lpss);
	}

	static int prepareLPSArrays(String pattern, int lps[]) {
		int patternLength = pattern.length();
		int len = 0, i = 1;
		while (i < patternLength) {
			if (pattern.charAt(i) == pattern.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len == 0) {
					lps[i] = len;
					i++;
				} else {
					len = lps[len - 1];
				}
			}
		}
		String h = "";
		int o = 1;
		for (int l = 0; l < patternLength; l++) {
			if (lps[l] == o) {
				h += pattern.charAt(l);
				o++;
			}
		}
		{

		}

		return len;
	}

	// Longest Happy Prefix
//O(n)
	public String longestPrefix(String pattern) {
		int patternLength = pattern.length();
		int[] lpss = new int[patternLength];
		return prepareLPSArrayss(pattern, lpss);
	}

	String prepareLPSArrayss(String pattern, int lps[]) {
		int patternLength = pattern.length();
		int len = 0, i = 1;
		while (i < patternLength) {
			if (pattern.charAt(i) == pattern.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len == 0) {
					lps[i] = len;
					i++;
				} else {
					len = lps[len - 1];
				}
			}
		}
		String h = "";
		int o = 1;

		for (int l = 0; l < patternLength; l++) {
			if (lps[l] == o && o <= len) {
				h += pattern.charAt(l);
				o++;
			}
		}

		return len > 0 && lps[patternLength - 1] != 0 ? h : "";
	}

//20
// Convert a sentence into its equivalent mobile numeric keypad sequence
	public static String mobile() {
		String i = "GEEKSFORGEEKS";
		String str[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7",
				"77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };
		return print(str, i);
	}

	public static String print(String i[], String str) {
		int n = str.length();
		String output = "";
		for (int j = 0; j < n; j++) {
			if (str.charAt(j) == ' ') {
				output += "0";
			} else {
				int x = str.charAt(j) - 'A';
				output += i[x];
			}
		}
		return output;
	}

//21
//Count the Reversals O(n)
	int countRev(String s) {
		char[] t = s.toCharArray();
		int n = s.length(), o = 0, c = 0, ans = 0;
		if (n % 2 == 1)
			return -1;
		for (int i = 0; i < n; i++) {
			if (t[i] == '{')
				o++;
			else {
				if (c == o) {
					ans++;
					o++;
				} else {
					c++;
				}
			}
		}
		int z = o - c;
		if (z % 2 == 1)
			return -1;
		z = z / 2;
		ans += z;
		return ans;
	}
	//22
	//Count Palindromic Subsequences
	//memo
    long dps[][];
    String hs;
    long countPS(String s)
    {
        int n=s.length();
     dps=new long[n+1][n+1];
for(int i=0;i<n;i++)Arrays.fill(dps[i],-1);
hs=s;
 return countp(0,n-1)%1000000007;
                 }
   long countp(int i,int j)
   {
       if(dps[i][j]>1000000007)dps[i][j]%=1000000007;
       if(i>j)return 0;
       if(dps[i][j]!=-1)return dps[i][j];
       
       if(i==j)return dps[i][j]=1;
      else if(hs.charAt(i)==hs.charAt(j)){ dps[i][j]=countp(i+1,j)+countp(i,j-1)+1;
          return dps[i][j]%1000000007;
      }
      else{  dps[i][j]=countp(i+1,j)+countp(i,j-1)-countp(i+1,j-1)+1000000007;
       return dps[i][j]%1000000007;   
      }
   }
//dp
   static int countPSt(String str)
   {
       int N = str.length();
       int[][] cps = new int[N][N];
       for (int i = 0; i < N; i++)
           cps[i][i] = 1;
       for (int L = 2; L <= N; L++) {
           for (int i = 0; i <= N-L; i++) {
               int k = L + i - 1;
             if (str.charAt(i) == str.charAt(k)) {
               cps[i][k] = cps[i][k - 1]
                                   + cps[i + 1][k] + 1;
             }else{
               cps[i][k] = cps[i][k - 1]
                                   + cps[i + 1][k]
                                   - cps[i + 1][k - 1];
             }
           }
       }
return cps[0][N - 1];
   }
   
	//23
	//count of nos of given string in 2d character array
//Backtracking  O(2^n)
	public static void xxxx()
	{
		String needle = "MAGIC";
		String input[]={ "BBABBM",
				         "CBMBBA",
                         "IBABBG",
                         "GOZBBI",
                         "ABBBBC",
                         "MCIGAM" };
		String str[]= new String [input.length];
		for(int i=0;i<input.length;i++)
		{
			str[i]=input[i];
		}
		System.out.println(SearchString(str,needle,0,0,input.length,input[0].length()));
	}
private static int SearchString(String[] str, String needle, int i, int j,
		int l, int l2) {
	int f=0;	
	for(int k=0;k<l;k++)
		{for(int h=0;h<l2;h++)
		{
			f+=search(str,needle,k,h,l-1,l2-1,0);
		}	
		}
		return f;
	}

private static int search(String[] str, String needle, int i, int j, int row, int col, int x) {
	int f=0;
	if(i>=0&&j>=0&&i<=row&&j<=col&&needle.charAt(x)==str[i].charAt(j))
	{
		char m=needle.charAt(x);x+=1;
		str[i]=str[i].substring(0,j)+'0'+str[i].substring(j+1);
	
		if(x==needle.length()){f=1;}
		else {
			f+=search(str,needle,i+1,j,row,col,x);
			f+=search(str,needle,i-1,j,row,col,x);
			f+=search(str,needle,i,j+1,row,col,x);
			f+=search(str,needle,i,j-1,row,col,x);
		}
		str[i]=str[i].substring(0,j)+m+str[i].substring(j+1);
	}
	return f;
}
//24
public static int[][] searchWord(char[][] grid, String word)
{
    // Code here
    ArrayList<Integer> row=new ArrayList<Integer>();
    ArrayList<Integer> col=new ArrayList<Integer>();
    
    for(int i=0;i<grid.length;i++)
    {
        for(int j=0;j<grid[0].length;j++)
        {
            if(grid[i][j]==word.charAt(0) && exist(grid,i,j,word))
            {
                row.add(i);
                col.add(j);
            }
        }
    }
    int[][] ans=new int[row.size()][2];
    for(int i=0;i<row.size();i++)
    {
        ans[i][0]=row.get(i);
        ans[i][1]=col.get(i);
    }
    return ans;
}

public static boolean exist(char[][] grid,int i,int j,String word)
{
    int x[]={0,-1,-1,-1,0,1,1,1};
    int y[]={-1,-1,0,1,1,1,0,-1};
    
    for(int dir=0;dir<8;dir++)
    {
        int r=i+x[dir];
        int c=j+y[dir];
        int k;
        for(k=1;k<word.length();k++)
        {
            if(r<0 || c<0 || r>=grid.length || c>=grid[0].length 
            || word.charAt(k)!=grid[r][c])
            break;
            
            r+=x[dir];
            c+=y[dir];
        }
        if(k==word.length())
        {
            return true;
        }
    }
    return false;
}
//25
//Boyre moore algo

public static void BMA() {
	 char txt[] = "AABAACAADAABAABA".toCharArray();
     char pat[] = "AABA".toCharArray();
     search(txt, pat);
}
private static void search(char[] t, char[] p) {
	int x[]=new int[256];
badFill(p,x);
int s=0,m=p.length,n=t.length;
while(s<=(n-m))
{int j=m-1;	
while(j>=0&&t[s+j]==p[j]) {j--;}
if(j<0) {System.out.println(s);  s+=((s+m)<n)?m-x[t[s+m]]:1;}
else {s+=Math.max(1, j-x[t[s+j]]);}
}
}

private static void badFill(char[] p, int[] x) {
	Arrays.fill(x, -1);
	for(int i=0;i<p.length;i++) {x[(int)p[i]]=i;}
}

//26
	//Roman Number to Integer
	//O(n)
	   public int romanToDecimal(String S) {
	        HashMap<Character,Integer>x= new HashMap<Character,Integer>();
	        x.put('I',1);x.put('V',5);x.put('X',10);x.put('L',50);x.put('C',100);x.put('D',500);
	x.put('M',1000);
	Stack<Integer>u= new Stack<Integer>();
	char[]s=S.toCharArray();int n=S.length();
	int a=0;
	for(int i=0;i<n;i++)
	{
	    if(u.isEmpty()){u.push(x.get(s[i]));a=a+u.peek();}
	    else if(u.peek()<x.get(s[i]))
	    {int t=u.pop();a=a+x.get(s[i])-(2*t);u.push(x.get(s[i]));}
	    else{int t=u.pop();a=a+x.get(s[i]);u.push(x.get(s[i]));}
	}

	return a;
	    }
	
	// 27
//Longest Common Prefix
// O(n*length)

	public String longestCommonPrefix(String[] strs) {
		int i = strs[0].length(), z = strs.length;
		for (int j = 1; j < z; j++) {
			int h = Math.min(strs[j].length(), strs[0].length());
			if (h == 0) {
				return "";
			}
			for (int k = 0; k < h; k++) {
				if (i > h) {
					i = h;
				}
				if (k >= i) {
					break;
				}
				if (strs[0].charAt(k) != strs[j].charAt(k)) {
					i = k;
				}
			}
		}

		return strs[0].substring(0, i);
	}
//28
//Min nos of flips
// O(n)

	public int minFlips(String s) {
		char[] x = s.toCharArray();
		int n = x.length, t = 0;
		for (int i = 0; i < n; i++) {
			if (x[i] == '0' && i % 2 == 0) {
				t++;
			}
			if (x[i] == '1' && i % 2 == 1) {
				t++;
			}
		}
		return Math.min(t, n - t);
	}

//1888. Minimum Number of Flips to Make the Binary String Alternating
//o(N)
	public int minFlip(String s) {
		int m = s.length();
		s += s;
		char si[] = s.toCharArray();
		int n = s.length();
		String s1 = "", s2 = "";
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				s1 += '0';
				s2 += '1';
			} else {
				s1 += '1';
				s2 += '0';
			}
		}
		char s1i[] = s1.toCharArray();
		char s2i[] = s2.toCharArray();
		int ans = Integer.MAX_VALUE, ans1 = 0, ans2 = 0;
		for (int i = 0; i < n; i++) {
			if (s1i[i] != si[i]) {
				ans1++;
			}
			if (s2i[i] != si[i]) {
				ans2++;
			}
			if (i >= m) {

				if (s1i[i - m] != si[i - m]) {
					ans1--;
				}
				if (s2i[i - m] != si[i - m]) {
					ans2--;
				}
			}
			if (i >= (m - 1)) {
				ans = Math.min(ans, Math.min(ans1, ans2));
			}
		}
		return ans;
	}

	// same but O(1) space
	public static int minFlipss(String S) {
		int n = S.length();
		char s[] = S.toCharArray();
		int ans1 = 0, ans2 = 0, ans = Integer.MAX_VALUE;
		for (int i = 0; i < 2 * n; i++) {
			if (i < n)
				s[i] -= '0'; // make '1' and '0' to be integer 1 and 0.
			if (i % 2 != s[i % n])
				++ans1;
			if ((i + 1) % 2 != s[i % n])
				++ans2;
			if (i >= n) {
				if ((i - n) % 2 != s[i - n])
					--ans1;
				if ((i - n + 1) % 2 != s[i - n])
					--ans2;
			}
			if (i >= n - 1) {
				ans = Math.min(ans, Math.min(ans1, ans2));
			}
		}
		return ans;
	}

//29
//Find the first repeated word in a string
//O(n) 
	static String findFirstRepeated(String s) {
		String token[] = s.split(" ");
		HashSet<String> x = new HashSet<String>();
		for (int i = 0; i < token.length; i++) {
			if (x.contains(token[i])) {
				return token[i];
			} else {
				x.add(token[i]);
			}
		}
		return "";
	}

//Second most repeated string in a sequence
//O(n)
	String secFrequent(String arr[], int N) {
		HashMap<String, Integer> x = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			if (!x.containsKey(arr[i])) {
				x.put(arr[i], 1);
			} else {
				x.put(arr[i], x.get(arr[i]) + 1);
			}
		}
		int first_max = Integer.MIN_VALUE, sec_max = Integer.MIN_VALUE;
		Iterator<Map.Entry<String, Integer>> itr = x.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			int v = entry.getValue();
			if (v > first_max) {
				sec_max = first_max;
				first_max = v;
			} else if (v > sec_max && v != first_max)
				sec_max = v;
		}
		itr = x.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			int v = entry.getValue();
			if (v == sec_max)
				return entry.getKey();
		}
		return null;
	}

//30
	static int minimumNumberOfSwaps(String S) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		int n = S.length();
		char[] s = S.toCharArray();
		for (int i = 0; i < n; i++) {
			if (s[i] == '[') {
				x.add(i);
			}
		}

		int c = 0, p = 0, sum = 0;
		for (int i = 0; i < n; i++) {
			if (s[i] == '[') {
				++c;
				++p;
			} else if (s[i] == ']') {
				--c;
			}
			if (c < 0) {
				sum += x.get(p) - i;
				char y = s[i];
				s[i] = s[x.get(p)];
				s[x.get(p)] = y;
				c = 1;
				++p;
			}
			// System.out.print(c);
		}
		return sum;
	}

// O(n)  O(1)
	static int minimumNumberOfSwap(String S) {

		int n = S.length();
		char[] s = S.toCharArray();

		int lc = 0, rc = 0, b = 0, sum = 0;
		for (int i = 0; i < n; i++) {
			if (s[i] == '[') {
				++lc;
				if (b > 0) {
					sum += b;
					b--;
				}
			} else if (s[i] == ']') {
				++rc;
				b = (rc - lc);
			}
		}
		return sum;
	}

	// no need swap alternative
	public int minSwaps(String S) {
		int n = S.length();
		char[] s = S.toCharArray();

		int c = 0, p = 0, sum = 0;
		for (int i = 0; i < n; i++) {
			if (s[i] == '[') {
				++c;
			} else if (c > 0 && s[i] == ']') {
				--c;
			}
		}
		return (c + 1) / 2;
	}

//31
//FAMOUS LCS Q
// O(N2)
	//32
	//Restore IP Addresses
	//O(n3)
	
	   public static List<String> restoreIpAddresses(String A) {
	        if (A.length() < 3 || A.length() > 12)
	            return new ArrayList<>();
	        return convert(A); 
	    }
	    private static  ArrayList<String>
	    convert(String s)
	    {
	        ArrayList<String> l = new ArrayList<>();
	        int size = s.length();
	 
	        String snew = s;
	 
	        for (int i = 1; i < size - 2;
	             i++) {
	            for (int j = i + 1;
	                 j < size - 1; j++) {
	                for (int k = j + 1;
	                     k < size; k++) {
	                    snew
	                        = snew.substring(0, k) + "."
	                          + snew.substring(k);
	                    snew
	                        = snew.substring(0, j) + "."
	                          + snew.substring(j);
	                    snew
	                        = snew.substring(0, i) + "."
	                          + snew.substring(i);
	 
	                    if (isValids(snew)) {
	                        l.add(snew);
	                    }
	                    snew = s;
	                }
	            }
	        }
	 
	        Collections.sort(l, new Comparator<String>() {
	            public int compare(String o1, String o2)
	            {
	                String a1[] = o1.split("[.]");
	                String a2[] = o2.split("[.]");
	 
	                int result = -1;
	                for (int i = 0; i < 4
	                                && result != 0;
	                     i++) {
	                    result = a1[i].compareTo(a2[i]);
	                }
	                return result;
	            }
	        });
	        return l;
	    }
	 
	    private static boolean isValids(String ip)
	    {
	        String a[] = ip.split("[.]");
	        for (String s : a) {
	            int i = Integer.parseInt(s);
	            if (s.length() > 3 || i < 0 || i > 255) {
	                return false;
	            }
	            if (s.length() > 1 && i == 0)
	                return false;
	            if (s.length() > 1 && i != 0
	                && s.charAt(0) == '0')
	                return false;
	        }
	 
	        return true;
	    }
//Backtrcking O(n)
	    //difficult
	    public List<String> restoreIpAddresse(String s) {
	        ArrayList<String> res = new ArrayList<>();
	        helper(res,new StringBuilder(),s,0,0);
	        return res;
	    }
	    //start: starting index, count: numbers added into stringbuilder
	    public void helper(List<String> res, StringBuilder temp, String s,int start, int count){
	        // if we are at the end and added 4 elements, add to result
	        if (start==s.length() && count==4) 
	            res.add(temp.toString());
	        // if we are not at the end and already has 4 elements-> invalid
	        else if (count==4) return;
	        
	        for(int i=start; i<s.length(); i++){
	            String curr = s.substring(start,i+1);
	            int value = Integer.parseInt(curr);
	            // check whether the number is like "0010" or "00";
	            if (curr.length()>1 && curr.charAt(0)=='0') return;
	            // out of range
	            if (value>255) return;
	            // less or equal to 255
	            if (value<=255 && value>=0){
	                // Backtracking
	                StringBuilder rollback = new StringBuilder(temp);
	                temp.append(s.substring(start,i+1));
	                if (count<3) temp.append(".");
	                
	                helper(res,temp,s,i+1,count+1);
	                // Rollback to previous state
	                temp = rollback;
	            }
	        }
	    }
	    //33
	    //Smallest distinct window 
	    //O(n)  sliding window
	    public String findSubString( String si) 	    {
	        char s[]=si.toCharArray();
	    int m[] = new int[256];
	   int ans = Integer.MAX_VALUE;
	    int start = 0;
	    int count = 0;
	    for (int i = 0; i < s.length; i++) {
	        if (m[s[i]] == 0)
	            {count++;
	        m[s[i]]++;}
	    }
	    int i = 0;
	    int j = 0;
	    while (j < s.length)
	    {
	        m[s[j]]--;
	        if (m[s[j]] == 0)
	            count--;
	        if (count == 0)
	        {
	            while (count == 0)
	            {
	                if (ans > j - i + 1)
	                {
	                    ans = Math.min(ans, j - i + 1);
	                    start = i;
	                }
	                m[s[i]]++;
	                if (m[s[i]] > 0)
	                    count++;
	                i++;
	            }
	        }
	        j++;
	    }
	   if (ans != Integer.MAX_VALUE)
	        return si.substring(start, ans+start);
	    else
	        return "-1";
	}
	    //34
		//just to check if we can Rearrange characters in a string such that no two adjacent are same
	    public static void gross() throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
				int		n = Integer.parseInt(st.nextToken());
HashMap<Character,Integer>h= new HashMap<Character,Integer>();
				for(int i=0;i<n;i++)
				{h.clear();
					 st = new StringTokenizer(br.readLine());
					 String a= st.nextToken();
					 char[]b= a.toCharArray();
					 int max=-5;
                      for(int j=0;j<a.length();j++)
                      {
                    	  if(!h.containsKey(b[j])) {h.put(b[j],1);}
                    	  else {h.put(b[j],h.get(b[j])+1);max=Math.max(max, h.get(b[j]));}
                      }
                 if(a.length()%2==0) {if(max<=a.length()/2)System.out.println(1);else System.out.println(0);}
                 else {if(max<=(int)((a.length()/2)+1))System.out.println(1);else System.out.println(0);}     
				}
				 
		          }
	    //Rearrange characters in a string such that no two adjacent are same
	    //767. Reorganize String  
	    //O(n)
	    public String reorganizeString(String S) {
	        if (S == null || S.length() == 1) return S;
	        Map<Character, Integer> dic = new HashMap<>();
	        char maxChar = S.charAt(0);
	        int L = S.length();
	               for (char c: S.toCharArray()) {
	            dic.put(c, dic.getOrDefault(c, 0) +1);
	            if (dic.get(c) > dic.get(maxChar)) {
	                maxChar = c;
	            }
	        }
	        if (dic.get(maxChar) > (L+1)/2) return "";
	        int idx = 0;
	        char[] ret = new char[L];
	                while (idx < L && dic.get(maxChar) > 0) {
	            ret[idx] = maxChar;
	            dic.put(maxChar, dic.get(maxChar)-1);
	            idx +=2;
	        }
	        for (Character c: dic.keySet()) {
	            while (dic.get(c) > 0) {
	                if (idx >= L) idx = 1; // First time it reaches L, reset it. Won't be inf loop cause not looping on idx
	                ret[idx] = c;
	                dic.put(c, dic.get(c)-1);
	                idx += 2;
	            }
	        }
	        return new String(ret);
	    }

	    //35
	    //Minimum characters to be added at front to make string palindrome
	    public static int[] computeLPSArray(String str)
	    {int n = str.length(), lps[] = new int[n],i = 1, len = 0;
	        lps[0] = 0;
	        while (i < n)
	        {if (str.charAt(i) == str.charAt(len)){len++;lps[i] = len;i++;}
	            else{if (len != 0){len = lps[len - 1];}
	                 else{lps[i] = 0;i++;}
	                }
	        }return lps;
	    }
	    static int getMinCharToAddedToMakeStringPalin(String str)
	    {
	        StringBuilder s = new StringBuilder();
	        s.append(str);
	        String rev = s.reverse().toString();
	        System.out.println(s);
	        s.reverse().append("$").append(rev);
	       int lps[] = computeLPSArray(s.toString());
	        return str.length() - lps[s.length() - 1];
	    }
	    //36
	    //Print all amagrms
	    public List<List<String>> Anagrams(String[] arr) {
	        HashMap<String, List<String> > map = new HashMap<>();
	 for (int i = 0; i < arr.length; i++) {
	    String word = arr[i];
	            char[] letters = word.toCharArray();
	            Arrays.sort(letters);
	            String newWord = new String(letters);
	    if (map.containsKey(newWord)) {
	 
	                map.get(newWord).add(word);
	            }
	            else {
	        List<String> words = new ArrayList<>();
	                words.add(word);
	                map.put(newWord, words);
	            }
	        }
	        List<List<String>>v= new ArrayList<>();
	        v.clear();
	        for (String s : map.keySet()) {
	            List<String> values = map.get(s);
	                v.add(values);
	        }map.clear();
	    return v;
	           }
	 
	    //37
	    public static String smallestWindow(String si, String pi)
	    {
	        char s[]=si.toCharArray();
	        char t[]=pi.toCharArray();
	    int m[] = new int[256];
	   int ans = Integer.MAX_VALUE;
	    int start = 0;
	    int count = 0;
	    for (int i = 0; i < t.length; i++) {
	        if (m[t[i]] == 0)
	            count++;
	        m[t[i]]++;
	    }
	    int i = 0;
	    int j = 0;
	    while (j < s.length)
	    {
	        m[s[j]]--;
	        if (m[s[j]] == 0)
	            count--;
	        if (count == 0)
	        {
	            while (count == 0)
	            {
	                if (ans > j - i + 1)
	                {
	                    ans = Math.min(ans, j - i + 1);
	                    start = i;
	                }
	                m[s[i]]++;
	                if (m[s[i]] > 0)
	                    count++;
	                i++;
	            }
	        }
	        j++;
	    }
	   if (ans != Integer.MAX_VALUE)
	        return si.substring(start, ans+start);
	    else
	        return "-1";
	}
	//38
	// without recurstion and adjecent
    public String removeConsecutiveCharacter(String S){
   	if(S.isBlank())return null;
    	if(S.length()==1)return S;
     Stack<Character>a = new Stack<Character>();
     StringBuilder b=new StringBuilder();
     a.add(S.charAt(0));b.append(S.charAt(0));
     for(int i=1;i<S.length();i++)
     {
    	 if(!a.isEmpty()&&a.peek()==S.charAt(i)) {
//    		  a.pop();// if they are not adjecent
//              b.deleteCharAt(b.length()-1);
     }
    	 else
    	 {a.add(S.charAt(i));b.append(S.charAt(i));}
     }
     
    	
    	return b.toString();
    }

//39
//memo O(n2) both
//Wildcard string matching
	static boolean match(String p, String s) {
		int m = s.length(), n = p.length();
		dp = new int[m + 1][n + 1];
		for (int i = 0; i < m + 1; i++)
			Arrays.fill(dp[i], -1);
		dp[m][n] = finding(s, p, m - 1, n - 1);
		return dp[m][n] == 1;
	}

	static int dp[][];

	public static int finding(String s, String p, int m, int n) {
		if (m == -1 && n == -1) {
			return 1;
		}
		if (n == -1)
			return 0;
		if (m == -1) {
			while (n != -1) {
				if (p.charAt(n) != '*') {
					return 0;
				}
				n--;
			}
			return 1;
		}
		if (dp[m][n] == -1) {
			if (p.charAt(n) == '?' || p.charAt(n) == s.charAt(m)) {
				dp[m][n] = finding(s, p, m - 1, n - 1);
			} else if (p.charAt(n) == '*') {
				int x = finding(s, p, m, n - 1);
				int y = finding(s, p, m - 1, n);
				dp[m][n] = x == 1 || y == 1 ? 1 : 0;
			} else {
				dp[m][n] = 0;
			}
			return dp[m][n];
		}
		return dp[m][n];
	}

//dp
	static boolean strmatch(String str, String pattern, int n, int m) {
		if (m == 0)
			return (n == 0);
		boolean[][] lookup = new boolean[n + 1][m + 1];
		for (int i = 0; i < n + 1; i++)
			Arrays.fill(lookup[i], false);
		lookup[0][0] = true;
		for (int j = 1; j <= m; j++)
			if (pattern.charAt(j - 1) == '*')
				lookup[0][j] = lookup[0][j - 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (pattern.charAt(j - 1) == '*')
					lookup[i][j] = lookup[i][j - 1] || lookup[i - 1][j];
				else if (pattern.charAt(j - 1) == '?' || str.charAt(i - 1) == pattern.charAt(j - 1))
					lookup[i][j] = lookup[i - 1][j - 1];
				else
					lookup[i][j] = false;
			}
		}

		return lookup[n][m];
	}

//40
	// Function to find Number of customers who could not get a computer
	// O(n)
	public static int runCustomers(int i, char x[]) {
		int n = x.length, v = 0, c = 0;
		int o[] = new int[256];
		for (int u = 0; u < n; u++) {
			if (c < i) {
				if (o[x[u]] == 0) {
					o[x[u]] = 2;
					c++;
				} else if (o[x[u]] == 2) {
					o[x[u]] = 0;
					c--;
				} else {
					o[x[u]] = 0;
				}
			} else {
				if (o[x[u]] == 0) {
					o[x[u]] = 1;
					v++;
				} else if (o[x[u]] == 2) {
					o[x[u]] = 0;
					c--;
				} else {
					o[x[u]] = 0;
				}
			}
		}
		return v;
	}

//41
	// Transform One String to Another using Minimum Number of Given Operation
	// O(n)
	public static int minOps(String A, String B) {
		if (A.length() != B.length())
			return -1;
		int i, j, res = 0;
		int count[] = new int[256];
		for (i = 0; i < A.length(); i++) {
			count[A.charAt(i)]++;
			count[B.charAt(i)]--;
		}
		for (i = 0; i < 256; i++)
			if (count[i] != 0)
				return -1;
		i = A.length() - 1;
		j = B.length() - 1;
		while (i >= 0) {
			if (A.charAt(i) != B.charAt(j))
				res++;
			else
				j--;
			i--;
		}
		return res;
	}

	// 42
	// Isomorphic Strings
	public static boolean areIsomorphic(String str1, String str2) {
		HashSet<Character> x = new HashSet<Character>();
		HashSet<Character> y = new HashSet<Character>();
		if (str1.length() != str2.length()) {
			return false;
		}
		int n = str2.length();
		x.add(str1.charAt(0));
		y.add(str2.charAt(0));
		for (int i = 1; i < n; i++) {
			char x1 = str1.charAt(i), x2 = str1.charAt(i - 1);
			char y1 = str2.charAt(i), y2 = str2.charAt(i - 1);
			x.add(x1);
			y.add(y1);
			if (x.size() != y.size())
				return false;

			if (x1 == x2) {
				if (y1 != y2)
					return false;
			} else if (x1 != x2) {
				if (y1 == y2)
					return false;
			}
		}
		return true;
	}

//43
	// Recursively print all sentences that can be formed from list of word lists
	public static class GFG {
		static final int R = 3;
		static final int C = 3;

		static void printUtil(String[][] arr, int m, int n, String[] output) {
			output[m] = arr[m][n];
			if (m == R - 1) {
				for (int i = 0; i < R; i++)
					System.out.print(output[i] + " ");
				System.out.println();
				return;
			}
			for (int i = 0; i < C; i++)
				if (arr[m + 1][i] != "" && m < C)
					printUtil(arr, m + 1, i, output);
		}

		static void print(String[][] arr) {
			String[] output = new String[R];
			for (int i = 0; i < C; i++)
				if (arr[0][i] != "")
					printUtil(arr, 0, i, output);
		}

		public static void main(String[] args) {
			String[][] arr = { { "you", "we", "" }, { "have", "are", "" }, { "sleep", "eat", "drink" } };
			print(arr);
		}
	}
}
