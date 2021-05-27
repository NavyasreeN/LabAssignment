package labbook;

import java.util.Scanner;

public class SumofCubes {

	static int r,sum=0;
	
	public static void main(String[] args) throws Exception {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("n:");
		
		int n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+(r*r*r);
			
		}
		System.out.println(sum);
		
		
		
		
		

	}

}
