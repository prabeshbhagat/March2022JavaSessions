package JavaPractice;

public class LoopsConcept4 {
	
	//While Loop
	//do while  loop

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to print from 1 to 10
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		//above is unnecessary repetitive code
		//what about when you have to print 1 to 1000
		//Whenever we have repetitive task we use Loops 
		//whenever we have sequential numbers we use loops 
		
		//1.While Loop
		int i=1;
		
//1.		
		//infinite loop (bad code)
//		while(i<=10) { //should be small
//			System.out.println(i);
//		}

		//While Loop
		//Loop stats with condition 
		
//2.	int j=1;//Start	
//		while(j<=10) { //conditional
//			System.out.println(j);
//			j++;//incremental or decremental
//		}
		
		//using post increment operator
//
		
//3.		
//		while(i<=10) { 
//			System.out.println(i);
//			++i;
//		}
		
//		//using i=i+1
////4.		
//				while(i<=10) { 
//					System.out.println(i);
//					i=i+1;
//				}
		
		//again this an infinite loop
		/*	int z=2;
			System.out.println("**********");
		while(z<=10) { 
			System.out.println(z);
			z=z++;
			
		}
		System.out.println("**********");
		*/
//				
////5.   infinite loop
//				int k=1;
//				while(true) {
//					System.out.println(k);
//					k++;	
//				}
				
//6. using if loop & break to make it finite 
				//5.   
				int k=1;
				while(true) {
					System.out.println(k);
					k++;
					if(k==20) { //Double equal to operator for comparision of primitive type
						break;
					}
					
				}
				
//7. Example of Infinte loop
//				while(true) {
//					System.out.println("Welcome Delhi Capitals ");
//				}
				//in automation we will never use infinte loop

				
				
				
				
//Facebook/Linkedin app Keep Scrolling (infinite loop)
//facebook/Linkedin app --lazy page loading(keep scrolling 
//				till you see post from Naveen Automation labs)
				
//8. Assignment print 10 to 1 using while loop
				
//While Loop examples	
//1.pagination-choose a name from list of pages
//2.Crousel -choose a product from list available
//3.Calendar /date picker (go ibibo) choose a future date for hotel booking
//4.Facebook/Linkedin app lazy page loading Keep Scrolling
//Swiggy scroll till the resturant name is available.	Sometime 1st one,sometimes
//50th one sometimes ,sometimes 17th one
				
//QQQ
		//Use cases of While Loop
		//1.We have to use while loop when we are not sure of number of cycles or iteration
		// Pagination is one of the best example of using while loop
	    //we dont know which page the value/data(Prabesh) is available 1st ,2nd ,3rd page among many pages
		//go to CRMPRO application and click on applcaition than click on pagination
		
				
 //2nd example noon.com crousel example for while loop
				
//QQQQ		
				
				/*
				 * print even  numbers betwee  1 to 10 using for loop
				 * 
				 * 
				 */
				System.out.println("############");
			
		for (int h=2;h<=10;h++) {
			System.out.println(h);
			h=h+1;
		}
		
		/*
		 * infinite loop 
		 * interview qauestion
		 * it will by default consider all conditions will be satisfied
		 */
//		for(;;) {
//			System.out.println("bye");
//		}
		
		System.out.println("-----------");
		int p=1;
		do {
			p++;
			System.out.println(p);
			
		}
		while(p<=10);
		
	}

}















