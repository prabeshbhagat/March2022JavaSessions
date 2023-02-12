package JavaPractice;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loop
		//Typical For loop :(Index based for loop)
		//Print 1 to 10
		
		//int p=1this line will be executed only once
		for(int p=1;p<=10;p++) {
			System.out.println(p);//1
		}
		
//Q		for loop intilization outside bracket()
		int t=1;
		for(;t<=10;t++) {
			System.out.println(t);//1
		}
		
		int u=1;
		for( ;u<=10; ) {
			System.out.println(u);//1
			u++;
			//++u;
			//u=u+1;
			//we can write all of the above
		}
			
		//1.infinite for loop
//			for(int o=10;o<=20;) { //no incremental operator 
//				System.out.println(o);
//			}
			
//		//1.infinite for loop		
//			for(;;) { //no incremental operator 
//				//System.out.println("Welcome RCB");	
//			}
			
			/*in the above example java will consider by default as True
			Intilization,condition,increment all will be by
			default True if its not mentioned*/
			
		
		
		//Print even number in between 1 to 10
		//2 4 6 8 10
		
		System.out.println("++++++Even++++++");
		for(int even=2;even<=10;even++) {
			System.out.println(even);
			even++;
		}
		
		/*
		 * Print even number in between 1 to 10 using mod operator
		 */
		System.out.println("++++++Even type 2++++++");
		String evenList="";
		for(int evenN=2;evenN<=10;evenN++) {
			if(evenN%2==0) {
				evenList=(evenList+evenN+",");
		
			}

			
			
		}
		System.out.println(evenList);
		

//		2,
//		2,4,
//		2,4,6,
//		2,4,6,8,
//		2,4,6,8,10,
		
		System.out.println("++++++Even type 2 end++++++");
		
		for(int odd=1;odd<=10;odd=odd+2) {
			System.out.println(odd);
		}
		
		
		//double can also be used with For Loop
		
		for (double d=1.0;d<=10.0;d++) {
			System.out.println(d);
		}
		
		//Interview Ques
		//Print a-z
		//character belongs to numeric family
		System.out.println("++++++++++++");
		//1st type
		for(char c='a';c<='z';c++) {
			System.out.println(c);
		}
		
		
		System.out.println("=========");
		//2nd type
		//asci value of a to z is 97 to 122
		for(int ab=97;ab<=122;ab++) {
				System.out.println((char)ab);
			}
		
		
		System.out.println("=========");
		
		
		for(int d='a';d<='z';d++) {
			System.out.println(d);
		}
		
	
		

	}

}
