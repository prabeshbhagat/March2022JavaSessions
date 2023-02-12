package JavaPractice;

public class ConditionalOperators4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		int j=20;
		int k=10;
		
		System.out.println(i==j);//false
		System.out.println(i==k);//true
		
		//find the largest number among 3 different numbers
		
		int  a=400;
		int b=500;
		int c=450;
		//we will use double && opeator which is also called as short circuit operator
		
		
		if(a>b && a>c) {//false && false=false
			System.out.println("a is the largest number");
		}
		else if (b> c) {//false
			System.out.println("b is the largest number");
		}
		else {
			System.out.println("c is the largest number");
		}
			
			
		/*
		 * Assignment 1
		 * session 4
		 * find the largest among 4 different numbers	
		 */
		
		int x=800;
		int y=900;
		int z=9900;
		int p=77700;
		
		if(x>y && x>z && x>p) {//true && false=false
			System.out.println("x is the largest number");
		}
		else if (y>z && y>p) {//false
			System.out.println("y is the largest number");
		}
		else if (z>p)
		{
		System.out.println("z is the largest number");	
		}
		else {
			System.out.println("p is the largest number");
		}
		
		
		
		
			
			
			
			
			
			
			
			
			
			

	}

}
