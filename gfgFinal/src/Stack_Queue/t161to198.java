package Stack_Queue;

import java.util.*;

import Stack_Queue.t161to198.GFG.myStack;

public class t161to198 {
	  static class Node
	    {
	        Node left, right;
	        int data;
	        Node(int data){
	            this.data = data;
	            left = null;
	            right = null;
	        }
	    }
	class TwoStack
	{

		int size;
		int top1,top2;
		int arr[] = new int[100];

		TwoStack()
		{
			size = 100;
			top1 = -1;
			top2 = size;
		}
	}
	public static void main(String[] args) {
//	     MyStack theStack = new MyStack(10); 
//	      theStack.push(10);
//	      theStack.push(20);
//	      theStack.push(30);
//	      theStack.push(40);
//	      theStack.push(50);
//	      
//	      while (!theStack.isEmpty()) {
//	         long value = theStack.pop();
//	         System.out.print(value);
//	         System.out.print(" ");
//	      }
//	      System.out.println("");
//	        Queue queue = new Queue(1000);
//	   	 
//	        queue.enqueue(10);
//	        queue.enqueue(20);
//	        queue.enqueue(30);
//	        queue.enqueue(40);
//	 
//	        System.out.println(queue.dequeue()
//	                           + " dequeued from queue\n");
//	 
//	        System.out.println("Front item is "
//	                           + queue.front());
//	 
//	        System.out.println("Rear item is "
//	                           + queue.rear());
		//5
//		  int k = 3, n = 10;
//          
//	        kstack ks = new kstack(n, k);
//	  
//	        ks.push(15, 2);
//	        ks.push(45, 2);
//	  
//	        // Let us put some items in stack number 1
//	        ks.push(17, 1);
//	        ks.push(49, 1);
//	        ks.push(39, 1);
//	  
//	        // Let us put some items in stack number 0
//	        ks.push(11, 0);
//	        ks.push(9, 0);
//	        ks.push(7, 0);
//	  
//	        System.out.println("Popped element from stack 2 is " + ks.pop(2));
//	        System.out.println("Popped element from stack 1 is " + ks.pop(1));
//	        System.out.println("Popped element from stack 0 is " + ks.pop(0));
//	    
//	        
//	         k = 3; n = 10;
//            KQueues kss=  new KQueues(k, n);
//            
//             
//            // Let us put some items in queue number 2
//            kss.enqueue(15, 2);
//            kss.enqueue(45, 2);
//           
//            // Let us put some items in queue number 1
//            kss.enqueue(17, 1);
//            kss.enqueue(49, 1);
//            kss.enqueue(39, 1);
//           
//            // Let us put some items in queue number 0
//            kss.enqueue(11, 0);
//            kss.enqueue(9, 0);
//            kss.enqueue(7, 0);
//             
//            System.out.println("Dequeued element from queue 2 is " +
//                                    kss.dequeue(2));
//            System.out.println("Dequeued element from queue 1 is " +
//                                    kss.dequeue(1));
//            System.out.println("Dequeued element from queue 0 is " +
//                                    kss.dequeue(0) );
            //4 middle element
//            GFG ob = new GFG();
//            myStack ms = ob.createMyStack();
//            ob.push(ms, 11);
//            ob.push(ms, 22);
//            ob.push(ms, 33);
//            ob.push(ms, 44);
//            ob.push(ms, 55);
//            ob.push(ms, 66);
//            ob.push(ms, 77);
//     
//            System.out.println("Item popped is " + ob.pop(ms));
//            System.out.println("Item popped is " + ob.pop(ms));
//            System.out.println("Middle Element is "
//                               + ob.findMiddle(ms));
        //Infix to prefix
	System.out.println(	infixToPreFix("x+y*z/w+u"));
		
            //21
//            iStack stk = new iStack();
//       	 
//    	    // push 7 and 8 at top of stack
//    	    stk.push(7);
//    	    stk.push(8);
//    	    System.out.print("Stack: ");
//    	    stk.display();
//    	 
//    	    // For new line
//    	    System.out.println();
//    	     
//    	    // pop an element
//    	    stk.pop();
//    	    System.out.print("Stack: ");
//    	    stk.display();
//    	 
//    	    // For new line
//    	    System.out.println();
//    	 
//    	    // Object of Queue
//    	    iQueue que = new iQueue();
//    	 
//    	    // Insert 12 and 13 in queue
//    	    que.enqueue(12);
//    	    que.enqueue(13);
//    	    System.out.print("Queue: ");
//    	    que.display();
//    	 
//    	    // New line
//    	    System.out.println();
//    	     
//    	    // Delete an element from queue
//    	    que.dequeue();
//    	    System.out.print("Queue: ");
//    	    que.display();
//    	 
//    	    // New line
//    	    System.out.println();
//    	    System.out.println("Size of stack is " +
//    	                       stk.size());
//    	    System.out.println("Size of queue is " +
//    	                       que.size());
    	
	      //  naam();naam2();
//		Queue<Integer>q=new LinkedList<Integer>();
//		q.add(1);q.add(2);q.add(3);q.add(4);
//		q.add(5);q.add(6);q.add(7);
//		q.add(8);
//		interleave(q);
    	    
	}
//1
	// Implement Stack
	static  class MyStack {
		   private int maxSize;
		   private long[] stackArray;
		   private int top;
		   
		   public MyStack(int s) {
		      maxSize = s;
		      stackArray = new long[maxSize];
		      top = -1;
		   }
		   public void push(long j) {
		      stackArray[++top] = j;
		   }
		   public long pop() {
		      return stackArray[top--];
		   }
		   public long peek() {
		      return stackArray[top];
		   }
		   public boolean isEmpty() {
		      return (top == -1);
		   }
		   public boolean isFull() {
		      return (top == maxSize - 1);
		   }
		   
		}	
	
	//2 
	// Implement Queue
	//Same as requirement of 
	//25 Circular Queue
static class MyQueue {
	    int front, rear, size;
	    int capacity;
	    int array[];
	 
	    public MyQueue(int capacity)
	    {
	        this.capacity = capacity;
	        front = this.size = 0;
	        rear = capacity - 1;
	        array = new int[this.capacity];
	    }
	 
	    // Queue is full when size becomes
	    // equal to the capacity
	    boolean isFull(MyQueue queue)
	    {
	        return (queue.size == queue.capacity);
	    }
	 
	    // Queue is empty when size is 0
	    boolean isEmpty(MyQueue queue)
	    {
	        return (queue.size == 0);
	    }
	 
	    // Method to add an item to the queue.
	    // It changes rear and size
	    void enqueue(int item)
	    {
	        if (isFull(this))
	            return;
	        this.rear = (this.rear + 1)
	                    % this.capacity;
	        this.array[this.rear] = item;
	        this.size = this.size + 1;
	        System.out.println(item
	                           + " enqueued to queue");
	    }
	 
