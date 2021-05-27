package day5;



	public class Manager extends Employee { 
		void sub() {
			super.add(5,8);
			} //method overriding will happen between parent and child class 
		//if same method with same parameter is available in both class parent as well as child 
		//then child class method will override to parent class method 
		void add(int i,int j) 
		{
	         System.out.println("i am child");
	         } 
		static void mult() 
		{
			
		} public static void main(String[] args)
		{ 
			Manager m=new Manager(); 
			m.sub(); 
			}
		}
	

