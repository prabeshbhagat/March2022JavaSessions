package MiniJavaInterviewQuestion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "m", "r", "v" };// mrv //m|r|v //m;r;v

		String join = String.join(";", arr);
		System.out.println(join);
		
		//using streams
		String join1=Arrays.asList("t","e","s","t").stream().collect(Collectors.joining(";"));
		System.out.println(join1);

		System.out.println(joinString(":", "B", "E", "S", "T"));
		System.out.println(joinInteger(":", 10, 20, 30));

	}

	public static String joinString(String separtor, String... values) {

		StringBuilder sb = new StringBuilder();
		int end = 0;
		for (String s : values) {
			if (s != null) {
				sb.append(s);
				end = sb.length();
				sb.append(separtor);
				System.out.println("----" + end);
			}

		}
		System.out.println("---->>>>" + end);
		return sb.substring(0, end);

	}
	
	public static String joinInteger(String separtor, Integer... values) {

		StringBuilder sb = new StringBuilder();
		int end = 0;
		for (Integer s : values) {
			if (s != null) {
				sb.append(s);
				end = sb.length();
				sb.append(separtor);
				System.out.println("----" + end);
			}

		}
		System.out.println("---->>>>" + end);
		return sb.substring(0, end);

	}

}
