package simple_logic;

import java.util.Scanner;

public class LCM_code {

	public static void main(String[] args) {
		int a, b, lcm=1,f=1;
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the first number : " );
		a=ab.nextInt();
		System.out.println("Enter the second number : ");
		b=ab.nextInt();
		for(int i=1; i<=a || i<=b; i++) {
			if(a%i==0 && b%i==0) {
				lcm= lcm*i;
				a=a/i;
				b=b/i;
				
			}
			
			
			
			f=lcm*a*b;
			

				
		
			
			
			}
			
			
		
		System.out.println("LCM is: " +f);
	}
}



