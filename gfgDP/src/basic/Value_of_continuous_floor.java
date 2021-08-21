package basic;

import java.util.HashMap;

public class Value_of_continuous_floor {

	public static void main(String[] args) {
		int a[]= {6,8,15};
		
		for(int v: a)
	System.out.println(fib(v));
		System.out.println(map);
	}
static HashMap<Integer,Integer>map= new HashMap<Integer,Integer>();
	private static int fib(int v) {
		if(map.containsKey(v))return map.get(v);
		if(v==0)return 0;
		map.put(v,v+fib(v/2));
		return map.get(v);
	}

}
