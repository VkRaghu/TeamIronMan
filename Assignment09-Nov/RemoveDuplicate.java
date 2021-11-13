package arrayList;

import java.util.ArrayList;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		int []a = {1,2,2,3,9,9,5,6,7,9,8,6};
		
		ArrayList<Integer> arr = new ArrayList<>(); 
		
		for(int i=0; i<a.length; i++) {
			if(!arr.contains(a[i])) {
				arr.add(a[i]);
			}
		}
		for(Integer val : arr) {
			System.out.println(val);
		}
	}

}
