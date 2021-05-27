package labbook;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Trafficlights {
	//static String red;

	public static void main(String[] args) throws Exception {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("If Trafficlight is Indicated as:");
		String n=br.readLine();
		//int i=Integer.parseInt(n);
		
		switch(n)
		{
		case  "red" :
			System.out.println("stop");
			break;
		case  "orange" :
			System.out.println("Ready");
			break;
		case  "green" :
			System.out.println("Go");
			
			
		}
		
		

	}

}
