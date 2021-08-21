package string;

public class Sring {

	public static void main(String[] args) {

		
		String a="hence root";
		String a2="hence root++";
		
		//literals more optimized
		//jab literals seek value initialize ki to vo heap area me save hone ki bajaye string pool area me save 
		//hota hai agar vaha par koi same value vala nahi hua to kyu?
		//kyuki a2 ko pahle vo string pool area me search karega agar he to dito vohi utar dega naki nai value dalega 
		String a1= new String("hence root");
		//jab object use karke value initialize ki hai to variable heap area me save hota hai 1 aur uski ek copy string pool area 
		// me ban jati hai 2 hence 2 string .... but agar string ppol area me vo already hai to vo copy naahi hoga aur 1 string banega
		
		System.out.println(a);
		System.out.println(a==a2);
		System.out.println(a==a1);
		
  
//  only strings  are unmutable mean if i change the value of variable still there would be saved in memory the previous one
	
		String a3="hence";
		 a3="root++";	
	
		 System.out.println(a3.charAt(0)); 
		 System.out.println(a3.length()); 
		 System.out.println(a3.substring(1)); 
		 System.out.println(a3.substring(1,4));// 4 is not included 
		 System.out.println(a3.contains("+"));
		 System.out.println(a3.equals(a2));
		 System.out.println(a3.isEmpty());
		 System.out.println(a3.concat(a2));
		 System.out.println(a3.replace(a2,a3)); // originalone doesnot change
		 System.out.println(a3.replace('o','x')); 
		 //imp
		 
		 String ampple="apple   ball   cat   dog   egg";
		 String ampple2[] =ampple.split("   ");
		 for(String j:ampple2)
		 {
			 System.out.print(j+"");
		 }
		 
		 System.out.println(a3.indexOf('+')); 
		 System.out.println(a3.toLowerCase()); 
		 System.out.println(a3.toUpperCase()); 
		 System.out.println(ampple.trim()); 
		 
		 
		 
		 
	}
	}          
           