	    // Method to remove an item from queue.
	    // It changes front and size
	    int dequeue()
	    {
	        if (isEmpty(this))
	            return Integer.MIN_VALUE;
	 
	        int item = this.array[this.front];
	        this.front = (this.front + 1)
	                     % this.capacity;
	        this.size = this.size - 1;
	        return item;
	    }
	 
	    // Method to get front of queue
	    int front()
	    {
	        if (isEmpty(this))
	            return Integer.MIN_VALUE;
	 
	        return this.array[this.front];
	    }
	 
	    // Method to get rear of queue
	    int rear()
	    {
	        if (isEmpty(this))
	            return Integer.MIN_VALUE;
	 
	        return this.array[this.rear];
	    }
	}
	//3
	// Implement 2 stack in array
    void push1(int x, TwoStack sq)
    {
        if(sq.top1+1==sq.top2)return;
     sq.arr[++sq.top1]=x;   
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq)
    {
        if(sq.top2-1==sq.top1)return;
     sq.arr[--sq.top2]=x;   
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq)
    {
        if(sq.top1==-1)return -1;
        return sq.arr[sq.top1--];
    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq)
    {
        if(sq.top2==sq.size) return -1;
        return sq.arr[sq.top2++];
    }
    //4
    //Middle element find and delete in O(1) of stack
    static class GFG {
    static    class DLLNode {
            DLLNode prev;
            int data;
            DLLNode next;
            DLLNode(int d) { data = d; }
        }
      static  class myStack {
            DLLNode head;
            DLLNode mid;
            int count;
        }
        myStack createMyStack()
        {
            myStack ms = new myStack();
            ms.count = 0;
            return ms;
        }
        void push(myStack ms, int new_data)
        {
            DLLNode new_DLLNode = new DLLNode(new_data);
            new_DLLNode.prev = null;
            new_DLLNode.next = ms.head;
            ms.count += 1;
            if (ms.count == 1) { ms.mid = new_DLLNode;}
            else {ms.head.prev = new_DLLNode;
                if ((ms.count % 2)!= 0)ms.mid = ms.mid.prev;
            }
            ms.head = new_DLLNode;
        }
        int pop(myStack ms)
        {
            if (ms.count == 0) {System.out.println("Stack is empty");return -1;}
            DLLNode head = ms.head;
            int item = head.data;
            ms.head = head.next;
            if (ms.head != null)ms.head.prev = null;
            ms.count -= 1;
            if (ms.count % 2 == 0)ms.mid = ms.mid.next;
      return item;
        }
        int findMiddle(myStack ms)
        {
            if (ms.count == 0) {System.out.println("Stack is empty now");return -1;}
            return ms.mid.data;
        }
    }
    //5
    //Implement k stack in an array
    //O(1) O(N)
  static  class kstack{
    static	int top[],next[],arr[],space,n,k;
    	kstack(int n1, int k1){n=n1;k=k1;
    	arr=new int[n];top=new int[k];next=new int[n];
    		space=0;Arrays.fill(top, -1);
    		for(int i=0;i<n-1;i++) {next[i]=i+1;}next[n-1]=-1;
    	}
    	public  boolean isfull() {return (space==-1);}
    	public  boolean isEmpty(int sn) {return (arr[sn]==-1);}
    	public void push(int x,int sn)
    	{
    		if(isfull()){System.out.println("not possible");return;}
    	int i=space;space=next[i];next[i]=top[sn];top[sn]=i;arr[i]=x;
    	}
    	public  int pop(int sn)
    	{
    		if(isEmpty(sn)){System.out.println("not possible");return Integer.MAX_VALUE;}
    	int i=top[sn];top[sn]=next[i];next[i]=space;space=i;
    	return arr[i];
    	}
  }
//6
    //Parenthesis Checker 
    static boolean ispar(String s){
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
//7
//Reverse a String 
    public String reverse(String S){
        Stack<Character>t= new Stack<Character>();
        StringBuilder s= new StringBuilder(S);
        for(int i=0;i<s.toString().length();i++)
        {t.push(s.charAt(i));}
        s.setLength(0);;
        s.append(t.pop());
        while(!t.isEmpty()){s.append(t.pop());}
        return s.toString();
    }
//8
    // Min Stack
    //O(N) O(1)
    public void push(int a,Stack<Integer> s)
	{
		s.push(a);
	}
	public int pop(Stack<Integer> s){
		int a=s.pop();
		return a;
	}
	public int min(Stack<Integer> s){
		int m=s.pop();
		while(!s.isEmpty()){
			int n=s.pop();
			if(n<m)
				m=n;
		}
		return m;
	}
	public boolean isFull(Stack<Integer>s, int n){
		if(s.size()==n)
			return true;
		return false;
	}
	public boolean isEmpty(Stack<Integer>s){
		if(s.size()==0)
			return true;
		return false;
	}
	//O(1) O(1)
	// Leetcode
	class MinStack {
	  private Stack<Integer> stack;
	    private int min;
	    public MinStack() {
	        stack = new Stack<>();
	        min = Integer.MAX_VALUE;
	    }
	    
	    public void push(int x) {
	        if(x <= min){   // memorize the previous min by pushing it to the stack
	            stack.push(min);
	            min = x;
	        }
	        stack.push(x);
	    }
	    
	    public void pop() {
	        if(stack.pop() == min){
	            min = stack.pop();
	        }
	    }
	    
	    public int top() {
	        return stack.peek();
	    }
	    public int getMin() {
	        return min;
	    }
}
	//9
	//Next Greater Element
//	O(n) O(n)
	   public static long[] nextLargerElement(long[] arr, int n)
	    { 
	    long[] ans= new long[n];
	        Stack<Long> s=new Stack<Long>();
	        for(int i=n-1;i>=0;i--)
	        {
	            if(s.isEmpty()){s.push((long)-1);}
	            else{while(s.peek()!=-1&&s.peek()<=arr[i]){s.pop();}}
	            ans[i]=s.peek();
	            s.push(arr[i]);
	        }
	        return ans;
	    }
	//Next Greater Element 2
//	    	O(n) O(n)
	   public int[] nextGreaterElements(int[] nums) {
          	int res[]=new int[nums.length];
   	Stack<Integer>a=new Stack<Integer>();
   for(int i=2*nums.length-1;i>=0;i--) 
   {
   	while(!a.isEmpty()&&nums[i%nums.length]>=nums[a.peek()]) {a.pop();}
   	res[i%nums.length]=a.isEmpty()?-1:nums[a.peek()];
   	a.push(i%nums.length);
   }
   	
   	
   	return res;
   }
	//10
	        //The Celebrity Problem
	        //O(N) O(1) HARD to comeup to the approch 
	        int celebrity(int M[][], int n)
	        {
	        	int a=0,b=n-1;
	        	while(a<b){if(M[a][b]==1){a++;}else{b--;}}
	        	int c=0,d=0;
	        	for(int i=0;i<n;i++){if(M[i][a]==1){c++;}if(M[a][i]==1){d++;}}
	        	    return c==n-1&&d==0?a:-1;
	        }
	        //11
	        //INFIX evaluation
	        //O(n) O(n)
	        public int calculate(String expression) 
	            {
	                char[] tokens = expression.toCharArray();
	                Stack<Integer> values = new Stack<Integer>();
	                Stack<Character> ops = new Stack<Character>();
	         
	                for (int i = 0; i < tokens.length; i++)
	                {
	                    if (tokens[i] == ' ')  continue;
	                    if (tokens[i] >= '0' && tokens[i] <= '9')
	                    {
	                        StringBuffer sbuf = new StringBuffer();
	                        while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
	                        sbuf.append(tokens[i++]);
	                        values.push(Integer.parseInt(sbuf.toString()));
	                        i--;
	                    }
	                    else if (tokens[i] == '(')ops.push(tokens[i]);
	                    else if (tokens[i] == ')')
	                    {
	                        while (ops.peek() != '(')
	                        values.push(applyOp(ops.pop(), values.pop(), values.pop()));
	                        ops.pop();
	                    }
	                    else if (tokens[i] == '+' ||tokens[i] == '-' ||tokens[i] == '*' ||tokens[i] == '/')
	                    {
	                        while (!ops.empty() &&hasPrecedence(tokens[i],ops.peek()))
	                        values.push(applyOp(ops.pop(),values.pop(),values.pop()));
	                        ops.push(tokens[i]);
	                    }
	                }
	                while (!ops.empty()) values.push(applyOp(ops.pop(), values.pop(), values.pop()));
	                return values.pop();
	            }
	            public boolean hasPrecedence(char op1, char op2)
	            {
	                if (op2 == '(' || op2 == ')')  return false;
	                if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) return false;
	                else return true;
	            }
	            public int applyOp(char op,int b, int a)
	            {
	                switch (op)
	                {case '+':return a + b;
	                 case '-':return a - b;
	                 case '*':return a * b;
	                case '/':if (b == 0)return 0;
	                    return a / b;
	                }
	                return 0;
	            }
	            //O(n) O(n)
	            public int calculates(String s) {
	            	    int len;
	            	    if(s==null || (len = s.length())==0) return 0;
	            	    Stack<Integer> stack = new Stack<Integer>();
	            	    int num = 0;
	            	    char sign = '+';
	            	    for(int i=0;i<len;i++){
	            	        if(Character.isDigit(s.charAt(i))){
	            	            num = num*10+s.charAt(i)-'0';
	            	        }
	            	        if((!Character.isDigit(s.charAt(i)) &&' '!=s.charAt(i)) || i==len-1){
	            	            if(sign=='-'){
	            	                stack.push(-num);
	            	            }
	            	            if(sign=='+'){
	            	                stack.push(num);
	            	            }
	            	            if(sign=='*'){
	            	                stack.push(stack.pop()*num);
	            	            }
	            	            if(sign=='/'){
	            	                stack.push(stack.pop()/num);
	            	            }
	            	            sign = s.charAt(i);
	            	            num = 0;
	            	        }
	            	    }

	            	    int re = 0;
	            	    for(int i:stack){
	            	        re += i;
	            	    }
	            	    return re;
	            	}
	           // O(n)  O(1)
	            public int calculated(String s) {
	                int sum = 0;
	                int tempSum = 0;
	                int num = 0;
	                char lastSign = '+';
	                for (int i = 0; i < s.length(); i++) {
	                    char c = s.charAt(i);
	                    if (Character.isDigit(c)) num = num * 10 + c - '0';
	                    if (i == s.length() - 1 || !Character.isDigit(c) && c!=' ') {
	                        switch(lastSign) {
	                            case '+':
	                                sum+=tempSum;
	                                tempSum = num;
	                                break;
	                            case '-':
	                                sum+=tempSum;
	                                tempSum = -num;
	                                break;
	                            case '*':
	                                tempSum *= num;
	                                break;
	                            case '/':
	                                tempSum /= num;
	                                break;
	                        }
	                        lastSign = c;
	                        num=0;
	                    }
	                }
	                sum+=tempSum;
	                return sum;
	            }
	        //12
	        //Evaluation of Postfix Expression
	        public static int evaluatePostFix(String S)
	        {
	            Stack<Integer>a=new Stack<Integer>(); 
	        char[]s=S.toCharArray();int n=s.length;
	        for(int i=0;i<n;i++)
	        {
	        if(s[i]=='+'||s[i]=='-'||s[i]=='*'||s[i]=='/'){int x=a.pop(),y=a.pop();
	            if(s[i]=='+'){a.push(y+x);}
	                else  if(s[i]=='-'){a.push(y-x);}
	                else if(s[i]=='*'){a.push(y*x);}
	                else if(s[i]=='/'){a.push(y/x);}
	            }    else{a.push((int)(s[i]-'0'));}
	        }
	    return a.pop();
	        }
	        //Evaluation of prefix Expression
	        public static int evaluatePreFix(String S)
	        {
	            Stack<Integer>a=new Stack<Integer>(); 
	        char[]s=S.toCharArray();int n=s.length;
	        for(int i=n-1;i>=0;i--)
	        {
	        if(s[i]=='+'||s[i]=='-'||s[i]=='*'||s[i]=='/'){int x=a.pop(),y=a.pop();
	            if(s[i]=='+'){a.push(x+y);}
	                else  if(s[i]=='-'){a.push(x-y);}
	                else if(s[i]=='*'){a.push(x*y);}
	                else if(s[i]=='/'){a.push(x/y);}
	            }    else{a.push((int)(s[i]-'0'));}
	        }
	    return a.pop();
	        }
	        //infix to postfix
	        static int Prec(char ch)
	        {	            switch (ch)   {
	            case '+':
	            case '-':
	                return 1;
	          
	            case '*':
	            case '/':
	                return 2;
	          
	            case '^':
	                return 3;
	            }
	            return -1;
	        }
	          static String infixToPostfix(String exp)
	        {   String result = new String("");
	            Stack<Character> stack = new Stack<>();
	            for (int i = 0; i<exp.length(); ++i)
	            {       char c = exp.charAt(i);
	                if (Character.isLetterOrDigit(c))
	                    result += c;
	                else if (c == '(')
	                    stack.push(c);
	                else if (c == ')')
	                {
	                    while (!stack.isEmpty()&&stack.peek() != '(')result += stack.pop();
	                        stack.pop();
	                }
	                else // an operator is encountered
	                {
	                    while (!stack.isEmpty() && Prec(c)<= Prec(stack.peek())){result += stack.pop();}
	                    stack.push(c);
	                }
	          
	            }
	            while (!stack.isEmpty()){
	                if(stack.peek() == '(')
	                    return "Invalid Expression";
	                result += stack.pop();
	             }
	            return result;
	        }
	          //infix to prefix
	          static StringBuilder infixToPreFix(String expression){
                  StringBuilder result = new StringBuilder();
	              StringBuilder input = new StringBuilder(expression);
	              input.reverse();
	              Stack<Character> stack = new Stack<Character>();
                 char [] charsExp = input.toString().toCharArray();
	              for (int i = 0; i < charsExp.length; i++) {
	                  if (charsExp[i] == '(') {charsExp[i] = ')';i++;}
	                  else if (charsExp[i] == ')') {charsExp[i] = '(';i++;}
	              }
	              for (int i = 0; i <charsExp.length ; i++) {
	                  char c = charsExp[i];
                 if(Prec(c)>0){
	                      while(stack.isEmpty()==false &&
	                    		  ( (Prec(c)<Prec(stack.peek()))||(c=='^'&&Prec(c)<=Prec(stack.peek())))){
	                          result.append(stack.pop());
	                      }
	                      stack.push(c);
	                  }else if(c==')'){
	                      char x = stack.pop();
	                      while(x!='('){
	                          result.append(x);
	                          x = stack.pop();
	                      }
	                  }else if(c=='('){
	                      stack.push(c);
	                  }else{
	                      //character is neither operator nor "("
	                      result.append(c);
	                  }
	              }

	              for (int i = 0; i <=stack.size() ; i++) {
	                  result.append(stack.pop());
	              }
	              return result.reverse();
	          }
		        //postfix to infix
	          static String getInfix(String exp)
	          {Stack<String> s = new Stack<String>();
	           for (int i = 0; i < exp.length(); i++)
	              {char x=exp.charAt(i);
	        	   if ((x >= 'a' && x <= 'z') ||(x >= 'A' && x <= 'Z'))
	        	   {s.push(exp.charAt(i) + "");}
	              else{	  String op1 =s.pop();
	                      String op2 =s.pop();
	                      s.push("(" + op2 + exp.charAt(i) +op1 + ")");
	                  }
	              }   return s.pop();
	          }
	          //prefix to infix
	          static String getInfixs(String exp)
	          {Stack<String> s = new Stack<String>();
	           for (int i = exp.length()-1; i >=0; i--)
	              {char x=exp.charAt(i);
	        	   if ((x >= 'a' && x <= 'z') ||(x >= 'A' && x <= 'Z'))
	        	   {s.push(exp.charAt(i) + "");}
	              else{	  String op1 =s.pop();
	                      String op2 =s.pop();
	                      s.push("(" + op1 + exp.charAt(i) +op2 + ")");
	                  }
	              }   return s.pop();
	          }
	      	        //13
	        // Insert  an element at bottom of stack w/o using other ds
	        public static void insert2(int x) {
	        	if(a.isEmpty()){a.push(x);}
	        	else{int y=a.pop();insert2(x);a.push(y);}
	        }
	        
