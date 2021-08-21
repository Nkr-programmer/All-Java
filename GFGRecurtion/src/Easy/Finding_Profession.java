package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finding_Profession {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub


        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        Profession ob = new Profession();
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int K= Integer.parseInt(input_line[1]);
            char ans = ob.find(N,K);
            if(ans=='d')
            System.out.println("Doctor");
            else if(ans=='e')
            System.out.println("Engineer");
        }
	}

}

class  Profession{
	
	static int y=0;
	static char z='e';
	static char find(int N,int k) {
	    if(N==0)return 'e';
	    if(k==0)return 'd';
		y=0;
		z='e';
		findutil(k);
		return z;
	}
	
	static void findutil(int k) {
		if(k==1) {y=1;z='e';return;}
		
     if( k%2==0)findutil(k/2);else findutil((k+1)/2);
    // System.out.println(k+" "+z+" "+y);
	if(k==y*2) {y=k;if(z=='d')z='e';else z='d';}
	else {y=k;if(z=='e')z='e';else z='d';}
     
     
	}
	
}

