package JavaPractice;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

			
				
				int mark = 95;
				if(mark>=95 && mark<=100)
				{
					System.out.println("Congratualtions, you got A+");
				}
				 if(mark>=90 && mark<95)
				{
					System.out.println("You got Grade A");
				}
				else if(mark>=85 && mark<90)
				{
					System.out.println("Good job, you got B+");
				}
				else if(mark>80 && mark<85)
				{
					System.out.println("Your grade is B");
				}
				else if(mark>=70)
				{
					System.out.println("You are passed. Keep trying");
				}
				else
				{
					System.out.println("Your mark is "+ mark + ". Minimum grade to pass the test is 70 and above");
				}
			
				 
	//Cannot switch on a value of type float.
	//Only convertible int values, strings or enum variables are permitted			 
/*				 float num=12.33f;
				 
				 switch (num) {
				case 12:
					
					break;

				default:
					break;
				}
*/
	//Cannot switch on a value of type boolean. 
	//Only convertible int values, strings or enum variables are permitted			 
//				 int i=10;
//				 int j=20;
//				 switch (i<j) {
//				case value:
//					
//					break;
//
//				default:
//					break;
////				}
				 
				 boolean flag=true;
				 if(flag) {
					 System.out.println("the condition is true");
					 break;
				 }else {
					 System.out.println("the condition is not true");
				 }
		
				

	}

				      
		
	}

}
