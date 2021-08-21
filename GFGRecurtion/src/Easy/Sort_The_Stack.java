package Easy;

import java.util.Scanner;
import java.util.Stack;

public class Sort_The_Stack {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
	static Stack<Integer> a = new Stack<Integer>();
	static Stack<Integer> b = new Stack<Integer>();
	static Stack<Integer> c = new Stack<Integer>();
	public Stack<Integer> sort(Stack<Integer> s)
	{a.clear();
		c.clear();
		b.clear();
		c.addAll(s);
		sortutil();
		return a;
		
	}
	private void sortutil() {
		// TODO Auto-generated method stub
		if(c.isEmpty())return;
       int temp= c.pop();
		
		if(a.isEmpty()||a.peek()<temp) {a.push(temp);}
		else if(a.peek()>temp) {
			while(!a.isEmpty()&&a.peek()>temp) {b.push(a.pop());}
			a.add(temp);
			while(!b.isEmpty()) {
				a.add(b.pop());
			}
		}
		sortutil();
	}
}