	        //14
	        // Reverse Stack using Recurtion
	        //O(n2) O(1)
	        public static void naam() {
	        	a.push(1);a.push(2);a.push(3);a.push(4);
	        reverse();
	        while(!a.isEmpty()) {System.out.println(a.pop());}} 
	        
            static Stack<Integer>a= new Stack<Integer>();
	        public static void reverse() {
	        	if(!a.isEmpty())
	        	{int x=a.pop();reverse();insert(x);}
	        }
	        public static void insert(int x) {
	        	if(a.isEmpty()){a.push(x);}
	        	else{int y=a.pop();insert(x);a.push(y);}
	        }
	        //15
	        //sort stack using recurtion
	        //O(N*N) O(N)
	    	public Stack<Integer> sort(Stack<Integer> s)
	    	{
	    	if(!s.isEmpty()){
	    	    int i=s.pop();
	    	    sort(s);
	    	    insert(i,s);
	    	    
	    	}
	    	   return s;
	    	}
	    	public void insert(int i,Stack<Integer> s)
	    	{
	    	    if(s.isEmpty()||s.peek()<=i){s.push(i);}
	    	    else{
	    	        int t=s.pop();
	    	        insert(i,s);
	    	        s.push(t);
	    	    }
	    	    
	    	}
	        //16
	        //Mege ovellaping Intervls
	      
