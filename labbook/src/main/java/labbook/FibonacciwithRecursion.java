package labbook;

import java.util.Scanner;

public class FibonacciwithRecursion {
	
	static int n1 = 1, n2 = 1,n3;
	   static void fibbonacci(int count) {
	      if (count > 0) {
	         n3 = n1 + n2;
	         n1 = n2;
	         n2 = n3;
	         System.out.print(" " + n3);
	         fibbonacci(count-1);
	      }
	   }

	public static void main(String[] args) {
  
		Scanner sc=new Scanner(System.in);
		 System.out.print("n:");
		 int n=sc.nextInt();
		 System.out.print(n1 + " " + n2);
		 fibbonacci(n-2);
		 
		

		

	}

}
