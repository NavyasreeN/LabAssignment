package labbook;

import java.util.Scanner;

public class PowerofTwo {
	
	static boolean power(int n)
	{
if(n==1)
	return true;
else if(n%2!=0 || n==0)
	return false;
return power(n/2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	int	n=sc.nextInt();

if(power(n)==true)
	System.out.print("true" + "\n");
else
	System.out.print("false" + "\n");

	}

}

	
























//	static boolean PowerOfTwo(int n)
//    {
//        if (n == 0)
//            return false;
//         
//        while (n != 1)
//        {
//            if (n % 2 != 0)
//                return false;
//            n = n / 2;
//        }
//        return true;
//    }
//
//	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner(System.in);
//		 System.out.print("a:");
//		 int a=sc.nextInt();
//		
//		 PowerOfTwo(a);
//		
//		
//
//
//
//	}
//
//}