	      // SAME AS 14 OF ARRAY BY CHANGING LINKEDLIST INTO STACK  
	        //Maximum Intervals Overlap
	        //O(nlogn) O(1)
	    	public int[] findMaxGuests(int[] e,int x[], int n){
	            Arrays.sort(e);Arrays.sort(x);
	            int i=0,j=0,ic=0,max=0,point=-5;
	            while(i!=n&&j!=n)
	            {
	                if(e[i]<=x[j]){ic++;i++;}
	                else{ic--;j++;}
	                if(ic>max){
	                max=Math.max(max,ic);
	                point=e[i-1];}
	            }
	    	
	    	    return new int[]{max,point};
	    	}
	    	//17
	    	//Largest Rectangle in Histogram
	    	//O(NLOGN) Segment tree
	    	public int largestRectangleArea2(int[] heights) {
	            int n = heights.length;
	            int[] segment = buildSegmentTree(heights);
	            return divideConquer(heights, 0, n - 1, segment);        
	        }
	        
	        private static int divideConquer(int[] height, int l, int h, int[] segment) {
	            if(l <= h) {
	                if(l == h) return height[l] * 1;
	                int minIndex = query(segment, height, l, h);
	                int currArea = height[minIndex] * (h - l + 1);
	                int leftArea = divideConquer(height, l, minIndex - 1, segment);
	                int rightArea = divideConquer(height, minIndex + 1, h, segment);
	                return Math.max(Math.max(currArea, leftArea), rightArea);
	            }
	            return 0;
	        }
	        
	        private static int[] buildSegmentTree(int[] heights) {
	            int n = heights.length;
	            int[] segment = new int[2 * n];
	            for(int i = n - 1, j = 2 * n - 1; i >= 0; i--, j--) {
	                segment[j] = i;
	            }
	            for(int i = n - 1; i > 0; i--) {
	                if(heights[segment[2 * i]] < heights[segment[2 * i + 1]]) segment[i] = segment[2 * i];
	                else segment[i] = segment[2 * i + 1];
	            }
	            return segment;
	        }
	        
	        private static int query(int[] segment, int[] heights, int i, int j) {
	            int n = heights.length;
	            int p = i + n;
	            int q = j + n;
	            int min = Integer.MAX_VALUE;
	            int index = -1;
	            while(p <= q) {
	                if(p % 2 == 1) {
	                    if(heights[segment[p]] < min) {
	                        min = heights[segment[p]];
	                        index = segment[p];
	                    }
	                    p++;
	                }
	                if(q % 2 == 0) {
	                    if(heights[segment[q]] < min) {
	                        min = heights[segment[q]];
	                        index = segment[q];
	                    }
	                    q--;
	                }
	                p = p >> 1;
	                q = q >> 1;
	            }
	            return index;
	        }
	    
