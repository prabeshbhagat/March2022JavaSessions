package JavaPractice;

public class Programs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *1. WAP to print a to z
		 */
		
		for(char a1='a'; a1<='z';a1++) {
			System.out.println(a1);
		}
		
		//here char comes from numeric family hence interanlly its 
		//increasing & printing the number
		
		/*
		 *2. WAP to print asci values of a to z
		 */
		for(char a1='a'; a1<='z';a1++) {
			System.out.println((int)a1);
		}
		
		
		
		/*
		 *3. WAP to print char & respective asci values of a to z
		 *e.g a=97
		 */
		for(char a1='a'; a1<='z';a1++) {
			System.out.println(a1+"="+(int)a1);
		}
		
		
		/*
		 *4. WAP to print char & respective asci values of A to Z
		 *e.g a=97
		 */
		for(char a2='A'; a2<='Z';a2++) {
			System.out.println(a2+"="+(int)a2);
		}
		
		/*
		 *5. WAP to print char & respective asci values of 0 to 9
		 *e.g a=97
		 */
		for(char a3='0'; a3<='9';a3++) {
			System.out.println(a3+"="+(int)a3);
		}



	}

}
