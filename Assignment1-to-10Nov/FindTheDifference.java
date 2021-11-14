package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheDifference {
	
	public static void main(String[] args) {
		String s = "abcd", t = "abcde";
		char []s1 = s.toCharArray();
		char []t1 = t.toCharArray();
		
		ArrayList<Character> arr = new ArrayList<>();
		Arrays.sort(s1);
		Arrays.sort(t1);
		for(Character ch : t1) {
			if(isChar(s1,ch)==false) {
				arr.add(ch);
			}
		}
		for(Character c : arr) {
		    System.out.println(c);
		    }
	}
	static boolean isChar(char []s1, char key) {
		int start = 0, end = s1.length-1;

		while(start<=end) {
			int mid = start+(end-start)/2;
			if(s1[mid]==key) {
				return true;
			}
			else if(s1[mid]>key) {
				end = mid -1;
			}
			else start = mid + 1;
			
		}
		
		return false;
	}

}