	        //O(N) O(N)
	    	public int largestRectangleArea(int[] hist) 
	        {int n=hist.length;
	      Stack<Integer>s= new Stack<Integer>();
	      int i=0;int max=0;
	       while (i < n) {
	           if (s.isEmpty()||hist[s.peek()] <= hist[i]) {
	           s.push(i++);}
	           else {
	               int tp=s.pop();
	               int ans=hist[tp]*(s.isEmpty()?i:i-s.peek()-1);
	           max=Math.max(ans,max);
	           }
	       }
	      while(!s.isEmpty()){ int tp=s.pop();
	               int ans=hist[tp]*(s.isEmpty()?i:i-s.peek()-1);
	           max=Math.max(ans,max);}
	       return max;
	      }
	    	//O(N) O(N) BUT  FASTER DUE TO PREPROCESSING
	    	public static int largestRectangleArea3(int[] height) {
	    	    if (height == null || height.length == 0) {
	    	        return 0;
	    	    }
	    	    int[] lessFromLeft = new int[height.length]; // idx of the first bar the left that is lower than current
	    	    int[] lessFromRight = new int[height.length]; // idx of the first bar the right that is lower than current
	    	    lessFromRight[height.length - 1] = height.length;
	    	    lessFromLeft[0] = -1;

	    	    for (int i = 1; i < height.length; i++) {
	    	        int p = i - 1;

	    	        while (p >= 0 && height[p] >= height[i]) {
	    	            p = lessFromLeft[p];
	    	        }
	    	        lessFromLeft[i] = p;
	    	    }

	    	    for (int i = height.length - 2; i >= 0; i--) {
	    	        int p = i + 1;

	    	        while (p < height.length && height[p] >= height[i]) {
	    	            p = lessFromRight[p];
	    	        }
	    	        lessFromRight[i] = p;
	    	    }

	    	    int maxArea = 0;
	    	    for (int i = 0; i < height.length; i++) {
	    	        maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
	    	    }

	    	    return maxArea;
	    	}

	        //18
	        // Longest Valid Parentheses
	        //O(N2) O(1)
	        static int findMaxLen(String s) {
	        	   int max=0,n=s.length();
	        	        for(int i=0;i<n;i++)
	        	        {
	        	            for(int j=i+2;j<=n;j+=2)
	        	            {
	        	                if(valid(s,i,j)){max=Math.max(max,j-i);}
	        	            }
	        	        }
	        	    
	        	        return max;
	        	    }
	        	    
	        	    public static boolean valid(String s,int i,int j)
	        	    {
	        	         s=s.substring(i,j);int m=0,p=0;
	        	        for(int t=0;t<s.length();t++)
	        	        {
	        	            if(s.charAt(t)=='(')m++;
	        	            else p++;
	        	            if(p>m)return false;
	        	        }
	        	        return m==p?true:false;
	        	    }
	        // O(N) O(N)
	        public int longestValidParentheses(String s) {
	            int n=s.length();
	         Stack<Integer>a= new Stack<Integer>();
	            a.push(-1);int max=0;
	            for(int i=0;i<n;i++)
	            {
	                if(s.charAt(i)=='(')a.push(i);
	                else{
	                    a.pop();
	                if(a.isEmpty()){a.push(i);}
	                    else{max=Integer.max(max,i-a.peek());}
	                }
	            }
	            return max;
	        }
	        //O(N)  O(1)
	        static int findMax(String s) {
	        int n=s.length(),open=0,close=0,max=0;
	        for(int i=0;i<n;i++)
	        {
	            if(s.charAt(i)=='(')open++;
	            else{close++;}
	            
	            if(close>open){open=0;close=0;}
	                else if(close==open){max=Integer.max(max,2*open);}
	        }
	        
	        open=0;close=0;
	        for(int i=s.length()-1;i>=0;i--)
	        {
	            if(s.charAt(i)=='(')open++;
	            else{close++;}
	            
	            if(open>close){open=0;close=0;}
	                else if(close==open){max=Integer.max(max,2*open);}
	        }
	        return max;
	    }
	        //19
	        //Redunctant  braces
	        //O(N) O(N)
	        public int braces(String A) {
	            char[] t= A.toCharArray();
	            Stack<Character>s= new Stack<Character>();
	            int n=t.length;
	            for(int i=0;i<n;i++)
	            {if(t[i]==')'){
	                boolean red=true;
	                while(s.peek()!='('){
	                    if(s.peek()=='+'||s.peek()=='-'||s.peek()=='*'||s.peek()=='/'){red=false;}
	                s.pop();
	                }s.pop();
	                if(red==true)return 1;
	            }
	            else{s.push(t[i]);}}
	        return 0;
	        }
	        //2
	        //Faster because we neet to check count only
	        public int bracs(String A) {
	            char[] t= A.toCharArray();
	            Stack<Character>s= new Stack<Character>();
	            int n=t.length;
	            for(int i=0;i<n;i++)
	            {if(t[i]==')'){
	                int red=0;
	                while(s.peek()!='('){
	                   red++;
	                s.pop();
	                }s.pop();
	                if(red<2)return 1;
	            }
	            else{s.push(t[i]);}}
	        return 0;
	        }
	        //20
	        //Implement stack using  queue 
	        Queue<Integer>q=new LinkedList<Integer>();
	        
	        public void push(int x) {
	              q.add(x);
	    	    for(int i=1;i<q.size();i++){q.add(q.remove());}
	        }
	         public int pop() {
	               if(q.size()==0)return -1;
	    return q.remove(); 
	        }
	        public int top() {
	            return q.peek();
	        }
	        public boolean empty() {
	            return q.isEmpty()?true:false;
	        }
	        //21
	     
	        	static class DQueNode
	  {
	      int value;DQueNode next;DQueNode prev;
	  DQueNode(int x){this.value=x;next=null;prev=null;}
	  }
	        
	      	static class deque{private DQueNode head,tail;
	        	  public deque(){ head = tail = null;}
	        	  int size() { DQueNode temp = head;int len = 0;
	        		  if (temp==null)return 0;
	        	            while (temp != null)
	        	            {len++;temp = temp.next;}
	        	            return len;
	        	    }
	        	 void insert_first(int element)
	        	 {DQueNode temp = new DQueNode(element);
	        	 if (head == null)
	        	        {
	        	            head = tail = temp;
	        	            temp.next = temp.prev = null;
	        	        }
	        	        else
	        	        { temp.prev = null; temp.next = head; head.prev = temp; head = temp;}
	        	    }
	      	    void insert_last(int element)
	        	    { DQueNode temp = new DQueNode(element);
	        	        temp.value = element;
	        	        if (head == null)
	        	        {
	        	            head = tail = temp;
	        	            temp.next = temp.prev = null;
	        	        }
	        	        else
	        	        { temp.next = null;temp.prev = tail; tail.next = temp;  tail = temp; }
	        	    }
	        	  void remove_first()
	        	    {if(head==null)return;
	        	    if(head==tail) {int ans=head.value;System.out.println(ans);head=null;tail=null;return;}
	        	            DQueNode temp = head;
	        	            head = head.next;
	        	            head.prev = null;
	        	        System.out.print(temp.value);
	        	    }
	        	 void remove_last()
	        	    {if(tail==null)return;
	        	    if(head==tail) {int ans=head.value;System.out.print(ans);head=null;tail=null;return;}
    	            DQueNode temp = tail;
	        	            tail = tail.prev;
	        	            tail.next.prev=null;
	        	            tail.next = null;
	        	        System.out.print(temp.value);
	        	    }
	        	 void display() { DQueNode temp = head;
       		  if (temp==null)System.out.print("Not There");
       	            while (temp != null)
       	            {System.out.print(temp.value+" ");temp = temp.next;}
       	    }
	      	}
	        	 static class iStack
	        	{deque d = new deque();
	        	 public void push(int element){ d.insert_last(element);}
	        	 public void pop(){d.remove_last();}
	        	 public int size() { return d.size(); }
	        	 public void display() {d.display();}
	        	}
	        	 
