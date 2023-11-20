package simple_logic;

import java.util.Scanner;

public class Fibbobbaci_Series {

	public static void main(String[] args) {
		int num; 
		
		Scanner  sc= new Scanner(System.in);
		System.out.println("Enter  the value :");
		num= sc.nextInt();
		int num1=0;
		int num2=1;
		for(int i=1; i<=num; i++) {
		System.out.println(num1+" ");
		int num3 =num1+num2;
		num1=num2;
		num2=num3;}
		
		
		

	}

}