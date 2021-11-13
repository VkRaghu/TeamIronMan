package arrayList;

import java.util.ArrayList;

public class CopyArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		for(Integer val : arr) {
			System.out.print(val+" ");
		}
		System.out.println();
		ArrayList<Integer> arr2 = new ArrayList<>();
		for(Integer val : arr) {
			arr2.add(val);
		}
		System.out.println(arr2);
		
	}

}
