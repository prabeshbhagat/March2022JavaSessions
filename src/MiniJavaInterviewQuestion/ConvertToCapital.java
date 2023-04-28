package MiniJavaInterviewQuestion;

public class ConvertToCapital {

	public static void main(String[] args) {
		String caps=captilaizedWord("welcome to ideagen group");
		System.out.println(caps);
		
		 caps=captilaizedWord("welcome");
		System.out.println(caps);
		
		 caps=captilaizedWord("w");
		System.out.println(caps);
		
		caps=captilaizedWord(null);
		System.out.println(caps);
		
		caps=captilaizedWord("n n n n");
		System.out.println(caps);
		
		caps=captilaizedWord("123");
		System.out.println(caps);
		
		caps=captilaizedWord("naveen 123 labs 456 done");
		System.out.println(caps);
	}
	
	
	public static String captilaizedWord(String text) {
		
		
		if(text==null) {
			return null;
		}
		
		if(text.length()==1) {
			return text.toUpperCase();
		}
		
		

		String[] words=text.split("\\s");
		String result="";
		for(String e:words) {
			String first=e.substring(0, 1).toUpperCase();//W
			String restString=e.substring(1);//elcome
			
			result=result+first+restString+" ";//Welcome
			
		}
		return result.trim();
	}

}