	        	 static class iQueue
	        	{deque d = new deque();
	        	 public void enqueue(int element){d.insert_last(element);}
	        	 public void dequeue(){d.remove_first();}
	        	 public void display() { d.display(); }
	        	 public int size() { return d.size();}
	        	}
	        //22
	        // Stack Permutations (Check if an array is stack permutation of other)
	        //O(n) O(n)
	        public boolean validateStackSequences(int[] i, int[] o) {
	            int n=i.length;
	              Stack<Integer> s= new Stack<Integer>();
	              int j=0;
	              for(int t=0;t<n;t++)
	              {
	                  if(i[t]!=o[j]){s.push(i[t]);}
	              else{j++;while(!s.isEmpty()&&s.peek()==o[j]){s.pop();j++;}}
	              }
	            
	          return s.isEmpty()?true:false;
	          }
//23
	        //Implement Queue using 2 stack

	        int front=0;
	        Stack<Integer>    s1=new Stack<Integer>();
	        Stack<Integer>   s2=new Stack<Integer>();
	        
	        public void ipush(int x) {
	            if(s1.isEmpty()){front=x;}
	        s1.push(x);     
	        }
	        public int ipop() {
	            if(s1.size()==0)return -1;
	            while(!s1.isEmpty()){s2.push(s1.pop());}
	            int i=s2.pop();if(!s2.isEmpty())front=s2.peek();else front =-1;
	            while(!s2.isEmpty()){s1.push(s2.pop());}
	        return i;
	        }
	        public int peek() {
	            return front;
	        }
	        public boolean iempty() {
	           return s1.isEmpty()?true:false;   
	        }
	        //Implement Queue using 1 stack
	        //Literal it is 1 stack
	        // technical we are use recurtion stack to this so inside it is taking 
	        //2 stack memory
	        public int iipop(){
	            if (s1.size() == 0)
	                return -1;

	            if (s1.size() == 1)
	                return s1.pop();
	        
	            int data = s1.pop();
	                if(s1.size()==1){front =data;}
	            int retVal = iipop();
	            s1.push(data);
	            return retVal;
	        }
//24
	        // implement k Queues in a single array
	        //O(1) O(n)
	 static class KQueues {
	    int k,n,arr[], front[],rear[],next[],free;
	    KQueues(int k1, int n1){k = k1;n = n1;
	    arr = new int[n];front = new int[k];rear = new int[k];next = new int[n];
	                for(int i= 0; i< k; i++) {front[i] = rear[i] = -1;}free = 0;
	                for(int i= 0; i< n-1; i++) {next[i] = i+1;}next[n-1] = -1;
	            }
	            private boolean isEmpty(int i) {return front[i] == -1;}
	            private boolean isFull() {return free == -1;}
	         private void enqueue(int x, int j) {
	          if(isFull()) {System.out.println("queue overflow");return;}
	                int i=free,ii = next[i];
	                if(isEmpty(j)) {rear[j] = front[j] = i;}
	                else {next[rear[j]] = i;rear[j] = i;}
	                next[i] = -1; arr[i] = x; free = ii;
	            }
	            private int dequeue(int sn) {
	                if(isEmpty(sn)){System.out.println("Stack underflow");return Integer.MIN_VALUE;}
	                int i = front[sn];front[sn] = next[i];next[i] = free;
	                free = i;return arr[i];
	            }    
	        }
	 //26
	 //LRU Cache
// TLE
	 static class LRUCache {
		 static  Queue<Integer>q;
		 static  HashMap<Integer,Integer>h;
		 static  int capacity;
		     LRUCache(int cap)
		     {this.capacity=cap;q= new ArrayDeque<Integer>();h= new LinkedHashMap();}
		     public static int get(int key)
		     {     if(h.containsKey(key)){   q.remove(new Integer(key));q.add(key);}
		     return !h.containsKey(key)?-1:h.get(key);
		     }

		     public static void put(int key, int value)
		     {
		         if(h.containsKey(key)){q.remove(new Integer(key));q.add(key);h.put(key,value);}
		         else{
		             if(q.size()<capacity){q.add(key);h.put(key,value);}
		             else{
		                  int k=q.remove();q.add(key);h.remove(k);h.put(key,value);}
		         }
		         //System.out.print("g"+h);
		     }
		 }
	 //O(1) with HashLinked Map It already have feature of LRU
	 class LRUCache3 {
		    private LinkedHashMap<Integer, Integer> map;
		    private final int CAPACITY;
		    public LRUCache3(int capacity)
		    {
		        CAPACITY = capacity;
		        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
		            protected boolean removeEldestEntry(Map.Entry eldest)
		            {
		                return size() > CAPACITY;
		            }
		        };
		    }
		    public int get(int key)
		    {        return map.getOrDefault(key, -1);}
		    public void set(int key, int value)
		    {        map.put(key, value);}
		}
	 //O(1) Doubly LL
static class Nod {
    int key;
    int value;
    Nod pre;
    Nod next;
 
    public Nod(int key, int value)
    {
        this.key = key;
        this.value = value;
    }
}
 
static class LRUCache2 {
    private static HashMap<Integer, Nod> map;
    private static int capacity, count;
    private static Nod head, tail;
 
    public LRUCache2(int capacity)
    {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Nod(0, 0);
        tail = new Nod(0, 0);
        head.next = tail;
        tail.pre = head;
        head.pre = null;
        tail.next = null;
        count = 0;
    }
 
    public static void deleteNode(Nod node)
    {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
 
    public static void addToHead(Nod node)
    {
        node.next = head.next;
        node.next.pre = node;
        node.pre = head;
        head.next = node;
    }
    public static int get(int key)
    {
        if (map.get(key) != null) {
            Nod node = map.get(key);
            int result = node.value;
            deleteNode(node);
            addToHead(node);
       
            return result;
        }
        return -1;
    }
    public static void set(int key, int value)
    {
        if (map.get(key) != null) {
            Nod node = map.get(key);
            node.value = value;
            deleteNode(node);
            addToHead(node);
        }
        else {
            Nod node = new Nod(key, value);
            map.put(key, node);
            if (count < capacity) {
                count++;
                addToHead(node);
            }
            else {
                map.remove(tail.pre.key);
                deleteNode(tail.pre);
                addToHead(node);
            }
        }
    }
}
	        //27
	        //Queue reversal
	        public static void naam2() {
	        	Queue<Integer> a=new LinkedList<Integer>();
	        	a.add(1);a.add(2);a.add(3);a.add(4);
	        rev(a);
	        while(!a.isEmpty()) {System.out.println(a.remove());}}
	        
