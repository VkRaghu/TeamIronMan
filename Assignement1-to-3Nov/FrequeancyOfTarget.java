package binarySearch;

public class FrequeancyOfTarget {
	
	static int first(int []a, int target) {
		int start = 0, last = a.length-1;
		int fi = -1;
		while(start<=last) {
			int mid = start+(last-start)/2;
			if(target<a[mid]) {
				last = mid - 1;
			}
			else if(target>a[mid]) {
				start = mid + 1;
			}
			else {
				fi = mid;
				last = mid - 1;
			}
		}
		
		return fi;
	}
	
	static int last(int []a, int target) {
		int start = 0, last = a.length-1;
		int la = -1;
		while(start<=last) {
			int mid = start+(last-start)/2;
			if(target<a[mid]) {
				last = mid - 1;
			}
			else if(target>a[mid]) {
				start = mid + 1;
			}
			else {
				la = mid;
				start = mid + 1;
			}
		}
		
		return la;
	}
	
	public static void main(String[] args) {
		int []a = {1,1,2,2,4,5,5,6,6,6,6,9,10,11}; 
		int target = 6; 
		int firstOccurenc = first(a,target);
		int lastOccurenc = last(a,target);
		int count = lastOccurenc - firstOccurenc + 1;
		System.out.println(count);
	}

}
