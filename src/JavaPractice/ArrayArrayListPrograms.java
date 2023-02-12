package JavaPractice;

import java.util.ArrayList;

public class ArrayArrayListPrograms {
	
	public static void main(String[] args) {
		
		ArrayList<String> ar=new ArrayList();
		ar.add("Red");
		ar.add("Yellow");
		ar.add("Blue");
		ar.add("Black");
		
		System.out.println(ar);
		
		for(String s:ar) {
			System.out.println(s);
		}
		
		System.out.println("---------");
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		
		
	}

}
