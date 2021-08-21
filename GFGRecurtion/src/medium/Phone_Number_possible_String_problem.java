package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Phone_Number_possible_String_problem {
	 public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();//testcases
	        
	        
	        while(t-- > 0)
	        {
	            int n = sc.nextInt(); // input size of array
	            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
	            
	            for(int i = 0; i < n; i++)
	               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
	            ArrayList <String> res = new PhoneDigit().possibleWords(arr, n);
	            for (String i : res) System.out.print (i + " ");
	             System.out.println();
	              
	        }
	    }
	}
	// } Driver Code Ends


	//User function Template for Java

	class PhoneDigit
	{
		static Character[][] numberToCharMap;

	
	    static ArrayList <String> possibleWords(int numbers[], int N)
	    {
	    	 generateNumberToCharMap();
	    	 ArrayList<String> stringList = 
	    	      printWords(numbers, numbers.length, 0, "");
	    	 //stringList.stream().forEach(System.out :: println);
	    	 return stringList;
	    }
	        // your code here  
private static ArrayList<String> printWords(int[] numbers, 
                                      int len, 
                                      int numIndex, 
                                      String s)
{
 if(len == numIndex)
 {
   return new ArrayList<>(Collections.singleton(s));
 }
  
 ArrayList<String> stringList = new ArrayList<>();
  
 for(int i = 0; 
         i < numberToCharMap[numbers[numIndex]].length; i++)
 {
   String sCopy = 
          String.copyValueOf(s.toCharArray());
   sCopy = sCopy.concat(
           numberToCharMap[numbers[numIndex]][i].toString());
   stringList.addAll(printWords(numbers, len, 
                                numIndex + 1, 
                                sCopy));
 }
 return stringList;
}
    


private static void generateNumberToCharMap()
{
 numberToCharMap = new Character[10][5];
 numberToCharMap[0] = new Character[]{'\0'};
 numberToCharMap[1] = new Character[]{'\0'};
 numberToCharMap[2] = new Character[]{'a','b','c'};
 numberToCharMap[3] = new Character[]{'d','e','f'};
 numberToCharMap[4] = new Character[]{'g','h','i'};
 numberToCharMap[5] = new Character[]{'j','k','l'};
 numberToCharMap[6] = new Character[]{'m','n','o'};
 numberToCharMap[7] = new Character[]{'p','q','r','s'};
 numberToCharMap[8] = new Character[]{'t','u','v'};
 numberToCharMap[9] = new Character[]{'w','x','y','z'};
}
	}
