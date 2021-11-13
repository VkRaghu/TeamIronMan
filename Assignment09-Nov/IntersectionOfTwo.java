package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwo {
	public static void main(String[] args) {
		int []a1 = {1,2,4,4,2,3,5};
		int []a2 = {4,2,5,7};
		
		ArrayList<Integer> arr = new ArrayList<>();
		Arrays.sort(a2);
		for(Integer key : a1) {
			if(getNumber(a2,key) && arr.contains(key)==false) {
				arr.add(key);
			}
		}
		System.out.println(arr);
	}
	static boolean getNumber(int []a2, int key) {
		int start = 0, end = a2.length-1;

		while(start<=end) {
			int mid = start+(end-start)/2;
			if(a2[mid]==key) {
				return true;
			}
			else if(a2[mid]>key) {
				end = mid -1;
			}
			else start = mid + 1;
			
		}
		
		return false;
	}

}