	        static Queue<Integer> rev(Queue<Integer> q)
	        {
	        	if(q.isEmpty()) {return q;}
	        	int x=q.remove();
	        	rev(q);
	        	q.add(x);
	        	return q;
	        }
	        //28
	        //Reverse First K elements of Queue
	        //O(N) o(N)
	        public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
	            Stack<Integer>a= new Stack<Integer>();
	            Queue<Integer>b= new LinkedList<Integer>();
	            while(k!=0){a.push(q.remove());k--;}
	            while(!q.isEmpty()){b.add(q.remove());}
	            while(!a.isEmpty()){q.add(a.pop());}
	            while(!b.isEmpty()){q.add(b.remove());}
	            return q;
	     }
	        //29
	        //Interleave first half of queue to second half
	        //O(n) O(n) Just by a single stack
	        public static void interleave(Queue<Integer>q)
	        {
	        	Stack<Integer>a= new Stack<Integer>();
	        	boolean b=false;
	        	if(q.size()%2==1) {q.add(-1);b=true;}
	        	int h=q.size()/2;
	        	while(h>0) {a.push(q.remove());h--;}
	        	while(!a.isEmpty()) {q.add(a.pop());}
	        	h=q.size()/2;
	        	while(h>0) {q.add(q.remove());h--;}
	        	h=q.size()/2;
	        	while(h>0) {a.push(q.remove());h--;}
	        	h=q.size();
	        	while(h>0) {q.add(a.pop());
	        	if(a.size()!=0||!b)q.add(q.remove());
	        	else q.remove();
	        	h--;}
	        
	        	while(!q.isEmpty()) {System.out.println(q.remove());}
	        }
	        //30
	        //Circular Tour
	        //O(n) O(1)
	        public static int tour(int[]p,int []d){
	        int start=0,n=p.length;
	        for(int i=0;i<n;i++){if((p[i]-d[i])>=0){start=i;break;}}
	        int i=start,curr=0;
	        while(i<n)
	        {
	            curr+=(p[i]-d[i]);
	           
	            if(curr<0){i++;while(i<n){if((p[i]-d[i])>=0){start=i;curr=0;break;}i++;}}
	            else{i++;}
	        }
	        if(curr<0)return -1;
	        for(int j=0;j<start;j++){curr+=(p[j]-d[j]);if(curr<0){return -1;}}
	        return start;
	    }
	        //31
	        //Rotten Oranges
	        //O(n^2) O(n^2)
	        public int orangesRotting(int[][] grid)  {int n=grid.length,m=grid[0].length,ans=-88,jk=0;
		    Queue<int[]>q=new LinkedList<int[]>();
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<m;j++)
		        {
		            if(grid[i][j]==2){q.add(new int[]{i,j});}
		            else if(grid[i][j]==1){jk++;}
		        }
		    }
	                         if(q.isEmpty()){if(jk==0)return 0; else return -1;}                     
		    //System.out.print(jk);
		    q.add(new int[]{-1,0});

		    while(!q.isEmpty())
		    {
		        int r=q.peek()[0],c=q.peek()[1];q.remove();
		        if(q.size()==0){ans=c;return jk>0?-1:ans;}
		        else{ 
		            if(r==-1){c++;q.add(new int[]{r,c});}
		            else{
		    if(r-1>=0&&r-1<n&&c>=0&&c<m&&grid[r-1][c]==1){jk--;grid[r-1][c]=2;q.add(new int[]{r-1,c});}
		    if(r+1>=0&&r+1<n&&c>=0&&c<m&&grid[r+1][c]==1){jk--;grid[r+1][c]=2;q.add(new int[]{r+1,c});}
		    if(r>=0&&r<n&&c-1>=0&&c-1<m&&grid[r][c-1]==1){jk--;grid[r][c-1]=2;q.add(new int[]{r,c-1});}
		    if(r>=0&&r<n&&c+1>=0&&c+1<m&&grid[r][c+1]==1){jk--;grid[r][c+1]=2;q.add(new int[]{r,c+1});}
		            }
		        }
		    }

		    return jk>0?-1:ans;
		       }
