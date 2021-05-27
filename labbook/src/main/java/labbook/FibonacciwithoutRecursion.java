package labbook;

import java.util.Scanner;

public class FibonacciwithoutRecursion {
	static int n;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 System.out.print("n:");
		 n=sc.nextInt();
		
        int f0,f1,f2;
        f0=1;
        f1=1;
        f2=f0+f1;
        System.out.println(f0);
        System.out.println(f1);
        
        while(f2<=n)
        {
        	System.out.println(f2);
        	f0=f1;
        	f1=f2;
        	f2=f0+f1;
        	
        }sc.close();
	}
	
	
		 }


//
//public static int fibonacciRecursion(int n){
//	if(n == 0){
//		return 0;}
//	if(n == 1 || n == 2){
//			return 1;
//		}
//	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
//	}
//         
//public static void main(String[] args) {
//
//	System.out.println("enter your choice");
//
//	Scanner sc=new Scanner(System.in);
//        int max = sc.nextInt();  		
//        System.out.print("Fibonacci Series of "+max+" numbers: ");
//		for(int i = 0;
//				i < max;
//				i++){   
//				System.out.print(fibonacciRecursion(i) +" ");//
//			}
//		}}
//
