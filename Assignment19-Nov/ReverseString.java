package stack;

import java.util.Stack;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "Hi This is My Book";
		System.out.println(rev(str));
		
	}
	
	public static String rev(String str) {
		
		Stack<String> st = new Stack<>();
		
		for(String s : str.split(" ")) {
			if(!s.isEmpty()) {
				st.push(s);
			}
		}
			StringBuilder sb = new StringBuilder();
			while(!st.isEmpty()) {
				sb.append(st.pop());
				sb.append(" ");
			}
		return sb.toString();
		
	}

}
