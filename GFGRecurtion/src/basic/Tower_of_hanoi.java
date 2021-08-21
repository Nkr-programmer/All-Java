package basic;
import java.io.*;
import java.util.*;

public class Tower_of_hanoi {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int T = sc.nextInt();//total testcases
	        while (T-- > 0) {
	            Hanoi obj = new Hanoi();
	            int N;
	            
	            //taking input N
	            N = sc.nextInt();

	            //calling toh() method 
	            System.out.println(obj.toh(N, 1, 3, 2));
	        }
	    }
	}

	class Hanoi {
		static int moves=0;
	    public long toh(int N, int from, int to, int aux) {
moves=0;
	    	tohutil(N,from,to,aux);
	    	
	    	return moves;
	    	// Your code here
	    }
		private void tohutil(int n, int from, int to, int aux) {
			// TODO Auto-generated method stub
			
			if(n==1) {moves++;System.out.println("move disk "+n+" from rod "+from+" to rod "+to);return;}
			
			
		 	tohutil(n-1,from,aux,to);
		 	System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
		 	moves++;
		 	tohutil(n-1,aux,to,from);
		}
	}
