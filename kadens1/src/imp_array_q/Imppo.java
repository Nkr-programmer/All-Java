package imp_array_q;

public class Imppo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,-1,7,-2,-5,6};
int c1=0, c2=0, c3=0, c4=0, c5=0, c6=0,d=0,e1=0, e2=0, e3=0, e4=0, e5=0, e6=0,e7=0,e8=0;

for(int i=0;i<8;i++) {

		
		System.out.print(a[i]+",");
	if(e1<a[i]) {
		e1=a[i];
		}       
   
	
	
	
}

        System.out.println();
		
        for(int i=0;i<7;i++) {
        	
     int h=i;
    		c1=a[i]+a[++i];
    		System.out.print(c1+",");
          i=h;
          if(e2<c1) {
      		e2=c1;
      		}   
        	        	
        }
    
                
          
        System.out.println();
        for(int i=0;i<6;i++) {
        	
        	 int h=i;
     		c2=a[i]+a[++i]+a[++i];
     		System.out.print(c2+",");
           i=h;
           if(e3<c2) {
       		e3=c2;
       		}   
        	                  }
      
        System.out.println();
        for(int i=0;i<5;i++) {
        	
        	 int h=i;
     		c3=a[i]+a[++i]+a[++i]+a[++i];
     		System.out.print(c3+",");
           i=h;
           if(e4<c3) {
       		e4=c3;
       		}   
        	                  }
       
        System.out.println();
        for(int i=0;i<4;i++) {
        	
       	 int h=i;
    		c4=a[i]+a[++i]+a[++i]+a[++i]+a[++i];
    		System.out.print(c4+",");
          i=h;
          if(e5<c4) {
      		e5=c4;
      		}           
        }
        System.out.println();
        for(int i=0;i<3;i++) {
        	
          	 int h=i;
       		c5=a[i]+a[++i]+a[++i]+a[++i]+a[++i]+a[++i];
       		System.out.print(c5+",");
             i=h;
          	   
             if(e6<c5) {
         		e6=c5;
         		}   
             }
        System.out.println();
        for(int i=0;i<2;i++) {
        	
         	 int h=i;
      		c6=a[i]+a[++i]+a[++i]+a[++i]+a[++i]+a[++i]+a[++i];
      		System.out.print(c6+",");
            i=h;
            if(e7<c6) {
        		e7=c6;
        		}    	      
        }
        System.out.println();
        for(int i=0;i<8;i++) {
        	
         	 int h=i;
      		d=a[i]+d;
      		
            i=h;
         	                  }
        System.out.println(d+" ");
		
        
        
	
        int h[]= {e1,e2,e3,e4,e5,e6,e7,d};
       
		
        for(int i=0;i<8;i++)
        {
        	if(e8<h[i]) {
        		
        		e8=h[i];
        		
        	}
        	
        }
		
		
		System.out.println(e8+"is the largest one");
		
		
		
		
		
		
		
		
		
		
	}

}
