package arrayList;

import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrray = new ArrayList<>();
		
		arrray.add("Vikash");
		arrray.add("Vishal");
		arrray.add("Amit");
		arrray.add("Anand");
		
		System.out.println(arrray.size());
		arrray.add(3, "abcd");
		for(String val : arrray) {
			System.out.print(val+" ");
		}
		System.out.println();
		arrray.set(3, "ABCD");
		for(String val : arrray) {
			System.out.print(val+" ");
		}
	}

}