//32
//Distance of nearest cell having 1 
	        //O(n2) O(n2)
	        public int[][] nearest(int[][] grid)
	        {int n=grid.length,m=grid[0].length,ans=-88,jk=0;
	        int[][] anss=new int[n][m];
	    		    Queue<int[]>q=new LinkedList<int[]>();
	    		    for(int i=0;i<n;i++)
	    		    {
	    		        for(int j=0;j<m;j++)
	    		        {
	    		            if(grid[i][j]==1){q.add(new int[]{i,j});}
	    		            else if(grid[i][j]==0){anss[i][j]=-1;}
	    		        }
	    		    }
	    	                         if(q.isEmpty())
	    	                         {
	    	                             for(int i=0;i<n;i++)
	    	                             {Arrays.fill(anss[i],Integer.MAX_VALUE);}return anss;
	    	                             
	    	                         } 
	    		    while(!q.isEmpty())
	    		    {
	    		        int r=q.peek()[0],c=q.peek()[1];q.remove();
	    		    if(r-1>=0&&r-1<n&&c>=0&&c<m&&anss[r-1][c]==-1){anss[r-1][c]=anss[r][c]+1;q.add(new int[]{r-1,c});}
	    		    if(r+1>=0&&r+1<n&&c>=0&&c<m&&anss[r+1][c]==-1){anss[r+1][c]=anss[r][c]+1;q.add(new int[]{r+1,c});}
	    		    if(r>=0&&r<n&&c-1>=0&&c-1<m&&anss[r][c-1]==-1){anss[r][c-1]=anss[r][c]+1;q.add(new int[]{r,c-1});}
	    		    if(r>=0&&r<n&&c+1>=0&&c+1<m&&anss[r][c+1]==-1){anss[r][c+1]=anss[r][c]+1;q.add(new int[]{r,c+1});}
	    		    }

	    		    return anss;
	        }
	        //33
	        //First negative integer in every window of size k 
	        //O(N) O(N)
	        public long[] printFirstNegativeInteger(long A[], int n, int k)
	        {
	            Deque<Integer>x= new LinkedList<Integer>();
	            for(int i=0;i<k;i++)
	            {if(A[i]<0){x.addLast(i);}}
	            long[]a= new long[n-k+1];
	            int ff=0;
	            if(x.isEmpty()){a[ff++]=0;}
	            else{a[ff++]=A[x.peek()];}
	            
	            for(int i=k;i<n;i++)
	              {
	                  while(!x.isEmpty()&&i-k>=x.peek()){x.removeFirst();}
	                  if(A[i]<0){x.addLast(i);}
	            if(x.isEmpty()){a[ff++]=0;}
	            else{a[ff++]=A[x.peek()];}
	            }
	            return a;
	        }
	        //34
	        //Check if all levels of two trees are anagrams or not
	        //because of sorting is O(nlogn)
	        public static boolean trees(Node p,Node q)
	        {
	        	if(p==null&&q==null)return true;
	        	if(p==null||q==null)return true;
            Queue<Node> p1= new LinkedList<Node>();
            Queue<Node> q1= new LinkedList<Node>();
               p1.add(p);q1.add(q);
               while(true)
               {
            	   int n1=p1.size(),n2=q1.size();
            	   if(n1!=n2)return false;if(n1==0)break;
            	   ArrayList<Integer>x=new ArrayList<Integer>();
            	   ArrayList<Integer>y=new ArrayList<Integer>();
               while(n1>0)
               {
            	   Node node1 = p1.remove();
                   if (node1.left != null)
                       q1.add(node1.left);
                   if (node1.right != null)
                       q1.add(node1.right);
                   n1--;
         
                   Node node2 = q1.remove();
                   if (node2.left != null)
                       q1.add(node2.left);
                   if (node2.right != null)
                       q1.add(node2.right);
         
                   x.add(node1.data);
                   y.add(node2.data);
               }
               Collections.sort(x);Collections.sort(y);
               if(!x.equals(y))return false;
               }
           return true;
            }
	        
	        //35
	        //Sum of minimum and maximum elements of all subarrays of size k.
	        //O(N) O(K)
	        public static int SumOfKsubArray(int arr[] , int k)
	        {
	            int sum = 0;  // Initialize result
	            Deque<Integer> S=new LinkedList<>(),G=new LinkedList<>();
	            int i = 0;
	            for (i = 0; i < k; i++)
	            {
	                while ( !S.isEmpty() && arr[S.peekLast()] >= arr[i])
	                    S.removeLast();
	                while ( !G.isEmpty() && arr[G.peekLast()] <= arr[i])
	                    G.removeLast();
	                G.addLast(i);
	                S.addLast(i);
	            }
	       for (  ; i < arr.length; i++ )
	            {
	                sum += arr[S.peekFirst()] + arr[G.peekFirst()];
	                while ( !S.isEmpty() && S.peekFirst() <= i - k)
	                    S.removeFirst();
	                while ( !G.isEmpty() && G.peekFirst() <= i - k)
	                    G.removeFirst();
	                while ( !S.isEmpty() && arr[S.peekLast()] >= arr[i])
	                    S.removeLast(); // Remove from rear
	                while ( !G.isEmpty() && arr[G.peekLast()] <= arr[i])
	                    G.removeLast(); // Remove from rear
	                G.addLast(i);
	                S.addLast(i);
	            }
	            sum += arr[S.peekFirst()] + arr[G.peekFirst()];
	       
	            return sum;
	        }
	        //Sliding Window Maximum (Maximum of all subarrays of size k)
	        //O(nlogk) O(k)
	        public int[] maxSlidingWindow(int[] arr, int k) {
	            int n=arr.length,max=-100000;
	        PriorityQueue<Integer>p=new PriorityQueue<Integer>(Collections.reverseOrder());
	        ArrayList<Integer>a= new ArrayList<Integer>();
	    for(int i=0;i<k;i++){p.add(arr[i]);}
	            for(int i=k;i<n;i++)
	            {a.add(p.peek());p.remove(arr[i-k]);p.add(arr[i]);}
	            a.add(p.peek());
	    return a.stream().mapToInt(i -> i).toArray();
	        }
	        
	        //O(n) O(k)	        
	        public int[] maxSlidingWindow2(int[] arr, int k) {
	            int jj=0,n=arr.length,max=-100000;
	        Deque<Integer>p=new LinkedList<Integer>();
	        int[] a= new int[n-k+1];
	    for(int i=0;i<k;i++){
	        while(!p.isEmpty()&&arr[i]>=arr[p.peekLast()]){p.removeLast();}
	        p.add(i);}
	            for(int i=k;i<n;i++)
	            {a[jj++]=arr[p.peek()];
	              while(!p.isEmpty()&&i-k>=p.peek()){p.removeFirst();}
	             while(!p.isEmpty()&&arr[i]>=arr[p.peekLast()]){p.removeLast();}p.addLast(i);
	            }
	        a[jj]=arr[p.peek()];
	    return a;
	        }
	       
	        //36
	        //O(nlogn) O(n)
	        //Min sum of squares of character count in a given String after removing k characters
	        static int minValue(String s, int k){
        	int a[]= new int[26],n=s.length();
        	for(int i=0;i<n;i++){a[(int)(s.charAt(i)-'a')]++;}
        	PriorityQueue<Integer>p=new PriorityQueue<Integer>(new Comparator<Integer>() 
        	{
        	    public int compare(Integer i1,Integer i2)
        	    {return i1<i2?1:i1==i2?0:-1;}
        	}
        			);
        	    for(int i=0;i<26;i++){if(a[i]!=0){p.add(a[i]);}}
        	   
        	    for(int i=0;i<k;i++){int l=p.remove();l--;p.add(l);}
        	    int ans=0;
        	    while(!p.isEmpty()){ans+=Math.pow(p.remove(),2);}
        	    return ans;
        	    }
	        //37
	        //First non-repeating character in a stream 
	        //O(N) O(N) // but queue approach
	        // different approach  Ll 36
	        public static String FirstNonRepeating(String A)
		    {
		        int b[]= new int[26];
		        StringBuilder ans=new StringBuilder();
		        Arrays.fill(b,-1);
		        Queue<Character>a= new LinkedList<Character>();
		        for(int i=0;i<A.length();i++)
		        {   char g=A.charAt(i);
		        	int t=(int)(g-'a');
		        	
		        	if(b[t]==-1) {a.add(g);b[t]=0;}else{b[t]=1;}
		        	while(!a.isEmpty()&&b[(int)(a.peek()-'a')]==1){a.remove();}
		        	
		        	if(a.isEmpty())ans.append('#');else ans.append(a.peek());
		        	
		   	        }
		        return ans.toString();
		    }
//38
  //O(n) O(n)
	    //1475    Final Prices With a Special Discount in a Shop
	 	   public static int[] finalPrices(int[] arr)
		    {int n=arr.length; 
		    int[] ans= new int[n];
		        Stack<Integer> s=new Stack<Integer>();
		        for(int i=n-1;i>=0;i--)
		        {
		            if(s.isEmpty()){s.push(-1);}
		            else{while(s.peek()!=-1&&s.peek()>arr[i]){s.pop();}}
		            ans[i]=s.peek()==-1?arr[i]:arr[i]-s.peek();
		            s.push(arr[i]);
		        }
		        return ans;
		    }
}